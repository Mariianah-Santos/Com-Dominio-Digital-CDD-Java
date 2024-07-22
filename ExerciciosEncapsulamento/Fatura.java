package ExerciciosEncapsulamento;

public class Fatura {

	private String codigo;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Fatura(String codigo, String descricao, int quantidade, double preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		if (preco > 0) {
			System.out.printf("PREÇO R$");
		} else {
			System.out.printf("NEGATIVO PREÇO R$");
		}
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double FaturaTotal() {
		double faturaTotal = (quantidade * preco);
		if (faturaTotal > 0) {
			System.out.printf("fatura Total R$");
		} else {
			System.out.printf("Fatura Total R$");
		}
		return faturaTotal;
	}

	

}
