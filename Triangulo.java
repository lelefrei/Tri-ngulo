package exercicio2;

public class Triangulo {

    double base;
    double altura;

    public Triangulo() {

    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaArea() {
        return base * altura / 2.0;
    }

    public void imprimeDados() {
        System.out.println("Base: " +getBase() +"\n" +"Altura: " +getAltura() +"\n" +"Area: " +
                String.format("%.2f", calculaArea()) +"\n");
    }
}
