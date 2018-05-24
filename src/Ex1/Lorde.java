package Ex1;

public class Lorde extends Sith {

	private int CampodeVidencia;
	private String DataPromo��o;
	
	public Lorde(String Nome, boolean Genero, String Especie, String DataNascimento, String PlanetaNatal,
			int MidiChlorians, boolean Alive, String NovoNome, double PercentualdeRaiva, boolean Telepatia,
			boolean Telecinese, boolean Persuas�o, int CampodeVid�ncia, String DataPromo��o) {
		super(Nome, Genero, Especie, DataNascimento, PlanetaNatal, MidiChlorians, Alive, NovoNome, PercentualdeRaiva, Telepatia,
				Telecinese, Persuas�o);
		this.setCampodeVid�ncia(CampodeVid�ncia);
		this.setDataPromo��o(DataPromo��o);
	}

	public int getCampodeVid�ncia() {
		return CampodeVidencia;
	}

	public void setCampodeVid�ncia(int campodeVid�ncia) {
		CampodeVidencia = campodeVid�ncia;
	}

	public String getDataPromo��o() {
		return DataPromo��o;
	}

	public void setDataPromo��o(String dataPromo��o) {
		DataPromo��o = dataPromo��o;
	}

}