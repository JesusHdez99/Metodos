import java.util.*;
public class programaa10 {
Scanner dato = new Scanner(System.in);
public void compraproducto(){
double precio, totalc;
double tp =0;
String producto;
System.out.println("Ingreso el nombre del producto");
producto = dato.next();
System.out.println("Ingrese el nombre de la marca"); String marca ="";
marca = dato.next();

System.out.println("Ingreso el precio del producto");
precio = dato.nextDouble();

System.out.println("la siguiente compra es de: ");
System.out.println("Hardware: "+producto+" Marca: "+marca);
if(precio >320 ){
System.out.println("El precio por recargo es de ; $"+precio*0.16);
tp = precio + (precio*0.16);
System.out.println("El neto a pagar es : $"+tp);
}else{
System.out.println("El precio por concepto de movilidad es de $51.15 ");
tp = precio - (precio+51.15);
System.out.println("El neto a pagar es : $"+tp);
}

}
public static void main (String []args){
programaa10 cp = new programaa10();
cp.compraproducto();
}
}