package com.ipt.dissertacao.ms.saga.transferencia.saga.definition;

import io.eventuate.tram.commands.consumer.CommandWithDestination;
import io.eventuate.tram.sagas.orchestration.SagaDefinition;
import io.eventuate.tram.sagas.simpledsl.SimpleSaga;

public class TransferenciaNaoPrioritariaSaga implements SimpleSaga<TransferenciaSagaData> {

	@Override
	public SagaDefinition<TransferenciaSagaData> getSagaDefinition() {
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
	
	private CommandWithDestination cancelarPagamento(TransferenciaSagaData data) {
		return null;

	}
	
	private CommandWithDestination validarCliente(TransferenciaSagaData data) {
		return null;

	}

	private CommandWithDestination reservarConta(TransferenciaSagaData data) {
		return null;
	}

	private CommandWithDestination devolverSaldo(TransferenciaSagaData data) {
		return null;
	}

	private CommandWithDestination registrarPagamento(TransferenciaSagaData data) {
		return null;
	}
	
	private CommandWithDestination confirmarPagamento(TransferenciaSagaData data) {
		return null;

	}
}
