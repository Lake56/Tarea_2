class Departamento{
    private String nombre;
    private int CantidadEmpleados;
    public Departamento(){
    }
    public Empleado AgregarEmpleado(String nombre, String apellidos, String correo, String id){
            CantidadEmpleados+=1;
            return new Empleado(nombre,apellidos,correo,id);

    }
    public int ObtenerCantidadEmpleados(){
        return CantidadEmpleados;
    }
}
