import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        PointList points = new PointList();
        double x, y;

        System.out.println("\nВведите координаты точки: ");
        System.out.print("x: ");
        x = scanner.nextDouble();
        System.out.print("y: ");
        y = scanner.nextDouble();

        points.add(new Point(x, y));

        int choice;

        System.out.println("\nЖелаете добавить еще? (1 - да, 2 - нет)");
        System.out.print("Ваш выбор: ");
        choice = scanner.nextInt();

        while (choice == 1) {

            System.out.println("\nВведите координаты точки: ");
            System.out.print("x: ");
            x = scanner.nextDouble();
            System.out.print("y: ");
            y = scanner.nextDouble();

            points.add(new Point(x, y));

            System.out.println("\nЖелаете добавить еще? (1 - да, 2 - нет)");
            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();

        }

        System.out.println("\nВведите координаты центра окружности: ");
        System.out.print("x: ");
        x = scanner.nextDouble();
        System.out.print("y: ");
        y = scanner.nextDouble();

        System.out.println("\nВведите радиус окружности: ");
        System.out.print("radius: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(new Point(x, y), radius);

        System.out.println("\nСписок введенных точек:");
        System.out.println(points);

        System.out.println(
                "\nСписок точек, лежащих в окружности с центром " + "(" + x + ", " + y + ")" + " и радиусом " + radius + "."
        );
        System.out.println(circle.inbounding(points));

    }

}
