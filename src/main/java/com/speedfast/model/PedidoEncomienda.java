package com.speedfast.model;

/**
 * Clase que representa un Pedido de encomienda
 * Hereda atributos y métodos de la clase padre Pedido
 */
public class PedidoEncomienda extends Pedido{

    /**
     * Constructor para crear los objetos e inicializar atributos heredados
     * @param idPedido
     * @param direccionEntrega
     * @param tipoPedido
     */
    public PedidoEncomienda(int idPedido, String direccionEntrega, String tipoPedido) {
        /**
         * Llamado al constructor de la clase padre para inicializar sus atributos en el objeto PedidoEncomienda
         */
        super(idPedido, direccionEntrega, tipoPedido);
    }

    /**
     * Redefine el metodo de la clase padre, cambiando su comportamiento
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor de encomienda...");
    }

    /**
     * Sobrecarga del metodo
     * Se le pasan tres parámetros
     * @param nombreRepartidor
     */
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Verificando el peso de la encomienda...");
        System.out.println("El peso de la encomienda ha sido verificado satisfactoriamente!");
        System.out.println("Embalando encomienda...");
        System.out.println("La encomienda ha sido embalada satisfactoriamente!");
        System.out.println("El pedido ha sido asignado a: "+nombreRepartidor);
    }
}
