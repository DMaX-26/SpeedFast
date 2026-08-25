package com.speedfast.model;

/**
 * Subclase que representa un Pedido de comida
 * Hereda atributos y métodos de la clase padre Pedido
 */
public class PedidoComida extends Pedido{

    /**
     * Constructor para crear los objetos e inicializar atributos heredados
     * @param idPedido
     * @param direccionEntrega
     * @param distanciaKm
     */
    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm) {
        /**
         * Llamado al constructor de la clase padre para inicializar sus atributos en el objeto actual
         */
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Redefine el metodo de la clase padre, cambiando su comportamiento
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor de comida...");
    }

    /**
     * Se implementa el metodo abstracto
     */
    @Override
    public void calcularTiempoEntrega() {
        /**
         * Se calcula el tiempo estimado de entrega y el valor se guarda en la variable "tiempo"
         */
        double tiempo = 15+(2*distanciaKm);

        /**
         * Trata la variable "tiempo" como int y guarda su valor en la variable "tiempoEstimado"
         */
        int tiempoEstimado = (int) tiempo;

        System.out.println("Tiempo estimado de entrega: "+tiempoEstimado+" minutos");
    }

    /**
     * Sobrecarga del metodo asignarRepartidor
     * @param nombreRepartidor
     */
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Repartidor disponible: "+nombreRepartidor);
        System.out.println("Verificando si el repartidor tiene mochila térmica...");
        System.out.println("El repartidor sí tiene mochila térmica!");
        System.out.println("El pedido ha sido asignado a: "+nombreRepartidor);
    }
}
