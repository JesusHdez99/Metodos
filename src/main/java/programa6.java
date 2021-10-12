import java.util.*;
public class programa6 {
Scanner dato = new Scanner(System.in);
void generos(String gn){
gn=" "; String nombre;
System.out.println("Ingrese su genero ;");
gn=dato.next();
switch(gn){
case "M":
System.out.println("Ingrese su nombre ;");
nombre=dato.next(); break; case "F": System.out.println("Ingrese su nombre ;");
nombre=dato.next();
break;
case "": System.out.println("Debe ingrese su GENERO ! ;");
break;
}
}

public static void main(String[]args) {
programa6 genero = new programa6();
genero.generos("");
}
}

