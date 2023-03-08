package A3_Mathematics;

public class Main {
    public int add(int n1,int n2){
        return n1+n2;
    }
    public double add(double n1,double n2){
        return n1+n2;
    }

    public int multiply(int n1,int n2){
        return n1*n2;
    }
    public double multiply(double n1,double n2){
        return n1*n2;
    }

    public int min(int x,int y){
        if (x<y)
            return x;
        else
            return y;
    }
    public int min(int x,int y,int z){
        if (x<y&&x<z)
            return x;
        else if (y<z)
            return y;
        else
            return z;
    }
    public int min(int w,int x,int y,int z){
        if (w<x&&w<y&&w<z)
            return w;
        else if (x<y&&x<z)
            return x;
        else if (y<z)
            return y;
        else
            return z;
    }
}

