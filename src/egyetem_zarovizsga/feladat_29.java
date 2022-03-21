package egyetem_zarovizsga;

class Feladat_29 {

    public static void main(String[] args) {
        
        System.out.println( tizedesPontUtaniSzamjegy( 1212.263 ) );

    }

    static int tizedesPontUtaniSzamjegy( double num ) {

        int szam = (int)(num*10);

        return szam % 10;

    }

}