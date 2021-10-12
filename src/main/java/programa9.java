import java.util.*;
public class programa9 {
Scanner dato = new Scanner(System.in);
void cifras(){
int numero;
System.out.println("Ingreseumero");
numero = dato.nextInt();
if(numero>=1 && numero<10){
System.out.println("Haesado un numero de un digito ");
}else if(numero>=10 && numero<100){
System.out.println("Haesado un numero de dos digito ");
}else{
System.out.println("Haesado un numero de tres digito ");
}
}
public static void main(String[] args){
programa9 cif = new programa9(); cif.cifras();
}
}
