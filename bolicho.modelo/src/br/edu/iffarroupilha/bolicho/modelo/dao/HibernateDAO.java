package br.edu.iffarroupilha.bolicho.modelo.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.edu.iffarroupilha.bolicho.modelo.Cliente;

public class HibernateDAO {
	private static SessionFactory fabrica;
	static {
		// depois adicionar as demais entidades
		// apos ter feito o mapeamento
		Configuration ctg = new Configuration();
		ctg.addAnnotatedClass(Cliente.class);
		ctg.configure();
		// forma mains facio de criar fabrica
		fabrica = ctg.buildSessionFactory();
	}

	public static Session getSessao() {
		return fabrica.openSession();
	}

}
