import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Taller02UnitTesting {

    public void mostrarValorAlto(double[][] mat) {
        int hora = 0, dia = 0;
        double valor = 0, valorMayor = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < mat.length; j++) {
                valor = mat[i][j];
                if (valor > valorMayor) {
                    valorMayor = valor;
                    hora = i;
                    dia = j;
                }
            }
        }
        System.out.println("El sismo mas alto: " + valorMayor + " en el dia: " + dia + " y en la hora: " + hora);
    }

    public void mostrarNumeroSismosGrandes(double[][] mat) {
        int numeroDias = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] >= 5.5) {
                    numeroDias = numeroDias + 1;
                }
            }
        }
        System.out.println("Se registraron " + numeroDias + " Sismos >= a 5.5°");
    }

    public int elegirOpcion() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                System.out.println("Ingrese opcion a revisar");
                System.out.println("1.-¿Qué intensidad? ¿Qué día? y a ¿Qué hora ocurrió el sismo más intenso?");
                System.out.println("2.-¿Cuántos días en total se registraron sismos ≥ 5.5 grados?");
                System.out.println("3.-¿Hay alerta de escalada sísmica?.");
                System.out.println("4.- Salir");
                opcion = teclado.nextInt();
            } catch (InputMismatchException e) {
                teclado.next();
                System.out.println("Dato ingresado erroneo");
            }
        } while (opcion < 1 || opcion > 3);
        return opcion;
    }
}











