public class Calculator {
    private double a;
    private double b;
    public Calculator(){
        this.a=0;  //вызываем поле и присваиваем есму 0
        this.b=0;
    }
    public Calculator(double a, double b){
        this.a= a;
        this.b= b;
    }
    public double add(){
        return  a + b;
    }
    public double subs() {
        return a - b;
    }
    public  double multi(){
        return  a * b;
    }
    public double div(){
        return a /b;
    }
    public double mod(){
        return a %b;
    }
}

