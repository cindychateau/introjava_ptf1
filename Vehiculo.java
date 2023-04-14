class Vehiculo {

    /*Variables miembro - Características o atributos de mi objeto */
    private int anio;
    private String marca;
    private String modelo;
    private String color;
    private int ruedas;

    public static int cantidadVehiculos = 0; //Mi variable estática NO pertenece a una instancia, sino pertenece a la clase.

    /*Constructor - Inicializa un objeto */
    public Vehiculo() {
        cantidadVehiculos++;
    }

    /*Múltiples constructores - SOBRECARGA */
    /*
    color = "rojo"
    auto2.color = "rojo"
    "*/
    public Vehiculo(String color) {
        this.color = color;   
        cantidadVehiculos++;
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
        cantidadVehiculos++;
    }

    public Vehiculo(int ruedas) {
        this.ruedas = ruedas;
        cantidadVehiculos++;
    }

    public void acelera() {
        System.out.println("El vehículo "+this.marca+" está acelerando!");
    }

    /*
    A través de los getters y setters vamos a poder modificar y consultar los datos de un objeto
     */
    
    //Getter es el encargado de regresarme un dato
    public int getAnio() {
        return this.anio;
    }

    //Setter es el encargado de asignar un valor a mi atributo
    /*
    anio = 2001
    this = auto1
    auto1.anio = 2001
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return this.marca;
    }

    /*camelCase - empiezaConMinuscula */
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public static void sonidoAuto() {
        System.out.println("rum rum");
    }

}