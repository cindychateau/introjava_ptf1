class Vehiculo {

    /*Variables miembro - Características o atributos de mi objeto */
    public int anio;
    public String marca;
    public String modelo;
    public String color;
    public int ruedas;

    /*Constructor - Inicializa un objeto */
    public Vehiculo() {

    }

    /*Múltiples constructores - SOBRECARGA */
    /*
    color = "rojo"
    auto2.color = "rojo"
    "*/
    public Vehiculo(String color) {
        this.color = color;   
    }

    /*
    color = "azul"
    marca = "Tesla"
    auto3.color = "azul"
    auto3.marca = "Tesla"
     */
    public Vehiculo(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    public Vehiculo(int ruedas) {
        this.ruedas = ruedas;
    }

    public void acelera() {
        System.out.println("El vehículo "+this.marca+" está acelerando!");
    }

}