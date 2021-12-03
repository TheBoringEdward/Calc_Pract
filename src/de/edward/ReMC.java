package de.edward;

import java.util.Scanner;

public class ReMC{

    Scanner scn2 = new Scanner(System.in);

    public void play(){

        final Decim z1 = new Decim("z1", 4);
        final Decim z2 = new Decim("z2", 4);
        final Decim z3 = new Decim("z3", 2.5);    //Thanks

        final Fract b1 = new Fract("b1", 2, 5);

        boolean rn = true;
        boolean rt = true;
        boolean rb = true;

        /*

        "CV" = "class value"

         Decim methods:

         show: shows CV
         get_n: returns CV
         set_n: sets and thereafter returns CV
         set: sets value of CV from given value
         add: adds given value to CV
         sub: subtracts given value of CV
         div: divides CV into given value
         mul: multiplies CV by given value
         siz: checks whether CV is smaller or bigger than given value
         sqrt: checks whether CV is a square root or not
         rnd: rounds CV
         prim: checks whether CV is a prime number

         Any methods that have the prefix "q" (questionnaire) are the same as their counterpart
            except that they make request the parameters

        qAdd
        qSub
        qMul
        qDiv
        qSiz
        qSet

        Any methods that have the prefix "g"(get) are the same as their counterpart
            except that they return something

        gSqrt
        gPrim
        gSiz
        */

        System.out.print("\n\n Debugging");

        z1.show();
        z1.add(2);
        z1.sub(1);
        z1.div(2);
        z1.mul(2);
        z2.show();
        z2.siz(8);
        z1.add(z2.get_n());
        z1.siz(7);
        z1.gSiz(7); //Why? Just why?
        z3.show();
        z3.rnd();
        z1.add(1);
        z2.sqrt();
        z1.sqrt();
        z2.rnd();
        z1.prim();
        z1.set(17);
        z1.set_n(17);
        z1.prim();
        z1.set(127);
        z1.prim();
        z1.set(511);
        z1.prim();
        z1.set(2);

        b1.show();
        b1.sDec();

        System.out.print("\n\n Debugging End"); //I'm a genius /s

        while(rn) {
            System.out.print("\n\n Commands at your disposal:\n 0: Quit\n 1. Decimals\n 2. Fractions\n");
            int a = scn2.nextInt();
            switch (a) {
                case 2 -> {
                    rb = true;
                    while (rb) {
                        System.out.print("\n\n Commands at your disposal:\n 0: Go back\n 1: Set\n 2: Add decimal\n 3: Add fraction\n 4: Shorten\n : Subtract\n : Multiply\n : Divide\n : Round\n : Compare size");
                        System.out.print("\n\n Please enter what you wish to do with b1 (" + b1.cnt() + "/" + b1.den() + "):\n");
                        a = scn2.nextInt();     //I'd do unspeakable things to b1
                        switch (a) {
                            case 0 -> {
                                System.out.print("\n Going back...");
                                rb = false;
                            }
                            case 1 -> b1.qSet();
                            case 2 -> b1.qAddD();
                            case 3 -> b1.qAddF();
                            case 4 -> b1.Short();
                            default -> System.out.print("\n " + a + " is not a valid command");
                        }
                    }
                }
                case 1 -> {
                    rt = true;
                    while (rt) {
                        System.out.print("\n\n Commands at your disposal:\n 0: Go back\n 1: Set\n 2: Add\n 3: Subtract\n 4: Multiply\n 5: Divide\n 6: Round\n 7: Check for quadrant\n 8: Check for prime\n 9: Compare size");
                        System.out.print("\n\n Please enter what you wish to do with z1 (" + z1.get_n() + "):\n");
                        a = scn2.nextInt();

                        switch (a) {
                            case 0 -> {
                                System.out.print("\n Going back...");
                                rt = false;
                            }
                            case 1 -> z1.qSet();
                            case 2 -> z1.qAdd();
                            case 3 -> z1.qSub();
                            case 4 -> z1.qMul();
                            case 5 -> z1.qDiv();
                            case 6 -> z1.rnd();
                            case 7 -> z1.sqrt();
                            case 8 -> z1.prim();
                            case 9 -> z1.qSiz();

                            //I owe Jonas so bloody much
                            default -> System.out.print("\n " + a + " is not a valid command");
                        }
                    }
                }
                default -> System.out.print("\n " + a + " is not a valid command");
                case 0 -> {
                    System.out.print("\n Quitting...");
                    rn = false;
                }
            }
        }
    }
    public static void main(String [] args){
        ReMC me = new ReMC();
        me.play();
        System.out.print("\n\n --This code has been provided by TheBoringEdward with the help of a great fellow-- \n\n"); //I'm being too clingy to that boi, amn't I?
    }
}

//      This code has been provided by TheBoringEdward with the help of a great fellow
//      This code is under the license of the Unlicense
//      Cheers