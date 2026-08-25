package com.speedfast.model;

/**
 * Subclase que representa un Pedido de encomienda
 * Hereda atributos y métodos de la clase padre Pedido
 */
public class PedidoEncomienda extends Pedido{

    /**
     * Constructor para crear los objetos e inicializar atributos heredados
     * @param idPedido
     * @param direccionEntrega
     * @param distanciaKm
     */
    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        /**
         * Llamado al constructor de la clase padre para inicializar sus atributos en el objeto PedidoEncomienda
         */
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Redefine el metodo de la clase padre, cambiando su comportamiento
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor de encomienda...");
    }

    /**
     * Se implementa el metodo abstracto
     */
    @Override
    public void calcularTiempoEntrega() {
        double tiempo = 20+(1.5*distanciaKm);

        /**
         * Trata la variable "tiempo" como int y guarda su valor en la variable "tiempoEstimado"
         */
        int tiempoEstimado = (int) tiempo;

        System.out.println("Tiempo estimado de entrega: "+tiempoEstimado+" minutos");
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
