package com.spindola.rabbitmq.backend.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spindola.rabbitmq.backend.dto.PagamentoDTO;
import com.spindola.rabbitmq.backend.facade.PagamentoFacade;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoApi {
  @Autowired private PagamentoFacade pagamentoFacade;

  @PostMapping
  public String processarPagamento(@RequestBody PagamentoDTO request){
    return pagamentoFacade.solicitarPagamento(request);
  }
}
