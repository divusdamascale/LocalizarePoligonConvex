public class S1
{

    public Point[] cautare(Point a[], Point b) {
       Point [] x1 = new Point[2];
        for (int i = 0; i < a.length-1; i++) {
            if(i==a.length-2)
            {
                if(a[i].getX()==b.getX())
                {
                    if(a[i].getY() == b.getY())
                    {
                        x1[0]=a[i-1];
                        x1[1]=a[0];
                        return x1;
                    }
                }

            }else if(i==0)
            {
                if(a[i].getX()==b.getX())
                {
                    if(a[i].getY() == b.getY())
                    {
                        x1[0]=a[6];
                        x1[1]=a[1];
                        return x1;
                    }
                }

            }
            if(a[i].getX()==b.getX())
            {
                if(a[i].getY() == b.getY())
                {
                    x1[0]=a[i-1];
                    x1[1]=a[i+1];
                    return x1;
                }
            }
            
        }
return null;  
    }



    public Point[] cautareBin(Point a[], int i, int n, Point b) {
        Point [] x1 = new Point[2];
        Point O = new Point(0, 0);
        System.out.println(i);

        if(b.getCadran()==a[(i+n)/2].getCadran())
        {
            if(O.determinant(b, O, a[(i+n/2)])==0)
            {
                x1[0]=new Point(a[(i+n-1)/2].getX(), a[(i+n-1)/2].getY());
                x1[1]=new Point(a[(i+n+1)/2].getX(), a[(i+n+1)/2].getY());
                return x1;
            }else if(O.determinant(b, O, a[(i+n/2)])<0)
            {
                cautareBin(a, i, (i+n)/2, b);
            }else
            {
                cautareBin(a, ((i+n)/2)+1, n, b);
            }
        }
        else if( b.getCadran()>a[(i+n)/2].getCadran()) cautareBin(a, i, (i+n)/2, b);
        else cautareBin(a, ((i+n)/2)+1, n, b);
        
        return null;
        
        
    }
    
}