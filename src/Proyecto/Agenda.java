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
    
    public boolean agregarContacto(Contacto contacto){
        boolean estadoEliminar = this.listaDeContactos.add(contacto);
        return estadoEliminar;
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
