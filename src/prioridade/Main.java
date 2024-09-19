package prioridade;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		List<Processo> processos = new ArrayList<>();
		processos.add(new Processo(10,2));
		processos.add(new Processo(20,2));
		processos.add(new Processo(40,2));
		processos.add(new Processo(5,2));
		processos.add(new Processo(100,2));
		Prioridade prioridade = new Prioridade(processos);
		prioridade.ExecutarProcessos();
	}
}
