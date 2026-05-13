class Departamento{
    private String nombre;
    private int CantidadEmpleados;
    public Departamento(){
    }
    public void AgregarEmpleado(String nombre, String apellidos, String correo, String id){
            new Empleado(nombre,apellidos,correo,id);
            CantidadEmpleados+=1;
    }
    public int ObtenerCantidadEmpleados(){
        return CantidadEmpleados;
    }
}
