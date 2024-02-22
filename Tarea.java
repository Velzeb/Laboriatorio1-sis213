public class Tarea {
    String Nombre;
    boolean Terminado;
    public Tarea(String nombre) {
        this.Nombre = nombre;
        this.Terminado = false;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public boolean isTerminado() {
        return Terminado;
    }
    public void setTerminado(boolean terminado) {
        this.Terminado = terminado;
    }
    
    
}
