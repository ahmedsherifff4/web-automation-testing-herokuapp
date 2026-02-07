# 🧪 Web Automation Testing Framework

## 📌 Overview
A professional **Web Automation Testing project** using **Java, Selenium WebDriver, and TestNG**.  
The project automates testing for various web pages including forms, alerts, checkboxes, dropdowns, and dynamic loading elements.  
It follows the **Page Object Model (POM)** design pattern for maintainability and scalability.  

---

## 🛠️ Tools & Technologies
- **Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **Test Framework:** TestNG  
- **Build Tool:** Maven  
- **Design Pattern:** Page Object Model (POM)  
- **Optional:** Cucumber for BDD (Step Definitions included)  
- **IDE:** IntelliJ IDEA  

---

### **BaseTest**  
- [`BaseTestClass.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/BaseTest/BaseTestClass.java) – Base class for test initialization  

- [`HooksPackeg/`](#) – Optional hooks (currently empty)  

### **Pages**  
- [`AddRemovePage.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/Pages/AddRemovePage.java)  
- [`AlertsPage.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/Pages/AlertsPage.java)  
- [`CheckBoxPage.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/Pages/CheckBoxPage.java)  
- [`DropDownPage.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/Pages/DropDownPage.java)  
- [`DynamicLoadingPage.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/Pages/DropDownPage.java)  
- [`FormAuthPage.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/Pages/FormAuthPage.java)  
- [`HomePage.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/Pages/HomePage.java)  
- [`SecureAreaPage.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/Pages/SecureAreaPage.java)  

### **Run**  
- [`Runner.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/Run/Runner.java) – Test runner  

### **StepDefinitions**  
- [`Alerts_StepDef.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/StepDefinitions/Alerts_StepDef.java)  
- [`Login_StepDef.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/StepDefinitions/Login_stepDef.java)  

### **Tests**  
- [`AddRemoveTest.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/Tests/AddRemoveTest.java)  
- [`AlertsTests.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/Tests/AlertsTests.java)  
- [`CheckBoxTest.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/Tests/CheckBoxTest.java)  
- [`DropDownTest.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/Tests/DropDownTest.java)  
- [`DynamicLoadingTest.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/Tests/DynamicLoadingTest.java)  
- [`FormAuthTest.java`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/0f1c81a18896f85f33f2d8c2a0a3aa9e2af8ac06/src/test/java/Tests/FormAuthTest.java)  

### **Configuration & Build**  
- [`pom.xml`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/7d85a2dc14bbbe39e24c542e7a0aa9fcc6949b8a/pom.xml) – Maven dependencies  
- [`testng.xml`](https://github.com/ahmedsherifff4/web-automation-testing-herokuapp/blob/7d85a2dc14bbbe39e24c542e7a0aa9fcc6949b8a/testng.xml) – TestNG Suite configuration  
- [`.gitignore`](#) – Ignored files  

> **Ignored files/folders:** `target/`, `test-output/`, `.idea/`, `*.iml`  

---

## ✅ Test Coverage

### Add/Remove Elements
- Add multiple elements
- Remove selected elements
- [`AddRemoveTest.java`](#) for implementation

### Alerts
- Validate JS Alert, Confirm, and Prompt dialogs
- Accept, Dismiss, and Send Keys
- [`AlertsTests.java`](#) for implementation

### Checkboxes
- Verify checkbox selection for multiple checkboxes
- Validate state changes
- [`CheckBoxTest.java`](#) for implementation

### Dropdowns
- Select options by value, text, and index
- [`DropDownTest.java`](#) for implementation

### Dynamic Loading
- Validate content loading using Example One and Example Two pages
- Test implicit and explicit waits
- [`DynamicLoadingTest.java`](#) for implementation

### Form Authentication
- Validate login with valid credentials
- Validate login with invalid username/password
- Verify error messages and secure area content
- [`FormAuthTest.java`](#) for implementation

---

## 🚀 How to Run Tests

### Option 1: Run via IntelliJ
1. Open project in **IntelliJ IDEA**.
2. Ensure **Maven dependencies** are downloaded (`pom.xml` → right click → Maven → Reimport).
3. Run tests:
   - Right-click on any **TestNG test class** → Run  
   - Or right-click on **testng.xml** → Run (to run all tests)

### Option 2: Run via Command Line
1. Open terminal at project root.
2. Execute:
```bash
mvn test

