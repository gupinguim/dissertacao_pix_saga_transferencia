package com.ipt.dissertacao.ms.saga.transferencia.saga.definition;

import org.springframework.beans.factory.annotation.Autowired;

import com.ipt.dissertacao.ms.saga.transferencia.repositorio.TransferenciaRepository;

import io.eventuate.tram.commands.consumer.CommandWithDestination;
import io.eventuate.tram.sagas.orchestration.SagaDefinition;
import io.eventuate.tram.sagas.simpledsl.SimpleSaga;

public class TransferenciaNaoPrioritariaSaga implements SimpleSaga<TransferenciaNaoPrioritariaSagaData> {

	@Autowired
	private TransferenciaRepository transfRepository;
	
	@Override
	public SagaDefinition<TransferenciaNaoPrioritariaSagaData> getSagaDefinition() {
		return //definição da saga
				step()
					.invokeParticipant(this::validarCliente)
				.step()
					.invokeParticipant(this::registrarPagamento)
					.withCompensation(this::cancelarPagamento)
				.step()
					.invokeParticipant(this::reservarConta)
					.withCompensation(this::devolverSaldo)
				.step()
					.invokeParticipant(this::confirmarPagamento)					
				.build();
	}
	
	private CommandWithDestination cancelarPagamento(TransferenciaNaoPrioritariaSagaData data) {
		return null;
	}
	
	private CommandWithDestination validarCliente(TransferenciaNaoPrioritariaSagaData data) {
		return null;
	}

	private CommandWithDestination reservarConta(TransferenciaNaoPrioritariaSagaData data) {
		return null;
	}

	private CommandWithDestination devolverSaldo(TransferenciaNaoPrioritariaSagaData data) {
		return null;
	}

	private CommandWithDestination registrarPagamento(TransferenciaNaoPrioritariaSagaData data) {
		return null;
	}
	
	private CommandWithDestination confirmarPagamento(TransferenciaNaoPrioritariaSagaData data) {
		return null;

	}
}
