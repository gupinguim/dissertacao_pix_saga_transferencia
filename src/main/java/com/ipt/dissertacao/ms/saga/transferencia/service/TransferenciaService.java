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
	private SagaManager<TransferenciaSagaData> transferenciaSagaManager;

	@Autowired
	private TransferenciaRepository transferenciaRepository;

	@Transactional
	public Transferencia efetuarTransferenciaNaoPrioritaria(Transferencia data) {
		Transferencia transf = transferenciaRepository.save(data);

		TransferenciaSagaData transferenciaSagaData = new TransferenciaSagaData();
		transferenciaSagaManager.create(transferenciaSagaData);

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
