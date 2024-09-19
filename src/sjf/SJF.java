package sjf;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import prioridade.Processo;

public class SJF {
	private List<ProcessoSJF> processos = new ArrayList<>();
	
	public SJF(List<ProcessoSJF> processos) {
		this.processos = processos;
	}
	
	private void ordenarProcessos() {
		processos.sort(Comparator.comparing(ProcessoSJF::getTempoExecucao));
	}
	
	public void mostrarProcessos() throws InterruptedException {
		for(ProcessoSJF processo : processos) {
			System.out.println(processo);
		}
	}
	
	public void ExecutarProcessos() throws InterruptedException {
		ordenarProcessos();
		mostrarProcessos();
		while(!processos.isEmpty()) {
			System.out.println("==============================================");
			System.out.printf("ID: %d",processos.getFirst().getID());
			System.out.println();
			System.out.printf("Tempo de execucao: %d",processos.getFirst().getTempoExecucao());
			System.out.println();
			System.out.println("Executando processo: ");
			TimeUnit.SECONDS.sleep(processos.getFirst().getTempoExecucao());
			processos.remove(processos.getFirst());

		}
	}
}
