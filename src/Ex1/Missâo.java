package Ex1;

public class Missâo {

	private String Nome;
	private String Data;
	private String Objetivo;
	private String NomeCriador;
	private String[] Envolvidos;
	private boolean Sucess;
	
	public Missâo(String nome, String data, String objetivo, String nomeCriador, String[] envolvidos, boolean sucesso ) {
		this.setNome(nome);
		this.setData(data);
		this.setObjetivo(objetivo);
		this.setNomeCriador(nomeCriador);
		this.setEnvolvidos(envolvidos);
		this.setSucesso(sucesso);
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public String getObjetivo() {
		return Objetivo;
	}
	public void setObjetivo(String objetivo) {
		Objetivo = objetivo;
	}
	public String getNomeCriador() {
		return NomeCriador;
	}
	public void setNomeCriador(String nomeCriador) {
		NomeCriador = nomeCriador;
	}
	public String[] getEnvolvidos() {
		return Envolvidos;
	}
	public void setEnvolvidos(String[] envolvidos) {
		Envolvidos = envolvidos;
	}
	public boolean isSucesso() {
		return Sucess;
	}
	public void setSucesso(boolean sucesso) {
		Sucess = sucesso;
	}
	
}