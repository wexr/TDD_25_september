public class Linie {
    double length = 0;
    Punkt punkt = new Punkt();
    double x = punkt.getX();
    double y = punkt.getY();



    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double afstand(double x, double y) {
        length = x - y;
        return length;
    }
}
