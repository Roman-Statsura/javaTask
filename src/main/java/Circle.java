public class Circle extends Primitive{
    {name = "Круг";}
    
    @Override
    public double getArea(){
        return Math.PI*b*b/4.0;
    }
    public double getDlina(){
        return Math.PI*b;
    }
}
