package com.speedfast.model;

/**
 * Clase que representa un Pedido
 */
public class Pedido {
    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;

    /**
     * Constructor
     * @param idPedido
     * @param direccionEntrega
     * @param tipoPedido
     */
    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    public void asignarRepartidor(){
        System.out.println("Asignando repartidor...");
    }
}
