public class HelloWorld {

    public static String hola() {
        return "Hola mundo";
    }

    //Sobrecarga
    public static String hola(String nombre) { //nombre = "Elena"
        return "Hola "+nombre;
    }

    public static String hola(String nombre, String apellido) {
        return "Hola "+nombre+ " "+apellido;
    }

}