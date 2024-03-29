package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 0;
        expected = 0;
        out = Converter.rubleToEuro(in);
        passed = expected == out;
        System.out.println("0 rubles are 0. Test result : " + passed);
        in = 140;
        expected = 2.3333333f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2.3333333. Test result : " + passed);
        in = 0;
        expected = 0;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("0 rubles are 0. Test result : " + passed);
    }
}
