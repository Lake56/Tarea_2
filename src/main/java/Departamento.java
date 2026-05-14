import java.util.ArrayList;
class Departamento{
    private String nombre;
    private ArrayList<Empleado> Empleados;
    public Departamento(){
        Empleados=new ArrayList<>();
    }
    public Empleado AgregarEmpleado(String nombre, String apellidos, String correo, String id){
        Empleado E= new Empleado(nombre,apellidos,correo,id);
        Empleados.add(E);
        return E;
    }
    public int ObtenerCantidadEmpleados(){
        return Empleados.size();
    }
}
