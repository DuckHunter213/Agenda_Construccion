package Proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Agenda {
    private ArrayList <Contacto> listaDeContactos;
    
    public Agenda(){
        this.listaDeContactos = new ArrayList<Contacto>();
    }
    
    public boolean agregarContacto(Contacto contacto){
        boolean estadoAgregar = this.listaDeContactos.add(contacto);
        return estadoAgregar;
    }
    
    private Predicate<Contacto> filtraContacto(String criterioBusqueda, TipoBusqueda tipo){
        Predicate<Contacto> predicadoFiltrado=null;
        if(tipo==TipoBusqueda.porNombre){
            predicadoFiltrado=contacto->contacto.getNombre().contains(criterioBusqueda);
        }else if(tipo==TipoBusqueda.porCorreo){
            predicadoFiltrado=contacto->contacto.getCorreosElectronicos().contains(criterioBusqueda);
        }
        return predicadoFiltrado;
    }
    private List<Contacto> buscaContacto(String criterioBusqueda, TipoBusqueda tipo){
        return this.listaDeContactos
                .stream()
                .filter(filtraContacto(criterioBusqueda, tipo))
                .collect(Collectors.toList());
    }
    public List<Contacto> buscaContactosPorNombre(String nombre){
        return this.buscaContacto(nombre, TipoBusqueda.porNombre);
    }
    public List<Contacto> buscaContactosPorCorreo(String correo){
        return this.buscaContacto(correo, TipoBusqueda.porCorreo);
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
    
    public void agregarUsuarioPrueba(){
        ArrayList <String> telefonos,redesSociales,correosElectronicos;
        telefonos = new ArrayList<String>();
        redesSociales = new ArrayList<String>();
        correosElectronicos = new ArrayList<String>();           
        Contacto contactoTemporal = new Contacto();
        
        contactoTemporal.setNombre("Xalaquia");
        contactoTemporal.setApellido("Cuevas");
        telefonos.add("2282191122");
        contactoTemporal.setTelefonos(telefonos);
        redesSociales.add("/gerardo0579");
        contactoTemporal.setRedesSociales(redesSociales);
        correosElectronicos.add("gerardo0579@hotmail.com");
        contactoTemporal.setCorreosElectronicos(correosElectronicos);
        contactoTemporal.setPaginaWeb("www.eso.com");
        contactoTemporal.setIdentificador(2345);        
    }
}
