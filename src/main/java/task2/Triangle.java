package task2;

// Р/б треуг
public class Triangle {
    private double base;
    private double side;
    private double height;

    public Triangle(double base, double side, double height) {
        if (base <= 0 || side <= 0 || height <= 0) {
            /*
                try { } catch (Exception e)
             */
            // checked / unchecked
            // checked - на уровне компляции
            // unchecked - runtime exception
            throw new RuntimeException("Invalid properties");
        }
        if (base / 2 >= side || base / 2 >= height) { // maths
            throw new RuntimeException("Invalid properties");
        }

        this.base = base;
        this.side = side;
        this.height = height;
    }

    public double getPerimeter() {
        return base + 2 * side;
    }

    public double getSquare() {
        return base * 0.5 * height;
    }

    public double[] getAngles() {
        // fixme
        double[] angles = new double[3];
        angles[0] = Math.atan(2 * height / base);
        angles[1] = angles[0];
        angles[2] = Math.PI - 2 * angles[0];
        return angles;
    }

    @Override
    public String toString() {
        return String.format("""
                Основание треугольника: %s,
                Высота треугольника: %s,
                Сторона треугольника: %s
                 """, base, height, side);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } // Если это один и тот же объект - true
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Triangle triangle = (Triangle) o;

        if (base != triangle.base) {
            return false;
        }
        if (side != triangle.side) {
            return false;
        }
        if (height != triangle.height) {
            return false;
        }
        return true;
    }
}
