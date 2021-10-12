import java.util.*;
public class programa8 {
Scanner dato = new Scanner(System.in);
void dobleotriple(){
int numero;
System.out.println("Ingreseumero a evaluar ;");
numero = dato.nextInt();
if( numero % 2 == 0 ){
System.out.println("Ele del numero ==> " + 2* numero);
} else {
System.out.println("Elle del numero ==> " + 3* numero);
}

} public static void main(String []args){
programa8 dt = new programa8();
dt.dobleotriple();
}
}

