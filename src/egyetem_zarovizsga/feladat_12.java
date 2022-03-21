package egyetem_zarovizsga;

class Feladat_12 {

    public static void main(String[] args) {
        
        System.out.println( onlyNumbers( "hello!!44!!4!" ) );

    }

    static String onlyNumbers( String s ) {

        StringBuilder newString = new StringBuilder();

        for( int i=0; i < s.length(); i++ ) {

            if ( s.charAt(i) > 47 && s.charAt(i) < 58 ) {
                
                newString.append( s.charAt( i ) );

            }

        }

        return newString.toString();

    }

}