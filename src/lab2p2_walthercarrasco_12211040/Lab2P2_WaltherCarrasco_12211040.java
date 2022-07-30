
package lab2p2_walthercarrasco_12211040;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Lab2P2_WaltherCarrasco_12211040 {
    
    static Scanner leer = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        //Clases
        Empleados e = new Empleados();
        Clientes c = new Clientes();
        Carros a = new Carros();
        
        //ArrayList de Clases
        ArrayList<Empleados> em = new ArrayList<>();
        ArrayList<Clientes> cli = new ArrayList<>();
        ArrayList<Carros> car = new ArrayList<>();
        
        System.out.println("    Inicio de Sesion");
        System.out.print("Usuario: ");
        String usuario = leer.next();
        System.out.print("Contraseña: ");
        String contra = leer.next();
        while(!contra.equals("admin1234") || !usuario.equals("admin")){
            System.out.println("\nUsuario y contraseña incorrectos");
            System.out.println("\n    Inicio de Sesion");
            System.out.print("Usuario: ");
            usuario = leer.next();
            System.out.print("Contraseña: ");
            contra = leer.next();        
        }
        
        boolean salida = false;
        while(salida == false){
            System.out.println("\n1) Clientes"
                    + "\n2) Empleados"
                    + "\n3) Carros"
                    + "\n4) Salir");
            System.out.print("Opcion: ");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("\n1) Crear"
                            + "\n2) Modificar"
                            + "\n3) Eliminar"
                            + "\n4) Listar Clientes en Sistema"
                            + "\n5) Listar Carros por Cliente");
                    System.out.print("Opcion: ");
                    int opcioncliente = leer.nextInt();
                    switch(opcioncliente){
                        case 1:
                            System.out.print("Nombre: ");
                            leer = new Scanner(System.in);
                            String name = leer.nextLine();
                            
                            System.out.print("Edad: ");
                            int edad = leer.nextInt();
                            
                            System.out.print("Numero de Identidad: ");
                            String id = leer.next();
                            
                            cli.add(new Clientes(name, edad, id));
                            System.out.println("\nCliente agregado al sistema\n");
                        break;
                        
                        case 2:
                            System.out.print("\n1) Nombre"
                                    + "\n2) Edad"
                                    + "\n3) Numero de Identidad");
                                    int modcli = leer.nextInt();
                                    System.out.println("Ingrese el id del cliente a eliminar: ");
                                    id = leer.next();
                                    int x = 0;
                                    boolean valida = false;
                                    for(int i = 0; i < cli.size(); i++){
                                        if(cli.get(i).getID().equals(id)){
                                            x = i;
                                            valida = true;
                                        }                    
                                    } 
                                    if(modcli == 1 && valida == true){
                                        System.out.print("Ingrese Nombre: ");
                                        leer = new Scanner(System.in);
                                        name = leer.nextLine();
                                        cli.get(x).setNombre(name);
                                    }else if(modcli == 2 && valida == true){
                                         System.out.print("Ingrese Edad: ");
                                         int ed = leer.nextInt();
                                         cli.get(x).setEdad(ed);
                                    }else if(modcli == 3 && valida == true){
                                        System.out.print("Ingrese Nombre: ");
                                        leer = new Scanner(System.in);
                                        id = leer.nextLine();
                                        cli.get(x).setID(id);                                     
                                    }else{
                                        System.out.println("Opcion no Correcta");
                                    }
                        break;
                        
                        case 3:
                            System.out.println("Ingrese el id del cliente a eliminar: ");
                            id = leer.next();
                            boolean val = true;
                            for(int i = 0; i < cli.size(); i++){
                                if(cli.get(i).getID().equals(id)){
                                    cli.remove(i);
                                    val = false;
                                }
                            }
                            if(val == false){
                                System.out.println("El Cliente se elimino con exito");
                            }else{
                                System.out.println("No se encontro ningun cliente");
                            }
                        break;
                        
                        case 4:
                            for (Object o : cli) {
                                System.out.println(o.toString());
                                System.out.println();
                            }
                        break;
                        
                        case 5:
                            for (int i = 0; i < cli.size(); i++){
                                System.out.println(cli.get(i).listarcar());
                                System.out.println();
                            }                          
                        break;
                        
                        default:
                            System.out.println("Opcion incorrecta");
                        break;
                    }
                break;
                
                case 2:
                    System.out.println("\n1) Crear"
                            + "\n2) Modificar"
                            + "\n3) Eliminar"
                            + "\n4) Listar Empleados"
                            + "\n5) Marcar Asistencia");
                    System.out.print("Opcion: ");
                    int opcionem = leer.nextInt();
                    
                    switch(opcionem){
                        case 1:
                            System.out.print("Nombre: ");
                            leer = new Scanner(System.in);
                            String name = leer.nextLine();
                            
                            System.out.print("Edad: ");
                            int edad = leer.nextInt();
                            
                            System.out.print("Numero de Identidad: ");
                            String id = leer.next();
                            
                            System.out.print("RRHH: ");
                            String num = leer.next();
                            
                            System.out.print("Sueldo: ");
                            double sueldo = leer.nextDouble();
                            
                            em.add(new Empleados(name, edad, true, sueldo, num, id));
                            
                            System.out.println("\nEmpelado agregado correctamente\n");
                        break;
                        
                        case 2:
                            System.out.print("\n1) Nombre"
                                    + "\n2) Identidad"
                                    + "\n3) Edad"
                                    + "\n4) Sueldo"
                                    + "\n5) RRHH");
                            System.out.print("Opcion: ");
                            int modEm = leer.nextInt();
                            System.out.print("Ingrese RRHH del empleado: ");
                            String rrhh = leer.next();
                            boolean val = false;
                            int x = 0;
                            for(int i = 0; i < em.size(); i++){
                                if(em.get(i).getRRHH().equals(rrhh)){
                                    x = i;
                                    val = true;
                                }
                            }
                            if(modEm == 1 && val == true){
                                System.out.print("Ingrese el nuevo nombre del empleado: ");
                                leer = new Scanner(System.in);
                                name = leer.nextLine();
                                em.get(x).setNombre(name);
                            }else if(modEm == 2 && val == true){
                                System.out.print("Ingrese el nuevo ID del empleado: ");
                                id = leer.next();
                                em.get(x).setID(id);
                            }else if(modEm == 3 && val == true){
                                System.out.print("Ingrese la edad del empleado: ");
                                edad = leer.nextInt();
                                em.get(x).setEdad(edad);
                            }else if(modEm == 4 && val == true){
                                System.out.print("Ingrese el nuevo sueldo del empleado: ");
                                sueldo = leer.nextDouble();
                                em.get(x).setSueldo(sueldo);
                            }else if(modEm == 5 && val == true){
                                System.out.print("Ingrese el nuevo RRHH del empleado: ");
                                num = leer.next();
                                em.get(x).setRRHH(num);
                            }else{
                                System.out.println("Opcion no correcta");
                            }
                        break;
                        
                        case 3: 
                            System.out.println("Ingrese el RRHH del empleado a eliminar: ");
                            num = leer.next();
                            boolean vali = true;
                            for(int i = 0; i < cli.size(); i++){
                                if(em.get(i).getRRHH().equals(num)){
                                    em.remove(i);
                                    vali = false;
                                }
                            }
                            if(vali == false){
                                System.out.println("El empleado se elimino con exito");
                            }else{
                                System.out.println("No se encontro ningun empleado");
                            }
                        break;
                        
                        case 4: 
                            for (Object ob : em) {
                                System.out.println(ob.toString());
                                System.out.println();
                            }                           
                        break;
                        
                        case 5:
                            System.out.print("Ingrese RRHH del empleado: ");
                            rrhh = leer.next();
                            for(int i = 0; i < em.size(); i++){
                                if(em.get(i).getRRHH().equals(rrhh)){
                                    if(em.get(i).getEstado() == true){
                                        System.out.println("Nombre: " + em.get(i).getNombre());
                                        System.out.println("RRHH: " + em.get(i).getRRHH());                                        
                                        System.out.println("El empleado esta ACTIVO ");
                                        System.out.println("¿Desea Cambiarlo? \n1) Si \n2) No");
                                        System.out.print("Opcion: ");
                                        int opcionyn = leer.nextInt();
                                        if(opcionyn == 1){
                                            em.get(i).setEstado(false);
                                        }
                                    }else{
                                        System.out.println("Nombre: " + em.get(i).getNombre());
                                        System.out.println("RRHH: " + em.get(i).getRRHH());
                                        System.out.println("El empleado NO esta ACTIVO ");
                                        System.out.println("¿Desea Cambiarlo? \n1) Si \n2) No");
                                        System.out.print("Opcion: ");
                                        int opcionyn = leer.nextInt();
                                        if(opcionyn == 1){
                                            em.get(i).setEstado(true);
                                        }                                        
                                    }
                                }
                            }                           
                        break;
                    }
                break;
                
                case 3:
                    System.out.println("\n1) Crear"
                            + "\n2) Listar Carros"
                            + "\n3) Modificar Estado de Reparacion");
                    System.out.print("Opcion: ");
                    int opcionca = leer.nextInt();
                    
                    switch(opcionca){
                        case 1:
                            System.out.print("Ingrese el numero de identidad del cliente dueño: ");
                            String id = leer.next();
                            
                            boolean valida = true;
                            while(valida == true){
                                for(int i = 0; i < cli.size(); i++){
                                    if(cli.get(i).getID().equals(id)){
                                        valida = false;
                                    }else{
                                        System.out.println("Cliente no existe en la base de datos");
                                        System.out.print("Ingrese el numero de identidad del cliente dueño: ");
                                        id = leer.next();                                         
                                    }
                                }
                            }
                            
                            System.out.print("Marca: ");
                            leer = new Scanner(System.in);
                            String ma = leer.nextLine();
                            
                            System.out.print("Modelo: ");
                            leer = new Scanner(System.in);
                            String mo = leer.nextLine();
                            
                            System.out.print("Año de Fabricacion: ");
                            int ano = leer.nextInt();
                            
                            System.out.print("Costo de reparacion: ");
                            double costo = leer.nextDouble();
                            Date fe = new Date();
                            
                            car.add(new Carros(ma, mo, ano, fe, 1, costo, id));
                        break;
                        
                        case 2:
                            for (Object obj : car) {
                                System.out.println(obj.toString());
                                System.out.println();
                            }
                        break;
                        
                        case 3:
                            System.out.print("Numero del auto: ");
                            int num = leer.nextInt();
                            if(num < car.size()){
                                car.get(num).setEstado();
                            }else{
                                System.out.println("No hay esa catidad de carros");
                            }
                            if(car.get(num).getEstado() == 3){
                                System.out.println("Por donde desea pagar el costo?"
                                        + "\n1) Banco"
                                        + "\n2) En taller");
                                int op = leer.nextInt();
                                if(op == 1){
                                    car.get(num).setEstado(6);
                                }
                            }
                        break;
                        
                        
                    }
                break;
                
                case 4: 
                    salida = true;
                break;
                
                default:
                    System.out.println("Opcion Incorrecta");
                break;
            }
        }
    }
    
}
