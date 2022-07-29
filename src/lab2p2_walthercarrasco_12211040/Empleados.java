
package lab2p2_walthercarrasco_12211040;

public class Empleados {
    
    private String nombre;
    private int edad;
    private boolean estado;
    private double sueldo;
    private String RRHH;
    private String ID;
    
    public Empleados(){
        
    }
    
    public Empleados(String n, int e, boolean es, double s, String r, String i){
        this.nombre = n;
        this.edad = e;
        this.estado = es;
        this.sueldo = s;
        this.RRHH = r;
        this.ID = i;
    }
    
    public String getRRHH(){
        return RRHH;
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public void setID(String i){
        this.ID = i;
    }
    
    public void setEdad(int e){
        this.edad = e;
    }
    
    public void setSueldo(double s){
        this.sueldo = s;
    }
    
    public void setRRHH(String r){
        this.RRHH = r;
    }
    
    public void setEstado(boolean es){
        this.estado = es;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String toString(){
        return "\nNombre: " + nombre + "\nEdad: " + edad + "\nRRHH: " + RRHH + "\nSueldo: " + sueldo + "\nIdentidad: " + ID;
    }
 
}
