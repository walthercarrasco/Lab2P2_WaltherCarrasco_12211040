
package lab2p2_walthercarrasco_12211040;

public class Clientes {
    private String nombre;
    private int edad;
    private String ID;
    private double pago;
    
    public Clientes(){
        
    }
    
    public Clientes(String name, int e, String id){
        this.nombre = name;
        this.edad = e;
        this.ID = id;
    }
    
    public String getID(){
        return ID;
    }
    
    public void setID(String i){
        this.ID = i;
    }
    
    public void setNombre(String name){
        this.nombre = name;
    }
    
    public void setEdad(int e){
        this.edad = e;
    }
    
    public String listarcar(){
        Carros ca = new Carros();
        if(ca.getCliente().equals(ID)){
            return "\nCliente: " + ID + ca.toString();
        }else{
            return "";
        } 
    }    
    
    public String toString(){
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nIdentidad: " + ID;
    }
}
