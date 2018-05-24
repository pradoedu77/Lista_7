package Ex1;

public class Mestre extends Jedi{

	private int CampoDeVidencia;
	private boolean Imortalidade; 
	
	public Mestre(String Nome, boolean Genero, String Especie, String DataNascimento, String PlanetaNatal,
			int MidiChlorians, boolean Alive, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuasao, int CampodeVidencia, boolean Imortalidade) {
		super(Nome, Genero, Especie, DataNascimento, PlanetaNatal, MidiChlorians, Alive, PazInterna, Telepatia, Telecinese,
				Persuasao);
		
		this.setCampoDeVid�ncia(CampodeVidencia);
		this.setImortalidade(Imortalidade);
		
	}
	
	public int getCampoDeVid�ncia() {
		return CampoDeVidencia;
	}
	public void setCampoDeVid�ncia(int campoDeVid�ncia) {
		CampoDeVidencia = campoDeVid�ncia;
	}
	public boolean isImortalidade() {
		return Imortalidade;
	}
	public void setImortalidade(boolean imortalidade) {
		Imortalidade = imortalidade;
	}
}
