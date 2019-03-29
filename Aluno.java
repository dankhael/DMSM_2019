package mpoo_p2;

public class Aluno {
	private int anoEntrada;
	
	public void setEntrada(int ano) {
		this.anoEntrada = ano;
	}
	
	public int getEntrada() {
		return this.anoEntrada;
	}
	
	private int periodo;
	
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	public int getPeriodo() {
		return this.periodo;
	}
	
	private Pessoa pessoa;
	
	public void setPessoa(String nome, int cpf, String cidade, String rua, int numero, String complemento) {
		Pessoa p = new Pessoa();
		p.criarPessoa(nome, cpf, cidade, rua, numero, complemento);
		this.pessoa = p;
	}
	
	public Pessoa getPessoa() {
		return this.pessoa;
	}
	
	public void imprimir() {
		System.out.println("Ano de Entrada: " + this.getEntrada());
		System.out.println("Periodo de Entrada: " + this.getPeriodo());
	}
}
