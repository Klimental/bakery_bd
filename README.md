# Клієнт бази даних пекарні (MongoDB)

## Результати виконання програми

```text
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------< com.bakery:bakery-db >------------------------
[INFO] Building bakery-app 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- exec:3.7.0:java (default-cli) @ bakery-db ---

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.4)

2026-11-26 09:09:09.141  INFO 20568 --- [lication.main()] com.bakery.BakeryApplication             : Starting BakeryApplication using Java 17.0.21 on Workspace_Yan with PID 20568 (C:\Users\yyanc\Projects\bakery_bd\target\classes started by yyanc in C:\Users\yyanc\Projects\bakery_bd)
2026-11-26 09:09:09.144  INFO 20568 --- [lication.main()] com.bakery.BakeryApplication             : No active profile set, falling back to default profiles: default
2026-11-26 09:09:09.471  INFO 20568 --- [lication.main()] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data MongoDB repositories in DEFAULT mode.
2026-11-26 09:09:09.521  INFO 20568 --- [lication.main()] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 45 ms. Found 1 MongoDB repository interfaces.
2026-11-26 09:09:09.842  INFO 20568 --- [lication.main()] org.mongodb.driver.cluster               : Cluster created with settings {hosts=[localhost:27017], mode=SINGLE, requiredClusterType=UNKNOWN, serverSelectionTimeout='30000 ms'}
2026-11-26 09:09:09.907  INFO 20568 --- [localhost:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:2, serverValue:19}] to localhost:27017
2026-11-26 09:09:09.907  INFO 20568 --- [localhost:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:1, serverValue:18}] to localhost:27017
2026-11-26 09:09:09.908  INFO 20568 --- [localhost:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=localhost:27017, type=STANDALONE, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=25, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=17913800}
2026-11-26 09:09:10.160  INFO 20568 --- [lication.main()] com.bakery.BakeryApplication             : Started BakeryApplication in 1.395 seconds (JVM running for 4.705)
1. Додати випікання з CSV-файлу
2. Подивитись випікання
3. Видалити випікання
4. Вихід
Введіть номер команди (1-4): 1
2026-11-26 09:09:27.903  INFO 20568 --- [lication.main()] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:3, serverValue:20}] to localhost:27017
12 документів з рядками про випікання завантажено з CSV.
1. Додати випікання з CSV-файлу
2. Подивитись випікання
3. Видалити випікання
4. Вихід
Введіть номер команди (1-4): 2
Знайдено 24 документів випікання:
Baking { id="6b07daf9ffa0791cc950ed2b"
 bakingNumber="2501"
 bakingDate="2026-09-01"
 product="Житній хліб"
 oven="Подова"
 ovenCapacityKg="80"
 usedRawMaterials="Борошно житнє / кг / Сухе приміщення / 18
Дріжджі пресовані / кг / Холодильник / 1"
}
...
Baking { id="6b07db279b8a5b14cba02bea"
 bakingNumber="2512"
 bakingDate="2026-09-06"
 product="Вівсяне печиво"
 oven="Конвекційна"
 ovenCapacityKg="40"
 usedRawMaterials="Пластівці вівсяні / кг / Сухе приміщення / 29
Цукор / кг / Сухе приміщення / 2.65"
}
1. Додати випікання з CSV-файлу
2. Подивитись випікання
3. Видалити випікання
4. Вихід
Введіть номер команди (1-4): 3
Дані про випікання видалено.
1. Додати випікання з CSV-файлу
2. Подивитись випікання
3. Видалити випікання
4. Вихід
Введіть номер команди (1-4): 1
12 документів з рядками про випікання завантажено з CSV.
1. Додати випікання з CSV-файлу
2. Подивитись випікання
3. Видалити випікання
4. Вихід
Введіть номер команди (1-4): 4
2026-11-26 09:09:36.066  INFO 20568 --- [ionShutdownHook] org.mongodb.driver.connection            : Closed connection [connectionId{localValue:3, serverValue:20}] to localhost:27017 because the pool has been closed.
```