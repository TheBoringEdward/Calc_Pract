import java.util.Scanner;

public class Fract {
    Scanner scn = new Scanner(System.in);

    protected double c;
    protected double d;
    protected String name;
    protected double i;
    protected double j;
    protected double k;

    public Fract(String nam, double zae, double nen){
        name = nam;
        c = zae;
        d = nen;
        i = 0;      //Grade 4 says "Hello"
        j = 0;
        k = 0;
    }

    public void qAddD(){
        System.out.print("\n\n Please enter value to be added to "+name+" ("+ c +"/"+ d +")\n");
        i = scn.nextDouble();
        j = i * d;
        c = c + j;  //I'm dumb
        System.out.print("\n "+name+"'s value now is at "+ c +"/"+ d);
    }

    public void qAddF(){
        System.out.print("\n\n Please enter the fraction to be added to "+name+" ("+ c +"/"+ d +")");
        System.out.print("\n Enter value for numerator\n");
        i = scn.nextDouble();
        System.out.print("\n Enter value for denominator\n");
        j = scn.nextDouble();
        c = c *j;
        i = i* d;
        c = c+i;    //I'm sure there is a more efficient way
        d = d*j;    //TODO: This shit. It just won't work!!!
        System.out.print("\n "+name+"'s value now is at "+ c +"/"+ d);
    }

    /*
    a   c   a*d + c*b
      +   =                 eh
    b   d      b*d
     */

    public void qSet(){
        System.out.print("\n\n Please enter value to be set as "+name);
        System.out.print("\n Enter value for numerator\n");
        c = scn.nextDouble();
        System.out.print("\n Enter value for denominator\n");
        d = scn.nextDouble();
        System.out.print("\n "+name+"'s value now is "+ c +"/"+ d);
    }

    public void show(){
        System.out.print("\n\n "+name+"'s value is "+ c +"/"+ d);
        i = c / d;
        System.out.print("\n ("+i+" as a decimal)");
    }
    public double cnt(){
        return c;
    }
    public double den(){
        return d;
    }
    public double dec(){
        //i = z/n;
        return c / d;
    }
    public void sDec(){
        System.out.print("\n\n "+name+" as a decimal is "+ c / d);
    }
    public void qAdd(){
        System.out.print("\n\n Test");
    }
}
