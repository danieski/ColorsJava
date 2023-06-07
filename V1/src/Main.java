import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    final int NumeroColoresCombinacion = 4;
    final int NumeroColoresJuego=6;
    public void main(String[] args) {

        Combinacion combinacion=new Combinacion();
        char[] correcto = new char[3];
        Random random = new Random();
        for (int x=0;x<3;x++){
            int numeroAleatorio = random.nextInt(6);
            correcto[x] = combinacion.getTablaColores()[numeroAleatorio];
        }
        for (int x=0;x<3;x++){
            System.out.println(correcto[x]);
        }
        char[] combi = new char[3];

        Scanner scanner = new Scanner(System.in);

        for (int x=0;x<3;x++) {
            System.out.print("Ingrese color: ");
            combi[x] = scanner.next().charAt(0);
        }
        EvaluacionCombinacion(combi,correcto);

    }
    public class Combinacion
    {
        char[] Combi; /* Tabla de NumColoresCombinacion elementos que representa la combinación */
        char[] TablaColores={'R', 'A', 'V', 'Z', 'M', 'B'};/* Posibles colores dentro del juego */
        /* ... Definiciones de Métodos ... */

        public char[] getTablaColores() {
            return TablaColores;
        }

        public void setTablaColores(char[] tablaColores) {
            TablaColores = tablaColores;
        }
    }
    public static void EvaluacionCombinacion(char[] combi, char[] resultado){
        boolean sonIguales = Arrays.equals(combi, resultado);
        if (sonIguales){
            System.out.println("Combinacion correct");
        }else{
            System.out.println("Combinacion error");
        }
    }

}