public class Retangulo extends FormaBidimencional{
    private double base;
    private double altura;

    public Retangulo(double base,double altura){
        super("Retângulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularPerimetro() {
        return (this.altura * 2)+(this.base * 2);
    }

    @Override
    double calcularArea() {
        return this.base * altura;
    }
}
