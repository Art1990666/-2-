public class Main {
    public static void main(String[] args) {
        transient1();
        transient2();
        transient3();
        transient4();
        transient5();
        transient6();
        transient7();
        transient8();
    }
    public static void transient1() {
        System.out.println("work1");
        int a = 15000;
        System.out.println(" Значение переменной с типом " + " a " + " равно " + a);
        byte b = 10;
        System.out.println(" Значение переменной с типом " + " b " + " равно " + b);
        short v = 1000;
        System.out.println(" Значение переменной с типом " + " v " + " равно " + v);
        long n = 110;
        System.out.println(" Значение переменной с типом " + " n " + " равно " + n);
        float m = 5.1f;
        System.out.println(" Значение переменной с типом " + " m " + " равно " + m);
        double c = 10.1f;
        System.out.println(" Значение переменной с типом " + " c " + " равно " + c);
    }
    public static void transient2() {
        System.out.println("work2");
        long n = 987678965549L;
        System.out.println(n);
        int a = -159;
        System.out.println(a);
        byte b = 67;
        System.out.println(b);
        short v = 27897;
        System.out.println(v);
        float m = 569;
        System.out.println(m);
        double c = 27.12;
        System.out.println(c);
    }
    public static void transient3() {
        System.out.println("work3");
        int a = 23;
        int b = 27;
        int c = 30;
        int over = a+b+c;
        int sheets = 480 / over;
        System.out.println(" На каждого ученика рассчитано " + sheets + " листов бумаги ");
    }
    public static void transient4() {
        System.out.println("work4");
        int a = 16;
        int b = 2;
        int oneMinute = a / b;
        int time = 20;
        int overBot = time * oneMinute;
        System.out.println(" За " +  time + " минут "  + " машина произвела " + overBot + " штук бутылок " );
        int c = 60;
        int d = c * oneMinute;
        int kHour = 24;
        int zBot = d * kHour;
        System.out.println(" За " + kHour + " часа, машина произвела " + zBot + " штук бутылок " );
        int xDay = 24;
        int lDay = xDay * 3;
        int mBot = 480;
        int gBot = lDay * mBot;
        System.out.println( " За " + lDay  + " часа, машина произвела " + gBot + " штук бутылок " );
        int uDay = lDay * 10;
        int eBot = uDay * mBot;
        System.out.println( " За " + uDay  + " часов, машина произвела " + eBot + " штук бутылок " );
    }
    public static void transient5() {
        System.out.println("work5");
        int cans = 120;
        int a = 2;
        int b = 4;
        int overC = a + b;
        int classR = cans / overC;
        int overA = a * classR;
        int overB = b * classR;
        System.out.println(" В школе, где " + classR + " классов, " +
                " нужно " + overA + " банок белой краски и " + overB + " банок коричневой краски ");
}
    public static void transient6() {
        System.out.println("work6");
        int a = 80;
        int b = 105;
        int c = 100;
        int d = 70;
        int overA = a * 5;
        int overB = b * 2;
        int overC = c * 2;
        int overD = d * 4;
        int overAmount = overA + overB + overC + overD;
        System.out.println( " Завтрак, который употребляет спортсмен, равен " + overAmount + " грамм " );
        double n = 1.000;
        double m = 1.090;
        double overK = m / n;
        System.out.println( " Завтрак, который употребляет спортсмен, равен " + overK + " киллограмм " );
    }
    public static void transient7() {
        System.out.println("work7");
        int a = 7;
        int b = 1000;
        int aGram = a * b;
        int c = 250;
        int d = 500;
        int cDays = aGram / c;
        int bDays = aGram / d;
        System.out.println( " Если спортсмен будет терять в весе по 250 грамм, то на это уйдет " + cDays + " дней" +
                " если он будет терять в весе по 500 грамм, то на это уйдет " + bDays + " дней " );
        int rDays = cDays / 2;
        int tDays = bDays / 2;
        System.out.println( " Чтобы худеть по 250 грамм в течении 28 дней, то в среднем необходимо будет "
                + rDays + " дней " + " а чтобы худеть по 500 грамм в течении 14 дней, то в среднем необходимо будет "
                + tDays + " дней ");
    }
    public static void transient8() {
        System.out.println("work8");
        int a = 67760;
        int b = 83690;
        int c = 76230;
        int aTotal = a / 10;
        int bTotal = b / 10;
        int cTotal = c / 10;
        int aInm = a + aTotal;
        int bInm = b + bTotal;
        int cInm = c + cTotal;
        int aIny = aTotal * 12;
        int bIny = bTotal * 12;
        int cIny = cTotal * 12;
        System.out.println( " Маша теперь получает " + aInm + " рублей. Годовой доход вырос на "
                + aIny + " Денис теперь получает " + bInm + " рублей. Годовой дохлд вырос на "
        + bIny + " рублей " + " Кристина теперь получает " + cInm + " рублей. Годовой доход вырос на "
         + cIny + " рублей ");
    }
}