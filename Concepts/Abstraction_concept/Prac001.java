package Concepts.Abstraction_concept;

public class Prac001 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        int area = circle.area(2,3);
        System.out.println(area);
    }
}
