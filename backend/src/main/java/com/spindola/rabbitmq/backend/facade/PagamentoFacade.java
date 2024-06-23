package com.spindola.rabbitmq.backend.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spindola.rabbitmq.backend.dto.PagamentoDTO;
import com.spindola.rabbitmq.backend.producer.PagamentoRequestProducer;

@Service
public class PagamentoFacade {
  @Autowired private PagamentoRequestProducer producer;

  public String solicitarPagamento(PagamentoDTO request) {
    try{
      producer.integrar(request);
    } catch (Exception e) {
      return "Erro ao solicitar pagamento" + e.getMessage();
    }
    return "Pagamento aguardando confirmação...";
  }
}
