public  abstract class FormaGeometrica {
    private String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    abstract double calcularArea();


}
