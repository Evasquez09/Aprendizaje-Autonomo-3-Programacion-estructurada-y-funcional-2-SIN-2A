public class TrianguloRectangulo extends Forma {
    private double base;
    private double altura;
    public TrianguloRectangulo(double base, double altura) {
        super("Triangulo Rectangulo");
        this.base = base;
        this.altura = altura;
    }
    //Sobreescribiendo la funcion en su clase padre llamada Forma
    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }
    //Sobreescribiendo la funcion en su clase padre llamada Forma
    @Override
    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }
    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    public String determinarTipoTriangulo() {
        if (base == altura) {
            return "El triángulo es equilátero.";
        } else if (base != altura) {
            return "El triángulo es isósceles.";
        } else {
            return "El triángulo es escaleno.";
        }
    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
}
