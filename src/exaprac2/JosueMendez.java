/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class JosueMendez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int menu;
        int emp, horatrab;
        String nombre="", r;
        double salhora;
        
        
        
       do{
           
           menu=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero \n [1] Agregar empleado \n [2] Calcular planilla \n [3] salir"));
           
           
                emp=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de empleados q desea agregar"));
                String vectEmp[];
                vectEmp=new String[emp];
           
                for (int i = 0; i < emp; i++) {
                    nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del empleado");
                    salhora = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el salario por hora"));
                    horatrab = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de horas trabajadas"));
                    
                    r=JOptionPane.showInputDialog(null,"Nombre "+ nombre +"\n Salario por hora $"+ salhora+ "\n Cantidad de horas" + horatrab);
                    vectEmp[i]=r;
                    
                    JOptionPane.showMessageDialog(null,vectEmp[i]);
                }
           if(menu == 2){
               for (int j = 0; j < emp; j++) {
                   JOptionPane.showMessageDialog(null,vectEmp[j]);
                   
                   
               }
           }
          
        }while(menu != 3);
                
    }
    
}
