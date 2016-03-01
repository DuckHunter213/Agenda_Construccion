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
