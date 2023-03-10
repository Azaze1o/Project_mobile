# <img width="5%" title="Jenkins" src="images/logo/Wikipedia.svg"> Дипломный проект по автоматизации тестирования мобильного приложения Wikipedia

##	Содержание

- [Технологии и инструменты](#technologist-технологии-и-инструменты)
- [Реализованныe проверки](#bookmark_tabs-реализованные-проверки)
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Запуск тестов в Jenkins](#-запуск-тестов-в-jenkins)
- [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-Allure-report)
- [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)
- [Пример запуска теста в Browserstack](#-пример-запуска-теста-в-Browserstack)


## :technologist: Технологии и инструменты
<p  align="center">

<code><img width="5%" title="IntelliJ IDEA" src="images/logo/Idea.svg"></code>
<code><img width="5%" title="Java" src="images/logo/Java.svg"></code>
<code><img width="5%" title="Gradle" src="images/logo/Gradle.svg"></code>
<code><img width="5%" title="Junit5" src="images/logo/Junit5.svg"></code>
<code><img width="5%" title="AndroidStudio" src="images/logo/Android-studio.svg"></code>
<code><img width="5%" title="Appium" src="images/logo/Appium.svg"></code>
<code><img width="5%" title="Browserstack" src="images/logo/Browserstack.svg"></code>
<code><img width="5%" title="Allure Report" src="images/logo/Allure.svg"></code>
<code><img width="5%" title="Jenkins" src="images/logo/Jenkins.svg"></code>
<code><img width="5%" title="Telegram" src="images/logo/Telegram.svg"></code>

</p>

## :bookmark_tabs: Реализованные проверки:

- Успешный поиск статьи в приложении
- Добавление нового языка
- Проверка соотвествия страницы статьи, заданным параметрам поиска

## :computer: Запуск тестов из терминала

### Удаленный запуск тестов

```bash
gradle clean test 
-DdeviceHost=remote
```

### Локальный запуск тестов

```bash
gradle clean test
-DdeviceHost=local
```

## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/project_mobile/)

Для запуска сборки необходимо нажать кнопку <code><strong>*Собрать*</strong></code>.

<p align="center">
  <img src="images/screenshot/jenkins.png" alt="Jenkins" width="800">
</p>

После выполнения сборки, в блоке <code><strong>*История сборок*</strong></code> напротив номера сборки появится
значок *Allure Report*, кликнув по которому, откроется страница с сформированным html-отчетом.

## <img width="4%" title="Allure Report" src="images/logo/Allure.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/project_mobile/6/allure/)

<p align="center">
  <img src="images/screenshot/allure-report1.png" alt="allure-report1" width="900">
</p>

<p align="center">
  <img src="images/screenshot/allure-report.png" alt="allure-report" width="900">
</p>


## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота
После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.

<p align="center">
<img title="Telegram Notifications" src="images/screenshot/notification.png">


## <img width="4%" title="Selenoid" src="images/logo/Browserstack.svg"> Пример запуска теста в Browserstack

К каждому тесту в отчете прилагается видео.

На данном видео выполняется:

- Проверка соотвествия страницы статьи заданным параметрам поиска


<p align="center">
  <img title="Browserstack Video" src="images/gif/mobile_test.gif">
</p>