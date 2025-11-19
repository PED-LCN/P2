public class Cubo extends  FormaTridimensional{
    private double lado;

    public Cubo(double lado){
        super("Cubo");
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return (lado*lado) * 6;
    }

    @Override
    double calcularVolume() {
        return lado*lado*lado;
    }
}
