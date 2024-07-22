package JavaPOO;

public class ClasseTeste {

	public static void main(String[] args) {
		ClassePessoa aluno1 = new ClassePessoa();
		aluno1.nome = "Mariana";
		System.out.printf("%s ",aluno1.nome);
		aluno1.comer();
	}

}
