package egyetem_zarovizsga;

class feladat_4 {

    /* 4. A következő közelítő formulát használva írjon függvényt vagy metódust, amely egy valós
    szám négyzetgyökét adja vissza! Használja az xk+1=1/2*(xk+a/xk) sorozatot, amely a
    négyzetgyökéhez konvergál, ha x1=1. */

    public static void main(String[] args) {

        System.out.print( gyok(323.313) );

    }

    static double gyok(double a) {

        double x, y;
        x = 1;
        do {
            y = x;
            x = (double)(0.5 * (x + a/x));
        }
        while(Math.abs(x-y) > 0.00001);
        
        return x;
    }

}