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