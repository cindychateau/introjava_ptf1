import java.util.Scanner;
public class PitagorasTest {

    public static void main(String[] args) {

        //Inicializando el Objeto Pitagoras
        Pitagoras pitag = new Pitagoras();
        
        System.out.println(pitag.calcularHipotenusa(3, 4));
        
        //Crea un objeto scanner para leer datos en terminal
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el cateto a:");
        int a = input.nextInt();

        System.out.println("Ingresa el cateto b:");
        int b = input.nextInt();

        System.out.println("Hipotenusa:"+pitag.calcularHipotenusa(a, b));

    }

}