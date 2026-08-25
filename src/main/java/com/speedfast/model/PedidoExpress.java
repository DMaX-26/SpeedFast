package com.speedfast.model;

/**
 * Subclase que representa un Pedido express
 * Hereda atributos y métodos de la clase padre Pedido
 */
public class PedidoExpress extends Pedido{

    /**
     * Constructor para crear los objetos e inicializar atributos heredados
     * @param idPedido
     * @param direccionEntrega
     * @param distanciaKm
     */
    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        /**
         * Llamado al constructor de la clase padre para inicializar sus atributos en el objeto PedidoExpress
         */
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor de pedidos express...");
    }

    @Override
    public void calcularTiempoEntrega() {
        /**
         * Tiempo estimado base de 10 minutos
         */
        int tiempoEstimado = 10;

        /**
         * Si la distancia es mayor a 5, el tiempo estimado aumenta 5 minutos
         */
        if (distanciaKm>5){
            tiempoEstimado = 10+5;
        }
        System.out.println("Tiempo estimado de entrega: "+tiempoEstimado+" minutos");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Buscando repartidor cercano a la zona...");
        System.out.println("Repartidor encontrado: "+nombreRepartidor);
        System.out.println("Verificando disponibilidad inmediata...");
        System.out.println("EL repartidor está disponible!");
        System.out.println("El pedido ha sido asignado a : "+nombreRepartidor);
    }
}
