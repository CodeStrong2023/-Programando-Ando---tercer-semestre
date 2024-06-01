package Emiliano_3er_sem.Java_3er_sem.Leccion04;

public class testInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan",1000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Jose", 500, "Sistemas");
        //determinarTipo(empleado1);
    }

    public static void determinarTipo(Empleado empleado){
    if(empleado instanceof Gerente){
        System.out.println("Es de tipo gerente");
        //((Gerente) empleado).getDepartamento(); // formato 1
        //System.out.println("gerente = "+empleado); //Para el formato 1
        Gerente gerente = (Gerente)empleado;// formato 2
        System.out.println("gerente = "+gerente.getDepartamento());//Para el formato 2
       }
    else if (empleado instanceof Empleado) {
        System.out.println("Es de tipo empleado");
        //Gerente gerente = (Gerente)empleado;
        //System.out.println("gerente = "+gerente.getDepartamento());
    }
    else if (empleado instanceof Object) {
        System.out.println("Es de tipo Onject");
    }
    }
}
