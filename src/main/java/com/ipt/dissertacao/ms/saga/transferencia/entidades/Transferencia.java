package com.ipt.dissertacao.ms.saga.transferencia.entidades;

import javax.persistence.*;

@Entity(name = "transferencia")
public class Transferencia {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transf_sequence")
	@SequenceGenerator(name = "transf_sequence", sequenceName = "pgto_seq")
	long id;

	@Column(name = "status")
	String status;

	@Column(name = "dict_origem")
	String dictOrigem;

	@Column(name = "dict_destino")
	String dictDestino;

	@Column(name = "valor_pagamento")
	double valorPagamento;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDictOrigem() {
		return dictOrigem;
	}

	public void setDictOrigem(String dictOrigem) {
		this.dictOrigem = dictOrigem;
	}

	public String getDictDestino() {
		return dictDestino;
	}

	public void setDictDestino(String dictDestino) {
		this.dictDestino = dictDestino;
	}

	public double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}
}
