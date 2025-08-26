# 🥒 CucumberTM – Test Automation Framework

A sample **Cucumber BDD automation framework** for testing simple banking operations (Deposit & Withdraw).  
Built with **Java, Maven, Selenium (optional), JUnit/TestNG, and Cucumber (Gherkin)**.  

---

## 🚀 Features
- BDD scenarios with **Cucumber + Gherkin**  
- Step Definitions with Java  
- Simple business logic (`Bank.java`) under test  
- Maven-based build and test execution  
- GitHub Actions CI pipeline  

---

## 📂 Project Structure

cucumberTM/
├── Features/ # Gherkin feature files
├── src/main/java/ # Application logic (Bank class)
├── src/test/java/steps/ # Step definitions + Runner
├── pom.xml # Maven dependencies


more in depth:

 cucumberTM/
 ├── .github/
 │   └── workflows/
 │       └── maven.yml        # GitHub Actions CI
 ├── .gitignore               # Ignore target/, IDE, reports
 ├── pom.xml                  # Maven config
 ├── README.md                # Project description
 ├── Features/
 │   ├── Deposit.feature
 │   └── Withdraw.feature
 ├── src/
 │   ├── main/java/cucumberTM/cucumberTM/Bank.java
 │   └── test/java/steps/
 │       ├── DepositSteps.java
 │       ├── WithdrawSteps.java
 │       └── Runner.java




 
---

## ▶️ How to Run Tests
```bash
# Run all tests
mvn test


Reports will be generated in the target/ directory.




🛠️ Tech Stack

Java 17

Maven

Cucumber + Gherkin

JUnit / TestNG




📦 CI/CD

This project includes a GitHub Actions workflow (.github/workflows/maven.yml)
that builds and runs all tests on each push/PR.
