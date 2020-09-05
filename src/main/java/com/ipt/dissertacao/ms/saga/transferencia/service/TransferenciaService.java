package com.ipt.dissertacao.ms.saga.transferencia.service;

import io.eventuate.tram.sagas.orchestration.SagaManager;

import java.util.List;
import com.ipt.dissertacao.ms.saga.transferencia.saga.definition.*;
import com.ipt.dissertacao.ms.saga.transferencia.entidades.*;
import com.ipt.dissertacao.ms.saga.transferencia.repositorio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TransferenciaService {

	@Autowired
	private SagaManager<TransferenciaNaoPrioritariaSagaData> transferenciaNaoPrioritariaSagaManager;

	@Autowired
	private TransferenciaRepository transferenciaRepository;

	@Transactional
	public Transferencia efetuarTransferenciaNaoPrioritaria(Transferencia data) {
		Transferencia transf = transferenciaRepository.save(data);

		TransferenciaNaoPrioritariaSagaData transferenciaSagaData = new TransferenciaNaoPrioritariaSagaData();
		transferenciaNaoPrioritariaSagaManager.create(transferenciaSagaData);

		return transf;
	}
	
	@Transactional
	public Transferencia efetuarTransferenciaPrioritaria(Transferencia data) {
		Transferencia transf = transferenciaRepository.save(data);

		TransferenciaNaoPrioritariaSagaData transferenciaSagaData = new TransferenciaNaoPrioritariaSagaData();
		transferenciaNaoPrioritariaSagaManager.create(transferenciaSagaData);

		return transf;
	}

	public List<Transferencia> findAllCompletedTransferencias() {
		return transferenciaRepository.findAllByStatus("completed");
	}

	public List<Transferencia> findAllRunningTransferencias() {
		return transferenciaRepository.findAllByStatus("running");
	}

	
	public Transferencia findOne(long id) {
		return transferenciaRepository.findById(id);
	}
}
