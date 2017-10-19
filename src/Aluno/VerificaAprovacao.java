package Aluno;

import Curso.Curso;

public class VerificaAprovacao {

	public static void main(String[] args) {

		Curso poo = new Curso();
		Aluno aluno1 = new Aluno();

		aluno1.setNome("João");
		aluno1.atribuitNota(7.7);

		String resultado = poo.verificaResultado(aluno1.getNota());

		System.out.println("O aluno " + aluno1.getNome() + " obteve o resultado: " + resultado);

	}

}
