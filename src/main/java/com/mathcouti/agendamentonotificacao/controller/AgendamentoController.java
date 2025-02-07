package com.mathcouti.agendamentonotificacao.controller;

import com.mathcouti.agendamentonotificacao.business.AgendamentoService;
import com.mathcouti.agendamentonotificacao.controller.dto.in.AgendamentoRecord;
import com.mathcouti.agendamentonotificacao.controller.dto.out.AgendamentoRecordOut;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agendamento")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<AgendamentoRecordOut> gravarAgendamentos(@RequestBody AgendamentoRecord agendamento){
        return ResponseEntity.ok(agendamentoService.gravarAgendamento(agendamento));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AgendamentoRecordOut> buscarAgendamentoPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(agendamentoService.buscarAgendamentoPorId(id));
    }
}
