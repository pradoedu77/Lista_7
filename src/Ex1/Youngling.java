package Ex1;

public class Youngling extends Jedi{
	private String cl�n;
	private boolean ColetaDeCristais;
	public Youngling(String Nome, boolean Genero, String Especie, String DataNascimento, String PlanetaNatal,
			int MidiChlorians, boolean Alive, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuasao, String cl�n, boolean ColetaDeCristais) {
		super(Nome, Genero, Especie, DataNascimento, PlanetaNatal, MidiChlorians, Alive, PazInterna, Telepatia, Telecinese,
				Persuasao);
	this.setCl�(cl�n);
	this.setColetaDeCristais(ColetaDeCristais);
	}

	
	public String getCl�() {
		return cl�n;
	}
	public void setCl�(String cl�) {
		this.cl�n = cl�;
	}
	public boolean isColetaDeCristais() {
		return ColetaDeCristais;
	}
	public void setColetaDeCristais(boolean coletaDeCristais) {
		ColetaDeCristais = coletaDeCristais;
	}
	
}
