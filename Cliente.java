public class Cliente {

    //Atributos
    private String nombre;
    private String apellidos;
    private String cedula;
    private char sexo;
    private String ubicacion;

    //Métodos

    //toString()
    public String toString(){
        return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nCedula: " + cedula + "\nSexo: " + sexo +
                "\nUbicación: " + ubicacion + "\n";
    }

    //Getters
    public String getNombre (){
        return nombre;
    }
    public String getApellidos (){
        return apellidos;
    }
    public String getCedula (){
        return cedula;
    }
    public char getSexo (){
        return sexo;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    //Setters
    public void setNombre (String nuevoNombre){
        nombre = nuevoNombre;
    }
    public void setApellidos (String nuevosApellidos){
        apellidos = nuevosApellidos;
    }
    public void setCedula (String nuevaCedula){
        cedula = nuevaCedula;
    }
    public void setSexo (char nuevoSexo){
        sexo = nuevoSexo;
    }
    public void setUbicacion (String nuevaUbicacion){
        ubicacion = nuevaUbicacion;
    }

    public boolean equals(Cliente clienteComparar) {
        return cedula.equals(clienteComparar.cedula);
    }

    public Cliente (String nombreObjeto,
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

    public Cliente (String nombreObjeto,
             String apellidosObjeto,
             String cedulaObjeto,
             String ubicacionObjeto){
        nombre = nombreObjeto;
        apellidos = apellidosObjeto;
        cedula = cedulaObjeto;
        ubicacion = ubicacionObjeto;
    }

    public Cliente (){}

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Cédula: " + cedula);
        System.out.println("Sexo: " + sexo);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("------");
    }

    public void subscribirse (Subscripcion obejtoSubscripcion) {
        System.out.println(nombre + " " + apellidos + " obtuvo la subscripción" +
                " " + obejtoSubscripcion.getTipo() + ".");
    }

}
