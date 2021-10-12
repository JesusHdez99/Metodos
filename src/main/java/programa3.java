import java.util.Scanner;
public class programa3 {
Scanner dato=new Scanner(System.in);
public void multiplicar(int n1){
System.out.println("Ingrese el numero");
n1 = dato.nextInt();
for(int a=1;a<=12;a++){
int resul=a*n1;

System.out.println(" o "+ a + " x " +n1+ " = " +resul);
}
}
public static void main(String[]args){
programa3 tabla = new programa3();
tabla.multiplicar(0);
}
}