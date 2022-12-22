public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 10;
        short b = 55;
        int c = 200000;
        long d = 9000L;
        float e = 90.12f;
        double f = 789.8765;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной d с типом double равно " + f);

            }

    public static void task2 () {
        System.out.println("Задача 2");
        byte a = 67;
        short b = -159;
        short w = 569;
        int c = 27897;
        long d = 987678965549L;
        float e = 27.12f;
        double f = 2.786;
           }
    public static void task3 () {
        System.out.println("Задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short paper = 480;
        int paperPerPerson = paper / (class1 + class2 + class3);
        System.out.println("На кажого ученика расситано по " + paperPerPerson + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte minutes2 = 16;
        System.out.println("За 2 минуты машина произвела " + minutes2 + " бутылок");
        int minutes20 = minutes2 * 10;
        System.out.println("За 20 минуты машина произвела " + minutes20 + " бутылок");
        int hour = minutes20 * 3;
        //System.out.println("Количество бутылок за 1 час " + hour);
        int day = hour * 24;
        System.out.println("За сутки машина произвела " + day + " бутылок");
        int day3 = day * 3;
        System.out.println("За трое суток машина произвела " + day3 + " бутылок");
        int month = day * 30;
        System.out.println("За месяц машина произвела " + month + " бутылок");

    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalTinForSchool = 120;
        byte whiteTinPerClass = 2;
        byte brownTinPerClass = 4;
        int paintPerClass = whiteTinPerClass + brownTinPerClass;
        int numberOfClasses = totalTinForSchool / paintPerClass;
        int totalWhitePaint = numberOfClasses * whiteTinPerClass;
        int totalBrownPaint = numberOfClasses * brownTinPerClass;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte banana = 5;
        int totalBananaWeight = banana * 80;
        //System.out.println(totalBananaWeight);
        int milk = 200;
        int milkTotal = milk * 105 / 100;
        //System.out.println(milkTotal);
        int iceCream = 2;
        int totalIceCream = iceCream * 100;
        int egs = 4;
        int totalEgs = egs * 70;
        int totalMixGramm = totalBananaWeight + milkTotal + totalIceCream + totalEgs;
        float totalMixKilo = totalMixGramm / 1000;
        System.out.println("Общий вес завтрака в граммах равен " + totalMixGramm + " грамм");
        System.out.println("Общий вес завтрака в килограммах равен " + totalMixKilo + " килограмм");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int sportsmanWeightInGramm = 7000;
        int firstDietGammPerDay = 250;
        int seconfDietGrammPerDay = 500;
        int totalDaysForFirstDiet = sportsmanWeightInGramm / firstDietGammPerDay;
        int totalDaysForSecondDiet = sportsmanWeightInGramm / seconfDietGrammPerDay;
        int averageDaysForDiet = (totalDaysForFirstDiet + totalDaysForSecondDiet) / 2;
        System.out.println("Чтобы похудеть по первой дитете потребуется " + totalDaysForFirstDiet + " дней");
        System.out.println("Чтобы похудеть по второй дитете потребуется " + totalDaysForSecondDiet + " дней");
        System.out.println("В среднем для похудения потебуется " + averageDaysForDiet + " день.");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int mashaSalaryPerMonth = 67760;
        int denisSalaryPerMonth = 83690;
        int kristinaSalaryPerMonth = 76230;
        int salaryIncrease = 10;
        int monthForWork = 12;
        int mashaSalaryForYear = mashaSalaryPerMonth * monthForWork;
        //System.out.println(mashaSalaryForYear);
        int denisSalaryForYear = denisSalaryPerMonth * monthForWork;
        int kristinaSalaryForYear = kristinaSalaryPerMonth * monthForWork;
        int increaseMashaSalary = mashaSalaryPerMonth / salaryIncrease;
        //System.out.println(increaseMashaSalary);
        int increaseDenisSalary = denisSalaryPerMonth / salaryIncrease;
        int increaseKristinaSalary = kristinaSalaryPerMonth / salaryIncrease;
        int inreaseMashaSalaryForYear = (increaseMashaSalary + mashaSalaryPerMonth) * 12;
        //System.out.println(inreaseMashaSalaryForYear);
        int inreaseDenisSalaryForYear = (increaseDenisSalary + denisSalaryPerMonth) * 12;
        int inreaseKristinaSalaryForYear = (increaseKristinaSalary + kristinaSalaryPerMonth) * 12;
        int differenceMashaSalary = inreaseMashaSalaryForYear - mashaSalaryForYear;
        //System.out.println(differenceMashaSalary);
        int differenceDenisSalary = inreaseDenisSalaryForYear - denisSalaryForYear;
        int differenceKristinaSalary = inreaseKristinaSalaryForYear - kristinaSalaryForYear;
        System.out.println("Маша теперь получает " + inreaseMashaSalaryForYear + " рублей. Годовой доход вырос на " + increaseMashaSalary  + " рублей.");
        System.out.println("Денис теперь получает " + inreaseDenisSalaryForYear + " рублей. Годовой доход вырос на " + increaseDenisSalary  + " рублей.");
        System.out.println("Кристина теперь получает " + inreaseKristinaSalaryForYear + " рублей. Годовой доход вырос на " + increaseKristinaSalary  + " рублей.");
    }

}