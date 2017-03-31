package br.edu.iffarroupilha.bolicho.controle;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session.*;

/**
 * <p>
 * controlador genérico que agrupa as funções comuns de lógicas, como gravar,
 * buscar etc
 * </p>
 */
public abstract class AControle {
	// gravar ou atualizar uma informação
	// em banco
	public void gravar(Object entidade) {
		Session sessao = HibernateDAO.getSessao();
		sessao.getTransaction().begin();
		sessao.saveOrUpdate(entidade);
		sessao.getTransaction().commit();
		

	}

	// busca todos os registros de uma
	// determinada entidade (classe)
	public List buscarTodos(Class classe) {
		return null;
	}

	// excluir entidades
	public void excluir(Object entidade) {

	}

	/**
	 * <p>
	 * Converte um termo em numero, caso esteja em formato invpalido retorna-se
	 * zero
	 * </p>
	 */
	public int converteInteiro(String termo) {
		try {
			return Integer.parseInt(termo);
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * <p>
	 * Converte um termo em numero com casas decimais,
	 *  caso esteja em formato invpalido retorna-se
	 * zero
	 * </p>
	 */
	public float converteFlutuante(String termo) {
		try {
			return Float.parseFloat(termo);
		} catch (Exception e) {
			return 0;
		}
	}

}