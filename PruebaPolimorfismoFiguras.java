public class PruebaPolimorfismoFiguras {
    public static void main(String[] args) {

        Figura f1 = new Circulo();
        Figura f2 = new Rectangulo();


        ((Circulo) f1).radio = 4.0;

        ((Rectangulo) f2).base = 5.0;
        ((Rectangulo) f2).altura = 3.0;


        f1.calcularArea(); // Llama al método de Circulo
        f2.calcularArea(); // Llama al método de Rectangulo
    }
}
