package Ex1;

public class RegimePol�tico {
	
	private String Nome;
	private String DatadeInstitui�ao;
	private String Dissolu��o;
	private String PlanetaCapital;
	private String ChefedeEstado;
	private String[] PlanetasPartid�rios;
	
	public RegimePol�tico(String nome, String datadeInstitui��o, String dissolu��o, String planetaCapital, String chefedeEstado, String[] planetasPartid�rios) {
		
		this.setNome(nome);
		this.setDatadeInstitui��o(datadeInstitui��o);
		this.setDissolu��o(dissolu��o);
		this.setPlanetaCapital(planetaCapital);
		this.setChefedeEstado(chefedeEstado);
		this.setPlanetasPartid�rios(planetasPartid�rios);
		
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDatadeInstitui��o() {
		return DatadeInstitui�ao;
	}
	public void setDatadeInstitui��o(String datadeInstitui��o) {
		DatadeInstitui�ao = datadeInstitui��o;
	}
	public String getDissolu��o() {
		return Dissolu��o;
	}
	public void setDissolu��o(String dissolu��o) {
		Dissolu��o = dissolu��o;
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
	public String[] getPlanetasPartid�rios() {
		return PlanetasPartid�rios;
	}
	public void setPlanetasPartid�rios(String[] planetasPartid�rios) {
		PlanetasPartid�rios = planetasPartid�rios;
	}
	
	

}