package br.edu.iffarroupilha.bolicho.visao.web;

import java.util.List;

import br.com.caelum.vraptor.Result;
import br.edu.iffarroupilha.bolicho.controle.ClienteControle;
import br.edu.iffarroupilha.bolicho.modelo.Aluno;
import br.edu.iffarroupilha.bolicho.modelo.Cliente;

public class AlunoControler {
	private AlunoControler controle;
	private Result result;

	public AlunoControler(AlunoControler controle,
			                           Result result) {
		this.controle = controle;
		this.result = result;
	}
		
	public void listar(){
		List itens = controle.buscarTodos(Aluno.class);
		result.include("Aluno", itens);
	}
	
	private List buscarTodos(Class<Aluno> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	// carrega a visao para adicionar um item 
	public void cadastrar(){
		
	}
	
	public void gravar(Aluno aluno){
		controle.gravar( aluno  );
	}
	
}
