class Project {

    private String nombre;
    private String descripcion;

    public String elevatorPitch() {
        //return "Ninja Gold:Intenta buscar el oro en las distintas opciones"
        return this.nombre+":"+this.descripcion;
    }

    public Project() {}

    /*
    name = "Administrador de Tareas"
    proyecto3.nombre = "Administrador de Tareas"
     */
    public Project(String name) {
        this.nombre = name;
    }

    /*
    name = "Ninja Gold"
    description = "Intenta buscar el oro en las distintas opciones"
    proyecto4.nombre = "Ninja Gold"
    proyecto4.descripcion = "Intenta buscar el oro en las distintas opciones"
     */
    public Project(String name, String description) { 
        this.nombre = name;
        this.descripcion = description;
    }

    public String getNombre() {
        return this.nombre;
    }

    /*
    nombre = "Ninja Dorado"
    proyecto4.nombre = "Ninja Dorado"
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}