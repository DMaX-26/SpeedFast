package com.speedfast.model;

/**
 * Clase padre abstracta que representa un Pedido
 */
public abstract class Pedido {
    /**
     * Atributos de tipo protected para acceder a ellos desde cada subclase
     */
    protected int idPedido;
    protected String direccionEntrega;
    protected double distanciaKm;

    /**
     * Constructor
     * @param idPedido
     * @param direccionEntrega
     * @param distanciaKm
     */
    public Pedido(int idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    public void asignarRepartidor(){
        System.out.println("Asignando repartidor...");
    }

    /**
     * Metodo implementado
     */
    public void mostrarResumen(){
        System.out.println("Código Pedido: "+idPedido);
        System.out.println("Dirección de entrega: "+direccionEntrega);
        System.out.println("Distancia en Km: "+distanciaKm);
    }

    /**
     * Metodo abstracto que debe ser implementado en cada subclase
     */
    public abstract void calcularTiempoEntrega();
}
