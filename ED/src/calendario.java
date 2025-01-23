
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author germa
 */
public class calendario {

  
       
    
    
    
    
    public static String signos(int mes, int dia) {
        String signofinal = "";
        
        if ((mes == 3 && dia >= 21&& dia<=31) || (mes == 4 && dia <= 19)) {
            signofinal = " Tu signo es Aries";
        } else if ((mes == 4 && dia >= 20 && dia <=30) || (mes == 5 && dia <= 20)) {
            signofinal = "Tu signo es Tauro";
        } else if ((mes == 5 && dia >= 21 && dia <=31) || (mes == 6 && dia <= 20)) {
            signofinal = "Tu signo es Géminis";
        } else if ((mes == 6 && dia >= 21 && dia<=30) || (mes == 7 && dia <= 22)) {
            signofinal = "Tu signo es Cáncer";
        } else if ((mes == 7 && dia >= 23 && dia<=31) || (mes == 8 && dia <= 22)) {
            signofinal = "Tu signo es Leo";
        } else if ((mes == 8 && dia >= 23 && dia<=31) || (mes == 9 && dia <= 22)) {
            signofinal = "Tu signo es Virgo";
        } else if ((mes == 9 && dia >= 23 && dia<=30) || (mes == 10 && dia <= 22)) {
            signofinal = "Tu signo es Libra";
        } else if ((mes == 10 && dia >= 23 &&dia<=31) || (mes == 11 && dia <= 21)) {
            signofinal = "Tu signo es Escorpio";
        } else if ((mes == 11 && dia >= 22 && dia<=30) || (mes == 12 && dia <= 21)) {
            signofinal = "Tu signo es Sagitario";
        } else if ((mes == 12 && dia >= 22 && dia<=31) || (mes == 1 && dia <= 19)) {
            signofinal = "Tu signo es Capricornio";
        } else if ((mes == 1 && dia >= 20 && dia<=31) || (mes == 2 && dia <= 18)) {
            signofinal = "Tu signo es Acuario";
        } else if ((mes == 2 && dia >= 19 && dia <=28) || (mes == 3 && dia <= 20)) {
            signofinal = "Tu signo es Piscis";
        } else {
            signofinal = "error";
        }

        return signofinal;

        
}
    
    
    public static void main(String[] args) {
      
        int mes;
        int dia;
        
        
        System.out.println("Dime tu mes de nacimiento");
       Scanner leer= new Scanner(System.in);
       mes = leer.nextInt();
       
       System.out.println("Dime tu dia de nacimiento");
      
       dia = leer.nextInt();
       
       String resultado= signos(mes,dia);
    
       System.out.println(resultado);
   

    }

    
}
