package br.edu.iffarroupilha.bolicho.controle;
/**
*<p>
* 
*</p>
**/
public class VendaControle extends AControle {
	/**
	 * <p>
	 * Valida se os dados da venda
	 * </p>
	 */
	public String validarVenda(venda cli) {
		if (cli != null) {
			if( cli.getVenda() == 0 ){
				return "Informe o valor venda";
			}else if( cli.getCliente() == null || cli.getCliente().isEmpty()){
				return "Por favor, informe o cliente";
			}
			
		}else{
			return "Dados da venda não informado!";
		}
		return null;
	}

}