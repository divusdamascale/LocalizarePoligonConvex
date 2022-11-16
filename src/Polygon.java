public class Polygon {
    private Point [] polygon  ;

    public Polygon()
    {
        polygon = new Point[9];
        polygon[0] = new Point(0, 4);
        polygon[1] = new Point(2, 2);
        polygon[2] = new Point(7, 1);
        polygon[3] = new Point(9, 3);
        polygon[4] = new Point(10, 6);
        polygon[5] = new Point(7, 8);
        polygon[6] = new Point(2, 7);
        polygon[7] = new Point(0,0);
        polygon[8] = new Point(0, 4);
    }

    public Point getPoint(int i)
    {
        return polygon[i];
    }

    public Point[] getPolygon()
    {
        return polygon;
    }

    public void showPoly()
    {
        for (int i = 0; i < polygon.length-1; i++) {
            System.out.println(polygon[i].getX() + " " + polygon[i].getY());
        }
    }
    
}
