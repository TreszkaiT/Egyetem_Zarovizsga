package egyetem_zarovizsga;

class Feladat_17 {

    public static void main(String[] args) {
        
        squareASCII();

    }

    static void squareASCII() {

        // 65 A -> 122 z
        int a = (int)'a';
        int z = (int)'z';

        for( int i = a; i <= z; i++ ) {


            if( Math.pow( (int)Math.sqrt(i), 2 ) == i ) {

                System.out.print( (char)i + " ");

            }

        }

        System.out.print("\n");

    }

}