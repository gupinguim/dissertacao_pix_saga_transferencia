package com.ipt.dissertacao.ms.saga.transferencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ipt.dissertacao.ms.saga.transferencia.entidades.Transferencia;
import com.ipt.dissertacao.ms.saga.transferencia.repositorio.TransferenciaRepository;
import com.ipt.dissertacao.ms.saga.transferencia.service.TransferenciaService;

@RestController
public class TransferenciaController {

	@Autowired
	private TransferenciaRepository transferenciaRepository;

	@GetMapping("/transferencias/hello")
	public String pagamentosRecuperarPorCliente() {
		return "Ola humano";
	}

	@GetMapping("/transferencias/{id_transferencia}")
	public Transferencia transfereciaRecuperar(@PathVariable long id) {
		return transferenciaRepository.findById(id);
	}

	@PostMapping("transferencias")
	public String efetuarTransferencia() {

		return "Para realizar uma transferencia, utilize as rotas /nao_prioritaria ou /prioritaria";
	}

	@PostMapping("transferencias/nao_prioritaria")
	public String efetuarTransferenciaNaoPrioritaria(@RequestBody Transferencia data) {
		Transferencia t = new TransferenciaService().efetuarTransferenciaNaoPrioritaria(data);

		return String.format("Transferencia %d em processamento.", t.getId());
	}

	@PostMapping("transferencias/prioritaria")
	public String efetuarTransferenciaPrioritaria(@RequestBody Transferencia data) {
		Transferencia t = new TransferenciaService().efetuarTransferenciaPrioritaria(data);

		return String.format("Transferencia %d em processamento.", t.getId());
	}
}
