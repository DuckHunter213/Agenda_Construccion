package Proyecto;
import java.util.ArrayList;

public class Contacto{
    private String nombre;
    private String apellido;
    private ArrayList <String> telefonos;
    private ArrayList <String> redesSociales;
    private ArrayList <String> correosElectronicos;
    private String paginaWeb;     

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the telefonos
     */
    public ArrayList <String> getTelefonos() {
        return telefonos;
    }

    /**
     * @param telefonos the telefonos to set
     */
    public void setTelefonos(ArrayList <String> telefonos) {
        this.telefonos = telefonos;
    }

    /**
     * @return the redesSociales
     */
    public ArrayList <String> getRedesSociales() {
        return redesSociales;
    }

    /**
     * @param redesSociales the redesSociales to set
     */
    public void setRedesSociales(ArrayList <String> redesSociales) {
        this.redesSociales = redesSociales;
    }

    /**
     * @return the correosElectronicos
     */
    public ArrayList <String> getCorreosElectronicos() {
        return correosElectronicos;
    }

    /**
     * @param correosElectronicos the correosElectronicos to set
     */
    public void setCorreosElectronicos(ArrayList <String> correosElectronicos) {
        this.correosElectronicos = correosElectronicos;
    }

    /**
     * @return the paginaWeb
     */
    public String getPaginaWeb() {
        return paginaWeb;
    }

    /**
     * @param paginaWeb the paginaWeb to set
     */
    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }
}
