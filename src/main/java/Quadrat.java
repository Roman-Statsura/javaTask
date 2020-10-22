public class Quadrat extends Primitive{
    {name = "Квадрат";}
    
    @Override
    public double getArea(){
        return b*b;
    }
    public double getDiagonal(){
        return b*Math.sqrt(2.0);
    } 
}
