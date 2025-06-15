
# OrangeHRM Automation Framework

A TestNG-based UI automation framework for testing the [OrangeHRM](https://www.orangehrm.com/) web application using Java, Selenium WebDriver, and Maven, following TDD practices with Page Object Model (POM).

---

## 📦 Tech Stack

- **Language**: Java
- **Build Tool**: Maven
- **Test Framework**: TestNG
- **Automation Tool**: Selenium WebDriver
- **Design Pattern**: Page Object Model (POM)
- **Data Source**: JSON / Excel
- **Reporting**: ExtentReports
- **Retry Logic**: Retry Analyzer
- **Driver Management**: ThreadLocal for parallel execution
- **Browser Support**: Chrome, Firefox, Edge (configurable)
- **Config File**: `credential.property`

---

## 📁 Project Structure

```
src/
│
├── main/
│   └── java/
│       └── com/DemoOrangeHRM/
│           ├── base/            # Base classes for driver, test
│           ├── config/          # Config reader, enums
│           ├── driver/          # DriverManager, factory pattern
│           ├── pages/           # Page Object classes
│           ├── utils/           # Utilities (e.g., PropertyUtils, ExcelUtils)
│
├── test/
│   └── java/
│       └── com/DemoOrangeHRM/tests/   # TestNG test classes
```

### ✅ With browser override:
```bash
mvn clean test -Dbrowser=chrome
```

### ✅ Parallel Test Execution:
Parallel execution is handled using `ThreadLocal` WebDriver and controlled via `testng.xml`.

---

## 🧪 Sample TestNG XML

```xml
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="OrangeHRM Suite" parallel="methods" thread-count="4">
    <test name="Login Tests">
        <parameter name="browser" value="chrome"/>
        <classes>
            <class name="com.DemoOrangeHRM.tests.LoginTest"/>
        </classes>
    </test>
</suite>
```

---

## 🔄 WebDriver Lifecycle

### ✅ When is the driver created?
- In `@BeforeMethod` using a dynamic browser parameter.
- If not passed from CLI or XML, the value is picked from `credential.property`.

### ✅ When is the driver closed?
- In `@AfterMethod`, `driver.quit()` is called and ThreadLocal is cleaned.
- This ensures full test isolation, especially for parallel runs.

---

## 📊 Reports & Logs

- **Extent Report**: Generated in `/extent-reports/` folder.
- **Screenshots**: Captured on failure, embedded into reports.
- **TestNG Reports**: Standard `/test-output/` is available after execution.

---

## 🧰 Utilities

- `PropertyUtils` — Reads from `.property` files
- `ExcelUtils` — For future data-driven tests
- `RetryAnalyzer` — Re-runs failed tests once
- `ListenerClass` — Captures screenshots on test failure

---

## 🛡️ Best Practices Followed

- Page Object Model (POM)
- SINGLE Responsibility per class
- Parallel-safe with ThreadLocal WebDriver
- Screenshot and log capture on failures
- Configurable via Maven or property file
- Lightweight and extensible framework

---

## 📃 License

This project is open-source and for educational/demonstration purposes.
