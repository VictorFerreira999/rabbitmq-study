package com.microsservico.consumidorestoque.consumer;

import constantes.RabbitmqConstantes;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import dto.EstoqueDto;

@Component
public class EstoqueConsumer {

    @RabbitListener(queues = RabbitmqConstantes.FILA_ESTOQUE)
    private void consumidor(EstoqueDto estoqueDto){
        System.out.println(estoqueDto.codigoproduto);
        System.out.println(estoqueDto.quantidade);
        System.out.println("_______________________________");
    }
}
