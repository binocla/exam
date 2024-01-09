package task2;


import java.util.Arrays;

/**
 * Создать класс "Равнобедренный треугольник".
 * Выделить необходимые атрибуты.
 * Создать конструктор,
 * позволяющий задать все атрибуты объекта
 * (и проверяющий,
 * что данные действительно являются треугольником,
 * иначе генерируется исключение)
 * Методы:
 * - Периметр
 * - Площадь
 * - Проверить на равенство с другим треугольником (переопределенный equals)
 * - Узнать углы треугольника (массив из трёх чисел,
 * не принципиально в чем - в радианах или градусах)
 * - переопределенный toString
 * Можно писать и другие методы, если необходимо
 * В другом классе создать static-методы,
 * вычисляющий общий периметр массива треугольников
 * делающий проверку, что в массиве хотя бы 2 треугольника равны
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(1, 2, 3); // a1
        Triangle triangle2 = new Triangle(1, 2, 3); // a2
        Triangle triangle3 = new Triangle(1, 2, 4);
        Triangle triangle4 = new Triangle(6, 12, 4);
        System.out.println(Arrays.toString(triangle1.getAngles()));
//        System.out.println(triangle1.toString());

        Triangle[] arr = {triangle1, triangle2, triangle3, triangle4};
        System.out.println(totalPerimeter(arr));
        System.out.println(hasAtLeastTwoTrianglesEqual(arr));

    }

    public static double totalPerimeter(Triangle[] arr) {
        double totalPerimeter = 0;
        for (int i = 0; i < arr.length; i++) {
            totalPerimeter += arr[i].getPerimeter();
        }
        return totalPerimeter;
    }

    public static boolean hasAtLeastTwoTrianglesEqual(Triangle[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
