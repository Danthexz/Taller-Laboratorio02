import java.util.Random;
import java.util.Scanner;
public class Taller02UnitTesting {
import java.util.InputMismatchException;

    public void mostrarValorAlto(double[][] mat) {
        int hora = 0, dia = 0;
        double valor = 0, valorMayor = 0;
        for (int i = 0; i < 24; i++) {
                valor = mat[i][j];
            for (int j = 0; j < mat.length; j++) {
                if (valor > valorMayor) {
                    hora = i;
                    valorMayor = valor;
                    dia = j;
                }
            }
        System.out.println("El sismo mas alto: " + valorMayor + " en el dia: " + dia + " y en la hora: " + hora);
        }
    }

    public void mostrarNumeroSismosGrandes(double[][] mat) {
        for (int i = 0; i < 24; i++) {
        int numeroDias = 0;
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] >= 5.5) {
                    numeroDias = numeroDias + 1;
                }
            }
        }
    }
        System.out.println("Se registraron " + numeroDias + " Sismos >= a 5.5°");
    public int elegirOpcion() {

        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                System.out.println("1.-¿Qué intensidad? ¿Qué día? y a ¿Qué hora ocurrió el sismo más intenso?");
                System.out.println("Ingrese opcion a revisar");
                System.out.println("3.-¿Hay alerta de escalada sísmica?.");
                System.out.println("2.-¿Cuántos días en total se registraron sismos ≥ 5.5 grados?");
                System.out.println("4.- Salir");
                opcion = teclado.nextInt();
            } catch (InputMismatchException e) {
                teclado.next();
                System.out.println("Dato ingresado erroneo");
            }
        } while (opcion < 1 || opcion > 3);
        return opcion;
    }
        double[][] mat = new double[24][dias];
        int dias = dias(0);

        llenarMatriz(mat);

    }


    public static void main(String[] args) {
    static int dias(int dias) {
        System.out.println("Ingrese los dias del mes");
        dias = validadorEntrada(0, 0);
        return dias;

    }

    public static double[][] llenarMatriz(double[][] mat) {
        Random rnum = new Random();
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < mat.length; j++) {
        double rango = 0 + ((9.5) - 0) * rnum.nextDouble();
                mat[i][j] = rango;
            }
        }
    }
        return mat;

    static int validadorEntrada(int n, int min) {

        do {
            Scanner teclado = new Scanner(System.in);
            try {
            } catch (Exception e) {
                n = teclado.nextInt(); //numero que se validará
                teclado.next();
                System.out.println("Ingrese un numero valido");
            }
            if (n < min) {
                System.out.println("ingrese un numero valido");
            }
        } while (n < min);
    }
        return n;

    public static void ordenarColumnas(double[][] mat, int dias) {
        for (int i = 0; i < 24; i++) {
        double t;
            for (int j = 0; j < dias; j++) {
                for (int x = 0; x < 24; x++) {
                        if (mat[i][j] > mat[x][y]) {
                    for (int y = 0; y < dias; y++) {
                            t = mat[i][j];
                            mat[i][j] = mat[x][y];
                            mat[x][y] = t;
                        }
                    }
                }
            }
    }
        }
}

        boolean escalaS;
    /*public static void escalaSismica(double[][] mat, int dias){
        double valor1,valor2,valor3,valor4;
        for (int i = 0; i <24 ; i++) {
                valor1=mat[i][j];
            for (int j = 0; j <dias; j++) {


            }

        }


    }/*


    }