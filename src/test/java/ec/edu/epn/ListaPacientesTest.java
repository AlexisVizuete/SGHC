package ec.edu.epn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)

public class ListaPacienteTest {

    private String cedula;
    private boolean expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{"1724831597", true});
        objects.add(new Object[]{"1713074050", true});
        objects.add(new Object[]{"1006425311", true});
        return objects;
    }

    public listaPacienteTest(String cedula, Boolean expected){
        this.cedula = cedula;
        this.expected = expected;
    }

    //assert con parametros
    @Test
    public void existePaciente(){
        ListaPacientes lp = new ListaPacientes();
        lp.anadirPaciente(new Paciente("1724831597", "ALEXIS", "VIZUETE", "22", "M", "06/01/2000", "JARDIN DEL VALLE", "0960071180", "B+"));
        lp.anadirPaciente(new Paciente("1713074050", "ANAHI", "VASQUEZ", "21", "F", "19/01/2001", "QUICENTRO", "09600808081", "A+"));
        lp.anadirPaciente(new Paciente("1006425311", "LEONARDO", "SALVADOR", "22", "M", "09/07/1999", "OTAVALO", "0987654321", "O+"));
        Boolean resultado = lp.existePaciente(cedula);
        assertEquals(expected,resultado);
        System.out.println("Test Existe Paciente");
    }

    //
    @Test
    public void consultarPaciente(){
        ListaPacientes lp = new ListaPacientes();
        lp.anadirPaciente(new Paciente("1713074050", "ANAHI", "VASQUEZ", "21", "F", "19/01/2001", "QUICENTRO", "09600808081", "A+"));
        assertEquals(lp.lista.get(0),lp.consultarPaciente("1713074050"));
    }


    //mock
    @Test
    public void actualizarDireccion(){
        ListaPacientes lp = Mockito.mock(ListaPacientes.class);
        Paciente p = new Paciente("1724831597", "ALEXIS", "VIZUETE", "22", "M", "06/01/2000", "JARDIN DEL VALLE", "0960071180", "B+");

        Mockito.when(lp.actualizarDireccion("1724831597","AV PATRIA")).thenReturn("La direccion del paciente ha sido actualizada\n" + p.toString());

        assertEquals("La direccion del paciente ha sido actualizada\n" + p.toString(),lp.actualizarDireccion("1724831597","AV PATRIA"));
    }


    //mock
    @Test
    public void actualizarTelefono(){
        ListaPacientes lp = Mockito.mock(ListaPacientes.class);
        Paciente p = new Paciente("1006425311", "LEONARDO", "SALVADOR", "22", "M", "09/07/1999", "OTAVALO", "0987654321", "O+");

        Mockito.when(lp.actualizarTelefono("1006425311","0983132578")).thenReturn("El telefono del paciente ha sido actualizado\n" + p.toString());

        assertEquals("El telefono del paciente ha sido actualizado\n" + p.toString(),lp.actualizarTelefono("1006425311","0983132578"));
    }


}