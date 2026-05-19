class Nota{
    private String Contenido;
    public Nota(){
    }
    public void AgregarNota(String Nota){
        this.Contenido=Nota+"\n";
    }
    public String getContenido(){
        return Contenido;
    }
}
