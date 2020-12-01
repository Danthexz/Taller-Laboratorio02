import java.util.Scanner;
import java.util.Random;

public class Taller02UnitTesting {
    public static void main(String[] args) {

        int dias = dias(0);
        double[][] mat = new double[24][dias];
        llenarMatriz(mat);


    }

    static int dias(int dias) {
        System.out.println("Ingrese los dias del mes");
        dias = validadorEntrada(0, 0);
        return dias;
    }


    public static double[][] llenarMatriz(double[][] mat) {
        Random rnum = new Random();
        double rango = 0 + ((9.5) - 0) * rnum.nextDouble();
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = rango;
            }
        }
        return mat;
    }

    static int validadorEntrada(int n, int min) {

        do {
            Scanner teclado = new Scanner(System.in);
            try {
                n = teclado.nextInt(); //numero que se validará
            } catch (Exception e) {
                teclado.next();
                System.out.println("Ingrese un numero valido");
            }
            if (n < min) {
                System.out.println("ingrese un numero valido");
            }
        } while (n < min);
        return n;
    }

    public static void ordenarColumnas(double[][] mat, int dias) {
        double t;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < dias; j++) {
                for (int x = 0; x < 24; x++) {
                    for (int y = 0; y < dias; y++) {
                        if (mat[i][j] > mat[x][y]) {
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

    /*public static void escalaSismica(double[][] mat, int dias){
        boolean escalaS;
        double valor1,valor2,valor3,valor4;
        for (int i = 0; i <24 ; i++) {
            for (int j = 0; j <dias; j++) {
                valor1=mat[i][j];


            }

        }


    }/*


    }

