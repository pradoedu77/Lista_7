package Ex1;

public class Padawan extends Jedi{

	private boolean ConstroiSabreLuz;
	private boolean TemTran�a;

	public Padawan(String Nome, boolean Genero, String Especie, String DataNascimento, String PlanetaNatal,
			int MidiChlorians, boolean Alive, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuasao, boolean ConstroiSabredeLuz, boolean TemTran�a) {
		super(Nome, Genero, Especie, DataNascimento, PlanetaNatal, MidiChlorians, Alive, PazInterna, Telepatia, Telecinese,
				Persuasao);
		this.setConstroiSabre(ConstroiSabredeLuz);
		this.setTemTran�a(TemTran�a);
	}
	
	public boolean isConstroiSabre() {
		return ConstroiSabreLuz;
	}
	public void setConstroiSabre(boolean constroiSabre) {
		ConstroiSabreLuz = constroiSabre;
	}
	public boolean isTemTran�a() {
		return TemTran�a;
	}
	public void setTemTran�a(boolean temTran�a) {
		TemTran�a = temTran�a;
	}

}