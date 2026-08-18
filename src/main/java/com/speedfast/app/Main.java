package com.speedfast.app;

import com.speedfast.model.PedidoComida;
import com.speedfast.model.PedidoEncomienda;
import com.speedfast.model.PedidoExpress;

public class Main {
    public static void main(String[] args) {

        System.out.println("---Pedido de comida---");
        //Se crea una instancia de PedidoComida y se ingresan los datos
        PedidoComida pedidoComida1 = new PedidoComida(1, "Los álamos 123, Viña del Mar", "comida");
        //Se llama al metodo (versión sobreescrita)
        pedidoComida1.asignarRepartidor();
        //Se llama al metodo (versión sobrecargada)
        pedidoComida1.asignarRepartidor("Pablo Gonzalez");
        //Salto de línea
        System.out.println();

        System.out.println("---Pedido de comida---");
        PedidoComida pedidoComida2 = new PedidoComida(2, "Calle Santiago 789, Con con", "comida");
        pedidoComida2.asignarRepartidor();
        pedidoComida2.asignarRepartidor("Hector Rodriguez");
        System.out.println();

        System.out.println(":::Pedido de encomienda:::");
        PedidoEncomienda pedidoEncomienda1 = new PedidoEncomienda(21, "Pasaje el roble 321, Quilpué", "encomienda");
        pedidoEncomienda1.asignarRepartidor();
        pedidoEncomienda1.asignarRepartidor("Martina Fernandez");
        System.out.println();

        System.out.println(":::Pedido de encomienda:::");
        PedidoEncomienda pedidoEncomienda2 = new PedidoEncomienda(22, "La Retuca 456, Peñablanca", "encomienda");
        pedidoEncomienda2.asignarRepartidor();
        pedidoEncomienda2.asignarRepartidor("Francisco Romero");
        System.out.println();

        System.out.println("***Pedido express***");
        PedidoExpress pedidoExpress1 = new PedidoExpress(12, "Calle Venecia 012, Valparaiso", "express");
        pedidoExpress1.asignarRepartidor();
        pedidoExpress1.asignarRepartidor("Pedro Suarez");
        System.out.println();

        System.out.println("***Pedido express***");
        PedidoExpress pedidoExpress2 = new PedidoExpress(13, "Calle Santa Maria 034, Valparaiso", "express");
        pedidoExpress2.asignarRepartidor();
        pedidoExpress2.asignarRepartidor("Mario Gonzalez");

    }
}