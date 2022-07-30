
package lab2p2_walthercarrasco_12211040;

import java.util.Date;

public class Carros {
    private String marca;
    private String modelo;
    private int fabricacion;
    private Date ingreso;
    private int estado;
    private double costo;
    private String cliente;
    
    public Carros(){
        
    }
    
    public Carros(String ma, String mo, int a, Date i, int es, double costo, String c){
        this.costo = costo;
        this.modelo = mo;
        this.marca = ma;
        this.estado = es;
        this.ingreso = i;
        this.fabricacion = a;
        this.cliente = c;
    }
    
    public void setEstado(){
        this.estado = estado++;
    }
    public void setEstado(int n){
        this.estado = n;
    }
    
    public int getEstado(){
        return estado;
    }
    
    public String getCliente(){
        return cliente;
    }
    
    public String toString(){
        String msj = "";
        msj += "\nMarca: " + marca + "\nModelo: " + modelo + "Año de Fabricacion: "+ fabricacion+ "\nCosto de reparacion: " + costo + "\nIngreso: " + ingreso + "\nIdentidad del cliente: " + cliente + "\nEstado: ";
        if(estado == 1){
            msj += "en espera de entrar a reparación";
        }else if(estado == 2){
            msj+= "en reparación";
        }else if(estado == 3){
            msj += "en espera de pago";
        }else if(estado == 4){
            msj += "saldo pagado";
        }else if(estado == 5){
            msj += "en espera de ser entregado";
            
        }else if(estado > 5){
            msj += "entregado";
        }
        return msj;
    }
}
