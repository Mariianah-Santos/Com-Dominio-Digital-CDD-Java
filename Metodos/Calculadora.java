package Metodos;

import java.util.Scanner;

class Calculadora {

	public static void main(String[] args) {
//		SomarMetdos calc = new SomarMetdos();
//		SomarMetdos div = new SomarMetdos();
//		int resultado = calc.somar(10, 90);
//		System.out.println(resultado);
//		System.out.println(calc.somar(10, 70, 20));
//		
		SomarMetdos a1 = new SomarMetdos();
		SomarMetdos aMulti = new SomarMetdos();
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o primeiro numero para dividr => ");
		double a2 = teclado.nextDouble();
		
		System.out.print("Digite o segundo numero para dividr => ");
		double b2 = teclado.nextDouble();
		
		System.out.print("Qual o primeiro numero a multiplica? ");
		int amulti = teclado.nextInt();
		
		System.out.print("Qual o segindo numero a multiplica? ");
		int bmulti = teclado.nextInt();
		
		System.out.println(a1.dividir(a2, b2));
		System.out.println(aMulti.multi(amulti, bmulti));
		
		teclado.close();
	}
}
