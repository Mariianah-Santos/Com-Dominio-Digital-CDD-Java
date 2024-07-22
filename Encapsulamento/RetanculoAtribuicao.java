//package Encapsulamento;
//
//public class RetanculoAtribuicao {
//
//	public static void main(String[] args) {
//		Retangulo r1 = new Retangulo();
//		r1.setBase(10);
//		r1.setAltura(20);
//		int area;
//		area = r1.getBase() * r1.getAltura();
//		System.out.printf("AREA DO RETANGULO: %d", area);
//		System.out.println();
//		int perimetro;
//		perimetro = 2 * (r1.getBase() + r1.getAltura());
//		System.out.printf("PERIMETRO DO RETANGULO: %d", perimetro);
//		
//	}
//
//}

//package Encapsulamento;
//
//public class RetanculoAtribuicao {
//
//	public static void main(String[] args) {
//		Retangulo r1 = new Retangulo();
//		r1.Altura(10.2);
//		r1.Base(20.1);
//		r1.Area();
//		r1.Perimetro();
//
//	}
//
//}

package Encapsulamento;

public class RetanculoAtribuicao {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo(10, 20);
		r1.Area();
		r1.Perimetro();

	}

}