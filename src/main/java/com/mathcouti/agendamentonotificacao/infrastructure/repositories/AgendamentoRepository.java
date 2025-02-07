package com.mathcouti.agendamentonotificacao.infrastructure.repositories;

import com.mathcouti.agendamentonotificacao.infrastructure.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
