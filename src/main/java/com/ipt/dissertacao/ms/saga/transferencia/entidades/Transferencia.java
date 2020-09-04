package com.ipt.dissertacao.ms.saga.transferencia.entidades;

import javax.persistence.*;

@Entity(name="transferencia")
public class Transferencia {

	@Id
	long id;
	
	@Column
	String status;
	
	@Column
	String dictOrigem;
	
	@Column
	String dictDestino;
	
	@Column
	double valorPagamento;
}
