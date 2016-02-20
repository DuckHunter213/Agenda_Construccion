package Proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
static ArrayList<Contacto> contactos = new ArrayList<>();
static Scanner teclado = new Scanner(System.in);
    
public static Contacto preguntarDatosContacto(){
    System.out.println("Ingrese el nombre del contacto");
    String nombre = teclado.nextLine();
    System.out.println("Ingrese los apellidos del contacto");
    String apellidos = teclado.nextLine();
    System.out.println("Ingrese el telefono del contacto");
    String telefono = teclado.nextLine();
    System.out.println("Ingrese una red Social del contacto");
    String redSocial = teclado.nextLine();
    System.out.println("Ingrese la página Web del contacto");
    String paginaWeb = teclado.nextLine();
    System.out.println("Ingrese una foto del contacto");
    image foto;
    
    Contacto aux = new Contacto(nombre,apellidos,telefono,redSocial);
    
}
public static void main(String[] args) {
    contactos.add();
        
    }
}
