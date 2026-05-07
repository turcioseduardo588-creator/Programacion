
package sistemas_suministros_de_marte;
import java.util.Scanner;

public class Sistemas_Suministros_De_Marte {


    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    //Declaracion de variables a usar
    char optionselected='t';//opcion de switch general
    int optionsuministro=0;//opcion de switch case A
    double oxigeno=85; 
    double agua=30000;
    double comida=10985;
    double combustible= 101000;
    double nitrogeno=74;
    double consumo_de_recurso=0;// Variable para reducir los recursos
    int optionconsumo=0;//opcion de switch case B
    double reabastecimiento_de_recursos=0; // Variable para aumentar los recursos
    int optionabastecimiento=0;
   
    
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|\t\tSistema de Suministros de Marte\t\t|");
        System.out.println("|-------------------------------------------------------|");//57 cacarteres en total
        System.out.printf("%s %-26s %28s%n", "|", "A. Consultar Suministros", "|");
        System.out.printf("%s %-26s %28s%n", "|", "B. Registrar Consumo", "|");
        System.out.printf("%s %-26s %28s%n", "|", "C. Reabastecer Suministros", "|");
        System.out.printf("%s %-26s %28s%n", "|", "D. Ver estado de la mision", "|");
        System.out.printf("%s %-36s %18s%n", "|", "E. Activar Protocolo de Emergencia", "|");
        System.out.printf("%s %-26s %28s%n", "|", "F. Salir", "|");
        System.out.println("|-------------------------------------------------------|");  
        System.out.println("Ingrese una opcion.");
        optionselected=input.nextLine().toUpperCase().charAt(0);
        
        switch(optionselected){
            case 'A':
                    System.out.println("|-------------------------------------------------------|");
                    System.out.printf("%s %-36s %18s%n", "|", "Que suministro quiere consultar?", "|");
                    System.out.printf("%s %-26s %28s%n", "|", "1. Oxigeno", "|");
                    System.out.printf("%s %-26s %28s%n", "|", "2. Agua", "|");
                    System.out.printf("%s %-26s %28s%n", "|", "3. Comida", "|");
                    System.out.printf("%s %-26s %28s%n", "|", "4. Combustible", "|");
                    System.out.printf("%s %-26s %28s%n", "|", "5. Nitrogeno", "|");
                    System.out.println("|-------------------------------------------------------|");
                    optionsuministro=input.nextInt();
                    switch(optionsuministro){
                        
                        case 1: 
                            System.out.printf("Nivel de Oxigeno: %.2f %s", oxigeno, "%");
                            System.out.println("");
                            break;
                        case 2: 
                            System.out.printf("Volumen de agua: %.2f %s", agua, "Galones");
                            System.out.println("");
                            break;
                        case 3:
                            System.out.printf("Comida: %.2f %s",comida, " raciones de comida");
                            System.out.println("");
                            break;
                        case 4:
                            System.out.printf("Volumen de combustible: %.2f %s", combustible, "Galones");
                            System.out.println("");
                            break;
                        case 5:
                            System.out.printf("Nivel de Nitrogeno: %.2f %s", nitrogeno, "%");
                            System.out.println("");
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida.");
                            break;                               
                    }//Fin SubSwitch
                    break;
            case 'B':
                    System.out.println("|-------------------------------------------------------|");
                    System.out.printf("%s %-36s %18s%n", "|", "Que consumo quiere registrar?", "|");
                    System.out.printf("%s %-26s %28s%n", "|", "1. Oxigeno", "|");
                    System.out.printf("%s %-26s %28s%n", "|", "2. Agua", "|");
                    System.out.printf("%s %-26s %28s%n", "|", "3. Comida", "|");
                    System.out.printf("%s %-26s %28s%n", "|", "4. Combustible", "|");
                    System.out.printf("%s %-26s %28s%n", "|", "5. Nitrogeno", "|");
                    System.out.println("|-------------------------------------------------------|");
                    optionconsumo=input.nextInt();
                    switch(optionconsumo){
                        
                        case 1: 
                            System.out.println("Por favor, ingrese el consumo de oxigeno realizado");
                            consumo_de_recurso=input.nextDouble();
                            oxigeno=oxigeno- consumo_de_recurso; 
                            System.out.println(oxigeno);
                            break;
                        case 2: 
                            System.out.println("Por favor, ingrese el consumo de Agua realizado");
                            consumo_de_recurso=input.nextDouble();
                            agua=agua- consumo_de_recurso; 
                            System.out.println(agua);

                            break;
                        case 3:
                            System.out.println("Por favor, ingrese el consumo de Comida realizado");
                            consumo_de_recurso=input.nextDouble();
                            comida=comida- consumo_de_recurso; 
                            System.out.println(comida);

                            break;
                        case 4:
                            System.out.println("Por favor, ingrese el consumo de combustible realizado");
                            consumo_de_recurso=input.nextDouble();
                            combustible=combustible- consumo_de_recurso; 
                            System.out.println(combustible);

                            break;
                        case 5:
                            System.out.println("Por favor, ingrese el consumo de Nitrogeno realizado");
                            consumo_de_recurso=input.nextDouble();
                            nitrogeno=nitrogeno- consumo_de_recurso; 
                            System.out.println(nitrogeno);

                            break;
                        default:
                            System.out.println("Ingrese una opcion valida.");
                            break;                               
                    }//Fin SubSwitch
                    break;
            case'C':
                    System.out.println("|-------------------------------------------------------|");
                    System.out.printf("%s %-40s %14s%n", "|", "Que abastecimiento quiere registrar?", "|");
                    System.out.printf("%s %-26s %28s%n", "|", "1. Oxigeno", "|");
                    System.out.printf("%s %-26s %28s%n", "|", "2. Agua", "|");
                    System.out.printf("%s %-26s %28s%n", "|", "3. Comida", "|");
                    System.out.printf("%s %-26s %28s%n", "|", "4. Combustible", "|");
                    System.out.printf("%s %-26s %28s%n", "|", "5. Nitrogeno", "|");
                    System.out.println("|-------------------------------------------------------|");
                    optionabastecimiento=input.nextInt();
                    switch(optionabastecimiento){
                        
                        case 1: 
                            System.out.println("Por favor, ingrese el abastecimiento de oxigeno realizado");
                            reabastecimiento_de_recursos=input.nextDouble();
                            oxigeno=oxigeno+reabastecimiento_de_recursos; 
                            break;
                        case 2: 
                            System.out.println("Por favor, ingrese el consumo de Agua realizado");
                            reabastecimiento_de_recursos=input.nextDouble();
                            agua=agua+reabastecimiento_de_recursos; 
                            break;
                        case 3:
                            System.out.println("Por favor, ingrese el consumo de Comida realizado");
                            reabastecimiento_de_recursos=input.nextDouble();
                            comida=comida+reabastecimiento_de_recursos; 
                            break;
                        case 4:
                            System.out.println("Por favor, ingrese el consumo de Agua realizado");
                            reabastecimiento_de_recursos=input.nextDouble();
                            combustible=combustible+reabastecimiento_de_recursos; 
                            break;
                        case 5:
                            System.out.println("Por favor, ingrese el consumo de Agua realizado");
                            reabastecimiento_de_recursos=input.nextDouble();
                            nitrogeno=nitrogeno+reabastecimiento_de_recursos; 
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida.");
                            break;                               
                    }//Fin SubSwitch 
        }//Fin Switch
    }
    
}
