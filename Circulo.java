class Circulo extends Figura {
    double radio;

    @Override
    public void calcularArea() {
        double area = 3.1416 * radio * radio;
        System.out.println("Área del Círculo: " + area);
    }
}