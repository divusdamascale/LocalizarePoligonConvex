
public class Ordonare {


    public void merge(Point[] lS,Point[] rS, Point[] S,int lsize, int rsize){

        Point A = new Point(0, 0);
      
        int i=0,l=0,r = 0;
        //verificam conditiile pentru verificare
        while(l<lsize && r<rsize){
            
            
            if(lS[l].getCadran()>rS[r].getCadran()){
                S[i++] = lS[l++];
            }else if(lS[l].getCadran()==rS[r].getCadran() &&(A.determinant(lS[l],A, rS[r]) > 0))
            {
                S[i++] = lS[l++];
            }
            else{
                S[i++] = rS[r++];
            }
        }
        while(l<lsize){
            S[i++] = lS[l++];
        }
        while(r<rsize){        
            S[i++] = rS[r++];
        }
    }
   
        public void ord(Point [] S,int l){

            if (l < 2){return;}
      
            int mij = l / 2;
            Point [] lS = new Point[mij];
            Point [] rS = new Point[l-mij];
            
          //Se imparte S in doua si se copiaza in alti doi vectori
            int k = 0;
            for(int i = 0;i<l;++i){
                if(i<mij){
                    lS[i] = S[i];
                }
                else{
                    rS[k] = S[i];
                    k ++;
                }
            }
           
          // Chemam recursiv functia ord pentru a impartii mai departe arrayurile
            ord(lS,mij);
            ord(rS,l-mij);
            
          // Chemam fucntia de unificare pentru fiecare subdivizie in parte
            merge(lS,rS,S,mij,l-mij);
            
        };

        public void afisare (int[] S)
        {
            int n= S.length;
            System.out.print("{ ");
            for (int i = 0; i < n ; i++) {
                System.out.print(S[i]);
                if(i!=S.length-1) System.out.print(",");
            };
            System.out.println(" }");
        }
    
   
    
}
