import java.util.*;

public class Main {
    final int NumeroColoresCombinacion = 4;
    final int NumeroColoresJuego=6;
    public static void main(String[] args) {

       ArrayList<Integer> listaUnica =new ArrayList<>(5);
        Random random = new Random();
        Colores colors=new Colores();
        listaUnica.add(random.nextInt(6));
        boolean noAdd=true;
            for (int x = 0; x < 5; x++) {
                int randomNumber=random.nextInt(6);

                for (Integer check:listaUnica) {


                    if (check==randomNumber){
                        x=x-1;
                        noAdd=false;
                    }
                }
                if(noAdd){
                    listaUnica.add(randomNumber);
                }else{
                    noAdd=true;
                }

            }
            ArrayList<Character> colorList =new ArrayList<>();
        for (Integer lista: listaUnica) {
            colorList.add(colors.getTablaColores()[lista]);
        }
        for (Character lista:colorList
             ) {
            System.out.println(lista);
        }
        ArrayList<Character> combi =new ArrayList<>();
        //Users combi

        Scanner scanner = new Scanner(System.in);
        int NumberTrys=10;
        do {
            System.out.println("You have " + NumberTrys + " attempts remaining");
            for (int x = 0; x < 6; x++) {
                System.out.print("Insert Color: ");
                combi.add(scanner.next().charAt(0));
            }
            if(EvaluacionCombinacion(combi, colorList)==1){
                System.out.println("You won!");
                break;
            }else {
                NumberTrys=NumberTrys-1;
                combi.clear();
            }
            if(NumberTrys==0){
                System.out.println("You lose");
            }
        }while (NumberTrys!=0);
    }

    public static int EvaluacionCombinacion(ArrayList<Character> combi, ArrayList<Character> resultado){
        boolean sonIguales = combi.equals(resultado);
        if (sonIguales){
            System.out.println("Combinacion correct");
            return 1;
        }else{
            System.out.println("Combinacion error");
            return 0;
        }
    }

}