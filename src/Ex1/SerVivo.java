package Ex1;

public abstract class SerVivo {
	
	private boolean Gen�ro;
	private String Esp�cie;
	private String DataNascimento;
	private boolean Alive;
	private String Nome;
	private String PlanetaNatal;
	private int Midichlorians;
	
	public SerVivo (String Nome, boolean Genero, String Especie, String DataNascimento, String PlanetaNatal, int MidiChlorians, boolean Alive){
		this.setGen�ro(Genero);
		this.setEsp�cie(Especie);
		this.setDataNascimento(DataNascimento);
		this.setAlive(Alive);
		this.setNome(Nome);
		this.setPlanetaNatal(PlanetaNatal);
		this.setMidiChlorians(MidiChlorians);
	}

	public boolean getGen�ro() {
		return Gen�ro;
	}

	public void setGen�ro(boolean gen�ro) {
		Gen�ro = gen�ro;
	}

	public String getEsp�cie() {
		return Esp�cie;
	}

	public void setEsp�cie(String esp�cie) {
		Esp�cie = esp�cie;
	}

	public String getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public boolean getAlive() {
		return Alive;
	}

	public void setAlive(boolean alive) {
		Alive = alive;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getPlanetaNatal() {
		return PlanetaNatal;
	}

	public void setPlanetaNatal(String planetaNatal) {
		PlanetaNatal = planetaNatal;
	}

	public int getMidiChlorians() {
		return Midichlorians;
	}

	public void setMidiChlorians(int midiChlorians) {
		Midichlorians = midiChlorians;
	}
	
	

}