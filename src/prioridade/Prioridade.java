package prioridade;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Prioridade {
	private List<Processo> processos = new ArrayList<>();
	
	public Prioridade(List<Processo> processos) {
		this.processos = processos;
	}
	
	private void ordenarProcessos() {
		processos.sort(Comparator.comparing(Processo::getPrioridade).reversed());
	}
	
	public void mostrarProcessos() throws InterruptedException {
		for(Processo processo : processos) {
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
			System.out.printf("Prioridade: %d",processos.getFirst().getPrioridade());
			System.out.println();
			System.out.println("Executando processo: ");
			TimeUnit.SECONDS.sleep(processos.getFirst().geTempoExecucao());
			processos.remove(processos.getFirst());

		}
	}
}
