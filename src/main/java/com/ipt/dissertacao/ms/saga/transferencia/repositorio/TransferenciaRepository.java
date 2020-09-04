package com.ipt.dissertacao.ms.saga.transferencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ipt.dissertacao.ms.saga.transferencia.entidades.*;
import java.util.List;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {

	Transferencia findById(long id);
	List<Transferencia> findAllByStatus(String status);
}
