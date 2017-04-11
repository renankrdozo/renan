package br.edu.iffarroupilha.bolicho.controle;

import br.edu.iffarroupilha.bolicho.modelo.Cliente;
import br.edu.iffarroupilha.bolicho.modelo.Produto;

/**
 * <p>
 * Classe que concentra as lógicas ligadas ao produto
 * </p>
 **/

public class ProdutoControle extends AControle{
	
	/**
	 * <p>
	 * Valida se os dados do cliente est�o corretos
	 * </p>
	 * @param cli
	 * @return
	 */
	public String validarProduto(Produto Pre){
		if (Pre != null) {
			if (Pre.getPreco() == 0) {
				return "Informe o pre�o";
			} else if(Pre.getDescricao() == null || Pre.getDescricao().isEmpty()){
				return "Por favor, informe uma descri��o ao produto";
			}
		} else {
			return "Dados do produto n�o informado!";
		}
		return null;
	}


}