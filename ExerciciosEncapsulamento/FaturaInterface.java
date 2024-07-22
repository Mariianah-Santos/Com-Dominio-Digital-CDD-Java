package ExerciciosEncapsulamento;

public class FaturaInterface {

	public static void main(String[] args) {
		Fatura item1 = new Fatura("1", "Iphone", 0, 0);
		System.out.println("INFORMAÇÕES");
		System.out.printf("\nCÓDGIO: %s", item1.getCodigo());
		System.out.printf("\nDESCRIÇÃO DO PRODUTO: %s", item1.getDescricao());
		System.out.printf("\nQUANTIDADE: %d", item1.getQuantidade());
		System.out.println();
		System.out.println(item1.getPreco());
		System.out.println();
		System.out.println(item1.FaturaTotal());
	}

}
