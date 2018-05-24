package Ex1;

public class Youngling extends Jedi{
	private String clãn;
	private boolean ColetaDeCristais;
	public Youngling(String Nome, boolean Genero, String Especie, String DataNascimento, String PlanetaNatal,
			int MidiChlorians, boolean Alive, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuasao, String clãn, boolean ColetaDeCristais) {
		super(Nome, Genero, Especie, DataNascimento, PlanetaNatal, MidiChlorians, Alive, PazInterna, Telepatia, Telecinese,
				Persuasao);
	this.setClã(clãn);
	this.setColetaDeCristais(ColetaDeCristais);
	}

	
	public String getClã() {
		return clãn;
	}
	public void setClã(String clã) {
		this.clãn = clã;
	}
	public boolean isColetaDeCristais() {
		return ColetaDeCristais;
	}
	public void setColetaDeCristais(boolean coletaDeCristais) {
		ColetaDeCristais = coletaDeCristais;
	}
	
}
