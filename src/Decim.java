import java.util.Scanner;

public class Decim {

    Scanner scn = new Scanner(System.in);

    protected double n;
    protected String name;
    protected double i;

    public Decim(String nam, double num){

        name = nam;
        n = num;
        i = 0;

    }

    public double get_n(){
        return n;
    }

    public void set(double ass){
        n = ass;
        System.out.print("\n\n "+name+" has been set to "+n);
    }

    public void qSet(){
        System.out.print("\n\n Please enter value to be set as "+name+"\n");
        n = scn.nextDouble();
        if(n==1984){
            System.out.print("\n Literally...");
        }else {
            System.out.print("\n " + name + " has been set to " + n);
        }
    }

    public double set_n(double ass){ // We don't speak about this one
        n = ass;
        return n;
        //System.out.print("\n\n Value of "+name+" is now "+n);		//I'm dumb
    }

    public void show(){ //Show CV
        System.out.print("\n\n Value of "+name+" is at: "+n);
        //System.out.print("\n\n Value of "+name+" is at: "+Math.sqrt(n));
    }
    /*
    public void sShow(){ //Show CV
        System.out.print(n);
        //System.out.print("\n\n Value of "+name+" is at: "+Math.sqrt(n));
    }
    */
    public void prim(){ //Weth/n CV is Prim
        for(i = 2; i <= n; i++){
            if(n == i){
                System.out.print("\n\n "+name+" is a prime number (Ended at "+i+")");
                break;
            }else if(n/i == Math.round(n/i)){
                System.out.print("\n\n "+name+" is not a prime number (Ended at "+i+")");
                break; //Loops... Why didn't I think of this one?
            }
        }
    }       //Couldn't have done this without help


    public boolean gPrim(){ //Weth/n CV is Prim
        for(i = 2; i <= n; i++){
            if(n == i){
                return true;
            }else {//(n/i == Math.round(n/i)){
                return false;
            }
        }
        return false;
    }
          //Can't get this to work somehow. Smth about the last curly bracket is off

    //Block comments are hella useful.

    public void rnd(){ //Round CV
        System.out.print("\n\n Rounding "+name+" ("+n+")");
        n = Math.round(n);
        System.out.print("\n\n Value of "+name+" now is at: "+n);
    }

    public void add(double a){ //Add to CV
        System.out.print("\n\n Adding "+a+" to "+name);
        n = n + a;
        System.out.print("\n\n Value of "+name+" now is at: "+n);
    }

    public void qAdd(){ //Add to CV

        System.out.print("\n\n Please enter value to be added to "+name+" ("+n+")\n");
        n = n + scn.nextDouble();   //I sense great opportunities
        System.out.print("\n Value of "+name+" now is at: "+n);
    }

    public void sub(double s){ //Subtract from CV
        System.out.print("\n\n Subtracting "+s+" from "+name);
        n = n - s;
        System.out.print("\n\n Value of "+name+" now is at: "+n);
    }
    public void qSub(){ //Subtract from CV
        System.out.print("\n\n Please enter value to be subtracted from "+name+" ("+n+")\n");
        n = n - scn.nextDouble();
        System.out.print("\n Value of "+name+" now is at: "+n);
    }

    public void div(double d){ //Divide CV by
        System.out.print("\n\n Dividing "+name+" by "+d);
        n = n / d;
        System.out.print("\n\n Value of "+name+" now is at: "+n);
    }

    public void qDiv(){ //Divide CV by
        System.out.print("\n\n Please enter value to divide "+name+" ("+n+") by\n");
        n = n / scn.nextDouble();
        System.out.print("\n Value of "+name+" now is at: "+n);
    }

    public void mul(double m){ //Multiply CV by
        System.out.print("\n\n Multiplying "+name+" "+m+" times.");
        n = n * m;
        System.out.print("\n\n Value of "+name+" now is at: "+n);
    }

    public void qMul(){ //Multiply CV by
        System.out.print("\n\n Please add value to multiply "+name+" ("+n+") by\n");
        n = n * scn.nextDouble();
        System.out.print("\n Value of "+name+" now is at: "+n);
    }

    public void siz(double q){ //Wheth/n is bigger than
        if(n > q){
            System.out.print("\n\n "+name+" ("+n+") is bigger than: "+q);
        }else{
            System.out.print("\n\n "+name+" ("+n+") is smaller than: "+q);
        }
    }

    public void qSiz(){ //Wheth/n is bigger than
        System.out.print("\n\n Please enter value to be compared to "+name+" ("+n+")\n");
        i = scn.nextDouble();
        if(n > i){
            System.out.print("\n "+name+" ("+n+") is bigger than "+i);
        }else{
            System.out.print("\n "+name+" ("+n+") is smaller than "+i);
        }
    }

    public boolean gSiz(double q){ //Same as above
        return n > q;
    }

    public void sqrt(){ //Weth/n is a quadrant
        if(Math.round(Math.sqrt(n)) == Math.sqrt(n)){
            System.out.print("\n\n "+name+" ("+n+") is a proper square ("+Math.sqrt(n)+") ");
        }else{
            System.out.print("\n\n "+name+" ("+n+") is not a proper square ("+Math.sqrt(n)+") ");
        }
    }

    public boolean gSqrt(){ //Same as above
        //WHY?!?!?
        return Math.round(Math.sqrt(n)) == Math.sqrt(n);
    }

}

//TODO: Make gPrim work