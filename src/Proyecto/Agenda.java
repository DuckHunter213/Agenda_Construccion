package Proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Agenda {
    private ArrayList <Contacto> listaDeContactos;
    
    public Agenda(){
        this.listaDeContactos = new ArrayList<Contacto>();
    }
    
    public void agregarContacto(Contacto contacto){
        this.listaDeContactos.add(contacto);
    }
    public List<Contacto> buscaContactosPorNombre(String nombre){
        List<Contacto> contactosEncontrados = null;
        //Busca Contacto(s) con las funciones lambda por nombre
        contactosEncontrados=this.listaDeContactos
                .stream()
                .filter(contacto->contacto.getNombre().equals(nombre))
                .collect(Collectors.toList());
        return contactosEncontrados;
    }
    public List<Contacto> buscaContactosPorIdentificador(int identificador){
        List<Contacto> contactosEncontrados = null;
        //Busca Contacto(s) con las funciones lambda por entero
        contactosEncontrados=this.listaDeContactos
                .stream()
                .filter(contacto->contacto.getIdentificador()==identificador)
                .collect(Collectors.toList());
        return contactosEncontrados;
    }
}
