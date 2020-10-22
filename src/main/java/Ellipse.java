public class Ellipse extends Primitive{
    {name = "Эллипс";}
    
    @Override
    public double getArea(){
        return Math.PI*a*b/4.0;
    }
    public double getRad(){
        return (a+b)/2.0;
    }
}
