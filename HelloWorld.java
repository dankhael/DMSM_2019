package hello_world;

import java.util.Calendar;

public class HelloWorld {
	Calendar data = Calendar.getInstance();
	int hora = data.get(Calendar.HOUR_OF_DAY);
	int minuto = data.get(Calendar.MINUTE);
	int segundo = data.get(Calendar.SECOND);
	private String nome;
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void imprimir() {
		System.out.println(hora + ":" + minuto + ":" + segundo + " - Olá " +  this.getNome() + 
				". Você acabou de fazer seu primeiro Hello World em Java. Parabéns");
	}
}
