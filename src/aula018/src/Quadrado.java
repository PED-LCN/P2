public class Quadrado extends FormaBidimencional{

    private double lado;

    public Quadrado(double lado){
        super("Quadrado");
        this.lado = lado;
    }

    @Override
    double calcularPerimetro() {
        return this.lado * 4 ;
    }

    @Override
    double calcularArea( ) {

        return Math.pow(this.lado,2);
    }
}
