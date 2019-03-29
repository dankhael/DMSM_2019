package mpoo_p2;

public class Endereço {
	private String cidade;
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	private  String rua;
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getRua() {
		return this.rua;
	}
	
	private int numero;
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	private String complemento;
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getComplemento() {
		return this.complemento;
	}
	
	public void criarEndereco(String cidade, String rua, int numero, String complemento) {
		this.setCidade(cidade);
		this.setRua(rua);
		this.setNumero(numero);
		this.setComplemento(complemento);
		
		
	}
}
