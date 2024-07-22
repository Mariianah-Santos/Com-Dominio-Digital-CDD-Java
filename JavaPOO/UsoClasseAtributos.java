package JavaPOO;

public class UsoClasseAtributos {

	public static void main(String[] args) {
		AtributosClasses cliente1 = new AtributosClasses();
		System.out.println(cliente1.fnome);
		System.out.println(cliente1.inome);
		System.out.println(cliente1.idade);
		System.out.printf("O aluno %S %s tem %d anos", cliente1.fnome, cliente1.inome, cliente1.idade);
		
	}

}
