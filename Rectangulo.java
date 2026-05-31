class Rectangulo extends Figura {
    double base;
    double altura;

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Área del Rectángulo: " + area);
    }
}