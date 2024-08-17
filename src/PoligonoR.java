public abstract class PoligonoR extends Forma {
    protected int numeroLados;
    protected double longitudLado;
    //Clase constructora para definir nombre, numero de lados y longitud de lados para el calculo
    public PoligonoR(String nombre, int numeroLados, double longitudLado) {
        super(nombre);
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }
    //Clase comin para calcular perimetros
    @Override
    public double calcularPerimetro() {
        return numeroLados * longitudLado;
    }
}
