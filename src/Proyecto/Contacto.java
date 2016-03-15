package Proyecto;

import java.util.ArrayList;
import java.util.Arrays;

public class Contacto {

    private int identificador;
    private String nombre;
    private String apellido;
    private ArrayList<String> telefonos;
    private ArrayList<String> redesSociales;
    private ArrayList<String> correosElectronicos;
    private String paginaWeb;

    public Contacto(int identificador, String nombre, String apellido, ArrayList<String> telefonos, ArrayList<String> redesSociales, ArrayList<String> correosElectronicos, String paginaWeb) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefonos = telefonos;
        this.redesSociales = redesSociales;
        this.correosElectronicos = correosElectronicos;
        this.paginaWeb = paginaWeb;
    }

    public Contacto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }

    public ArrayList<String> getRedesSociales() {
        return redesSociales;
    }

    public void setRedesSociales(ArrayList<String> redesSociales) {
        this.redesSociales = redesSociales;
    }

    public ArrayList<String> getCorreosElectronicos() {
        return correosElectronicos;
    }

    public void setCorreosElectronicos(ArrayList<String> correosElectronicos) {
        this.correosElectronicos = correosElectronicos;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object contacto) {
        if (this == contacto) {
            return true;
        }
        if (contacto == null) {
            return false;
        }
        if (!(contacto instanceof Contacto)) {
            return false;
        }
        Contacto contactoComparar = (Contacto) contacto;
        if (apellido == null) {
            if (contactoComparar.apellido != null) {
                return false;
            }
        } else if (!apellido.equals(contactoComparar.apellido)) {
            return false;
        }
        if (correosElectronicos == null) {
            if (contactoComparar.correosElectronicos != null) {
                return false;
            }
        } else if (!correosElectronicos.equals(contactoComparar.correosElectronicos)) {
            return false;
        }
        if (identificador != contactoComparar.identificador) {
            return false;
        }
        if (nombre == null) {
            if (contactoComparar.nombre != null) {
                return false;
            }
        } else if (!nombre.equals(contactoComparar.nombre)) {
            return false;
        }
        if (paginaWeb == null) {
            if (contactoComparar.paginaWeb != null) {
                return false;
            }
        } else if (!paginaWeb.equals(contactoComparar.paginaWeb)) {
            return false;
        }
        if (redesSociales == null) {
            if (contactoComparar.redesSociales != null) {
                return false;
            }
        } else if (!redesSociales.equals(contactoComparar.redesSociales)) {
            return false;
        }
        if (telefonos == null) {
            if (contactoComparar.telefonos != null) {
                return false;
            }
        } else if (!telefonos.equals(contactoComparar.telefonos)) {
            return false;
        }
        return true;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + ((correosElectronicos == null) ? 0 : correosElectronicos.hashCode());
        result = prime * result + identificador;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((paginaWeb == null) ? 0 : paginaWeb.hashCode());
        result = prime * result + ((redesSociales == null) ? 0 : redesSociales.hashCode());
        result = prime * result + ((telefonos == null) ? 0 : telefonos.hashCode());
        return result;
    }

}
