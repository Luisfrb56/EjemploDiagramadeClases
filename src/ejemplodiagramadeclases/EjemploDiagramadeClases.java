
package ejemplodiagramadeclases;


public class EjemploDiagramadeClases {


    public static void main(String[] args) {
        Estudante est1=new Estudante("Luis","Vigo","Frian",5);
        Ensinante ens1=new Ensinante("Matematicas","Juan","Vigo");
        EstudanteInternacional esti1=new EstudanteInternacional("Joao","Brasil","Maria Teresa",2,"España");
        System.out.println(est1.toString());
        System.out.println(ens1.toString());
        System.out.println(esti1.toString());
    }
    
}
