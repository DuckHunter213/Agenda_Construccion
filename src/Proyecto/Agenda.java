package Proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Agenda {

    private ArrayList<Contacto> listaDeContactos;

    public Agenda() {
        this.listaDeContactos = new ArrayList<Contacto>();
    }

    public boolean agregarContacto(Contacto contacto) {
        boolean estadoAgregar = this.listaDeContactos.add(contacto);
        return estadoAgregar;
    }

    private Predicate<Contacto> filtraContacto(String criterioBusqueda, TipoBusqueda tipo) {
        Predicate<Contacto> predicadoFiltrado = null;
        if (tipo == TipoBusqueda.porNombre) {
            predicadoFiltrado = contacto -> contacto.getNombre().contains(criterioBusqueda);
        } else if (tipo == TipoBusqueda.porCorreo) {
            predicadoFiltrado = contacto -> contacto.getCorreosElectronicos().contains(criterioBusqueda);
        }
        return predicadoFiltrado;
    }

    private List<Contacto> buscaContacto(String criterioBusqueda, TipoBusqueda tipo) {
        return this.listaDeContactos
                .stream()
                .filter(filtraContacto(criterioBusqueda, tipo))
                .collect(Collectors.toList());
    }

    public List<Contacto> buscaContactosPorNombre(String nombre) {
        return this.buscaContacto(nombre, TipoBusqueda.porNombre);
    }

    public List<Contacto> buscaContactosPorCorreo(String correo) {
        return this.buscaContacto(correo, TipoBusqueda.porCorreo);
    }

    public Contacto buscaContactosPorIdentificador(int identificador) {
        Contacto contactoEncontrado = null;
        contactoEncontrado = (Contacto) this.listaDeContactos
                .stream()
                .filter(contacto -> contacto.getIdentificador() == identificador)
                .collect(Collectors.toList()).get(0);
        return contactoEncontrado;
    }

    public boolean eliminarContacto(Contacto contacto) {
        boolean estadoEliminar = listaDeContactos.remove(contacto);
        return estadoEliminar;
    }
}
