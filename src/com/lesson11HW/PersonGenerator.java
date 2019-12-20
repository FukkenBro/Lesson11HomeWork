package com.lesson11HW;

import java.util.Random;

public class PersonGenerator {

    private static Random RANDOM = new Random();

    public static String gender() {
        return genderGenerator();
    }

    public static String name(String gender) {
        return nameGenerator(gender);
    }

    public static int age() {
        return ageAdultGenerator();
    }

    private static String genderGenerator() {
        int i = RANDOM.nextInt(11);
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
            return "Male";
        }
        if (i == 5 || i == 6 || i == 7 || i == 8 || i == 9) {
            return "Female";
        } else {
            return "Other";
        }
    }

    private static String nameGenerator(String gender) {

        String[] namesMaleArrayOne = {"Серг", "Андр", "Пав", "Дан", "Ден", "Ир", "Валер", "Кар", "Пив", "Рост"};
        String[] namesMaleArrayTwo = {"ей", "ел", "ил", "ис", "аклий", "ий", "асик", "анатор", "ас", "ислав", "аслав"};
        String[] namesFemaleArrayOne = {"Ольг", "Анастас", "Мар", "Виктор", "Гал", "Екатер", "Соф"};
        String[] namesFemaleArrayTwo = {"а", "ия", "ина", "ына", "ыла", "элла", "аслава", "ислава"};

        String name = "";
        StringBuilder sb = new StringBuilder(name);

        if (gender.equals("Male")) {
            sb.append(namesMaleArrayOne[RANDOM.nextInt(namesMaleArrayOne.length)]);
            sb.append(namesMaleArrayTwo[RANDOM.nextInt(namesMaleArrayTwo.length)]);
            return sb.toString();
        }
        if (gender.equals("Female")) {
            sb.append(namesFemaleArrayOne[RANDOM.nextInt(namesFemaleArrayOne.length)]);
            sb.append(namesFemaleArrayTwo[RANDOM.nextInt(namesFemaleArrayTwo.length)]);
            return sb.toString();
        }
        if (gender.equals("Other")) {
            int tmp = RANDOM.nextInt(2);
            if (tmp == 1) {
                return nameGenerator("Male");
            }
            if (tmp == 0) {
                return nameGenerator("Female");
            } else return "otherGenderError";
        } else return "nameError";
    }

    public static double weight(double heightMeters) {
        return Math.round((0.634 * heightMeters * 100 - 35.849) * 100) / 100;
    }

    private static int ageAdultGenerator() {
        int age = RANDOM.nextInt(70 - 18) + 18;
        return age;
    }

    public static double height() {
        return heightMetersGenerator();
    }

    private static double heightMetersGenerator() {
        double heightMeters = RANDOM.nextInt(250 - 130) + 130;
        return Math.round(heightMeters * 100.0) / 10000.0;
    }

}
