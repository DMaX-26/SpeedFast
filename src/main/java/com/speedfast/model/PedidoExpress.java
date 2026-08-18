package com.speedfast.model;

/**
 * Clase que representa un Pedido express
 * Hereda atributos y métodos de la clase padre Pedido
 */
public class PedidoExpress extends Pedido{

    /**
     * Constructor para crear los objetos e inicializar atributos heredados
     * @param idPedido
     * @param direccionEntrega
     * @param tipoPedido
     */
    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido) {
        /**
         * Llamado al constructor de la clase padre para inicializar sus atributos en el objeto PedidoExpress
         */
        super(idPedido, direccionEntrega, tipoPedido);
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor de pedidos express...");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Buscando repartidor cercano a la zona...");
        System.out.println("Repartidor encontrado: "+nombreRepartidor);
        System.out.println("Verificando disponibilidad inmediata...");
        System.out.println("EL repartidor está disponible!");
        System.out.println("El pedido ha sido asignado a : "+nombreRepartidor);
    }
}
