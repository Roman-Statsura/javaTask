# javaTask
Разработать классы на языке Java, представляющие собой простейшие
плоские геометрические фигуры (круг, равнобедренный прямоугольный
треугольник, квадрат, эллипс). Все разработанные классы должны являться
наследниками общего абстрактного класса Primitive.
У каждого из классов должен быть метод, возвращающий название
фигуры getName(), а также метод, вычисляющий площадь геометрической
фигуры, вписанной в прямоугольник со сторонами a и b getArea() (под
понятием «вписанный» подразумевается расположение фигуры в
прямоугольной области, при которой она имеет наибольшую площадь). Оба
метода должны быть непараметризированы, т.е. не принимать аргументов.
В классах должны быть реализованы следующие уникальные методы:
•для класса «круг» должен быть реализован метод, возвращающий
длину окружности круга;
•для
класса
«треугольник»
метод
возвращающий
периметр
треугольника;
•для класса «квадрат» метод должен возвращать диагональ квадрата;
•для класса «эллипс», метод возвращает сумму большого и малого
радиуса.
Значения сторон прямоугольной области должны быть скрыты
(инкапсулированы) внутри класса, для доступа к этим полям должны быть
разработаны открытые (публичные) методы для установки и чтения
значений этих полей.
При запуске программы у пользователя запрашиваются два числа a и b,
после чего для каждого класса геометрической фигуры создается по одному
объекту. Каждому объекту устанавливаются с помощью открытых методов
значения сторон прямоугольной области. После чего для каждого объекта
вызываются метод getName(), и метод getArea(), а также уникальный метод
класса. Возвращаемые значения должны быть отображены на экране.