package egyetem_zarovizsga;

class Feladat_11 {

    public static void main(String[] args) {
    
        System.out.println( pozitivOsztokSzama( 2141 ) );

    }

    static int pozitivOsztokSzama( int szam ) {

        int count = 0;

        for( int i = 1; i <= szam; i++ ) {
            
            if( szam % i == 0 ) {

                count++;
                System.out.println( i );

            }

        }
        
        
        return count;

    }

}