class Empleado{
    private String Id;
    private String Apellidos;
    private String Nombre;
    private String Correo;
    public Empleado(String nombre, String apellidos, String correo, String id){
        this.Nombre=nombre;
        this.Apellidos=apellidos;
        this.Correo=correo;
        this.Id=id;
    }
    public String getId(){
        return Id;
    }
}
