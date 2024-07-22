package Metodos;

import java.util.Scanner;

public class MenuMetodo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		SomarMetdos calculo = new SomarMetdos();
		System.out.print("MENU ESCOLHA UMA OPÇÃO: \n[1] - soma \n[2] - dividir \n[3] - multiplicar \n[4] - subtrair \nQUAL OPÇÃO => ");
		int opcaoCalc = teclado.nextInt();
		
		System.out.print("QUAL NUMEROS QUER FAZER ALGO? \n[1] - com 2 numeros \n[2] - com 3 numeros \nQUAL OPÇÃO =>");
		int opcaoNum = teclado.nextInt();
		
		if (opcaoNum == 1) {
			if (opcaoCalc == 1) {
				System.out.print("PRIMEIRO NUMERO => ");
				int num1 = teclado.nextInt();
				System.out.print("SEGUNDO NUMERO => ");
				int num2 = teclado.nextInt();
				System.out.println(calculo.somar(num1, num2));
				}
			}
		if (opcaoNum == 2) {
			if (opcaoCalc == 1) {
				System.out.print("PRIMEIRO NUMERO => ");
				int num1 = teclado.nextInt();
				System.out.print("SEGUNDO NUMERO => ");
				int num2 = teclado.nextInt();
				System.out.print("TERCEIRO NUMERO => ");
				int num3 = teclado.nextInt();
				System.out.println(calculo.somar(num1, num2, num3));
				
			}
		}
		
		if (opcaoNum == 1) {
			if (opcaoCalc == 2) {
				System.out.print("PRIMEIRO NUMERO => ");
				int num1 = teclado.nextInt();
				System.out.print("SEGUNDO NUMERO => ");
				int num2 = teclado.nextInt();
				System.out.println(calculo.dividir(num1, num2));
				}
			}
		if (opcaoNum == 2) {
			if (opcaoCalc == 2) {
				System.out.print("PRIMEIRO NUMERO => ");
				int num1 = teclado.nextInt();
				System.out.print("SEGUNDO NUMERO => ");
				int num2 = teclado.nextInt();
				System.out.print("TERCEIRO NUMERO => ");
				int num3 = teclado.nextInt();
				System.out.println(calculo.dividir(num1, num2, num3));
				
			}
		}
		
		if (opcaoNum == 1) {
			if (opcaoCalc == 3) {
				System.out.print("PRIMEIRO NUMERO => ");
				int num1 = teclado.nextInt();
				System.out.print("SEGUNDO NUMERO => ");
				int num2 = teclado.nextInt();
				System.out.println(calculo.multi(num1, num2));
				}
			}
		if (opcaoNum == 2) {
			if (opcaoCalc == 3) {
				System.out.print("PRIMEIRO NUMERO => ");
				int num1 = teclado.nextInt();
				System.out.print("SEGUNDO NUMERO => ");
				int num2 = teclado.nextInt();
				System.out.print("TERCEIRO NUMERO => ");
				int num3 = teclado.nextInt();
				System.out.println(calculo.multi(num1, num2, num3));
				
			}
		}
		
		if (opcaoNum == 1) {
			if (opcaoCalc == 4) {
				System.out.print("PRIMEIRO NUMERO => ");
				int num1 = teclado.nextInt();
				System.out.print("SEGUNDO NUMERO => ");
				int num2 = teclado.nextInt();
				System.out.println(calculo.sub(num1, num2));
				}
			}
		if (opcaoNum == 2) {
			if (opcaoCalc == 4) {
				System.out.print("PRIMEIRO NUMERO => ");
				int num1 = teclado.nextInt();
				System.out.print("SEGUNDO NUMERO => ");
				int num2 = teclado.nextInt();
				System.out.print("TERCEIRO NUMERO => ");
				int num3 = teclado.nextInt();
				System.out.println(calculo.sub(num1, num2, num3));
				
			}
		}
		teclado.close();		
	} 

}