package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    private final double x;
    private final double y;



    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает координату точки по оси абсцисс
     *
     * @return координату точки по оси X
     */
    public double getX() {
        return x;
    }

    /**
     * Возвращает координату точки по оси ординат
     *
     * @return координату точки по оси Y
     */
    public double getY() {
        return y;
    }

    /**
     * Подсчитывает расстояние от текущей точки до точки, переданной в качестве параметра
     *
     * @param point вторая точка отрезка
     * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {

        return Math.sqrt(Math.pow(this.getX() - point.getX(), 2) + Math.pow(this.getY() - point.getY(), 2));
    }

}
