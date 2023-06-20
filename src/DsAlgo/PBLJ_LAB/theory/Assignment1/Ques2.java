package DsAlgo.PBLJ_LAB.theory.Assignment1;

class Shape{
    public void draw(){
        System.out.println("Drawing shape");
    }

    public void erase(){
        System.out.println("Erasing shape");
    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Shape c = new Circle();
        c.draw();
        c.erase();
        Shape t = new Triangle();
        t.draw();
        t.erase();
        Shape s = new Square();
        s.draw();
        s.erase();
    }
}
