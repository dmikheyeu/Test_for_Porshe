#UI фреймворк на основе selenide. 
Отчет в виде Allure.
# Testing requirements
JDK 1.8.*
maven 3.6.3
allureCommandLine

#Запуск всех тестов: 
mvn clean test
![img_2.png](img_2.png)
#Получение отчета: 
mvn allure:serve
#Или 
"allure report"-allureCommandLine
![img.png](img.png)
![img_1.png](img_1.png)
#остановить чтение "CTRL+C"

#Запуск тестов
В тестах есть 3 статуса : Red Key, Yellow Key и Green Key
src.Legacy.Api.StaticApiMocks.v001.SapYPma5246SkGetRes.xml: 
<STATUS>05</STATUS> - Yellow Key
<STATUS>50</STATUS> - Green Key
<STATUS>98</STATUS> or <STATUS>99</STATUS> - Red Key
Если локально будет статус - Green, то тесты с Yellow и Red - будут падать.