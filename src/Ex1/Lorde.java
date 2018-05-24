package Ex1;

public class Lorde extends Sith {

	private int CampodeVidencia;
	private String DataPromoção;
	
	public Lorde(String Nome, boolean Genero, String Especie, String DataNascimento, String PlanetaNatal,
			int MidiChlorians, boolean Alive, String NovoNome, double PercentualdeRaiva, boolean Telepatia,
			boolean Telecinese, boolean Persuasão, int CampodeVidência, String DataPromoção) {
		super(Nome, Genero, Especie, DataNascimento, PlanetaNatal, MidiChlorians, Alive, NovoNome, PercentualdeRaiva, Telepatia,
				Telecinese, Persuasão);
		this.setCampodeVidência(CampodeVidência);
		this.setDataPromoção(DataPromoção);
	}

	public int getCampodeVidência() {
		return CampodeVidencia;
	}

	public void setCampodeVidência(int campodeVidência) {
		CampodeVidencia = campodeVidência;
	}

	public String getDataPromoção() {
		return DataPromoção;
	}

	public void setDataPromoção(String dataPromoção) {
		DataPromoção = dataPromoção;
	}

}