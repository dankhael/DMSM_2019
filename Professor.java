package mpoo_p2;

import java.util.Date;

public class Professor {
	private Date anoAdmissao;
	
	public void setAdmissao() {
		this.anoAdmissao = new Date();
		this.anoAdmissao.getDate();
	}
	
	public Date getDate() {
		return this.anoAdmissao;
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
		System.out.println("Data de Admissão: " + this.getDate());
	}
}
