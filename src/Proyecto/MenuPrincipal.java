/******************************************************************************/
/* Nombre del programa:     Agenda con estándares de código                   */
/* Nombres:                 Luis Fernando Gomez Alejandre                     */
/*                          Francisco Gerardo Mares Solano                    */
/* Fecha:                   25 de Febrero de 2016                             */
/* Descripción:             Es una agenda donde consiste en demostrar         */
/*                          el uso de buen código y buenas practicas para     */
/*                          escribir codigo                                   */
/*                                                                            */
/******************************************************************************/
package Proyecto;
import Proyecto.Contacto;
import Proyecto.Agenda;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {    
    static final int SALIDA_MENU=-1;
    
    public static Contacto capturarDatosDelContacto(){
        Scanner teclado = new Scanner(System.in);
        ArrayList <String> telefonos,redesSociales,correosElectronicos;
        telefonos = new ArrayList<String>();
        redesSociales = new ArrayList<String>();
        correosElectronicos = new ArrayList<String>();
            
        Contacto temporal = new Contacto();
        System.out.println("-----Datos del contacto-----");
        System.out.println("Identificador:");
        int identificador = teclado.nextInt();
        temporal.setIdentificador(identificador);
        teclado.nextLine();
        System.out.println("Nombre:");
        temporal.setNombre(teclado.nextLine());
        System.out.println("Apellido:");
        temporal.setApellido(teclado.nextLine());
        System.out.println("Telefono:");
        telefonos.add(teclado.nextLine());
        temporal.setTelefonos(telefonos);
        System.out.println("Red Social:");
        redesSociales.add(teclado.nextLine());
        temporal.setRedesSociales(redesSociales);
        System.out.println("Correo Elecctronico:");
        correosElectronicos.add(teclado.nextLine());
        temporal.setCorreosElectronicos(correosElectronicos);
        System.out.println("Pagina Web:");
        temporal.setPaginaWeb(teclado.nextLine());
        
        
        return temporal;
    }
        
    public static void imprimirMenuAcciones(){
        System.out.println("Bienvendido a la agenda");
        System.out.println("Opcion 1: Agregar un contacto");
        System.out.println("Opcion 2: Buscar numero y ver datos del Contacto");
        System.out.println("Opcion 9: Salir");
    }
    
    public static void imprimirContactoEnPantalla(Contacto contacto){
        System.out.println("Identificador:" + contacto.getIdentificador());
        System.out.println("Nombre:" + contacto.getNombre());
        System.out.println("Apellido:" + contacto.getApellido());
        System.out.println("Telefono:" + contacto.getTelefonos());
        System.out.println("RedSocial:" + contacto.getRedesSociales());
        System.out.println("Pagina Web:" + contacto.getPaginaWeb());
    }

    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        int menu=0,identificador=0;
        Agenda agendaDeLuis = new Agenda();
        Contacto contactoTemporal;
        
        while(menu!=SALIDA_MENU){
            imprimirMenuAcciones();
            menu = leerTeclado.nextInt();            
            switch (menu){
            case 1:
                contactoTemporal = capturarDatosDelContacto();
                agendaDeLuis.agregarContacto(contactoTemporal);
                imprimirContactoEnPantalla(contactoTemporal);
                menu=0;
                break;
            case 2:
                System.out.println("Buscar el contacto por identificador:");
                identificador = leerTeclado.nextInt();
                leerTeclado.nextLine();
                contactoTemporal = (Contacto) agendaDeLuis.buscaContactosPorIdentificador(identificador);
                imprimirContactoEnPantalla(contactoTemporal);
                menu=0;
                break;
            case 9:
                menu=-1;
                break;
            default:
                System.out.println("Verificar opción valida");
                menu=0;                
            }
        }
    }
}