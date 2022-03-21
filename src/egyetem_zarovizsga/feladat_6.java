package egyetem_zarovizsga;

class Feladat_6 {
    public static void main( String[] args ) {
        System.out.println( fibo( 8 ) );
    }

    static int fibo( int szam ) {
        if(szam == 1 || szam == 2) {
            return 1;
        }
        return fibo(szam - 1) + fibo(szam - 2);
    }
}