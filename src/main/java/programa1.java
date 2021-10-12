

import java.util.*;
public class programa1 {
Scanner informe = new Scanner(System.in);
public void datos(String nombre,String apellido,int edad){
System.out.println("Ingrese el nombre");
nombre = informe.next(); System.out.println("Ingrese el apellido");
apellido = informe.next(); System.out.println("Ingrese su edad");
edad = informe.nextInt(); System.out.println(nombre+"Los datos del usuario son "+" "+apellido+" ysu edad es "+edad); }

public static void main(String[]args){
programa1 robi = new programa1();
robi.datos(" ","",0);
}
}