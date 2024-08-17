public class Rectangulo extends Forma {
    private double base;
    private double altura;
    public Rectangulo(double base, double altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }
    //Sobreescribiendo la funcion en su clase padre llamada Forma
    @Override
    public double calcularArea() {
        return base * altura;
    }
    //Sobreescribiendo la funcion en su clase padre llamada Forma
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
}
