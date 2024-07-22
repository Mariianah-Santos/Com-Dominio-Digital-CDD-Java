package Herença;

public class Faculdade {


	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Mariana", "710.005.584-95", "(81) 98318-0058");
		aluno1.Matricula = "198-1";
		System.out.printf("NOME: %s | CPF: %s | TELEFONE: %s | MATRICULA: %s", aluno1.nome, aluno1.cpf, aluno1.telefone, aluno1.Matricula);
		
		Professor professor1 = new Professor("Alycia Black", "987.556.345.09", "(87) 99876-0099");
		professor1.salario = 3.479;
		professor1.disciplina = "Fisica";
		
		System.out.println(" ");
		System.out.printf("NOME: %s | CPF: %s | TELEFONE: %s | SALARIO R$%f | DISCIPLINA: %s", professor1.nome, professor1.cpf, professor1.telefone, professor1.salario, professor1.disciplina);
		
	}
}
