package Proyecto;

import java.util.ArrayList;

public class Agenda {
    private ArrayList <Contacto> ListaDeContactos ;
    public void agregarContacto(){
        ListaDeContactos.add(contacto);
    }
    
    public static Contacto preguntarDatosContacto(){
        System.out.println("Ingrese el nombre del contacto");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese los apellidos del contacto");
        String apellidos; = teclado.nextLine();
        System.out.println("Ingrese el telefono del contacto");
        String telefono = teclado.nextLine();
        System.out.println("Ingrese una red Social del contacto");
        String redSocial = teclado.nextLine();
        System.out.println("Ingrese la página Web del contacto");
        String paginaWeb = teclado.nextLine();
        System.out.println("Ingrese una foto del contacto");
        System.out.println("");
        Contacto aux = new Contacto(nombre,apellidos,telefono,redSocial,paginaWeb);
        return aux;
        Agenda.agregarContacto(aux);
    }
    
    
    public int buscarContacto(String nombreBuscado){
        return contactos.indexOf(nombreBuscado);     
    }
}
