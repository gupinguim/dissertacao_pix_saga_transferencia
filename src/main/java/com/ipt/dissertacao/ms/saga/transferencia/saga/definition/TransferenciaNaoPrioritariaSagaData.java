package com.ipt.dissertacao.ms.saga.transferencia.saga.definition;

public class TransferenciaNaoPrioritariaSagaData {
	String dictOrigem;

	String dictDestino;

	double valorPagamento;
	
	long idCliente;
	
	long idOrdemPagamento;
	
	long idContaCliente;

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

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public long getIdOrdemPagamento() {
		return idOrdemPagamento;
	}

	public void setIdOrdemPagamento(long idOrdemPagamento) {
		this.idOrdemPagamento = idOrdemPagamento;
	}

	public long getIdContaCliente() {
		return idContaCliente;
	}

	public void setIdContaCliente(long idContaCliente) {
		this.idContaCliente = idContaCliente;
	}
}
