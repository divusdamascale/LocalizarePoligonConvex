public class Point
{
    private int x;
    private int y;
    private int cadran;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
        if(x>0 && y>0)
        {
            cadran = 1;
        } else if(x<0 && y >= 0)
        {
            cadran = 2;
        }else if (x <= 0 && y>0)
        {
            cadran = 2;
        }else if (x<0 && y <= 0)
        {
            cadran = 3;
        }else if(x >= 0 && y < 0)
        {
            cadran = 4;
        }

    }

    public int determinant(Point B,Point O,Point A)
    {
        return ((B.getX()*O.getY())+(B.getY()*A.getX())+(O.getX()*A.getY())-(A.getX()*O.getY())-(B.getX()*A.getY())-(O.getX()*B.getY()));
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getCadran()
    {
        return cadran;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }

}