package Ex1;

public class SabreDeLuz {
	private String CorCristal;
	private String Punho;
	public SabreDeLuz (String Cor, String Punho){
		this.CorCristal = Cor;
		this.Punho = Punho;
	}
	public String getCor() {
		return CorCristal;
	}
	public void setCor(String cor) {
		CorCristal = cor;
	}
	public String getPunho() {
		return Punho;
	}
	public void setPunho(String punho) {
		Punho = punho;
	}
}
