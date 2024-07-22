package ExInterface.Olimpiada;

public class Atleta implements Corredor, Ciclista {

	private String nome;
	private double peso;
	private double altura;
	
	public Atleta(String nome, double peso, double altura) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	   public void correr() {
	        System.out.println(nome + " está competindo na corrida!");
	   }

	@Override
	public void pedalar() {
		System.out.println(nome + " está a todo vapo na bike!");
		
	}
	
	public static void main(String[]args) {
		Atleta correr1 = new Atleta("Mariana", 53, 1.64);
		correr1.correr();
		Atleta bike1 = new Atleta("Mariana", 53, 1.64);
		bike1.pedalar();
		Atleta batleta = new Atleta("Mariana", 53, 1.64);
		batleta.correr();
		batleta.pedalar();
	}
}

