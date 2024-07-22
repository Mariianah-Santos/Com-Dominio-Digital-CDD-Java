//package Encapsulamento;
//
//public class Retangulo {
//	private int base;
//	private int altura;
//	
//	public int getBase() {
//		return base;
//	}
//	public void setBase(int base) {
//		this.base = base;
//	}
//	public int getAltura() {
//		return altura;
//	}
//	public void setAltura(int altura) {
//		this.altura = altura;
//	}
//	
//	
//}

//package Encapsulamento;
//
//public class Retangulo {
//	private double base;
//	private double altura;
//	
//	
//	public double Base(Double base) {
//		return this.base = base;
//	}
//	public double Altura(Double altura) {
//		return this.altura = altura;
//	}
//	
//	public void Area() {
//		double area = base * altura;
//		System.out.println(area);
//	}
//	
//	public void Perimetro() {
//		double perimetro = 2 * (base + altura);
//		System.out.println(perimetro);
//	}
//	
//	
//}

package Encapsulamento;

public class Retangulo {
	private double base;
	private double altura;
	
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void Area() {
		double area = base * altura;
		System.out.println(area);
	}
	
	public void Perimetro() {
		double perimetro = 2 * (base + altura);
		System.out.println(perimetro);
	}
	
	
}

