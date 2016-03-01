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
    public Contacto buscaContactosPorIdentificador(int identificador){
        Contacto contactoEncontrado = null;
        //Busca Contacto(s) con las funciones lambda por entero
        contactoEncontrado=(Contacto) this.listaDeContactos
                .stream()
                .filter(contacto->contacto.getIdentificador()==identificador)
                .collect(Collectors.toList()).get(0);
        return contactoEncontrado;
    }
    public boolean eliminarContacto(Contacto contacto){
        boolean estadoEliminar = listaDeContactos.remove(contacto);
        return estadoEliminar;
    }
}
