import java.util.Scanner;
public class salario {
    public static void main(String[]args) {
        int porz;
        //variable para calcular el porcentaje de aumento de sueldo y fuera del do while
        Scanner scanner = new Scanner (System.in);

        System.out.println("Cuantos años has trabajado?");
        int aTrabaj = scanner.nextInt();
        //aTrbaj son los años trabajados en la empresa
        if (aTrabaj <= 3){
            System.out.println("Usted no ha trabajado lo suficiente para un aumento");
        }else{
            System.out.println("Usted ha trabajado lo suficiente");
        do{
            System.out.println("Porcentaje de aumento que desea.(Se recomienda entre un 5% y un 8%)");
            porz = scanner.nextInt();

        }while(porz<=5 || porz>=8);
            System.out.println("Cual es su salario?");
            double salario = scanner.nextInt();
            double porzFinal = salario+(salario*porz/100);
            System.out.println("Usted a recibido un aumento y su salario ahora es de "+porzFinal+".");
        }
    } 
}
