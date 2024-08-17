public class Trapecio extends Forma {
    private double lado1;
    private double lado2;
    private double altura;
    private double bMayor;
    private double bMenor;
    public Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        super("Trapecio");
        this.bMayor = baseMayor;
        this.bMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //Sobreescribiendo la funcion en su clase padre llamada Forma
    @Override
    public double calcularArea() {
        return ((bMayor + bMenor) / 2.0) * altura;
    }
    //Sobreescribiendo la funcion en su clase padre llamada Forma
    @Override
    public double calcularPerimetro() {
        return bMayor + bMenor + lado1 + lado2;
    }
}
