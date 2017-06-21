package br.edu.iffarroupilha.bolicho.controle;

import br.edu.iffarroupilha.bolicho.modelo.Aluno;
import br.edu.iffarroupilha.bolicho.modelo.Cliente;

public class AlunoControle  extends AControle {
	public String validarAluno(Aluno cli) {
		if (cli != null) {
			if( cli.getmatricula() == 0 ){
				return "Informe sua matricula";
			}else if( cli.getNome() == null || cli.getNome().isEmpty()){
				return "Por favor, informe um nome";
			}
			
		}else{
			return "Dados do Aluno não informado!";
		}
		return null;
	}

	public void gravar(Aluno c) {
		// TODO Auto-generated method stub
		
	}

	public int converteInteiro(String text) {
		// TODO Auto-generated method stub
		return 0;
	}
}
