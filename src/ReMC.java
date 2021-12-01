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

         Decim methods:

         show: shows value of class
         get_n: returns value of class
         set: sets value of CV from given value
         add: adds given value to class value
         sub: subtracts given value of class value
         div: divides class value into given value
         mul: multiplies class value by given value
         siz: checks whether class value is smaller or bigger than given value
         gSiz: same as above, but it returns a boolean instead of String
         sqrt: checks whether class value is a square root or not
         gSqrt: same as above, but it returns a boolean
         rnd: rounds class value
         prim: checks whether CV is a prime number
         gPrim: s.a.a., ecpt. returns boolean

         Any methods that have the prefix "q" are the same as their counterpart
            except that they make request for the value

        qAdd
        qSub
        qMul
        qDiv
        qSiz
        qSet
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
                        System.out.print("\n\n Commands at your disposal:\n 0: Go back\n 1: Set\n 2: Add decimal\n 3: Add fraction\n : Subtract\n : Multiply\n : Divide\n : Round\n : Compare size");
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
                            default -> System.out.print("\n " + a + " is not a valid command");
                        }
                    }
                }
                case 1 -> {
                    rt = true;
                    while (rt) {
                        System.out.print("\n\n Commands at your disposal:\n 0: Go back\n 1: Set\n 2: Add\n 3: Subtract\n 4: Multiply\n 5: Divide\n 6: Round\n 7: Check for quadrant\n 8: Check for prime\n 9: Compare size");
                        System.out.print("\n\n Please enter what you wish to do with z1 (" + z1.get_n() + "):\n");
                        a = scn2.nextInt();     //I'd do unspeakable things to z1

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

            /*
            if (a == 0) {
                System.out.print("\n Quitting...");
                rn = false;
            }else if(a == 1){       //If only such things as lists exist...
                z1.qSet();
            }else if(a == 2){
                z1.qAdd();
            }else if(a == 3){
                z1.qSub();
            }else if(a == 4){
                z1.qMul();
            }else if(a == 5){        //I deserve to burn in hell for this...
                z1.qDiv();
            }else if(a == 6){
                z1.rnd();
            }else if(a == 7){
                z1.sqrt();
            }else if(a == 8){
                z1.prim();
            }else if(a == 9){
                z1.qSiz();
            }else{
                System.out.print("\n " + a + " is not a valid command");//Using anything but integers as
            }
                                                                   //input crashes the entire program
             */
        }

        //		I know I'll sound like the meme. Using python for advanced Mathematics would be of a great advantage.
        //      Pls correct me if I'm wrong tho
    }
    public static void main(String [] args){
        ReMC me = new ReMC();
        me.play();
        System.out.print("\n\n --This code has been provided by TheBoringEdward with the help of a great fellow-- \n\n"); //I'm being too clingy to that boi, amn't I?
    }
}
//TODO: add Bruch.java (Sth like Bruch b1 = new Bruch ("b1", 1, 2); for a half)

//      This code has been provided by TheBoringEdward with the help of a great fellow
//      This code is under the license of the Unlicense
//      Cheers