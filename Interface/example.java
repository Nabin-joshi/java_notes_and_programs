package Interface;
interface Shape{
    public void calculatePerimeter();
}

interface Circle extends Shape {
    public void calculatePerimeter1();
}
public class example implements Circle {
    @Override
    public void calculatePerimeter() {

    }

    @Override
    public void calculatePerimeter1() {

    }
}
