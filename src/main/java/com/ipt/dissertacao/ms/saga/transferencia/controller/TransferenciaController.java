package com.ipt.dissertacao.ms.saga.transferencia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferenciaController {

	@GetMapping("/transferencias/hello")
	public String pagamentosRecuperarPorCliente() {
		return "Ola humano";
	}
}
