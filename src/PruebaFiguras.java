public class PruebaFiguras {
    //metodo principal de inicio
    public static void main(String[] args) {

        //Instancias de clases
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        Trapecio figura5 = new Trapecio(4, 2, 3, 5, 5);

        //Pequeño comentario de identificacion de estudiante
        System.out.println("Trabajo realizado por Edwin Vasquez, ID: 1759625104, Programación estructurada y funcional 2-SIN-2A");

        //Zona de impresión de cálculos
        System.out.println("El area del " + figura1.getNombre() + " es = " + figura1.calcularArea());
        System.out.println("El perimetro del " + figura1.getNombre() + " es = " + figura1.calcularPerimetro());

        System.out.println("El area del " + figura2.getNombre() + " es = " + figura2.calcularArea());
        System.out.println("El perimetro del " + figura2.getNombre() + " es = " + figura2.calcularPerimetro());

        System.out.println("El area del " + figura3.getNombre() + " es = " + figura3.calcularArea());
        System.out.println("El perimetro del " + figura3.getNombre() + " es = " + figura3.calcularPerimetro());

        System.out.println("El area del " + figura4.getNombre() + " es = " + figura4.calcularArea());
        System.out.println("El perimetro del " + figura4.getNombre() + " es = " + figura4.calcularPerimetro());
        System.out.println(figura4.determinarTipoTriangulo());

        System.out.println("El area del " + figura5.getNombre() + " es = " + figura5.calcularArea());
        System.out.println("El perimetro del " + figura5.getNombre() + " es = " + figura5.calcularPerimetro());
    }
}