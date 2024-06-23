package com.spindola.rabbitmq.backend.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spindola.rabbitmq.backend.dto.PagamentoDTO;

@Component
public class PagamentoRequestProducer {
  @Autowired private AmqpTemplate amqpTemplate;

  ObjectMapper objectMapper = new ObjectMapper();

  public void integrar (PagamentoDTO pagamento) throws JsonProcessingException {
    amqpTemplate.convertAndSend(
      "pagamento-request-exchange",
      "pagamento-request-route-key",
      objectMapper.writeValueAsString(pagamento)
    );
  }
  
}
