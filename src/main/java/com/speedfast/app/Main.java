package com.speedfast.app;

import com.speedfast.model.PedidoComida;
import com.speedfast.model.PedidoEncomienda;
import com.speedfast.model.PedidoExpress;

public class Main {
    public static void main(String[] args) {

        System.out.println("---Pedido de comida---");
        //Se crea una instancia de PedidoComida y se ingresan los datos
        PedidoComida pedidoComida1 = new PedidoComida(1, "Los álamos 123, Viña del Mar", 2.4);
        //Se llama al metodo asignarRepartidor (version sobreescrita)
        pedidoComida1.asignarRepartidor("Pablo Gonzalez");
        //Se llama al metodo mostrarResumen
        pedidoComida1.mostrarResumen();
        //Se llama al metodo calcularTiempoEntrega
        pedidoComida1.calcularTiempoEntrega();
        //Salto de línea
        System.out.println();

        System.out.println("---Pedido de comida---");
        PedidoComida pedidoComida2 = new PedidoComida(2, "Calle Santiago 789, Con-con", 1.5);
        pedidoComida2.asignarRepartidor("Hector Rodriguez");
        pedidoComida2.mostrarResumen();
        pedidoComida2.calcularTiempoEntrega();
        System.out.println();

        System.out.println(":::Pedido de encomienda:::");
        PedidoEncomienda pedidoEncomienda1 = new PedidoEncomienda(21, "Pasaje el roble 321, Quilpué", 4.5);
        pedidoEncomienda1.asignarRepartidor("Martina Fernandez");
        pedidoEncomienda1.mostrarResumen();
        pedidoEncomienda1.calcularTiempoEntrega();
        System.out.println();

        System.out.println(":::Pedido de encomienda:::");
        PedidoEncomienda pedidoEncomienda2 = new PedidoEncomienda(22, "La Retuca 456, Peñablanca", 4);
        pedidoEncomienda2.asignarRepartidor("Francisco Romero");
        pedidoEncomienda2.mostrarResumen();
        pedidoEncomienda2.calcularTiempoEntrega();
        System.out.println();

        System.out.println("***Pedido express***");
        PedidoExpress pedidoExpress1 = new PedidoExpress(12, "Calle Venecia 012, Valparaiso", 6);
        pedidoExpress1.asignarRepartidor("Pedro Suarez");
        pedidoExpress1.mostrarResumen();
        pedidoExpress1.calcularTiempoEntrega();
        System.out.println();

        System.out.println("***Pedido express***");
        PedidoExpress pedidoExpress2 = new PedidoExpress(13, "Calle Santa Maria 034, Valparaiso", 2);
        pedidoExpress2.asignarRepartidor("Mario Gonzalez");
        pedidoExpress2.mostrarResumen();
        pedidoExpress2.calcularTiempoEntrega();
    }
}