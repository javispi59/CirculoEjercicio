package circulo;

public class Circulo implements Comparable<Circulo> {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public int compareTo(Circulo c) {
        if (c.radio > radio) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return String.format("Radio: %.4f | Perimetro: %.4f | Area: %.4f%n", getRadio(), perimetro(), area());
    }

}
