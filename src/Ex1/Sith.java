package Ex1;

import ex1.SerVivo;

public abstract class Sith extends SerVivo{
	
	private double PercentualRaiva;
	private String NovoNome;
	private boolean Telepatia;
	private boolean Telecinese;
	private boolean Persuas�o;
	
	public Sith (String Nome, boolean Genero, String Especie, String DataNascimento, String PlanetaNatal, int MidiChlorians, boolean Alive, String NovoNome, double PercentualdeRaiva, boolean Telepatia, boolean Telecinese, boolean Persuas�o){
		super(Nome, Genero, Especie, DataNascimento, PlanetaNatal, MidiChlorians, Alive);
		this.setPercentualdeRaiva(PercentualdeRaiva);
		this.setNovoNome(NovoNome);
		this.setTelepatia(Telepatia);
		this.setTelecinese(Telecinese);
		this.setPersuas�o(Persuas�o);
	}

	public double getPercentualdeRaiva() {
		return PercentualRaiva;
	}

	public void setPercentualdeRaiva(double percentualdeRaiva) {
		PercentualRaiva = percentualdeRaiva;
	}

	public String getNovoNome() {
		return NovoNome;
	}

	public void setNovoNome(String novoNome) {
		NovoNome = novoNome;
	}

	public boolean isTelepatia() {
		return Telepatia;
	}

	public void setTelepatia(boolean telepatia) {
		Telepatia = telepatia;
	}

	public boolean isPersuas�o() {
		return Persuas�o;
	}

	public void setPersuas�o(boolean persuas�o) {
		Persuas�o = persuas�o;
	}

	public boolean isTelecinese() {
		return Telecinese;
	}

	public void setTelecinese(boolean telecinese) {
		Telecinese = telecinese;
	}

}
