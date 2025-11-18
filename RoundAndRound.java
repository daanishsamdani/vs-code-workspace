public class RoundAndRound {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.radius = 5.1;
        double a = 2;

        //circle 1 calculations

        circle1.diameter = circle1.radius * 2;
        circle1.circumference = Math.PI * 2 * circle1.radius;
        circle1.area = Math.PI * Math.pow(circle1.radius, a);
        

        //circle 2 calculations
        Circle circle2 = new Circle();
        circle2.radius = 17.5;
        circle2.diameter = circle2.radius * 2;
        circle2.circumference = Math.PI * 2 * circle2.radius;
        circle2.area = Math.PI * Math.pow(circle2.radius, a);


        //circle 1 outputs
        System.out.println("circle1.radius = " + circle1.radius);
        System.out.println("circle1.diameter = " + circle1.diameter);
        System.out.println("circle1.circumference = " + Math.round(circle1.circumference * 1000) / 1000.0);
        System.out.println("circle1.area = " + Math.round(circle1.area * 1000) / 1000.0);

        //circle 2 outputs
        System.out.println("circle2.radius = " + circle2.radius);
        System.out.println("circle2.diameter = " + circle2.diameter);
        System.out.println("circle2.circumference = " + Math.round(circle2.circumference * 1000) / 1000.0);
        System.out.println("circle2.area = " + Math.round(circle2.area * 1000) / 1000.0);


    }
}
