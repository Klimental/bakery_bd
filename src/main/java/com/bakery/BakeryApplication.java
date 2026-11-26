package com.bakery;

import com.opencsv.CSVReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.nio.charset.StandardCharsets;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Додаток для редагування бази даних пекарні.
 */
@SpringBootApplication
public class BakeryApplication implements CommandLineRunner {

    @Autowired
    private BakingRepository bakingRepository;

    public static void main(String[] args) {
        SpringApplication.run(BakeryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Додати випікання з CSV-файлу");
            System.out.println("2. Подивитись випікання");
            System.out.println("3. Видалити випікання");
            System.out.println("4. Вихід");
            System.out.print("Введіть номер команди (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBakingsFromCsv();
                    break;
                case 2:
                    viewAllBakings();
                    break;
                case 3:
                    dropAllBakings();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Номер команди некоректний. Спробуй ще.");
            }
        }
    }

    private void addBakingsFromCsv() {
        try (CSVReader reader = new CSVReader(new InputStreamReader(
                getClass().getClassLoader().getResourceAsStream("bakery_denormalized.csv"),
                StandardCharsets.UTF_8))) {
            List<String[]> records = reader.readAll();

            records.remove(0); // Видалити перший рядок з назвами стовпців

            List<Baking> bakingList = new ArrayList<>();
            for (String[] record : records) {
                Baking baking = new Baking(
                    record[0], // baking_number
                    record[1], // baking_date
                    record[2], // product
                    record[3], // oven
                    record[4], // oven_capacity_kg
                    record[5]  // used_raw_materials
                );

                bakingList.add(baking);
            }

            bakingRepository.saveAll(bakingList);
            System.out.println(bakingList.size() + " документів з рядками про випікання завантажено з CSV.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Не вдалось завантажити рядки про випікання з CSV.");
        }
    }

    private void viewAllBakings() {
        List<Baking> bakings = bakingRepository.findAll();
        if (bakings.isEmpty()) {
            System.out.println("Документи з рядками випікання не знайдено.");
        } else {
            System.out.println("Знайдено " + bakings.size() + " документів випікання:");
            bakings.forEach(System.out::println);
        }
    }

    private void dropAllBakings() {
        bakingRepository.deleteAll();
        System.out.println("Дані про випікання видалено.");
    }
}