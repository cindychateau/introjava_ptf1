class VehiculoTest {

    public static void main(String[] args) {
        //Creamos un vehiculo
        ///Inicializamos la instancia
        Vehiculo auto1 = new Vehiculo(); 
        auto1.anio = 2001;
        auto1.marca = "Honda";
        auto1.modelo = "Civic";
        auto1.color = "blanco";
        auto1.ruedas = 4;

        System.out.println("Marca auto1:"+ auto1.marca);

        Vehiculo auto2 = new Vehiculo("rojo");
        auto2.anio = 2018;
        auto2.marca = "Mazda";
        auto2.modelo = "CX-3";
        auto2.ruedas = 4;

        System.out.println("Marca auto2:" + auto2.marca);
        //System.out.printf("Marca auto2: %s", auto2.marca);

        //System.out.println(String.format("Marca auto2: %s", auto2.marca));

        Vehiculo auto3 = new Vehiculo("azul", "Tesla");
        System.out.println("Marca auto3:" + auto3.marca);

        Vehiculo bicicleta = new Vehiculo(2);
        System.out.println("Ruedas de bici:"+bicicleta.ruedas);

        Vehiculo auto4 = new Vehiculo("gris", "BMW");

        
        auto1.acelera();
        
        auto2.acelera();

    }

}