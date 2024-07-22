package Polimorfismo;

public class Atribuicao {

	public int num1;
	public int num2;
	public int num3;
	
	public Atribuicao(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
	public Atribuicao(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	
	}

	public static void main(String[]args) {
		Atribuicao soma1 = new Atribuicao(10, 20);
		int somaEstatico1 = soma1.num1 + soma1.num2;
		System.out.printf("Polimorfismo Estatico com duas atribuição: %d",somaEstatico1);
		System.out.println();
		Atribuicao soma2 = new Atribuicao(10, 80, 10);
		int somaEstatico2 = soma2.num1 + soma2.num2 + soma2.num3;
		System.out.printf("Polimorfismo Estatico com três atribuição: %d",somaEstatico2);
	}
}
