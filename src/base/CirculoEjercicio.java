package base;

import circulo.Circulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CirculoEjercicio {

    ArrayList<Circulo> circulos = new ArrayList<Circulo>();

    public static void main(String[] args) {
        CirculoEjercicio app = new CirculoEjercicio();
        app.start();
    }

    public void start() {
        double radio;
        do {
            radio = radioRandom();
            if (radio >= 0.1) {
                circulos.add(new Circulo(radio));
            }
        } while (radio >= 0.01);

        int numero = preguntarCliente();
        ordenarListado(numero);
        imprimirListado();

    }

    public double radioRandom() {
        return Math.random();
    }

    public int preguntarCliente() {
        // reciclado del codigo de reservar plaza en un avion
        Scanner leerTeclado = new Scanner(System.in);
        int respuesta = 0;
        boolean respuestaOK = false;
        do {
            System.out.println("Como quieres ordenarme, de manera Ascendente/1 o Descendente/2?");
            if (leerTeclado.hasNextInt()) {
                respuesta = leerTeclado.nextInt();
                if (respuesta == 1 || respuesta == 2) {
                    respuestaOK = true;
                } else {
                    System.out.println("Mete un numero valido");
                }
            } else {
                System.out.println("Por favor introduzca 1 o 2");
                leerTeclado.next();
            }
        } while (!respuestaOK);
        return respuesta;
    }

    public void ordenarListado(int numero) {
        if (numero == 1) {
            Collections.sort(circulos);

        } else {
            Collections.sort(circulos, Collections.reverseOrder());
        }
    }

    public void imprimirListado() {
        for (Circulo circulo : circulos) {
            System.out.println(circulos);
        }
    }
}
