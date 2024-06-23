package com.spindola.rabbitmq.backend.dto;

import java.math.BigDecimal;

public class PagamentoDTO {
  private String numeroPedido;
  private BigDecimal valor;
  private String produto;

  public String getNumeroPedido() {
    return this.numeroPedido;
  }

  public void setNumeroPedido(String numeroPedido) {
    this.numeroPedido = numeroPedido;
  }

  public BigDecimal getValor() {
    return this.valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public String getProduto() {
    return this.produto;
  }

  public void setProduto(String produto) {
    this.produto = produto;
  }


}
