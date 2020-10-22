import java.util.Scanner;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Primitive[] arr = new Primitive[4];
        arr[0] = new Circle();
        arr[1] = new Triangle();
        arr[2] = new Quadrat();
        arr[3] = new Ellipse();
        
        System.out.println("Введите А: ");
        double a = sc.nextDouble();
        System.out.println("Введите B: ");
        double b = sc.nextDouble();
        
        for(Primitive v:arr){
            v.setA(a);
            v.setB(b);
        }
        for(Primitive v:arr){
            System.out.println("Фигура: "+v.getName());
            System.out.println("Площадь Фигуры: "+v.getArea());
            if (v instanceof Circle){
                System.out.println("Длина окружности: "+((Circle) v).getDlina());
            }
            else if (v instanceof Triangle){
                System.out.println("Периметр треугольника: "+((Triangle) v).getPerimitr());
            }
            else if (v instanceof Quadrat){
                System.out.println("Диагональ квадрата: "+((Quadrat) v).getDiagonal());
            }
            else {
                System.out.println("Сумма радиусов: "+((Ellipse)v).getRad());
            }
        }
    }
    
}
