import java.awt.Image;
import java.util.ArrayList;

public class Contacto {
    private String nombre;
    private String apellidos;
    private ArrayList <String> telefono;
    private ArrayList <String> redSocial;
    private String paginaWeb;
    private Image foto;
    
    Contacto(String nombre, String apellidos, ArrayList telefono, ArrayList redSocial, String paginaWeb, Image foto){
            this.nombre=nombre;
            this.apellidos=apellidos;
            this.telefono=telefono;
            this.redSocial=redSocial;
            this.paginaWeb=paginaWeb;
            this.foto=foto;
        }
    
    public String getNombre() {return nombre;}
    public String getApellido() {return apellidos;}
    public ArrayList getTelefono() {return telefono;}
    public ArrayList getRedSocial() {return redSocial;}
    public String getWeb() {return paginaWeb;}
    public Image getFoto() {return foto;}
    
    public void setNombre(String nombre) {}
    public void setApellido(String apellido) {}
    public void setTelefono(ArrayList telefono) {}
    public void setRedSocial(ArrayList redSocial) {}
    public void setWeb(String web) {}
    public void setFoto(Image foto) {}
    
    public void agregarContacto(String nombre, String apellidos, ArrayList telefono, ArrayList redSocial, String paginaWeb, Image foto){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.telefono=telefono;
        this.redSocial=redSocial;
        this.paginaWeb=paginaWeb;
        this.foto=foto;
        
        
    }
}

