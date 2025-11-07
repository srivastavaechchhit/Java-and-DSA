public class fraction {

    static Fraction add(Fraction f1, Fraction f2) {
        int numerator = (f2.den*f1.num) + (f2.num*f1.den);
        int denominator = f1.den * f2.den;
        return new Fraction(numerator, denominator);
    }

    static Fraction sub(Fraction f1, Fraction f2) {
        int numerator = (f2.den*f1.num) - (f2.num*f1.den);
        int denominator = f1.den * f2.den;
        return new Fraction(numerator, denominator);
    }

    static Fraction mul(Fraction f1, Fraction f2) {
        int numerator = f1.num * f2.num;
        int denominator = f1.den * f2.den;
        return new Fraction(numerator, denominator);
    }

    static Fraction div(Fraction f1, Fraction f2) {
        int numerator = f1.num * f2.den;
        int denominator = f1.den * f2.num;
        return new Fraction(numerator, denominator);
    }

    static int findGCD(int x, int y) {
        if (y == 0) return x;
        return findGCD(y, x%y);
    }


    static class Fraction {
        int num, den;

        Fraction(int num, int den) {
            this.num = num;
            this.den = den;
            simplify();
        }

        void simplify() {
            int hcf = findGCD(num, den);
            num /= hcf;
            den /= hcf;
        }
    }


    static void main() {
        Fraction f1 = new Fraction(3, 21);
        System.out.println(f1.num+ "/" +f1.den);

        Fraction f2 = new Fraction(25, 20);
        System.out.println(f2.num+ "/" +f2.den);

        Fraction fa = add(f1, f2);
        Fraction fs = sub(f1, f2);
        Fraction fp = mul(f1, f2);
        Fraction fd = div(f1, f2);


        System.out.println("Sum:        " +fa.num+ "/" +fa.den);
        System.out.println("Difference: " +fs.num+ "/" +fs.den);
        System.out.println("Product:    " +fp.num+ "/" +fp.den);
        System.out.println("Division:   " +fd.num+ "/" +fd.den);
    }
}
