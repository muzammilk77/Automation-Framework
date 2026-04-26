# 🚀 Automation Framework (Selenium + Cucumber + TestNG)

## 📌 Project Overview

This project is a **Hybrid Test Automation Framework** built using:

* **Java**
* **Selenium WebDriver**
* **Cucumber (BDD)**
* **TestNG**
* **Maven**

It is designed to automate **UI and functional testing** with a scalable and maintainable architecture.

---

## 🧠 Key Features

* ✅ BDD approach using Cucumber (Gherkin syntax)
* ✅ Page Object Model (POM) design pattern
* ✅ Reusable utilities and common functions
* ✅ TestNG for test execution and reporting
* ✅ Maven for dependency management
* ✅ Easy integration with CI/CD tools (Jenkins, GitHub Actions)

---

## 🏗️ Framework Architecture

```
src/test/java
│
├── stepDefinitions     → Step definition files
├── pageObjects         → Page classes (POM)
├── runners             → Test runner classes
├── utilities           → Reusable methods (Driver, Config, etc.)
│
src/test/resources
│
├── features            → Cucumber feature files
├── config.properties   → Environment configs
```

---

## 🧪 Technologies Used

| Tool/Technology | Purpose              |
| --------------- | -------------------- |
| Java            | Programming language |
| Selenium        | Web automation       |
| Cucumber        | BDD framework        |
| TestNG          | Test execution       |
| Maven           | Build tool           |

---

## ▶️ How to Run Tests

### 🔹 Using Maven

```bash
mvn clean test
```

### 🔹 Using TestNG Runner

* Run `testng.xml`

---

## 📊 Reporting

* Default TestNG reports are generated after execution
* Can be extended with Extent Reports

---

## 📌 Sample Feature File

```gherkin
Feature: Login Functionality

  Scenario: Valid Login
    Given User is on login page
    When User enters valid credentials
    Then User should be logged in successfully
```

---

## 💼 Use Case

This framework is designed for:

* Scalable automation across multiple modules
* Easy maintenance using POM
* Clear collaboration between QA and business using BDD

---

## 🚀 Future Enhancements

* Add Extent Reports for advanced reporting
* Integrate with Jenkins CI/CD pipeline
* Add API automation (Rest Assured)
* Docker execution support

---

## 👨‍💻 Author
Muzammil Khan
Automation Test Engineer
