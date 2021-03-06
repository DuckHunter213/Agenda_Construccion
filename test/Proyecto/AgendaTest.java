/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import Proyecto.*;
import com.sun.org.apache.xpath.internal.operations.Equals;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gerardo
 */
public class AgendaTest {

    public AgendaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ArrayList<String> telefonos, redesSociales, correosElectronicos;
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

    @After
    public void tearDown() {
    }

    /**
     * Test of agregarContacto method, of class Agenda.
     */
    @Test
    public void testAgregarContacto() {
        ArrayList<String> telefonos = new ArrayList<>();
        ArrayList<String> redesSociales = new ArrayList<>();
        ArrayList<String> correosElectronicos = new ArrayList<>();
        telefonos.add("2282191122");
        redesSociales.add("/gerardo0579");
        correosElectronicos.add("gerardo0579@hotmail.com");
        Contacto contacto = new Contacto(1234, "Cho", "Gómez", telefonos, null, null, "pagina@web");
        Agenda agenda = new Agenda();
        boolean resultadoEsperado = true;
        assertEquals("Prueba agregar contacto", resultadoEsperado, agenda.agregarContacto(contacto));
    }

    @Test
    public void testEliminarContacto() {
        ArrayList<String> telefonos = new ArrayList<>();
        ArrayList<String> redesSociales = new ArrayList<>();
        ArrayList<String> correosElectronicos = new ArrayList<>();
        telefonos.add("2282191122");
        redesSociales.add("/gerardo0579");
        correosElectronicos.add("gerardo0579@hotmail.com");
        Contacto contacto = new Contacto(1234, "Cho", "Gómez", telefonos, null, null, "pagina@web");
        Agenda agenda = new Agenda();
        boolean resultadoEsperado = true;
        agenda.agregarContacto(contacto);
        assertEquals("Prueba buscar contacto por nombre", resultadoEsperado, agenda.eliminarContacto(contacto));
    }

    @Test
    public void testBuscaContactosPorNombre() {
        Agenda agenda = new Agenda();
        Contacto contactoPrueba = new Contacto();
        ArrayList<Contacto> resultadoEsperado = new ArrayList<>();
        assertEquals("Prueba buscar contacto por nombre", resultadoEsperado, agenda.buscaContactosPorNombre("Xalaquia"));
    }

    @Test
    public void testBuscaContactosPorCorreo() {
        Agenda agenda = new Agenda();
        Contacto contactoPrueba = new Contacto();
        ArrayList<Contacto> resultadoEsperado = new ArrayList<>();
        assertEquals("Prueba buscar contacto por nombre", resultadoEsperado, agenda.buscaContactosPorCorreo("gerardo0579@hotmail.com"));
    }
}
