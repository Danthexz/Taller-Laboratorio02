import java.util.Scanner;
import java.util.Random;

public class Taller02UnitTesting {
    public static void main(String[] args) {

        int dias = dias(0);
        double[][] mat = new double[24][dias];
        llenarMatriz(mat);


       // mat[][] = generarMatriz(0,0);

        /*verMatriz(mat, 24, dim2);
        System.out.println("-------------");

        llenarMatriz(mat, 100);

        System.out.println("-------------");
        verMatriz(mat, dim1, dim2);*/
    }
    static int dias(int dias){
        System.out.println("Ingrese los dias del mes");
        dias = validadorEntrada(0,0);
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
            } while (n < min );
            return n;
        }
    /*public static void sismoMayor(double[][] mat) {
        int hora, dia;
        double valor=0, valorMayor=0;

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < mat.length; j++) {
                valor =  mat[i][j];
                if (valor>valorMayor){
                    valorMayor = valor;
                    hora = i;
                    dia = j;
                }

            }
        }
        System.out.println("El sismo mas alto: "+valorMayor+" en el dia: "+dia+" y en la hora: "+hora);
    }*/

    public static void ordenarColumnas(double[][] mat,int dias){
        double t;
        for(int i=0; i < 24; i++){
            for(int j=0;j< dias; j++){
                for(int x=0; x < 24; x++){
                    for(int y=0; y <dias; y++){
                        if(mat[i][j] > mat[x][y]){
                            t = mat[i][j];
                            mat[i][j] = mat[x][y];
                            mat[x][y] = t;
                        }
                    }
                }
            }
        }
    }

    public static void escalaSismica(double[][] mat, int dias){
        for (int i = 0; i <24 ; i++) {
            for (int j = 0; j <dias; j++) {
                if(){

                }
            }

        }


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
