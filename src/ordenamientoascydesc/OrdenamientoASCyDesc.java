/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientoascydesc;

/**
 *
 * @author Daniel Argueta
 */
public class OrdenamientoASCyDesc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
     int []arreglo = {10,12,13,5,6,7,2,1};   
     
     
     for(int i=0;i<arreglo.length-1;i++){
     
         for(int j=0;j<arreglo.length-1;j++){
         
             if(arreglo[j]<arreglo[j+1]){
             int tmp = arreglo[j+1];
             arreglo[j+1] = arreglo[j];
             arreglo[j] = tmp;
             }
             
             
         }
     
     }
        System.out.println("Descendente");
      for(int i=0;i<arreglo.length;i++){
          System.out.println(arreglo[i]);
      }  
    
        System.out.println("Ascendente");
      for(int i=arreglo.length-1;i>=0;i--){
          System.out.println(arreglo[i]);
      }
      
    }
    
}
