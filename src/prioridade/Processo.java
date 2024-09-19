package prioridade;

public class Processo {
	private Integer ID;
	private Integer prioridade;
	private Integer tempoExecucao;
	
	public Processo(Integer prioridade,Integer tempoExecucao) {
		this.prioridade = prioridade;
		this.tempoExecucao = tempoExecucao;
		ID = (int)(Math.random() * (1000 - 1 + 1) + 1);
	}
	
	public Integer getPrioridade() {
		return prioridade;
	}
	
	public Integer geTempoExecucao() {
		return tempoExecucao;
	}
	public Integer getID() {
		return ID;
	}
	@Override
	public String toString() {
		return "id: " + getID() + "\n"+ "prioridade: " + getPrioridade() + "\n";
	}
}
