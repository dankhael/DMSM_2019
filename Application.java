package mpoo_p2;

public class Application {
	public static void main(String args[]) {
		Aluno d = new Aluno();
		d.setEntrada(2018);
		d.setPeriodo(1);
		d.setPessoa("Danilo", 111, "Recife", "Avenida Massa", 123, "Mundo");
		d.imprimir();
		d.getPessoa().imprimir();
		
		Professor g = new Professor();
		g.setAdmissao();
		g.setPessoa("Gabriel", 000, "Recife", "Rua Top", 984, "Planeta");
		g.imprimir();
		g.getPessoa().imprimir();
	}
}
