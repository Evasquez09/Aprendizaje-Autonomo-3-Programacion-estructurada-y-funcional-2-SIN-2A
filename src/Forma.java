public class Forma {
    protected String nombre;
    public Forma(String nombre) {
        this.nombre = nombre;
    }
    // Método para calcular el área
    public double calcularArea() {
        return 0.0; // Método predeterminado para ser sobrescrito
    }
    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 0.0; // Método predeterminado para ser sobrescrito
    }
    public String getNombre() {
        return nombre;
    }
}