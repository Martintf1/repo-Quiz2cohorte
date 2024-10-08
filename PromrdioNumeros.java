/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promrdionumeros;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class PromrdioNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        int numeros[] = new int [20];
        
        double sumaPares=0;
        double sumaImpares= 0;
        int contadorPar= 0;
        int contadorImpar= 0;
        
        for (int i=0;i<20;i++)
        {
            System.out.println("Digite "+(i+1)+" numero: ");
            numeros[i]=sc.nextInt();
        }
        
        for (int i = 0; i<20;i++)
        {
            

       
            if (numeros[i]%2==0)
            {
                sumaPares+=numeros[i];
                contadorPar++;
            }
            else if(numeros[i]%2!=0)
            {
                sumaImpares+=numeros[i];
                contadorImpar++;
            }
                
        
        }
        double promedioPar = promedioPar ( sumaPares, contadorPar);
        double promedioImpar = promedioImpar ( sumaImpares, contadorImpar);
        System.out.println("Promedio numeros pares = "+promedioPar);
        System.out.println("Promedio numeros pares = "+promedioImpar);
        System.out.println("Suma de numeros pares = "+sumaPares);
        System.out.println("suma numeros impares = "+sumaImpares);
        

        
    }
    public static double promedioPar (double sumaPares,int contadorPar)
    {
        return sumaPares/=contadorPar;
    }
     
    public static double promedioImpar (double sumaImpares,int contadorImpar)
    {
        return sumaImpares/=contadorImpar;
    }
  
}
