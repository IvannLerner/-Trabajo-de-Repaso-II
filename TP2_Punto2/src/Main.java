

public class Main {
    public static void main(String[] args) {

        Docente docente1 = new Docente("Juan", 35, "Matematica");
        Preceptor preceptor1 = new Preceptor("Pedro", 40, "5to año");

        docente1.mostrarInformacion();
        preceptor1.mostrarInformacion();

        docente1.setEdad(36);

        System.out.println("Datos actualizados:");
        docente1.mostrarInformacion();

        docente1.setEdad(-5);

        System.out.println("Despues de intentar poner edad negativa:");
        docente1.mostrarInformacion();
    }
}

