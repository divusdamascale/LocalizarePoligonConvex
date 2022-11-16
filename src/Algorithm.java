import javax.swing.JOptionPane;
import javax.swing.JPanel;

// import javax.lang.model.util.ElementScanner6;

public class Algorithm {

    private Polygon poli ;

    public Point gasesteCentruGreutate(Point A,Point B,Point C)
    {
        
        Point S = new Point(((A.getX()+B.getX()+C.getX())/3),((A.getY()+B.getY()+C.getY())/3));
        return S;

    }


    public Point tranzlatie(Point S, Point [] poligon )
    {
        for (int i = 0; i < poligon.length; i++) {
            poligon[i]=new Point(poligon[i].getX()-S.getX(), poligon[i].getY()-S.getY());
        }
        S.setX(0);
        S.setY(0);
        return S;

    }

    public Algorithm(Point M)
    {
        //poligonul propriu
        poli = new Polygon();
        //Centru de g
        Point S = gasesteCentruGreutate(poli.getPoint(0), poli.getPoint(1), poli.getPoint(2));
        //Translatare
        Point [] poligon = poli.getPolygon();
        M = new Point(M.getX()-S.getX(),M.getY()-S.getY());
        
        Point sT = tranzlatie(S, poligon);
        poligon[7]=new Point(M.getX(), M.getY());
        //ordonare varfuri
        Ordonare x = new Ordonare();
        x.ord(poligon, poligon.length-1);
        //cautare binara
        S1 y= new S1();
        Point [] vecinii = y.cautare(poligon,M);
       
        for (int i = 0; i < vecinii.length; i++) {
            System.out.println(vecinii[i].getX()+ "  "+ vecinii[i].getY());
        }

        //verificare interior exterior
        JPanel a = new JPanel();
        if(sT.determinant(M, vecinii[0], vecinii[1])>0)
        {
            JOptionPane.showMessageDialog(a, "Exterior");
        }else if(sT.determinant(M, vecinii[0], vecinii[1])<0 )
        {
            JOptionPane.showMessageDialog(a, "Interior");
        }else if(sT.determinant(M, vecinii[0], vecinii[1])==0)
        {
            JOptionPane.showMessageDialog(a, "Frontiera");
        }

        

        
   


    }
    
}
