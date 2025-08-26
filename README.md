# 🥒 CucumberTM – Test Automation Framework

A sample **Cucumber BDD automation framework** for testing simple banking operations (Deposit & Withdraw).  
Built with **Java, Maven, JUnit/TestNG, and Cucumber (Gherkin)**.  

---

## 🚀 Features
- BDD scenarios with **Cucumber + Gherkin**
- Step Definitions with Java
- Simple business logic (`Bank.java`) under test
- Maven-based build and test execution
- GitHub Actions CI pipeline

---

## 📂 Project Structure
```
cucumberTM/
 ├── Features/              # Gherkin feature files
 ├── src/main/java/         # Application logic (Bank class)
 ├── src/test/java/steps/   # Step definitions + Runner
 ├── pom.xml                # Maven dependencies
```

---

## ▶️ How to Run Tests
```bash
# Run all tests
mvn test
```

Reports will be generated in the `target/` directory.

---

## 🛠️ Tech Stack
- **Java 17**
- **Maven**
- **Cucumber + Gherkin**
- **JUnit / TestNG**

---

## 📦 CI/CD
This project includes a **GitHub Actions workflow** (`.github/workflows/maven.yml`)  
that builds and runs all tests on each push/PR.
