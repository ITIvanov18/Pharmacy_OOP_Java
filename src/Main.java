import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pharmacy> pharmacies = new ArrayList<>();

        while (true) {
            System.out.println("Меню");
            System.out.println("1. Въведете информация");
            System.out.println("2. Покажи всички данни");
            System.out.println("3. Покажи всички лекарства със зададената им цена и посочен производител");
            System.out.println("4. Покажи всички лекарства, внесени от посочен вносител");
            System.out.println("5. Покажи списък с всички вносители");
            System.out.println("6. Изход");
            System.out.println();
            System.out.print("Изберете опция от менюто: ");
            int n = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.println();
                    pharmacies.add(insertData(scanner));
                    break;
                case 2:
                    System.out.println();
                    printData(pharmacies);
                    break;
                case 3:
                    System.out.println();
                    printAllMedicinesWithPriceAndSpecificProvider(pharmacies, scanner);
                    break;
                case 4:
                    System.out.println();
                    printAllMedicinesWithSpecificImporter(pharmacies, scanner);
                    break;
                case 5:
                    System.out.println();
                    printAllImporters(pharmacies);
                    break;
                case 6:
                    exit(0);
                    break;
                default:
                    System.out.println("Невалидни входни параметри");
                    break;
            }
        }
    }

    public static void printAllMedicinesWithPriceAndSpecificProvider(ArrayList<Pharmacy> pharmacies, Scanner sc) {

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();

        String nothing = sc.nextLine();

        System.out.println();
        System.out.println("Въведте цена: ");
        double price = sc.nextDouble();
        System.out.println();
        String nothing1 = sc.nextLine();
        System.out.println("Въведете име на производител: ");
        String name = sc.nextLine();

        for (Pharmacy d : pharmacies) {
            if(d.getManufacturer().getName().equals(name)) {
                if(d.getMedicine().getPrice() < price) {
                    newPharmacies.add(d);
                }
            }
        }

        for (Pharmacy d : newPharmacies) {
            System.out.println(d.getMedicine().toString());
        }
    }

    public static void printAllMedicinesWithSpecificImporter(ArrayList<Pharmacy> pharmacies, Scanner sc) {

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();

        String nothing = sc.nextLine();

        System.out.println();
        System.out.println("Въведете име на вносител: ");
        String name = sc.nextLine();

        for (Pharmacy d : pharmacies) {
            if(d.getImporter().getName().equals(name)) {
                newPharmacies.add(d);
            }
        }

        for (Pharmacy d : newPharmacies) {
            System.out.println(d.getMedicine().toString());
        }
    }

    public static void printData(ArrayList<Pharmacy> pharmacies) {
        System.out.println("Покажи всички данни!");
        for (Pharmacy h : pharmacies) {
            System.out.println(h.toString());
        }
    }

    public static void printAllImporters(ArrayList<Pharmacy> pharmacies) {
        System.out.println("Информация относно всички вносители!");
        for (Pharmacy h : pharmacies) {
            System.out.println(h.getManufacturer().toString());
        }
    }

    public static Pharmacy insertData(Scanner scanner) {
        return new Pharmacy();
    }
}