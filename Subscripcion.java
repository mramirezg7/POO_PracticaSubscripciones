public class Subscripcion {
    //Atributos
    private String tipo;
    private double costo;
    private short periocidad;

    //Métodos
    public Subscripcion (String tipoObjeto,
                 double costoObjeto,
                 short periocidadObjeto){
        tipo = tipoObjeto;
        costo = costoObjeto;
        periocidad = periocidadObjeto;
    }
    //Getters
    public String getTipo(){
        return tipo;
    }
    public double getCosto () {
        return  costo;
    }
    public short getPeriocidad (){
        return periocidad;
    }

    //Setters
    public void setTipo (String nuevoTipo){
        tipo = nuevoTipo;
    }
    public void setCosto (double nuevoCosto){
        costo = nuevoCosto;
    }
    public void setPeriocidad (short nuevaPeriocidad){
        periocidad = nuevaPeriocidad;
    }

    public boolean equals (Subscripcion subscripcionComparar){
        return tipo.equals(subscripcionComparar.tipo) &&
                periocidad == subscripcionComparar.periocidad;
    }

    //toString()
    public String toString(){
        return "Tipo: " + tipo + "\nCosto: " + costo +
                "\nPeriocidad: " + periocidad + "\n";
    }
}
