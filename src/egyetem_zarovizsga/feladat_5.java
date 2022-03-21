package egyetem_zarovizsga;

class Feladat_5 {
    
    public static void main(String[] args) {
        System.out.println(kobgyok(2234.423));
    }

    public static double kobgyok(double a) {

        double x, y;
        x = 1;
        do {
            y = x;
            x = (double)( ( 2 * x + ( a / ( x * x ) ) ) / 3 );
        }
        while(Math.abs(x-y) > 0.00001);
        
        return x;
    }

}