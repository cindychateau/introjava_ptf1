import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
//import java.util.*;
//PascalCase - CadaPalabraVaConMayuscula. Nombres de archivos y nombres de clases
public class Intro {

    //Método principal = Método que se ejecuta con nuestro archivo
    public static void main(String[] args) {
        System.out.println("Hola mundo!"); //Impresión

        //Variable Primitivas - Solo guarda el valor. MINUSCULA
        //int = entero (número entero)
        int miEntero; //Declaramos sin establecer valor
        miEntero = 400; //Asignamos el valor en otra línea de código
        double pi = 3.141592; //Declaramos variable y asignamos valor
        boolean bool = true; //true o false
        char unCaracter = 'a'; //Un caracter

        //Variables tipo objeto - Método o funciones pre hechas
        Integer myInteger = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        String myString = "ABC";

        String myNewString = myInteger.toString(); //Transforma un número entero en texto - myNewString = "5"
        System.out.println(myNewString.length()); //la cantidad de caracteres de mi texto - 1

        //Cadena - Strings
        String cadena = "Buenos días a todos mis Compañeros";
        System.out.println("La longitud de la cadena es: "+ cadena.length());
        char letra = cadena.charAt(1); //el caracter en la posición indicada
        System.out.println(letra);

        int a = cadena.indexOf("Buenos"); //me regresa la posición del texto
        int b = cadena.indexOf("Compañeros");
        int c = cadena.indexOf("hola");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(cadena.toLowerCase()); //minúsculas
        System.out.println(cadena.toUpperCase()); //MAYUSCULAS

        String x = "hola";
        String y = "Hola";
        System.out.println(x.equals(y));

        String resultadoImpresion = impresion(); // resultadoImpresion = "holi"
        System.out.println(resultadoImpresion);

        impresion2();


        //Arreglos - Es una variable en la cual podemos agregar más de un valor es distintas posiciones.
        int[] miArreglo; //Declaración
        miArreglo = new int[5]; //Inicialización     
        miArreglo[0] = 4;
        miArreglo[1] = 8;
        miArreglo[2] = 8;
        miArreglo[3] = 5;
        miArreglo[4] = 9;

        //miArreglo[5] = 1;

        System.out.println(miArreglo[2]);

        int[] miArreglo2 = {4, 8, 8, 5, 9};
        
        //miArreglo2[5] = 1;

        System.out.println(miArreglo2[2]);
        
        ArrayList<Integer> miArreglo3 = new ArrayList<Integer>();
        miArreglo3.add(10);
        System.out.println(miArreglo3.get(0)); //actúa como posición -> [0]

        //Condicionales y Operadores
        boolean llueve = false;
        boolean soleado = true;

        if(llueve) {
            System.out.println("Lleva paraguas.");
        } else {
            System.out.println("Disfruta de tu día!");
        }

        if(llueve) {
            System.out.println("Lleva un paraguas");
        } else if(soleado) {
            System.out.println("Ponte bloqueador");
        } else {
            System.out.println("Vamos al parque!");
        }

        llueve = true;
        if(llueve && soleado) { //Ambos son verdadero
            System.out.println("Busca un arcoiris en el cielo");
        }

        /*
        i = 0
        alo?
        i = 1
        alo?
        i = 2
        alo?
        i = 3
        alo?
        i = 4
        alo?
        i = 5
        alo?
        i = 6
        alo?
        i = 7
         */
        for(int i=0; i < 7; i++) {
            System.out.println("alo?");
        }

        /*
        j = 0
        ciao!
        j = 2
        ciao!
        j = 4
        ciao!
        j = 6
        ciao!
        j = 8
        ciao!
        j = 10
         */
        int j = 0;
        while(j < 10) {
            System.out.println("ciao!");
            j += 2;
        }

        int inicio = 0;
        int fin = 10;
        while(inicio < fin) {
            System.out.println("bye");
            inicio++;
            fin--;
        }
        /*
        {
            "nombre": "Elena",
            "apellido": "De Troya",
            "email": "elena@codingdojo.com"
        }
        */
        HashMap<String, String> estudiante1 = new HashMap<String, String>();
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String a = input.nextLine();
        estudiante1.put("nombre", a);
         */
        estudiante1.put("nombre", "Elena");
        estudiante1.put("apellido", "De Troya");
        estudiante1.put("email", "elena@codingdojo.com");
        estudiante1.put("id", "8129839");

        System.out.println(estudiante1.get("nombre"));

        HashMap<String, String> usuarios = new HashMap<String, String>();
        usuarios.put("elena@codingdojo.com", "Elena de Troya");
        usuarios.put("juana@codingdojo.com", "Juana de Arco");
        usuarios.put("pedro@codingdojo.com", "Pedro Paramo");

        System.out.println(usuarios.get("pedro@codingdojo.com"));

        Set<String> claves = usuarios.keySet();
        /*
        claves = {"elena@codingdojo.com", "juana@codingdojo.com", "pedro@codingdojo.com"}
        clave = "elena@codingdojo.com"
        elena@codingdojo.com
        Elena de Troya
        --
        clave = "juana@codingdojo.com"
        juana@codingdojo.com
        Juana de Arco
        --
        clave = "pedro@codingdojo.com"
        pedro@codingdojo.com
        Pedro Paramo
         */
        for(String clave: claves) {
            System.out.println(clave);
            System.out.println(usuarios.get(clave));
        }

    }

    // Tipo de función: public, private, protected
    // static es de la clase. Viernes (detalle)
    // Tipo de valor de retorno: String, int, double. Si NO regreso nada: void
    // Nombre de función
    //(Parámetros a recibir)
    public static String impresion() {
        return "holi";
    }

    public static void impresion2() {
        System.out.println("holi2");
    }

}