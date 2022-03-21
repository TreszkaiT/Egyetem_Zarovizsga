package egyetem_zarovizsga;

class Feladat_20 {

    public static void main( String[] args ) {

        System.out.println( kombinacio( 8, 3 ) );
    }

    static float kombinacio( int n, int k ) {

        if( n >= k ) {

            return fakt(n) / ( fakt( k ) * fakt( n - k ) );

        }
        else {

            System.out.println( "Az n legyen nagyobb mint a k!" );
            return 0;

        }

    }

    static int fakt( int num ) {

        if( num == 0 ) return 1;
        else return num * fakt( num - 1 );

    }

}