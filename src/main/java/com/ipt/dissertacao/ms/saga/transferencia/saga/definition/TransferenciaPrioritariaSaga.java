package com.ipt.dissertacao.ms.saga.transferencia.saga.definition;

import io.eventuate.tram.commands.consumer.CommandWithDestination;
import io.eventuate.tram.sagas.orchestration.SagaDefinition;
import io.eventuate.tram.sagas.simpledsl.SimpleSaga;

public class TransferenciaPrioritariaSaga implements SimpleSaga<TransferenciaPrioritariaSagaData> {
	
	@Override
	public SagaDefinition<TransferenciaPrioritariaSagaData> getSagaDefinition() {
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
				.step()
					.invokeParticipant(this::processarPagamento)
				.step()
					.invokeParticipant(this::efetivarConta)
				.build();
	}
	
	private CommandWithDestination cancelarPagamento(TransferenciaPrioritariaSagaData data) {
		return null;

	}
	
	private CommandWithDestination validarCliente(TransferenciaPrioritariaSagaData data) {
		return null;

	}

	private CommandWithDestination reservarConta(TransferenciaPrioritariaSagaData data) {
		return null;
	}

	private CommandWithDestination devolverSaldo(TransferenciaPrioritariaSagaData data) {
		return null;
	}

	private CommandWithDestination registrarPagamento(TransferenciaPrioritariaSagaData data) {
		return null;
	}
	
	private CommandWithDestination confirmarPagamento(TransferenciaPrioritariaSagaData data) {
		return null;
	}
	
	private CommandWithDestination processarPagamento(TransferenciaPrioritariaSagaData data) {
		return null;
	}
	
	private CommandWithDestination efetivarConta(TransferenciaPrioritariaSagaData data) {
		return null;
	}
}
