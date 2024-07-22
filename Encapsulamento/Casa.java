//package Encapsulamento;
//
//public class Casa {
//
//	public static void main(String[] args) {
//		Pet cao1 = new Pet();
//		cao1.AjustarNome(null);
//		cao1.AjustarTipo(null);
//		cao1.AjustarIdade(0);
//		cao1.AjustarCor(null);
//		cao1.AjustarVacina(false);
//		
//	}
//
//}
package Encapsulamento;

public class Casa {

	public static void main(String[] args) {
		Pet cao1 = new Pet();
		cao1.setNome("Lucky");
		System.out.println(cao1.getNome());
		cao1.setTipo("Cachorro");
		System.out.println(cao1.getTipo());
		cao1.setIdade(1);
		System.out.println(cao1.getIdade());
		cao1.setCor("Marrom");
		System.out.println(cao1.getCor());
		cao1.setVacina(false);
		System.out.println(cao1.isVacina());
		
		
	}

}