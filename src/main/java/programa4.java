import java.util.*;
public class programa4 {
public int b;
Scanner dato=new Scanner(System.in);
public void subir(int b){
System.out.println("Ingrese el numero de piso");
b = dato.nextInt();
for(int a=1;a<=b;a++){
System.out.println(" sube al piso "+a);
}
}
public static void main(String[]args){
programa4 sub = new programa4();
sub.subir( 0);
}
}
