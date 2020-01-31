package inheritanceB1;

/**
 * Created by sity on 29/10/2019.
 */
public class Point {
    public int x;
    public int y;

    public double distance(Point other)
    {
        return Math.sqrt(Math.pow(this.x - other.x, 2) - Math.pow(this.y - other.y, 2));
    }
}
