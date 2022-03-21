package egyetem_zarovizsga;

import java.util.Random;

class Feladat_18 {

    public static void main( String[] args ) {

        System.out.println( randomString() );

    }

    static String randomString() {

        int a = (int)'a';
        int z = (int)'z';
        int rndInt;
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        System.out.println( a + ", " + z );

        for( int i = 0; i < 5; i++ ) {

            rndInt = Math.abs((int)rand.nextInt() % (z - a + 1)) + a;
            sb.append( (char)rndInt );

        }

        return sb.toString();

    }

}