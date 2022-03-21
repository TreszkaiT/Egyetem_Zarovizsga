package egyetem_zarovizsga;

class Feladat_13 {

    public static void main( String[] args ) {
        
        System.out.println( palindromaE( args[0] ) );

    }

    static boolean palindromaE( String s ) {

        StringBuilder szo =         new StringBuilder();
        StringBuilder szoForditva = new StringBuilder();

        for( int i=0; i < s.length(); i++ ) {

            if( s.charAt(i) != ' ' ) {

                szo.append( s.charAt( i ) );

            }

        }

        for( int j = szo.length(); j > 0; j-- ) {

            szoForditva.append( szo.charAt( j - 1 ) );

        }

        return szo.toString().equals(szoForditva.toString());

    }

}