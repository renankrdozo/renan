package br.edu.iffarroupilha.bolicho.visao.web;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.edu.iffarroupilha.bolicho.controle.AlunoControle;
import br.edu.iffarroupilha.bolicho.modelo.Aluno;
@Resource
public class AlunoController {
	private AlunoControle controle;
	private Result result;

	public AlunoController(AlunoControle controle,
			                           Result result) {
		this.controle = controle;
		this.result = result;
	}
		
	public void listar(){
		List itens = controle.buscarTodos(Aluno.class);
		result.include("Aluno", itens);
	}
	
	

	// carrega a visao para adicionar um item 
	public void cadastrar(){
		
	}
	
	public void gravar(Aluno aluno){
		controle.gravar( aluno  );
	}
	
}
