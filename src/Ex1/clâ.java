package Ex1;

public class cl� {
	private String Lider;
	private String Nome;
	private String DataCria��o;
	private String DataFim;
	public cl�(String Lider, String Nome, String DataCria��o, String DataFim) {
		this.Lider = Lider;
		this.Nome = Nome;
		this.DataCria��o = DataCria��o;
		this.DataFim = DataFim;
	}
	public String getLider() {
		return Lider;
	}
	public void setLider(String lider) {
		Lider = lider;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDataCria��o() {
		return DataCria��o;
	}
	public void setDataCria��o(String dataCria��o) {
		DataCria��o = dataCria��o;
	}
	public String getDataFim() {
		return DataFim;
	}
	public void setDataFim(String dataFim) {
		DataFim = dataFim;
	}
}
