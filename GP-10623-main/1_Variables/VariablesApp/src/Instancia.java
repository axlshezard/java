public class Instancia {
    //  variables de instancia
    float base;
    float altura;
    float area;
    float perimetro;
    String nombre;
    String tipo;

    // constructor, todos los argumentos son variables locales
    public Instancia(float base, float altura, String nombre) {
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;
        perimetro();
        area();
    }

    private void area() {
        this.area = this.base * this.altura;
    }


    private void perimetro(){
        this.perimetro = 2*this.altura + 2*this.base;
    }
    
    // sobre escribimos el método toString()
    @Override
    public String toString() {
        return "nombre: " + this.nombre + "\n" + 
               "base: " + this.base + "\n" +
               "altura: " + this.altura + "\n" +
               "area: " + this.area + "\n" +
               "perimetro: " + this.perimetro + "\n" +
               "tipo: " + this.tipo + "\n";
    }

    public static void main(String[] args) {
        Instancia i1 = new Instancia(5, 7, "rectangulo");
        Instancia i2 = new Instancia(6, 6, "cuadrado");
        System.out.println(i1.toString());
        System.out.println(i2.toString());
    }
}
