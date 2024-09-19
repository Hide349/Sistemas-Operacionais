package sjf;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		List<ProcessoSJF> processos = new ArrayList<>();
		processos.add(new ProcessoSJF(10,2));
		processos.add(new ProcessoSJF(20,2));
		processos.add(new ProcessoSJF(40,2));
		processos.add(new ProcessoSJF(5,2));
		processos.add(new ProcessoSJF(100,2));
		SJF sjf = new SJF(processos);
		sjf.ExecutarProcessos();
	}

}
