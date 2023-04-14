class StringManipulator {

    /*
    cadena1 = "    Hola     "
    cadena2 = "     Mundo    "
    return "Hola" + "Mundo"
    return "HolaMundo"
     */
    public String trimAndConcat(String cadena1, String cadena2) {
        return cadena1.trim() + cadena2.trim();
    }

    public int getIndexOrNull(String palabra, char letra) {
        return palabra.indexOf(letra);
    }

    /*
    palabra = "Hola"
    otraPalabra = "la"
     */
    public int getIndexOrNull(String palabra, String otraPalabra) {
        return palabra.indexOf(otraPalabra);
    }

    /*
    palabra1 = "Hola"
    inicio = 1
    fin = 3
    palabra2 = "mundo"
     */
    public String concatSubstring(String palabra1, int inicio, int fin, String palabra2){
        return palabra1.substring(inicio, fin) + palabra2;
    }

}