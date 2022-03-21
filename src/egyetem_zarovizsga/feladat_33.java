package egyetem_zarovizsga;

class Feladat_33 {

    public static void main(String[] args) {
        
        System.out.println( hanySzamjegyKettesben(33, 23) );

    }

    static int hanySzamjegyKettesben( int num1, int num2 ) {

        int lkkt = 1;
        int szamjegy = 0;
        boolean bool = true;

        while( bool ) {

            if ( lkkt % num1 == 0 && lkkt % num2 == 0 && lkkt != num1 && lkkt != num2 ) {
                bool = false;
            }
            else {
                lkkt++;
            }

        }

        while(lkkt > 0) {
            
            lkkt /= 2;
            szamjegy++;

        }

        return szamjegy;

    }

}