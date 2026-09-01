package com.speedfast.app;

import com.speedfast.model.PedidoComida;
import com.speedfast.model.PedidoEncomienda;
import com.speedfast.model.PedidoExpress;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //Listas vacías
        List<PedidoComida> historialPedidosComida = new ArrayList<>();
        List<PedidoEncomienda> historialPedidosEncomienda = new ArrayList<>();
        List<PedidoExpress> historialPedidosExpress = new ArrayList<>();

        //Se crea una instancia de PedidoComida y se ingresan los datos
        PedidoComida pedidoComida1 = new PedidoComida(1, "Pedido Comida", "Los álamos 123, Viña del Mar", 2.4);
        //Se llama al metodo mostrarResumen
        pedidoComida1.mostrarResumen();
        //Se llama al metodo asignarRepartidor (version sobrecargada)
        pedidoComida1.asignarRepartidor("Pablo Gonzalez");
        //Se llama al metodo calcularTiempoEntrega
        pedidoComida1.calcularTiempoEntrega();
        pedidoComida1.despachar();

        PedidoComida pedidoComida2 = new PedidoComida(2, "Pedido Comida", "Calle Santiago 789, Con-con", 1.5);
        pedidoComida2.mostrarResumen();
        pedidoComida2.asignarRepartidor("Hector Rodriguez");
        pedidoComida2.calcularTiempoEntrega();
        pedidoComida2.cancelar();

        //Se agregan las instancias creadas a la lista
        historialPedidosComida.add(pedidoComida1);
        historialPedidosComida.add(pedidoComida2);

        System.out.println("Historial de pedidos de comida:");
        //Se recorre la lista y cada elemento del recorrido se guarda en la variable "p"
        for (PedidoComida p : historialPedidosComida){
            //Se llama al metodo "mostrarHistorial"
            p.mostrarHistorial();
        }

        PedidoEncomienda pedidoEncomienda1 = new PedidoEncomienda(21, "Pedido Encomienda", "Pasaje el roble 321, Quilpué", 4.5);
        pedidoEncomienda1.mostrarResumen();
        pedidoEncomienda1.asignarRepartidor("Martina Fernandez");
        pedidoEncomienda1.calcularTiempoEntrega();
        pedidoEncomienda1.despachar();

        PedidoEncomienda pedidoEncomienda2 = new PedidoEncomienda(22, "Pedido Encomienda", "La Retuca 456, Peñablanca", 4);
        pedidoEncomienda2.mostrarResumen();
        pedidoEncomienda2.asignarRepartidor("Francisco Romero");
        pedidoEncomienda2.calcularTiempoEntrega();
        pedidoEncomienda2.cancelar();

        historialPedidosEncomienda.add(pedidoEncomienda1);
        historialPedidosEncomienda.add(pedidoEncomienda2);

        System.out.println("Historial de pedidos de encomienda:");
        for (PedidoEncomienda pe : historialPedidosEncomienda){
            pe.mostrarHistorial();
        }

        PedidoExpress pedidoExpress1 = new PedidoExpress(12, "Pedido Express", "Calle Venecia 012, Valparaiso", 6);
        pedidoExpress1.mostrarResumen();
        pedidoExpress1.asignarRepartidor("Pedro Suarez");
        pedidoExpress1.calcularTiempoEntrega();
        pedidoExpress1.despachar();

        PedidoExpress pedidoExpress2 = new PedidoExpress(13, "Pedido Express", "Calle Santa Maria 034, Valparaiso", 2);
        pedidoExpress2.mostrarResumen();
        pedidoExpress2.asignarRepartidor("Mario Gonzalez");
        pedidoExpress2.calcularTiempoEntrega();
        pedidoExpress2.cancelar();

        historialPedidosExpress.add(pedidoExpress1);
        historialPedidosExpress.add(pedidoExpress2);

        System.out.println("Historial de pedidos express:");
        for (PedidoExpress pex : historialPedidosExpress){
            pex.mostrarHistorial();
        }
    }
}