# База даних пекарні (bakery_bd)

Клієнтський застосунок на Java з використанням Hibernate ORM та PostgreSQL.

## Результати виконання програми

```text
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< com.bakery:bakery_bd >------------------------
[INFO] Building bakery-app 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- exec:3.7.0:java (default-cli) @ bakery_bd ---
Hibernate: 
    
    alter table baking_materials 
       drop constraint FK7t2gs44jix6sq9uua8ummcbsi
Hibernate: 
    
    alter table baking_materials 
       drop constraint FKbd3haqibcks05endvgttdug6j
Hibernate: 
    
    alter table bakings 
       drop constraint FKqdo3wkwewitwpb0ooi1kkrht1
Hibernate: 
    
    drop table if exists baking_materials cascade
Hibernate: 
    
    drop table if exists bakings cascade
Hibernate: 
    
    drop table if exists ovens cascade
Hibernate: 
    
    drop table if exists raw_materials cascade
Hibernate: 
    
    create table baking_materials (
       baking_number int4 not null,
        material_name varchar(255) not null,
        actual_quantity float4,
        primary key (baking_number, material_name)
    )
Hibernate: 
    
    create table bakings (
       baking_number int4 not null,
        baking_date date,
        product_name varchar(100),
        oven_name varchar(100),
        primary key (baking_number)
    )
Hibernate: 
    
    create table ovens (
       oven_name varchar(100) not null,
        capicity_kg int4,
        primary key (oven_name)
    )
Hibernate: 
    
    create table raw_materials (
       material_name varchar(100) not null,
        storage_conditions varchar(100),
        unit_of_measure varchar(100),
        primary key (material_name)
    )
Hibernate: 
    
    alter table baking_materials 
       add constraint FK7t2gs44jix6sq9uua8ummcbsi 
       foreign key (baking_number) 
       references bakings
Hibernate: 
    
    alter table baking_materials 
       add constraint FKbd3haqibcks05endvgttdug6j 
       foreign key (material_name) 
       references raw_materials
Hibernate: 
    
    alter table bakings 
       add constraint FKqdo3wkwewitwpb0ooi1kkrht1 
       foreign key (oven_name) 
       references ovens
Hibernate: 
    insert 
    into
        ovens
        (capicity_kg, oven_name) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        ovens
        (capicity_kg, oven_name) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        ovens
        (capicity_kg, oven_name) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        raw_materials
        (storage_conditions, unit_of_measure, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        raw_materials
        (storage_conditions, unit_of_measure, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        raw_materials
        (storage_conditions, unit_of_measure, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        raw_materials
        (storage_conditions, unit_of_measure, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        raw_materials
        (storage_conditions, unit_of_measure, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        raw_materials
        (storage_conditions, unit_of_measure, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        bakings
        (baking_date, oven_name, product_name, baking_number) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        bakings
        (baking_date, oven_name, product_name, baking_number) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        bakings
        (baking_date, oven_name, product_name, baking_number) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        bakings
        (baking_date, oven_name, product_name, baking_number) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        bakings
        (baking_date, oven_name, product_name, baking_number) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        bakings
        (baking_date, oven_name, product_name, baking_number) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        bakings
        (baking_date, oven_name, product_name, baking_number) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        bakings
        (baking_date, oven_name, product_name, baking_number) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        bakings
        (baking_date, oven_name, product_name, baking_number) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        bakings
        (baking_date, oven_name, product_name, baking_number) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        bakings
        (baking_date, oven_name, product_name, baking_number) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        bakings
        (baking_date, oven_name, product_name, baking_number) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        baking_materials
        (actual_quantity, baking_number, material_name) 
    values
        (?, ?, ?)
Дані пекарні успішно збережено!
Hibernate: 
    select
        baking1_.baking_number as col_0_0_,
        baking1_.baking_date as col_1_0_,
        baking1_.product_name as col_2_0_,
        oven2_.oven_name as col_3_0_,
        oven2_.capicity_kg as col_4_0_,
        rawmateria3_.material_name as col_5_0_,
        rawmateria3_.unit_of_measure as col_6_0_,
        rawmateria3_.storage_conditions as col_7_0_,
        bakingmate0_.actual_quantity as col_8_0_ 
    from
        baking_materials bakingmate0_ 
    inner join
        bakings baking1_ 
            on bakingmate0_.baking_number=baking1_.baking_number 
    inner join
        ovens oven2_ 
            on baking1_.oven_name=oven2_.oven_name 
    inner join
        raw_materials rawmateria3_ 
            on bakingmate0_.material_name=rawmateria3_.material_name 
    order by
        baking1_.baking_number ASC,
        bakingmate0_.actual_quantity DESC
Номер випікання: 2501
Дата випікання: 2026-09-01
Виріб: Житній хліб
Піч: Подова
Місткість печі, кг: 80
Сировина: Борошно житнє
Одиниця виміру: кг
Умови зберігання: Сухе приміщення
Фактична кількість: 18.0
--------------------------------------------------
Номер випікання: 2501
Дата випікання: 2026-09-01
Виріб: Житній хліб
Піч: Подова
Місткість печі, кг: 80
Сировина: Дріжджі пресовані
Одиниця виміру: кг
Умови зберігання: Холодильник
Фактична кількість: 1.0
--------------------------------------------------
Номер випікання: 2502
Дата випікання: 2026-09-01
Виріб: Багет
Піч: Ротаційна
Місткість печі, кг: 120
Сировина: Борошно пшеничне
Одиниця виміру: кг
Умови зберігання: Сухе приміщення
Фактична кількість: 19.0
--------------------------------------------------
Номер випікання: 2502
Дата випікання: 2026-09-01
Виріб: Багет
Піч: Ротаційна
Місткість печі, кг: 120
Сировина: Дріжджі пресовані
Одиниця виміру: кг
Умови зберігання: Холодильник
Фактична кількість: 1.15
--------------------------------------------------
Номер випікання: 2503
Дата випікання: 2026-09-02
Виріб: Здобна булочка
Піч: Конвекційна
Місткість печі, кг: 40
Сировина: Борошно пшеничне
Одиниця виміру: кг
Умови зберігання: Сухе приміщення
Фактична кількість: 20.0
--------------------------------------------------
Номер випікання: 2503
Дата випікання: 2026-09-02
Виріб: Здобна булочка
Піч: Конвекційна
Місткість печі, кг: 40
Сировина: Масло вершкове
Одиниця виміру: кг
Умови зберігання: Холодильник
Фактична кількість: 1.3
--------------------------------------------------
Номер випікання: 2504
Дата випікання: 2026-09-02
Виріб: Вівсяне печиво
Піч: Подова
Місткість печі, кг: 80
Сировина: Пластівці вівсяні
Одиниця виміру: кг
Умови зберігання: Сухе приміщення
Фактична кількість: 21.0
--------------------------------------------------
Номер випікання: 2504
Дата випікання: 2026-09-02
Виріб: Вівсяне печиво
Піч: Подова
Місткість печі, кг: 80
Сировина: Цукор
Одиниця виміру: кг
Умови зберігання: Сухе приміщення
Фактична кількість: 1.45
--------------------------------------------------
Номер випікання: 2505
Дата випікання: 2026-09-03
Виріб: Житній хліб
Піч: Ротаційна
Місткість печі, кг: 120
Сировина: Борошно житнє
Одиниця виміру: кг
Умови зберігання: Сухе приміщення
Фактична кількість: 22.0
--------------------------------------------------
Номер випікання: 2505
Дата випікання: 2026-09-03
Виріб: Житній хліб
Піч: Ротаційна
Місткість печі, кг: 120
Сировина: Дріжджі пресовані
Одиниця виміру: кг
Умови зберігання: Холодильник
Фактична кількість: 1.6
--------------------------------------------------
Номер випікання: 2506
Дата випікання: 2026-09-03
Виріб: Багет
Піч: Конвекційна
Місткість печі, кг: 40
Сировина: Борошно пшеничне
Одиниця виміру: кг
Умови зберігання: Сухе приміщення
Фактична кількість: 23.0
--------------------------------------------------
Номер випікання: 2506
Дата випікання: 2026-09-03
Виріб: Багет
Піч: Конвекційна
Місткість печі, кг: 40
Сировина: Дріжджі пресовані
Одиниця виміру: кг
Умови зберігання: Холодильник
Фактична кількість: 1.75
--------------------------------------------------
Номер випікання: 2507
Дата випікання: 2026-09-04
Виріб: Здобна булочка
Піч: Подова
Місткість печі, кг: 80
Сировина: Борошно пшеничне
Одиниця виміру: кг
Умови зберігання: Сухе приміщення
Фактична кількість: 24.0
--------------------------------------------------
Номер випікання: 2507
Дата випікання: 2026-09-04
Виріб: Здобна булочка
Піч: Подова
Місткість печі, кг: 80
Сировина: Масло вершкове
Одиниця виміру: кг
Умови зберігання: Холодильник
Фактична кількість: 1.9
--------------------------------------------------
Номер випікання: 2508
Дата випікання: 2026-09-04
Виріб: Вівсяне печиво
Піч: Ротаційна
Місткість печі, кг: 120
Сировина: Пластівці вівсяні
Одиниця виміру: кг
Умови зберігання: Сухе приміщення
Фактична кількість: 25.0
--------------------------------------------------
Номер випікання: 2508
Дата випікання: 2026-09-04
Виріб: Вівсяне печиво
Піч: Ротаційна
Місткість печі, кг: 120
Сировина: Цукор
Одиниця виміру: кг
Умови зберігання: Сухе приміщення
Фактична кількість: 2.05
--------------------------------------------------
Номер випікання: 2509
Дата випікання: 2026-09-05
Виріб: Житній хліб
Піч: Конвекційна
Місткість печі, кг: 40
Сировина: Борошно житнє
Одиниця виміру: кг
Умови зберігання: Сухе приміщення
Фактична кількість: 26.0
--------------------------------------------------
Номер випікання: 2509
Дата випікання: 2026-09-05
Виріб: Житній хліб
Піч: Конвекційна
Місткість печі, кг: 40
Сировина: Дріжджі пресовані
Одиниця виміру: кг
Умови зберігання: Холодильник
Фактична кількість: 2.2
--------------------------------------------------
Номер випікання: 2510
Дата випікання: 2026-09-05
Виріб: Багет
Піч: Подова
Місткість печі, кг: 80
Сировина: Борошно пшеничне
Одиниця виміру: кг
Умови зберігання: Сухе приміщення
Фактична кількість: 27.0
--------------------------------------------------
Номер випікання: 2510
Дата випікання: 2026-09-05
Виріб: Багет
Піч: Подова
Місткість печі, кг: 80
Сировина: Дріжджі пресовані
Одиниця виміру: кг
Умови зберігання: Холодильник
Фактична кількість: 2.35
--------------------------------------------------
Номер випікання: 2511
Дата випікання: 2026-09-06
Виріб: Здобна булочка
Піч: Ротаційна
Місткість печі, кг: 120
Сировина: Борошно пшеничне
Одиниця виміру: кг
Умови зберігання: Сухе приміщення
Фактична кількість: 28.0
--------------------------------------------------
Номер випікання: 2511
Дата випікання: 2026-09-06
Виріб: Здобна булочка
Піч: Ротаційна
Місткість печі, кг: 120
Сировина: Масло вершкове
Одиниця виміру: кг
Умови зберігання: Холодильник
Фактична кількість: 2.5
--------------------------------------------------
Номер випікання: 2512
Дата випікання: 2026-09-06
Виріб: Вівсяне печиво
Піч: Конвекційна
Місткість печі, кг: 40
Сировина: Пластівці вівсяні
Одиниця виміру: кг
Умови зберігання: Сухе приміщення
Фактична кількість: 29.0
--------------------------------------------------
Номер випікання: 2512
Дата випікання: 2026-09-06
Виріб: Вівсяне печиво
Піч: Конвекційна
Місткість печі, кг: 40
Сировина: Цукор
Одиниця виміру: кг
Умови зберігання: Сухе приміщення
Фактична кількість: 2.65
--------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.921 s
[INFO] Finished at: 2026-11-25T15:12:36+02:00
[INFO] ------------------------------------------------------------------------
```
