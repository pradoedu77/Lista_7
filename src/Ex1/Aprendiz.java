package Ex1;

public class Aprendiz  extends Sith{

	private String Treinador;
	private boolean ConstroiSabredeLuz;
	
	public Aprendiz(String Nome, boolean Genero, String Especie, String DataNascimento, String PlanetaNatal,
			int MidiChlorians, boolean Alive, String NovoNome, double PercentualdeRaiva, boolean Telepatia,
			boolean Telecinese, boolean Persuas�o, String Treindaor, boolean ConstruirSabredeLuz) {
		super(Nome, Genero, Especie, DataNascimento, PlanetaNatal, MidiChlorians, Alive, NovoNome, PercentualdeRaiva, Telepatia,
				Telecinese, Persuas�o);
		this.setTreinador(Treinador);
		this.setConstruirSabredeLuz(ConstruirSabredeLuz);

	}

	public String getTreinador() {
		return Treinador;
	}

	public void setTreinador(String treinador) {
		Treinador = treinador;
	}

	public boolean isConstruirSabredeLuz() {
		return ConstroiSabredeLuz;
	}

	public void setConstruirSabredeLuz(boolean construirSabredeLuz) {
		ConstroiSabredeLuz = construirSabredeLuz;
	}

}
