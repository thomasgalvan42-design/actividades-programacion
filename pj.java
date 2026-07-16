import java.util.*;
public class pj {
    private String nombre;
    private int salud;

    public void ataque(){
        System.out.println("carga de atake...");
    }

    public pj(String nombre, int salud ){
        this.nombre=nombre;
        this.salud=salud;
    }
    //set


    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;

    }

    public void setSalud(int nuevaSalud){
        this.salud = nuevaSalud;

    }

    //get
    public String getNombre(){
        return this.nombre;

    }
    public int getSalud(){
        return this.salud;

    }

   

    public void mostrarDatosGeneral(){
        System.out.println("El name de tu Mago/Guerrero es: " + nombre);
        System.out.println("La salud de tu Mago/Guerrero es: " + salud);


    }

    //MAGO
    public static class Mago extends pj {
        private String hechizo;
        public Mago(String nombre,int salud, String hechizo ){
            super(nombre,salud);
            this.hechizo=hechizo;
        }

        public void lanzarHechizo(){
            System.out.println("Hechizo de "+hechizo);
        }

        public void mostrarDatosMago(){
            System.out.println("El hechizo de tu mago es: " + hechizo);

        }

        //SET

        public void setHechizo(String nuevoHechizo){
            this.hechizo = nuevoHechizo;

        }

        //GET

        public String getHechizo(){
            return this.hechizo;

        }


    } //FIN MAGO


    public static class Guerrero extends pj {
        private String arma;
        public Guerrero(String nombre,int salud, String arma ){
            super(nombre,salud);
            this.arma=arma;
        }

        public void usarArma(){
            System.out.println(arma+ " ataca");
        }

        public void mostrarDatosGuerrero(){
            System.out.println("la armita de tu guerrero es: " + arma);

        }

        //set
        public void setArma(String nuevaArma){
            this.arma = nuevaArma;

        }

        //get
        public String getArma(){
            return this.arma;

        }


    } //fin del guerrero




    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Quiere un Guerrero o Mago?");
        String respuesta1= sc.next();
        String r= respuesta1.toLowerCase();
        if (r.equals("mago")){

            //Ingreso de datos
            System.out.println("pone nombre: ");
            String nom= sc.next();

            System.out.println("pone la salud de su Mago: ");
            int sal= sc.nextInt();

            System.out.println("pone el hechizo de tu Mago: ");
            String hec= sc.next();

            // mago

            Mago mag = new Mago (nom, sal, hec);
            mag.mostrarDatosGeneral();
            mag.mostrarDatosMago();
            mag.lanzarHechizo();

            System.out.println("¿quiere aplicar cambios?: (si/no)");
            String respuesta= sc.next();
            String r1= respuesta.toLowerCase();
            if (r1.equals("si")){
                int opcion;
                do {
                    System.out.println("\n--- MENÚ ---");
                    System.out.println("1. cambio de nombre");
                    System.out.println("2. Modificacion de salud");
                    System.out.println("3. cambiar de hechizo");
                    System.out.println("4. Salir del menu");

                    System.out.print("Opción: ");
                    opcion = sc.nextInt();

                    switch(opcion){
                        case 1:
                            System.out.println("ponga su  nombre: ");
                            String nom1= sc.next();
                            mag.setNombre(nom1);
                            System.out.println("\nModificacion realizada: "+ mag.getNombre());
                            break;

                        case 2:
                            System.out.println("Ingrese salud: ");
                            int sal1= sc.nextInt();
                            mag.setSalud(sal1);
                            System.out.println("\nModificacion realizada: "+ mag.getSalud());
                            break;

                        case 3:
                            System.out.println("pone un  hechizo: ");
                            String hec1= sc.next();
                            mag.setHechizo(hec1);
                            System.out.println("\nModificacion realizada: "+ mag.getHechizo());
                            break;

                        case 4:
                            System.out.println("\nSaliendo...");
                            break;

                        default:
                            System.out.println("error.");
                    }

                } while (opcion!=4);

            }else{
                System.out.println("\ndecidiste no hacer cambios ");
            }

        }else{ //guerrero
            System.out.println("Ingrese nombre: ");
            String nom= sc.next();

            System.out.println("Ingrese la salud de su Guerrero: ");
            int sal= sc.nextInt();

            System.out.println("pone el arma de su Guerrero: ");
            String arm= sc.next();

            Guerrero gue = new Guerrero (nom, sal, arm);
            gue.mostrarDatosGeneral();
            gue.mostrarDatosGuerrero();
            gue.usarArma();

            System.out.println("¿Desea aplicar cambios?: (si/no)");
            String respuesta= sc.next();
            String r1= respuesta.toLowerCase();
            if (r1.equals("si")){
                int opcion;
                do {
                    System.out.println("\n--- MENÚ ---");
                    System.out.println("1. Modificacion de nombre");
                    System.out.println("2. Modificacion de salud");
                    System.out.println("3. Modificacion de arma");
                    System.out.println("4. Salir del menu");

                    System.out.print("Opción: ");
                    opcion = sc.nextInt();

                    switch(opcion){
                        case 1:
                            System.out.println("Ingrese nombre: ");
                            String nom1= sc.next();
                            gue.setNombre(nom1);
                            System.out.println("\nModificacion realizada: "+ gue.getNombre());
                            break;

                        case 2:
                            System.out.println("Ingrese salud: ");
                            int sal1= sc.nextInt();
                            gue.setSalud(sal1);
                            System.out.println("\nModificacion realizada: "+ gue.getSalud());
                            break;

                        case 3:
                            System.out.println("Ingrese arma: ");
                            String arm1= sc.next();
                            gue.setArma(arm1);
                            System.out.println("\nModificacion realizada: "+ gue.getArma());
                            break;

                        case 4:
                            System.out.println("\nSaliendo...");
                            break;

                        default:
                            System.out.println("no bro, no sea gil.");
                    }

                } while (opcion!=4);

            }else{
                System.out.println("\n buenazo no cambiamos ");
            }


        }
        sc.close();

    }
}