public class HW4 {
    public static void main(String[] args) {
        System.out.println("Площадь треугольника: "+ areaTriangle(3,7,8));
    }
    // Функция возвращающая площадь треугольника по трем сторонам
    public static Double areaTriangle(int a, int b, int c){
        Double s = null;
        if (ExistenceofTriangle(a,b,c) && validLengths(a,b,c)){
            Double p = ((double)a +b + c)/2;
            s=Math.sqrt(p*(p-a)*(p-b)*(p-c));

        }
        return s;
    }

    public static boolean validLengths(int a, int b, int c) {
        return (a > 0 && b > 0 && c > 0);
    }

    private static boolean ExistenceofTriangle(int a, int b, int c) {
        return ((a + b> c) && (b + c > a) && (a + c >b));
    }


}

