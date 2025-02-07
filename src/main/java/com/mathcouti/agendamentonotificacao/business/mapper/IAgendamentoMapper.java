package com.mathcouti.agendamentonotificacao.business.mapper;

import com.mathcouti.agendamentonotificacao.controller.dto.in.AgendamentoRecord;
import com.mathcouti.agendamentonotificacao.controller.dto.out.AgendamentoRecordOut;
import com.mathcouti.agendamentonotificacao.infrastructure.entities.Agendamento;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {
    Agendamento paraEntity(AgendamentoRecord agendamento);

    AgendamentoRecordOut paraOut(Agendamento agendamento);
}
