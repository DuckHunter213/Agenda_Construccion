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
        Contacto contactoTemporal = new Contacto();
        System.out.println("-----Datos del contacto-----");
        System.out.print("Identificador: \t");
        int identificador = teclado.nextInt();
        contactoTemporal.setIdentificador(identificador);
        teclado.nextLine();
        System.out.print("Nombre: \t");
        contactoTemporal.setNombre(teclado.nextLine());
        System.out.print("Apellido: \t");
        contactoTemporal.setApellido(teclado.nextLine());
        System.out.print("Telefono: \t");
        telefonos.add(teclado.nextLine());
        contactoTemporal.setTelefonos(telefonos);
        System.out.print("Red Social: \t");
        redesSociales.add(teclado.nextLine());
        contactoTemporal.setRedesSociales(redesSociales);
        System.out.print("Correo Elecctronico: \t");
        correosElectronicos.add(teclado.nextLine());
        contactoTemporal.setCorreosElectronicos(correosElectronicos);
        System.out.print("Pagina Web: \t");
        contactoTemporal.setPaginaWeb(teclado.nextLine());
        return contactoTemporal;
    }
        
    public static void imprimirMenuAcciones(){
        System.out.println("Bienvendido a la agenda");
        System.out.println("Opcion 1: Agregar un contacto");
        System.out.println("Opcion 2: Eliminar contacto por su identificador");
        System.out.println("Opcion 3: Buscar identificador y ver datos del Contacto");
        System.out.println("Opcion 4: Buscar nombre y ver datos del Contacto");
        System.out.println("Opcion 5: Buscar correo y ver datos del Contacto");
        System.out.println("Opcion 9: Salir");
    }
    
    public static void imprimirContactoEnPantalla(Contacto contacto){
        System.out.println("Identificador: \t" + contacto.getIdentificador());
        System.out.println("Nombre: \t" + contacto.getNombre());
        System.out.println("Apellido: \t" + contacto.getApellido());
        System.out.println("Telefono: \t" + contacto.getTelefonos());
        System.out.println("RedSocial: \t" + contacto.getRedesSociales());
        System.out.println("Pagina Web: \t" + contacto.getPaginaWeb());
    }

    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        int menu=0,identificador=0;
        String datoParaBuscar="";
        Agenda agenda = new Agenda();
        ArrayList<Contacto> contactoTemporal = new ArrayList<>();
        Contacto nuevoContacto;
        agenda.agregarUsuarioPrueba();
        
        while(menu!=SALIDA_MENU){
            imprimirMenuAcciones();
            menu = leerTeclado.nextInt();            
            switch (menu){
            case 1:
                nuevoContacto = capturarDatosDelContacto();
                agenda.agregarContacto(nuevoContacto);
                menu=0;
                break;
            case 3:
                System.out.println("Buscar el contacto por identificador:");
                identificador = leerTeclado.nextInt();
                leerTeclado.nextLine();
                contactoTemporal.add((Contacto) agenda.buscaContactosPorIdentificador(identificador));
                for(Contacto contacto : contactoTemporal){
                    imprimirContactoEnPantalla(contacto);                    
                }
                contactoTemporal.removeAll(contactoTemporal);
                menu=0;
                break;
            case 4:
                System.out.println("Buscar el contacto por nombre:");
                datoParaBuscar = leerTeclado.next();
                leerTeclado.nextLine();
                contactoTemporal = (ArrayList) agenda.buscaContactosPorNombre(datoParaBuscar);
                for(Contacto contacto : contactoTemporal){
                    imprimirContactoEnPantalla(contacto);                    
                }
                contactoTemporal.removeAll(contactoTemporal);
                menu=0;
                break;
            case 5:
                System.out.println("Buscar el contacto por correo:");
                datoParaBuscar = leerTeclado.next();
                leerTeclado.nextLine();
                contactoTemporal = (ArrayList) agenda.buscaContactosPorCorreo(datoParaBuscar);
                for(Contacto contacto : contactoTemporal){
                    imprimirContactoEnPantalla(contacto);                    
                }
                contactoTemporal.removeAll(contactoTemporal);
                menu=0;
                break;
            case 2:
                System.out.println("Eliminar el contacto por identificador:");
                identificador = leerTeclado.nextInt();
                leerTeclado.nextLine();
                nuevoContacto = (Contacto) agenda.buscaContactosPorIdentificador(identificador);
                agenda.eliminarContacto(nuevoContacto);
                menu=0;
                break;
            case 9:
                menu=SALIDA_MENU;
                break;
            default:
                System.out.println("Verificar opción valida");
                menu=0;                
            }
        }
    }
}