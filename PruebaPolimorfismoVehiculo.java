public class PruebaPolimorfismoVehiculo {
    public static void main(String[] args) {

        Vehiculo miVehiculo = new Coche();
        miVehiculo.mover(); // Ejecuta el método de Coche


        miVehiculo = new Bicicleta();
        miVehiculo.mover(); // Ejecuta el método de Bicicleta
    }
}