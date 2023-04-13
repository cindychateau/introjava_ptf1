public class Pitagoras {
   
    public double calcularHipotenusa(int catetoA, int catetoB) {
        //La hipotenusa es el lado opuesto del ángulo recto.
        //Calcular el valor de c dados los valores catetoA y catetoB
        int aAlCuadrado = catetoA*catetoA; //Math.pow(catetoA, 2);
        int bAlCuadrado = catetoB*catetoB;
        int sumatoria = aAlCuadrado + bAlCuadrado;
        double c = Math.sqrt(sumatoria);

        return c;

        //return Math.sqrt( (catetoA*catetoA) + (catetoB*catetoB) );

    }

}
