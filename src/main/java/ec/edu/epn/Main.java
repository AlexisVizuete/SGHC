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


        //Endodoncia
        listaMain.endodoncia.registrarTratamiento("1713074050","extracción", "tratar inflamaciones");
        listaMain.endodoncia.listaEndodoncias.add(new Endodoncia("1713074050", "extracción", "tratar inflamaciones", "20/05/2022"));
        listaMain.anadirTratamiento("1713074050", "Endodoncia");

        System.out.println(listaMain.endodoncia.listaEndodoncias.toString());


        //Periodoncia
        listaMain.periodoncia.registrarTratamiento("1006425311","chequeo de encias superiores", "buena higiene");
        listaMain.periodoncia.listaPeriodoncia.add(new Periodoncia("1006425311", "chequeo de encias superiores", "buena higiene", "18/05/2022"));
        listaMain.anadirTratamiento("1006425311", "Periodoncia");

        System.out.println(listaMain.diagnostico.listaDiagnostico.toString());

        /*
        //Ortodoncia
        listaMain.ortodoncia.registrarTratamiento("1724831597","estudio", "utilizar kit de limpieza dental");
        listaMain.ortodoncia.listaOrtodoncias.add(new Ortodoncia("1724831597", "estudio", "utilizar kit de limpieza dental", "15/08/2021"));
        listaMain.anadirTratamiento("1724831597", "Ortodoncia");

        System.out.println(listaMain.ortodoncia.listaOrtodoncias.toString());

        //Lista tratamientos
        System.out.println(listaMain.toString());*/


    }
}

