package com.speedfast.model;

/**
 * Clase que representa un Pedido de comida
 * Hereda atributos y métodos de la clase padre Pedido
 */
public class PedidoComida extends Pedido{

    /**
     * Constructor para crear los objetos e inicializar atributos heredados
     * @param idPedido
     * @param direccionEntrega
     * @param tipoPedido
     */
    public PedidoComida(int idPedido, String direccionEntrega, String tipoPedido) {
        /**
         * Llamado al constructor de la clase padre para inicializar sus atributos en el objeto actual
         */
        super(idPedido, direccionEntrega, tipoPedido);
    }

    /**
     * Redefine el metodo de la clase padre, cambiando su comportamiento
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor de comida...");
    }

    /**
     * Sobrecarga del metodo asignarRepartidor
     * @param nombreRepartidor
     */
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Verificando si el repartidor tiene mochila térmica...");
        System.out.println("El repartidor sí tiene mochila térmica!");
        System.out.println("El pedido ha sido asignado a: "+nombreRepartidor);
    }
}
