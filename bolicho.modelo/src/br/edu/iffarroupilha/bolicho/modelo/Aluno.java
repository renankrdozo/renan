package br.edu.iffarroupilha.bolicho.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Aluno {

	@Id
	@Column(nullable = false)
	private int matricula;
	@Column(length = 40, nullable = false)
	private String nome;

	public int getmatricula() {
		return matricula;
	 }

	public void setmatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
