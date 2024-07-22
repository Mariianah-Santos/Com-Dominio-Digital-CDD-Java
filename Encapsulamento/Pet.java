//package Encapsulamento;
//
//public class Pet {
//	private String nome;
//	private String tipo;
//	private int idade;
//	private String cor;
//	private boolean vacina;
//	
//	public void AjustarNome(String nome) {
//		this.nome = nome;
//		System.out.println("NOME: Lucky");
//	}
//	public void AjustarTipo(String tipo) {
//		this.tipo = tipo;
//		System.out.println("RAÇA: Cachorro");
//	}
//	public void AjustarIdade(int idade) {
//		this.idade = idade;
//		System.out.println("ANO: Tem 1 ano");
//	}
//	public void AjustarCor(String cor) {
//		this.cor = cor;
//		System.out.println("COR: MARROM");
//	}
//	public void AjustarVacina(boolean vacina) {
//		this.vacina = vacina;
//		System.out.println("VACINAÇÃO ESTA EM DIA: VERDADEIRA");
//	}
//}

package Encapsulamento;

public class Pet {
	private String nome;
	private String tipo;
	private int idade;
	private String cor;
	private boolean vacina;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isVacina() {
		return vacina;
	}
	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}
}
