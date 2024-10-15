
package pokemon_registro;

import java.util.ArrayList;
import java.util.Scanner;

public class Pokemon_registro {

  public static void menu(){
      Scanner tec=new Scanner(System.in);
      int op=0;
      long ID=0;
      String nombre="";
      int nivel=0;
      int eleccion=0;
      boolean encontrado;
      String tipo="";
      ArrayList<Pokemon> Registro_Poke=new ArrayList<Pokemon>();
      System.out.println("Bienvenido al sistema de registro Pokemon ");
      do{
          System.out.println("1.-Registrar Pokemon");
          System.out.println("2.-Mostrar Pokemon y niveles ");
          System.out.println("3.-Entrenar Pokemon ");
          System.out.println("4.-Iniciar Batalla ");
          System.out.println("5.-Salir");
          op=tec.nextInt();
          switch(op){
              case 1: System.out.println("Ingrese la ID del Pokemon ");
              do{
                  encontrado=false;
                  System.out.println("ID: ");
                  ID=tec.nextInt();
                  for(Pokemon i:Registro_Poke){
                      if(i.ID==ID){
                          encontrado=true;
                          System.out.println("Error. ID en el sistema");
                      }else{
                      }
                  }   
              }while(encontrado==true);
                  System.out.println("Ingrese nombre de pokemon: ");
                  tec.nextLine();
                  nombre=tec.nextLine();
   
                  System.out.println("Ingrese el nivel del pokemon ");
                  nivel=tec.nextInt();
                  
                  System.out.println("Ingrese el tipo de Pokemon ");
                  
                  do{
                  System.out.println("1.-Agua 2.-Fuego ");
                  tec.nextLine();
                  eleccion=tec.nextInt(); 
                  if(eleccion==1){
                      tipo="Agua";
                  }
                  if(eleccion==2){
                      tipo="Fuego";
                  }
                  if(eleccion>2 || eleccion<1){
                      System.out.println("Error. Opcion no valida");
                  }
                  }while(eleccion>2 || eleccion<1);
                  Pokemon meth=new Pokemon(ID, nombre, nivel, tipo);
                  Registro_Poke.add(meth);
                  break; 
              case 2: for(Pokemon i:Registro_Poke){
                  System.out.println("ID: "+i.ID);
                  System.out.println("Nombre: "+i.nombre);
                  System.out.println("Nivel: "+i.nivel);
                  System.out.println("Tipo: "+i.tipo);
              }
                  break;
              case 3:
                  break;
              case 4:
                  break;
              case 5: System.out.println("Saliendo...");
                      break;
                  
          }
      }while(op!=5);
      
  }
    public static void main(String[] args) {
        
        menu();
        
    }
    
}
