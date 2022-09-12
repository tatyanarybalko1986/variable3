public class Main {
    public static void main(String[] args) {
        // Задача 6
        int weightOneBanana = 80;
        int weightMilk100Ml = 105;
        int weightOneIceCream = 100;
        int weightOneEggs = 70;
        int grPerKg = 1000;
        int ingredientsWeight = weightOneBanana * 5 + weightMilk100Ml * 2 + weightOneIceCream * 2 + weightOneEggs * 4;
        System.out.println(" Вес всех ингредиентов " + ingredientsWeight + "грамм");
        int inKilograms = ingredientsWeight / grPerKg;
        System.out.println("вес в килограммах равен" + inKilograms + "кг!");

        // Задача 7
        int weightLoss1PerDay = 250;
        int weightLoss2PerDay = 500;
        int totalWeightLoss = 7000;
        int DaysLoseWeight1 = totalWeightLoss / weightLoss1PerDay;
        System.out.println("DaysLoseWeight1");
        int DaysLoseWeight2 = totalWeightLoss / weightLoss2PerDay;
        System.out.println("DaysLoseWeight2");

        // Задача 8
        int wagesMasha = 67760;
        int wagesDenis = 83690;
        int wagesKristina = 76230;
        int IncomePerYearMasha = wagesMasha * 12;
        int IncomePerYearDenis = wagesDenis * 12;
        int IncomePerYearKristina = wagesKristina * 12;
        double increasedWagesMasha = wagesMasha * 0.1;
        double increasedWagesDenis = wagesDenis * 0.1;
        double increasedWagesKristina = wagesKristina * 0.1;
        double increasedIncomePerYearMasha = increasedWagesMasha * 12;
        double increasedIncomePerYearDenis = increasedWagesDenis * 12;
        double increasedIncomePerYearKristina = increasedWagesKristina * 12;
        double differenceAnnualIncomeMasha = increasedIncomePerYearMasha - IncomePerYearMasha;
        double differenceAnnualIncomeDenis = increasedIncomePerYearDenis - IncomePerYearDenis;
        double differenceAnnualIncomeKristina = increasedIncomePerYearKristina - IncomePerYearKristina;
        System.out.println("Маша теперь получает" + increasedWagesMasha + "рублей" + "Годовой доход вырос на" + differenceAnnualIncomeMasha + "  рублей");
        System.out.println("Денис теперь получает" + increasedWagesDenis + "рублей" + "Годовой доход вырос на" + differenceAnnualIncomeDenis + "  рублей");
        System.out.println("Кристина теперь получает" + increasedWagesKristina + "рублей" + "Годовой доход вырос на" + differenceAnnualIncomeKristina + "  рублей");


    }