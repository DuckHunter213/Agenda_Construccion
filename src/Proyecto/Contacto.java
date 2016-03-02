package Proyecto;
import java.util.ArrayList;

public class Contacto{
    private int identificador;
    private String nombre;
    private String apellido;
    private ArrayList <String> telefonos;
    private ArrayList <String> redesSociales;
    private ArrayList <String> correosElectronicos;
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
    public ArrayList <String> getTelefonos() {
        return telefonos;
    }
    public void setTelefonos(ArrayList <String> telefonos) {
        this.telefonos = telefonos;
    }
    public ArrayList <String> getRedesSociales() {
        return redesSociales;
    }
    public void setRedesSociales(ArrayList <String> redesSociales) {
        this.redesSociales = redesSociales;
    }
    public ArrayList <String> getCorreosElectronicos() {
        return correosElectronicos;
    }
    public void setCorreosElectronicos(ArrayList <String> correosElectronicos) {
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
}
