public class Linie {
    double length = 0;
    Punkt punkt = new Punkt();


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double afstand() {
        length = punkt.getX() - punkt.getY();
        return length;
    }
}
