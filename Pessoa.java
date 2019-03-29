package mpoo_p2;

public class Pessoa {
	private String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	private int cpf;
	
	public void setCPF(int cpf) {
		this.cpf = cpf;
	}
	
	public int getCPF() {
		return this.cpf;
	}
	
	private Endere�o endereco;
	
	public void setEndereco(String cidade, String rua, int numero, String complemento) {
		Endere�o e = new Endere�o();
		e.criarEndereco(cidade, rua, numero, complemento);
		this.endereco = e;
	}
	public void criarPessoa(String nome, int cpf, String cidade, String rua, int numero, String complemento) {
		this.setNome(nome);
		this.setCPF(cpf);
		this.setEndereco(cidade, rua, numero, complemento);
	}
	
	public void imprimir() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCPF());
		System.out.println("Endere�o:");
		System.out.println("  Cidade: " + this.endereco.getCidade());
		System.out.println("  Rua: " + this.endereco.getRua());
		System.out.println("  N�mero: " + this.endereco.getNumero());
		System.out.println("  Complemento: " + this.endereco.getComplemento());
	}
	
}
