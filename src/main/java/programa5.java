import java.util.*;
public class programa5 {
Scanner dato = new Scanner(System.in);
public void compraproducto(){
String nproducto ="";
double precio, totalc;
double tp =0;
int cantidad;
System.out.println("Ingreso el nombre del producto");
nproducto= dato.next();
System.out.println("Ingreso el precio del producto");
precio = dato.nextDouble();
System.out.println("Ingreso la cantidad");
cantidad =dato.nextInt();
totalc = precio * cantidad;
System.out.println("El total es : "+totalc);
if(totalc > 1000){
System.out.println("El descuento es ; "+totalc*0.20);
tp = totalc - (totalc*0.20);
System.out.println("El neto a pagar es : "+tp);
}else{
System.out.println("No hay descuentos");
}
}
public void seccion ( ) {
String cliente;
System.out.println("Ingreso el nombre del cliente");
cliente = dato.next();
System.out.println("Ingrese el nombre de la sección de productos"); String opcion ="";
opcion = dato.next();

switch(opcion) {
case "frutas": compraproducto(); break;
case "verduras": compraproducto(); break;
case "abarrotes": compraproducto(); break;
}
}
public static void main (String []args){
programa5 cp = new programa5();
cp.seccion();
}
}
