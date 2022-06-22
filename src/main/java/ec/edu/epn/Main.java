package ec.edu.epn;

public class Main {
    public static void main(String args[]) {
        //Pacientes

        ListaPacientes lp = new ListaPacientes();

        lp.anadirPaciente(new Paciente("1724831597", "ALEXIS", "VIZUETE", "22", "M", "06/01/2000", "JARDIN DEL VALLE", "0960071180", "B+"));
        lp.anadirPaciente(new Paciente("1713074050", "ANAHI", "VASQUEZ", "21", "F", "19/01/2001", "QUICENTRO", "09600808081", "A+"));
        lp.anadirPaciente(new Paciente("1006425311", "LEONARDO", "SALVADOR", "22", "M", "09/07/1999", "OTAVALO", "0987654321", "O+"));

        System.out.println(lp.toString());

        //Tratamiento
        ListaTratamientos listaMain = new ListaTratamientos();

        //Diagnostico
        listaMain.diagnostico.registrarTratamiento("1724831597","revisión bucal", "lavarse los dientes");
        listaMain.diagnostico.listaDiagnostico.add(new Diagnostico("1724831597", "revisión bucal", "lavarse los dientes", "10/10/2022"));
        listaMain.anadirTratamiento("1724831597", "Diagnostico");

        System.out.println(listaMain.diagnostico.listaDiagnostico.toString());


    }
}

