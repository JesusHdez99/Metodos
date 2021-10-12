import java.util.*;
public class programa7 {
Scanner dato = new Scanner(System.in);
void numerospares(){
System.out.println("Introduceumero");
int n = dato.nextInt();
int i =0;
int j =1;
System.out.println("Losros pares son ; ");
do{ if(j%2==0) {
System.out.print(j+","); j++; i++;
}else {
j++;
}
}while( i != n);
}
public static void main(String[]args){ programa7 numpar =new programa7();
numpar.numerospares();
} }
