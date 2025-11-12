public class Circulo extends FormaBidimencional{

     private double raio;
     private final double pi = Math.PI;

     public Circulo(double raio){
         super("Círculo");
         this.raio = raio;
     }

    @Override
    double calcularPerimetro() {
        return 2*pi*raio;
    }

    @Override
    double calcularArea() {
        return pi*(raio*raio);
    }
}
