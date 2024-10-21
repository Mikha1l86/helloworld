class Main {

    // work 1

    public static void main (String[] args) {
        int myInt = 250;
        byte myByte = 25;
        short myShort = 1250;
        long myLong = 12345678;
        float myFloat = 2.7f;
        double myDouble = 6.5;

        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);
    }


    // work 2

    static {
        double a = 27.12;
        long b = 987_678_965_549L;
        float c = 2.786f;
        int d = 569;
        short e = -159;
        long f = 27897;
        byte g = 67;
    }



    // work 3

    static {
        int studentsLuda = 23;
        int studentsAnna = 27;
        int studentsKaty = 30;
        int totalSheets = 480;

        int totalStudents = studentsLuda + studentsAnna + studentsKaty;
        int sheetsForStudents = totalSheets / totalStudents;

        System.out.println("На каждого ученика рассчитано " + sheetsForStudents + " листов бумаги");
    }



//work 4

    static {
        int bottlesMinute = 8;
        int minutesInDay = 1440;
        int minutesIn3Day = 3 * minutesInDay;
        int minutesInMonth = 30 * minutesInDay;

        int bottlesIn20Minutes = bottlesMinute * 20;
        int bottlesInDay = bottlesMinute * minutesInDay;
        int bottlesIn3Day = bottlesMinute * minutesInDay * 3;
        int bottlesInMonth = bottlesMinute * minutesInDay * 30;

        System.out.println("За 20 минут машина производит " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина производит " + bottlesInDay + " штук бутылок");
        System.out.println("За 3 дня машина производит " + bottlesIn3Day + " штук бутылок");
        System.out.println("За месяц машина производит " + bottlesInMonth + " штук бутылок");
    }


// work 5

static {
    int totalCans = 120;
    int WhiteCansForClass = 2;
    int BrownCansForClass = 4;

    int totalClasses = totalCans / (BrownCansForClass + WhiteCansForClass);
    int totalWhiteCans = totalClasses * WhiteCansForClass;
    int totalBrownCans = totalClasses * BrownCansForClass;

    System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");
}

// work 6

static {
    int bananas = 5;
    int bananasWeighsGramm = 80;
    int milk = 200;
    double iceCreamWeighsGramm = 2 * 100;
    int eggs = 4;
    int eggsGramm = 70;

    int totalWeight = (bananas * bananasWeighsGramm) + (milk * 105 / 100) + (int) iceCreamWeighsGramm + (eggs * eggsGramm);
    double totalWeightInKg = totalWeight / 1000.0;

    System.out.println("Общий вес завтрака составляет грамм " + totalWeight + " в кг " +  totalWeightInKg);
}

// work 7

static {
    int GoalLossWeightKg = 7;
    double dailyLowGoalLossWeightKg = 0.25;
    double dailyHighGoalLossWeightKg = 0.5;

    int LowDays = (int) (GoalLossWeightKg / dailyLowGoalLossWeightKg);
    int HighDays = (int) (GoalLossWeightKg / dailyHighGoalLossWeightKg);
    int AverageDays = (LowDays + HighDays) / 2;

    System.out.println("Для похудения на " + GoalLossWeightKg + " кг при потере веса " +  dailyLowGoalLossWeightKg + " кг в день нужно " + LowDays + " дней");
    System.out.println("Для похудения на " + GoalLossWeightKg + " кг при потере веса " +  dailyHighGoalLossWeightKg + " кг в день нужно " + HighDays + " дней");
    System.out.println("В среднем потребуется " + AverageDays + " дней для похудения на " +  GoalLossWeightKg + " кг ");
}

    // work 8

    static {
    int mashaSalary = 67760;
    int denisSalary = 83690;
    int kristinaSalary = 76230;

    int mashaNewSalary = mashaSalary / 10 + mashaSalary;
    int denisNewSalary = denisSalary / 10 + denisSalary;
    int kristinaNewSalary = kristinaSalary / 10 + kristinaSalary;

    int mashaAnnualIncomeBefore = mashaSalary * 12;
    int denisAnnualIncomeBefore = denisSalary * 12;
    int kristinaAnnualIncomeBefore = kristinaSalary * 12;

    int mashaAnnualIncomeAfter = mashaNewSalary * 12;
    int denisAnnualIncomeAfter = denisNewSalary * 12;
    int kristinaAnnualIncomeAfter = kristinaNewSalary * 12;

    System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + (mashaAnnualIncomeAfter - mashaAnnualIncomeBefore) + " рублей");
    System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + (denisAnnualIncomeAfter - denisAnnualIncomeBefore) + " рублей");
    System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + (kristinaAnnualIncomeAfter - kristinaAnnualIncomeBefore) + " рублей");
    }
}

