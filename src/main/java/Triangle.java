public class Triangle extends Primitive{
    {name = "Треугольник";}
    
    @Override
    public double getArea(){
        return a*b/2.0;
    }
    public double getPerimitr(){
        return (a+b)/2.0;
    }
}
