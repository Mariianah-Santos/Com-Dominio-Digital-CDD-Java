package Polimorfismo;

public abstract class AtribuicaoDinamico {

	public String nome;
	public int idade;
	
	public AtribuicaoDinamico(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public void soma() {
		System.out.println("SOMEI");
	}
}
