public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача №1");
        int age1 = 18;

        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }


        // Задача 2
        System.out.println("\nЗадача №2");
        int temperature = 3;

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }


        // Задача 3
        System.out.println("\nЗадача №3");
        int speed = 65;

        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }


        // Задача 4
        System.out.println("\nЗадача №4");
        int age4 = 10;

        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
        } else if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
        } else if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет");
        } else if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу");
        }


        // Задача 5
        System.out.println("\nЗадача №5");
        int childAge = 12;

        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }


        // Задача 6
        System.out.println("\nЗадача №6");
        int currentPassengers = 80;
        int sittingCapacity = 60;
        int totalCapacity = 102;

        if (currentPassengers < sittingCapacity) {
            System.out.println("В вагоне есть сидячие места");
        } else if (currentPassengers >= sittingCapacity && currentPassengers < totalCapacity) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("Вагон уже полностью забит");
        }

        // Задача 7
        System.out.println("\nЗадача №7");
        int one = 15;
        int two = 25;
        int three = 10;

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}