package br.edu.iffarroupilha.bolicho.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Venda {
	@Id
	@Column(nullable = false)
	private int idVenda;
	@Column(length = 40, nullable = false)
	private Cliente cliente;
	private Date data;

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}}
	
	