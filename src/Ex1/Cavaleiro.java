package Ex1;

public class Cavaleiro extends Jedi{
	
	String DataPromo��o;
	
	public Cavaleiro(String Nome, boolean Genero, String Especie, String DataNascimento, String PlanetaNatal,
			int MidiChlorians, boolean Alive, double PazInterna, boolean Telepatia, boolean Telecinese,
			boolean Persuasao, String DataPromocao) {
		super(Nome, Genero, Especie, DataNascimento, PlanetaNatal, MidiChlorians, Alive, PazInterna, Telepatia, Telecinese,
				Persuasao);
		this.setDataPromo��o(DataPromocao);
	}

	public String getDataPromo��o() {
		return DataPromo��o;
	}
	public void setDataPromo��o(String dataPromo��o) {
		DataPromo��o = dataPromo��o;
	}
}
	