package HERENCIA;



public class MAIN {
    public static void main (String[] arg){
        System.out.println("      PROGRAMA DE HERENCIA      ");
        System.out.println("                               ");
        System.out.println("          MAMIFEROS           ");


        System.out.println("                               ");
        System.out.println("HERENCIA DE FELINO A GATO");
//
        FELINO GATO1 = new GATO();
        GATO1.setColor(" El color del gato es cafe");
        System.out.println(GATO1.getColor());
        FELINO GATO2 = new FELINO();
        GATO2.setTamaño(" El peso del gato es de 5 kg");
        System.out.println(GATO2.getTamaño());
        FELINO GATO3 = new FELINO();
        GATO3.setTamaño(" La edad del gato es de 2 años");
        System.out.println(GATO3.getTamaño());



        System.out.println("                               ");
        System.out.println("HERENCIA DE FELINO A TIGRE");
//
        FELINO TIGRE1 = new TIGRE();
        TIGRE1.setColor(" El color del tigre es anaranjado con rayas negras");
        System.out.println(TIGRE1.getColor());
        FELINO TIGRE2 = new FELINO();
        TIGRE2.setTamaño(" El peso del tigre es de 15 kg");
        System.out.println(TIGRE2.getTamaño());
        FELINO TIGRE3 = new FELINO();
        TIGRE3.setTamaño(" La edad del tigre es de 5 años");
        System.out.println(TIGRE3.getTamaño());


        System.out.println("                               ");
        System.out.println("HERENCIA DE CANINO A LOBO");

        CANINO LOBO1 = new LOBO();
        LOBO1.setColor(" El color del lobo es negro con blanco");
        System.out.println(LOBO1.getColor());
        CANINO LOBO2 = new CANINO();
        LOBO2.setTamaño(" El peso del lobo es de 10 kg");
        System.out.println(TIGRE2.getTamaño());
        CANINO LOBO3 = new CANINO();
        LOBO3.setTamaño(" La edad del lobo es de 7 años");
        System.out.println(LOBO3.getTamaño());


        System.out.println("                               ");
        System.out.println("HERENCIA DE CANINO A PERRO");

        CANINO PERRO1 = new PRRRO();
        PERRO1.setColor(" El color del perro es blanco");
        System.out.println(PERRO1.getColor());
        CANINO PERRO2 = new CANINO();
        PERRO2.setTamaño(" El peso del perro es de 8 kg");
        System.out.println(PERRO2.getTamaño());
        CANINO PERRO3 = new CANINO();
        PERRO3.setTamaño(" La edad del perro es de 4 años");
        System.out.println(PERRO3.getTamaño());


        System.out.println("                               ");
        System.out.println("          OVIPAROS           ");
        System.out.println("                               ");
        System.out.println("HERENCIA DE AVE A PALOMA");

        PALOMA PALOMA1 = new PALOMA();
        PALOMA1.setColor(" El color de la paloma  es blanco");
        System.out.println(PALOMA1.getColor());
        PALOMA PALOMA2 = new PALOMA();
        PALOMA2.setTamaño(" El peso de la paloma es de 2 kg");
        System.out.println(PALOMA2.getTamaño());
        PALOMA PALOMA3 = new PALOMA();
        PALOMA3.setTamaño(" La edad de la paloma es de 1 años");
        System.out.println(PALOMA3.getTamaño());


        System.out.println("                               ");
        System.out.println("HERENCIA DE AVE A AGUILA");

        AGULA AGUILA1 = new AGULA();
        AGUILA1.setColor(" El color de la aguila es cafe con blanco");
        System.out.println(AGUILA1.getColor());
        AGULA AGUILA2 = new AGULA();
        AGUILA2.setTamaño(" El peso de la aguila es de 7 kg");
        System.out.println(AGUILA2.getTamaño());
        AGULA AGUILA3 = new AGULA();
        AGUILA3.setTamaño(" La edad de la aguila es de 1 años");
        System.out.println(AGUILA3.getTamaño());


        System.out.println("                               ");
        System.out.println("HERENCIA DE PEZ A TRUCHA");

        PEZ TRUCHA1 = new PEZ();
        TRUCHA1.setColor(" El color de la trucha es gris");
        System.out.println(TRUCHA1.getColor());
        PEZ TRUCHA2 = new PEZ();
        TRUCHA2.setTamaño(" El peso de la trucha es de 10 kg");
        System.out.println(TRUCHA2.getTamaño());
        PEZ TRUCHA3 = new PEZ();
        TRUCHA3.setTamaño(" La edad de la trucha es de 1 años");
        System.out.println(TRUCHA3.getTamaño());



        System.out.println("                               ");
        System.out.println("HERENCIA DE PEZ A SALMON");

        PEZ SALMON1 = new PEZ();
        SALMON1.setColor(" El color del salmon es rosa");
        System.out.println(SALMON1.getColor());
        PEZ SALMON2 = new PEZ();
        SALMON2.setTamaño(" El peso del salmon es de 12 kg");
        System.out.println(SALMON2.getTamaño());
        PEZ SALMON3 = new PEZ();
        SALMON3.setTamaño(" La edad del salmon es de 6 meses");
        System.out.println(SALMON3.getTamaño());


    }
}
