package de.edward;

import java.util.Scanner;

public class Fract {
    Scanner scn = new Scanner(System.in);

    protected double n; //Numerator
    protected double d; //Denominator
    protected String name; //Name
    protected double i; //Throwaway variable
    protected double j; //Throwaway variable
    protected double k; //Throwaway variable

    public Fract(String nam, double zae, double nen){
        name = nam;
        n = zae;
        d = nen;
        i = 0;      //Grade 4 says "Hello"
        j = 0;
        k = 0;
    }

    //Test

    public void Short(){
        n /= 2;
        d /= 2;
        if(n != Math.round(n) || d != Math.round(d)){
            System.out.print("\n\n "+name+"("+n*2+"/"+d*2+") can't be made any shorter ("+n+"/"+d+")");
            n *= 2;
            d *= 2;
        }else{
            System.out.print("\n\n "+name+" has been shorted by half ("+n+"/"+d+")");
        }
    }

    public void qAddD(){
        System.out.print("\n\n Please enter value to be added to "+name+" ("+ n +"/"+ d +")\n");
        i = scn.nextDouble();
        j = i * d;
        n = n + j;  //I'm dumb
        System.out.print("\n "+name+"'s value now is at "+ n +"/"+ d);
    }

    public void qAddF(){
        System.out.print("\n\n Please enter the fraction to be added to "+name+" ("+ n +"/"+ d +")");
        System.out.print("\n Enter value for numerator\n");
        i = scn.nextDouble();
        System.out.print("\n Enter value for denominator\n");
        j = scn.nextDouble();
        n = n *j;
        i = i* d;
        n = n +i;    //I'm sure there is a more efficient way
        d = d*j;    //TODO: This shit. It just won't work. I forgot 4th grade math... I'm an idiot.
        System.out.print("\n "+name+"'s value now is at "+ n +"/"+ d);
    }

    /*
    a   c   a*d + c*b
      +   =                 eh
    b   d      b*d
     */

    public void qSet(){
        System.out.print("\n\n Please enter value to be set as "+name);
        System.out.print("\n Enter value for numerator\n");
        n = scn.nextDouble();
        System.out.print("\n Enter value for denominator\n");
        d = scn.nextDouble();
        System.out.print("\n "+name+"'s value now is "+ n +"/"+ d);
    }

    public void show(){
        System.out.print("\n\n "+name+"'s value is "+ n +"/"+ d);
        i = n / d;
        System.out.print("\n ("+i+" as a decimal)");
    }
    public double cnt(){
        return n;
    }
    public double den(){
        return d;
    }
    public double dec(){
        return n / d;
    }
    public void sDec(){
        System.out.print("\n\n "+name+" as a decimal is "+ n / d);
    }
    public void qAdd(){
        System.out.print("\n\n Test");
    }
}
