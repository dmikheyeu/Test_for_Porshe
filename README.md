UI фреймворк на основе selenide. 
Отчет в виде Allure.
Для запуска нужно:
JDK 1.8.*
maven 3.6.3
allureСomandLine

Запуск всех тестов: mvn clean test
![img_2.png](img_2.png)
Получение отчета: mvn allure:serve
Или "allure report" -allureComandLine
![img.png](img.png)
![img_1.png](img_1.png)
остановить чтение "CTRL+C"