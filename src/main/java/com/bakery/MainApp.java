package com.bakery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Oven.class)
                .addAnnotatedClass(RawMaterial.class)
                .addAnnotatedClass(Baking.class)
                .addAnnotatedClass(BakingMaterial.class)
                .buildSessionFactory();

        try (Session session = factory.openSession()) {
            session.beginTransaction();

            Oven ovenPodova = new Oven("Подова", 80);
            Oven ovenRotatsiyna = new Oven("Ротаційна", 120);
            Oven ovenKonvektsiyna = new Oven("Конвекційна", 40);

            session.save(ovenPodova);
            session.save(ovenRotatsiyna);
            session.save(ovenKonvektsiyna);

            RawMaterial matRyeFlour = new RawMaterial("Борошно житнє", "кг", "Сухе приміщення");
            RawMaterial matWheatFlour = new RawMaterial("Борошно пшеничне", "кг", "Сухе приміщення");
            RawMaterial matOatFlakes = new RawMaterial("Пластівці вівсяні", "кг", "Сухе приміщення");
            RawMaterial matSugar = new RawMaterial("Цукор", "кг", "Сухе приміщення");
            RawMaterial matYeast = new RawMaterial("Дріжджі пресовані", "кг", "Холодильник");
            RawMaterial matButter = new RawMaterial("Масло вершкове", "кг", "Холодильник");

            session.save(matRyeFlour);
            session.save(matWheatFlour);
            session.save(matOatFlakes);
            session.save(matSugar);
            session.save(matYeast);
            session.save(matButter);

            Baking b2501 = new Baking(2501, LocalDate.parse("2026-09-01"), "Житній хліб", ovenPodova);
            Baking b2502 = new Baking(2502, LocalDate.parse("2026-09-01"), "Багет", ovenRotatsiyna);
            Baking b2503 = new Baking(2503, LocalDate.parse("2026-09-02"), "Здобна булочка", ovenKonvektsiyna);
            Baking b2504 = new Baking(2504, LocalDate.parse("2026-09-02"), "Вівсяне печиво", ovenPodova);
            Baking b2505 = new Baking(2505, LocalDate.parse("2026-09-03"), "Житній хліб", ovenRotatsiyna);
            Baking b2506 = new Baking(2506, LocalDate.parse("2026-09-03"), "Багет", ovenKonvektsiyna);
            Baking b2507 = new Baking(2507, LocalDate.parse("2026-09-04"), "Здобна булочка", ovenPodova);
            Baking b2508 = new Baking(2508, LocalDate.parse("2026-09-04"), "Вівсяне печиво", ovenRotatsiyna);
            Baking b2509 = new Baking(2509, LocalDate.parse("2026-09-05"), "Житній хліб", ovenKonvektsiyna);
            Baking b2510 = new Baking(2510, LocalDate.parse("2026-09-05"), "Багет", ovenPodova);
            Baking b2511 = new Baking(2511, LocalDate.parse("2026-09-06"), "Здобна булочка", ovenRotatsiyna);
            Baking b2512 = new Baking(2512, LocalDate.parse("2026-09-06"), "Вівсяне печиво", ovenKonvektsiyna);

            session.save(b2501);
            session.save(b2502);
            session.save(b2503);
            session.save(b2504);
            session.save(b2505);
            session.save(b2506);
            session.save(b2507);
            session.save(b2508);
            session.save(b2509);
            session.save(b2510);
            session.save(b2511);
            session.save(b2512);

            session.save(new BakingMaterial(b2501, matRyeFlour, 18.0f));
            session.save(new BakingMaterial(b2501, matYeast, 1.0f));
            session.save(new BakingMaterial(b2502, matWheatFlour, 19.0f));
            session.save(new BakingMaterial(b2502, matYeast, 1.15f));
            session.save(new BakingMaterial(b2503, matWheatFlour, 20.0f));
            session.save(new BakingMaterial(b2503, matButter, 1.3f));
            session.save(new BakingMaterial(b2504, matOatFlakes, 21.0f));
            session.save(new BakingMaterial(b2504, matSugar, 1.45f));
            session.save(new BakingMaterial(b2505, matRyeFlour, 22.0f));
            session.save(new BakingMaterial(b2505, matYeast, 1.6f));
            session.save(new BakingMaterial(b2506, matWheatFlour, 23.0f));
            session.save(new BakingMaterial(b2506, matYeast, 1.75f));
            session.save(new BakingMaterial(b2507, matWheatFlour, 24.0f));
            session.save(new BakingMaterial(b2507, matButter, 1.9f));
            session.save(new BakingMaterial(b2508, matOatFlakes, 25.0f));
            session.save(new BakingMaterial(b2508, matSugar, 2.05f));
            session.save(new BakingMaterial(b2509, matRyeFlour, 26.0f));
            session.save(new BakingMaterial(b2509, matYeast, 2.2f));
            session.save(new BakingMaterial(b2510, matWheatFlour, 27.0f));
            session.save(new BakingMaterial(b2510, matYeast, 2.35f));
            session.save(new BakingMaterial(b2511, matWheatFlour, 28.0f));
            session.save(new BakingMaterial(b2511, matButter, 2.5f));
            session.save(new BakingMaterial(b2512, matOatFlakes, 29.0f));
            session.save(new BakingMaterial(b2512, matSugar, 2.65f));

            session.getTransaction().commit();
            System.out.println("Дані пекарні успішно збережено!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (Session session = factory.openSession()) {
            session.beginTransaction();

            String hql = "SELECT new com.bakery.BakingInfoDTO(" +
                    "b.bakingNumber, b.bakingDate, b.productName, " +
                    "o.ovenName, o.capicityKg, " +
                    "rm.materialName, rm.unitOfMeasure, rm.storageConditions, " +
                    "bm.actualQuantity) " +
                    "FROM BakingMaterial bm " +
                    "JOIN bm.baking b " +
                    "JOIN b.oven o " +
                    "JOIN bm.rawMaterial rm " +
                    "ORDER BY b.bakingNumber ASC, bm.actualQuantity DESC";

            List<BakingInfoDTO> results = session.createQuery(hql, BakingInfoDTO.class).getResultList();

            for (BakingInfoDTO info : results) {
                System.out.println("Номер випікання: " + info.getBakingNumber());
                System.out.println("Дата випікання: " + info.getBakingDate());
                System.out.println("Виріб: " + info.getProductName());
                System.out.println("Піч: " + info.getOvenName());
                System.out.println("Місткість печі, кг: " + info.getCapicityKg());
                System.out.println("Сировина: " + info.getMaterialName());
                System.out.println("Одиниця виміру: " + info.getUnitOfMeasure());
                System.out.println("Умови зберігання: " + info.getStorageConditions());
                System.out.println("Фактична кількість: " + info.getActualQuantity());
                System.out.println("--------------------------------------------------");
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }
}