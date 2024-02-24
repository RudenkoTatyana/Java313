package HomeWork20;

public class Square {
 private double a;
 private double b;
 private double c;
 private double h;
 int d = 0;
 public Square(){
     this.a = a;
     this.b = b;
     this.c = c;
     this.h = h;
 }


    public double  geron(double a, double b, double c){
        double p = (a + b + c) /2;
        d++;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public double height(double a, double h){
     d++;
     return a * h / 2;
    }
    public double square(double a){
     d++;
     return a * a;
    }
    public double rectangle(double a, double b){
     d++;
     return a * b;
    }
    public int d(int d){
     return d;
    }
}
