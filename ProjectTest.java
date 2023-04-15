class ProjectTest {

    public static void main(String[] args) {
        //Proyecto vacío
        Project proyecto1 = new Project();

        //Proyecto con nombre
        Project proyecto2 = new Project("Planificador de Eventos");

        //Proyecto con nombre
        Project proyecto3 = new Project("Administrador de Tareas");
        proyecto3.setDescripcion("Proyecto para administrar las tareas de los alumnos");

        //Proyecto con nombre y descripcion
        Project proyecto4 = new Project("Ninja Gold", "Intenta buscar el oro en las distintas opciones");

        //proyecto4.getNombre();
        //proyecto4.setNombre("Ninja Dorado");

        System.out.println(proyecto4.elevatorPitch());
        //Imprimo: "Ninja Gold:Intenta buscar el oro en las distintas opciones"

        System.out.println(proyecto3.elevatorPitch());
    }

}