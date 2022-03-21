package egyetem_zarovizsga;

class Feladat_8 {
    
    public static void main(String[] args) {
        System.out.println( hanyKilences( 99999 ) );
    }

    static int hanyKilences( int szam ) {

        int count = 0;
        int maradek = 0;

        while( szam > 0 ) {

            maradek = szam % 10;
            if( maradek == 9 ) count++;
            szam = szam / 10;

        }

        return count;

    }

}