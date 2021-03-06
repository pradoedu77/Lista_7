package Ex1;

public class RegimePolítico {
	
	private String Nome;
	private String DatadeInstituiçao;
	private String Dissolução;
	private String PlanetaCapital;
	private String ChefedeEstado;
	private String[] PlanetasPartidários;
	
	public RegimePolítico(String nome, String datadeInstituição, String dissolução, String planetaCapital, String chefedeEstado, String[] planetasPartidários) {
		
		this.setNome(nome);
		this.setDatadeInstituição(datadeInstituição);
		this.setDissolução(dissolução);
		this.setPlanetaCapital(planetaCapital);
		this.setChefedeEstado(chefedeEstado);
		this.setPlanetasPartidários(planetasPartidários);
		
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDatadeInstituição() {
		return DatadeInstituiçao;
	}
	public void setDatadeInstituição(String datadeInstituição) {
		DatadeInstituiçao = datadeInstituição;
	}
	public String getDissolução() {
		return Dissolução;
	}
	public void setDissolução(String dissolução) {
		Dissolução = dissolução;
	}
	public String getPlanetaCapital() {
		return PlanetaCapital;
	}
	public void setPlanetaCapital(String planetaCapital) {
		PlanetaCapital = planetaCapital;
	}
	public String getChefedeEstado() {
		return ChefedeEstado;
	}
	public void setChefedeEstado(String chefedeEstado) {
		ChefedeEstado = chefedeEstado;
	}
	public String[] getPlanetasPartidários() {
		return PlanetasPartidários;
	}
	public void setPlanetasPartidários(String[] planetasPartidários) {
		PlanetasPartidários = planetasPartidários;
	}
	
	

}