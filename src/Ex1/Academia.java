package Ex1;

public class Academia {
	private String Ordem;
	private String Nome;
	private String Planetas;
	private String Conselho;
	public Academia(String Ordem, String Nome, String Planeta, String Conselho) {
		this.Ordem = Ordem;
		this.Nome = Nome;
		this.Planetas = Planeta;
		this.Conselho = Conselho;
	}
	public String getOrdem() {
		return Ordem;
	}
	public void setOrdem(String ordem) {
		Ordem = ordem;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getPlaneta() {
		return Planetas;
	}
	public void setPlaneta(String planeta) {
		Planetas = planeta;
	}
	public String getConselho() {
		return Conselho;
	}
	public void setConselho(String conselho) {
		Conselho = conselho;
	}
}

