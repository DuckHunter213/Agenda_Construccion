package agenda;

import java.awt.Image;
import java.util.ArrayList;

public class Contacto {
     private String nombre;
        private String apellido;
        private ArrayList <String> telefono;
        private ArrayList <String> redSocial;
        private String web;
        private Image foto;
        
        Contacto(String nombre, String apellido, ArrayList telefono, ArrayList redSocial, String web, Image foto){
            this.nombre=nombre;
            this.apellido=apellido;
            this.telefono=telefono;
            this.redSocial=redSocial;
            this.web=web;
            this.foto=foto;
        }
        public String getNombre(){return nombre;}
        public String getApellido(){return apellido;}
        public ArrayList getTelefono(){return telefono;}
        public ArrayList getRedSocial(){return redSocial;}
        public String getWeb(){return web;}
        public Image getFoto(){return foto;}
        public void setNombre(String nombre){this.nombre=nombre;}
        public void setApellido(String apellido){this.apellido=apellido;}
        public void setTelefono(ArrayList telefono){this.telefono=telefono;}
        public void setRedSocial(ArrayList redSocial){this.redSocial=redSocial;}
        public void setWeb(String web){this.web=web;}
        public void setFoto(Image foto){this.foto=foto;}
     
}
