public class Cuadrado extends PoligonoR {
    public Cuadrado(double lado) {
        super("Cuadrado", 4, lado);
    }
    //Sobreescribiendo la funcion en su clase padre llamada Forma
    @Override
    public double calcularArea() {
        return Math.pow(longitudLado, 2);
    }
}
