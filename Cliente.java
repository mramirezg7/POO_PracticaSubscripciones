public class Cliente {

    //Atributos
    String nombre;
    String apellidos;
    String cedula;
    char sexo;
    String ubicacion;

    //Métodos

    Cliente (String nombreObjeto,
             String apellidosObjeto,
             String cedulaObjeto,
             char sexoObjeto,
             String ubicacionObjeto){
        nombre = nombreObjeto;
        apellidos = apellidosObjeto;
        cedula = cedulaObjeto;
        sexo = sexoObjeto;
        ubicacion = ubicacionObjeto;
    }

    Cliente (String nombreObjeto,
             String apellidosObjeto,
             String cedulaObjeto,
             String ubicacionObjeto){
        nombre = nombreObjeto;
        apellidos = apellidosObjeto;
        cedula = cedulaObjeto;
        ubicacion = ubicacionObjeto;
    }

    Cliente (){}

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Cédula: " + cedula);
        System.out.println("Sexo: " + sexo);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("------");
    }

    void subscribirse (Subscripcion obejtoSubscripcion) {
        System.out.println(nombre + " " + apellidos + " obtuvo la subscripción" +
                " " + obejtoSubscripcion.tipo + ".");
    }

}
