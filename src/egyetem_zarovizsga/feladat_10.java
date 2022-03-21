package egyetem_zarovizsga;

class Feladat_10 {

    public static void main(String[] args) {
        
        elso5( 9 );

    }

    static void elso5( int szam ) {

        if ( szam > 1 && szam < 10 ) {

            int y = 1;
            int yUtan = 1;
            int count = 0;
            int index = 1;

            while( count < 5 ) {

                y = yUtan;

                if( index % 2 == 1 ) {
                    yUtan = y + 2;
                }
                else {
                    yUtan = y + 1;
                }

                if( yUtan % szam == 0 ) {

                    System.out.print(yUtan + ", ");
                    count++;

                }

                index++;

            }

        }
        else {

            System.out.println( "💩  💩  🙄" );

        }

    }

}