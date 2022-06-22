package ec.edu.epn;

import org.junit.Test;

import static org.junit.Assert.*;

public class PacienteTest {


    //assert Not Same
    @Test
    public void given_two_patients_when_ids_are_not_the_same(){
        Paciente p1 = new Paciente();
        Paciente p2 = new Paciente();
        p1.registrarPaciente("1724831597", "ALEXIS", "VIZUETE", "22", "M", "06/01/2000", "JARDIN DEL VALLE", "0960071180", "B+");
        p1.registrarPaciente("1006425311", "LEONARDO", "SALVADOR", "22", "M", "09/07/1999", "OTAVALO", "0987654321", "O+");
        assertNotSame(p2.getNumeroCedula(),p1.getNumeroCedula());
    }

}