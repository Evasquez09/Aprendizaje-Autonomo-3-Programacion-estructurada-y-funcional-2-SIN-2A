public class Circulo extends Forma {
    private int radio;
    public Circulo(int radio) {
        super("Circulo");
        this.radio = radio;
    }
    //Sobreescribiendo la funcion en su clase padre llamada Forma
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    //Sobreescribiendo la funcion en su clase padre llamada Forma
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
