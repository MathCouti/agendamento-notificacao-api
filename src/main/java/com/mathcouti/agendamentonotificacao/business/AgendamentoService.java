package com.mathcouti.agendamentonotificacao.business;

import com.mathcouti.agendamentonotificacao.business.mapper.IAgendamentoMapper;
import com.mathcouti.agendamentonotificacao.controller.dto.in.AgendamentoRecord;
import com.mathcouti.agendamentonotificacao.controller.dto.out.AgendamentoRecordOut;
import com.mathcouti.agendamentonotificacao.infrastructure.exception.NotFoundException;
import com.mathcouti.agendamentonotificacao.infrastructure.repositories.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@Service
@RequiredArgsConstructor
public class AgendamentoService {


    private final AgendamentoRepository repository;
    private final IAgendamentoMapper agendamentoMapper;

    public AgendamentoRecordOut gravarAgendamento(AgendamentoRecord agendamento){
        return agendamentoMapper.paraOut(
                repository.save(
                        agendamentoMapper.paraEntity(agendamento)));
    }


    public AgendamentoRecordOut buscarAgendamentoPorId(Long id){
        return agendamentoMapper.paraOut(repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Id não encontrado")));
    }

}
