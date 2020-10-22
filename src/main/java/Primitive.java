public abstract class Primitive {
    protected double a,b;
    protected String name;
    
    abstract double getArea();
    public String getName(){
        return name;
    }
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
}
