package Aluno;

//TODO Teste da View Task

public class Aluno {
	private String nome;
	private int documento;
	private int idade;
	private char sexo;
	private double nota;

	protected void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}


	public int getDocumento() {
		return documento;
	}

	protected void setDocumento(int documento) {
		this.documento = documento;
	}

	public int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	protected void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getNota() {
		return nota;
	}

	protected double atribuitNota(double nota) {
		this.nota = nota;
		return nota;
	}

}
