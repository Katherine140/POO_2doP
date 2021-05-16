package PROYECTO;

import java.util.Scanner;

public class MENU {
    public static <exeption> void main(String[] args) {


        int num1 = 0, num1a = 0, num1b = 0, num2 = 0, num2b = 0, num2a = 0,num=0,numH=0, res = 0, res1 = 0, res1a = 0, r=0;
        int numa = 0, numb = 0, numc = 0, numa1 = 0, numb2 = 0, numc3 = 0, resa = 0, resb = 0, resc = 0, t=0, num4=0, num8=0;
        int opcion1, SALIR;
        boolean salir = false;
        Scanner SC = new Scanner(System.in);


        while (!salir) {
            System.out.println("********************************************************************");
            System.out.println("                     CALCULADORA DE POLINOMIOS                      ");
            System.out.println("********************************************************************");
            System.out.println("1. Sumar grado 1");
            System.out.println("2. Sumar grado 2");
            System.out.println("3. Sumar grado 3");
            System.out.println("4. Restar de grado 1");
            System.out.println("5. Restar de grado 2");
            System.out.println("6. Restar de grado 3");
            System.out.println("7. Salir");

            System.out.println("Elige una opcion del menu: ");
            opcion1 = SC.nextInt();
            switch (opcion1) {
                case 1:
                    System.out.println("********************************************************************");
                    System.out.println("                  SUMA DE PRIMER GRADO DE POLINOMIO                 ");
                    System.out.println("********************************************************************");
                    System.out.println("PRIMER POLINOMIO");
                    System.out.println("                               ");

                    System.out.println("Primer termino: "+"x");
                    num1 = SC.nextInt();

                    System.out.println("Segundo termino: " + "x");
                    num1a = SC.nextInt();


                    System.out.println("                               ");
                    System.out.println("SEGUNDO POLINOMIO");
                    System.out.println("                               ");

                    System.out.println("Primer termino: " + "x");
                    num2 = SC.nextInt();

                    System.out.println("Segundo termino: " + "x");
                    num2a = SC.nextInt();


                    res = num1 + num2;
                    res1 = num1a + num2a;

                    System.out.println("Dame el termino: " + res + "x" + "+" + res1 + "x");
                    System.out.println("********************************************************************");
                    System.out.println("                         HERENCIA DE POLINOMIO                      ");
                    System.out.println("********************************************************************");
                    POLINOMIO poli1 = new POLINOMIO();
                    poli1.setTipo("LA SUMA DE DOS POLINOMIOS DE PRIMER GRADO");
                    System.out.println(poli1.getTipo());

                    POLINOMIO poli2 = new POLINOMIO();
                    poli2.setTerminos("1 terminos");

                    System.out.println(poli2.getTerminos());
                    POLINOMIO poli3 = new POLINOMIO();

                    poli3.setGrado("Exponentes de 1  ");
                    System.out.println(poli3.getGrado());


                    break;
                case 2:
                    System.out.println("********************************************************************");
                    System.out.println("               SUMA DE SEGUNDO GRADO DE POLINOMIO                   ");
                    System.out.println("********************************************************************");
                    System.out.println("PRIMER POLINOMIO");
                    System.out.println("                               ");

                    System.out.println("Primer termino: ");
                    num1 = SC.nextInt();

                    System.out.println("Primer termino: ");
                    num1a = SC.nextInt();

                    System.out.println("Segundo termino: " + "x");
                    num1b = SC.nextInt();

                    System.out.println("                               ");
                    System.out.println("SEGUNDO POLINOMIO");
                    System.out.println("                               ");

                    System.out.println("Segundo termino: " + "x");
                    num2 = SC.nextInt();

                    System.out.println("Segundo termino: " + "x");
                    num2a = SC.nextInt();

                    System.out.println("Segundo termino: ");
                    num2b = SC.nextInt();

                    res = num1 + num2;
                    res1 = num1a + num2a;
                    res1a = num1b + num2b;


                    System.out.println("Dame el termino: " + res + "x" + "+" + res1 + "x" + "-" + res1a + "x");
                    System.out.println("********************************************************************");
                    System.out.println("                       HERENCIA DE POLINOMIO                        ");
                    System.out.println("********************************************************************");
                    POLINOMIO polia = new POLINOMIO();
                    polia.setTipo("LA SUMA DE DOS POLINOMIOS DE SEGUNDO GRADO");
                    System.out.println(polia.getTipo());

                    POLINOMIO polib = new POLINOMIO();
                    polib.setTerminos("3 terminos");

                    System.out.println(polib.getTerminos());
                    POLINOMIO polic = new POLINOMIO();

                    polic.setGrado("Exponentes de 1  ");
                    System.out.println(polic.getGrado());


                    break;
                case 3:
                    System.out.println("********************************************************************");
                    System.out.println("                  SUMA DE TERCER GRADO DE POLINOMIO                 ");
                    System.out.println("********************************************************************");
                    System.out.println("PRIMER POLINOMIO");
                    System.out.println("                               ");

                    System.out.println("Primer termino: ");
                    num1 = SC.nextInt();

                    System.out.println("Segundo termino: ");
                    num1a = SC.nextInt();

                    System.out.println("Tercero termino: " + "x");
                    num1b = SC.nextInt();

                    System.out.println("Cuarto termino: " + "x");
                    num = SC.nextInt();

                    System.out.println("                               ");
                    System.out.println("SEGUNDO POLINOMIO");
                    System.out.println("                               ");

                    System.out.println("Primer termino: " + "x");
                    num2 = SC.nextInt();

                    System.out.println("Segundo termino: " + "x");
                    num2a = SC.nextInt();

                    System.out.println("Tercer termino: ");
                    num2b = SC.nextInt();

                    System.out.println("Cuarto termino: ");
                    numH = SC.nextInt();

                    res = num1 + num2;
                    res1 = num1a + num2a;
                    res1a = num1b + num2b;
                    r = num + numH;


                    System.out.println("Dame el termino: " + res + "x" + "+" + res1 + "x" + "-" + res1a + "x" + r + "x");
                    System.out.println("********************************************************************");
                    System.out.println("                          HERENCIA DE POLINOMIO                     ");
                    System.out.println("********************************************************************");

                    POLINOMIO poliS = new POLINOMIO();
                    poliS.setTipo("LA SUMA DE DOS POLINOMIOS DE TERCER GRADO");
                    System.out.println(poliS.getTipo());

                    POLINOMIO poliK = new POLINOMIO();
                    poliK.setTerminos("4 terminos");
                    System.out.println(poliK.getTerminos());

                    POLINOMIO poliJ = new POLINOMIO();
                    poliJ.setGrado("Exponentes de 1  ");
                    System.out.println(poliJ.getGrado());



                    break;
                case 4:
                    System.out.println("********************************************************************");
                    System.out.println("              RESTA DE POLINOMIO DE PRIMER GRADO                    ");
                    System.out.println("********************************************************************");
                    System.out.println("PRIMER POLINOMIO");
                    System.out.println("Primer termino: "+"X");
                    num1 = SC.nextInt();

                    System.out.println("Segundo termino: "+"X");
                    num1a = SC.nextInt();


                    System.out.println("                               ");
                    System.out.println("SEGUNDO POLINOMIO");
                    System.out.println("                               ");

                    System.out.println("Primer termino: " + "x");
                    num2 = SC.nextInt();

                    System.out.println("Segundo termino: " + "x");
                    num2a = SC.nextInt();

                    res = num1 - num2;
                    res1 = num1a - num2a;


                    System.out.println("EL RESULTADO ES: " + res + "x" + "+" + res1 + "x" );
                    System.out.println("********************************************************************");
                    System.out.println("                     LA HERENCIA DE ESTA OPERACION                  ");
                    System.out.println("********************************************************************");
                    POLINOMIO polid = new POLINOMIO();
                    polid.setTipo("LA RESTA DE 2 POLINOMIO DE PRIMER GRADO");
                    System.out.println(polid.getTipo());

                    POLINOMIO polie = new POLINOMIO();
                    polie.setTerminos("2 terminos");

                    System.out.println(polie.getTerminos());
                    POLINOMIO polif = new POLINOMIO();

                    polif.setGrado("Exponentes de 1  ");
                    System.out.println(polif.getGrado());
                    break;

                case 5:
                    System.out.println("********************************************************************");
                    System.out.println("             RESTA DE POLINOMIO DE SEGUNDO GRADO       ");
                    System.out.println("********************************************************************");
                    System.out.println("PRIMER POLINOMIO");
                    System.out.println("Primer termino: ");
                    num1 = SC.nextInt();

                    System.out.println("Segundo termino: ");
                    num1a = SC.nextInt();

                    System.out.println("Tercer termino: ");
                    num1b = SC.nextInt();


                    System.out.println("                               ");
                    System.out.println("SEGUNDO POLINOMIO");
                    System.out.println("                               ");

                    System.out.println("Primer termino: " + "x");
                    num2 = SC.nextInt();

                    System.out.println("Segundo termino: " + "x");
                    num2a = SC.nextInt();

                    System.out.println("Tercer termino: " + "x");
                    num2b = SC.nextInt();

                    res = num1 - num2;
                    res1 = num1a - num2a;
                    resb = num1b - num2b;


                    System.out.println("Dame el termino: " + res + "x" + "+" + res1 + "x" + resb + "x" );
                    System.out.println("********************************************************************");
                    System.out.println("          LA HERENCIA DE ESTA OPERACION DE POLINOMIO                ");
                    System.out.println("********************************************************************");

                    POLINOMIO poliD = new POLINOMIO();
                    poliD.setTipo("LA RESTA DE DOS POLINOMIO DE SEGUNDO GRADO");
                    System.out.println(poliD.getTipo());

                    POLINOMIO poliE = new POLINOMIO();
                    poliE.setTerminos("3 terminos");
                    System.out.println(poliE.getTerminos());

                    POLINOMIO poliF = new POLINOMIO();
                    poliF.setGrado("Exponentes de 1  ");
                    System.out.println(poliF.getGrado());


                    break;
                case 6:
                    System.out.println("********************************************************************");
                    System.out.println("              RESTA DE POLINOMIO DE TERCER GRADO                 ");
                    System.out.println("********************************************************************");
                    System.out.println("PRIMER POLINOMIO");
                    System.out.println("Primer termino: ");
                    num1 = SC.nextInt();

                    System.out.println("Segundo termino: ");
                    num1a = SC.nextInt();

                    System.out.println("Tercer termino: ");
                    num1b = SC.nextInt();

                    System.out.println("Cuarto termino: ");
                    num4 = SC.nextInt();


                    System.out.println("                               ");
                    System.out.println("SEGUNDO POLINOMIO");
                    System.out.println("                               ");

                    System.out.println("Primer termino: " + "x");
                    num2 = SC.nextInt();

                    System.out.println("Segundo termino: " + "x");
                    num2a = SC.nextInt();

                    System.out.println("Tercer termino: " + "x");
                    num2b = SC.nextInt();

                    System.out.println("Cuarto termino: " + "x");
                    num8 = SC.nextInt();

                    res = num1 - num2;
                    res1 = num1a - num2a;
                    resb = num1b - num2b;
                    t= num4 - num8;


                    System.out.println("Dame el termino: " + res + "x" + "+" + res1 + "x" + resb + "x" );
                    System.out.println("********************************************************************");
                    System.out.println("            LA HERENCIA DE ESTA OPERACION DE POLINOMIO              ");
                    System.out.println("********************************************************************");

                    POLINOMIO poliH = new POLINOMIO();
                    poliH.setTipo("LA RESTA DE DOS POLINOMIO DE TERCER GRADO, ");
                    System.out.println(poliH.getTipo());

                    POLINOMIO poliL = new POLINOMIO();
                    poliL.setTerminos("4 terminos");
                    System.out.println(poliL.getTerminos());

                    POLINOMIO poliP = new POLINOMIO();
                    poliP.setGrado("Exponentes de 1  ");
                    System.out.println(poliP.getGrado());
                    break;

                case 7:
                    System.out.println(" QUE TENGA BUEN DIA VUELVA PRONTO, ESPERO Y PASE EL EXAMEN JAJAJA");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}




