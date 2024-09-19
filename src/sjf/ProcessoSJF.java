package sjf;



public class ProcessoSJF {
	private Integer ID;
	private Integer prioridade;
	private Integer tempoExecucao;
	
	public ProcessoSJF(Integer prioridade,Integer tempoExecucao) {
		this.prioridade = prioridade;
		this.tempoExecucao = tempoExecucao;
		ID = (int)(Math.random() * (1000 - 1 + 1) + 1);
	}
	
	public Integer getPrioridade() {
		return prioridade;
	}
	
	public Integer getTempoExecucao() {
		return tempoExecucao;
	}
	public Integer getID() {
		return ID;
	}
	@Override
	public String toString() {
		return "id: " + getID() + "\n"+ "Tempo de execução: " + getTempoExecucao() + "\n";
	}
}
