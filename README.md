# E-commerce Website Search Automation

An automated software testing project designed to demonstrate the automation of a "Search" functionality on an e-commerce website using **Selenium WebDriver**. The script automatically searches for the term *"Laptop"* and verifies that the relevant product results are displayed correctly on the target website.

---

## 👥 Group Members
* **Dhakshina Deshan** - UGC_001/B005-B/0009
* Nurani Kaushalya - UGC_001/B005-B/0002
* Samadhi Hansika - UGC_001/B005-A/0005

---

## 🛠️ Technology Stack & Environment
* **Programming Language:** Java (JDK 21.0.1 LTS)
* **Build Management:** Apache Maven
* **Automation Framework:** Selenium WebDriver (v4.21.0)
* **Browser Engine:** Google Chrome via ChromeDriver
* **IDE:** IntelliJ IDEA

---

## 🚀 Step-by-Step Implementation

### Step 1: Environment Setup
* Validated the system environment variables and confirmed the Java Development Kit (JDK) configuration using the terminal.
* Placed the compatible `chromedriver.exe` in a local system directory (`C:\chromedriver-win64\`) to bridge Selenium commands with the browser engine.

### Step 2: Project Configuration & Dependency Management
* Configured the central `pom.xml` build file inside IntelliJ IDEA.
* Integrated the `selenium-java` dependency to automatically pull and build the required classes on the classpath.

### Step 3: Browser Initialization
* Used `System.setProperty()` to define the execution path for the executable driver.
* Instantiated the `ChromeDriver` class to open a new instance of the Google Chrome browser and maximized the test window.

### Step 4: Automation Core Logic
* Configured the script to navigate directly to the target e-commerce products page (`automationexercise.com/products`).
* Identified the search input container using the `By.name("search")` locator strategy.
* Injected the keyword `"Laptop"` and simulated the key execution using the `sendKeys(..., Keys.ENTER)` method.

### Step 5: Verification & Cleanup
* Retrieved the actual web page title using `driver.getTitle()` to compare it against the expected state.
* Asserted the test lifecycle state and printed the output status directly to the execution console.
* Explicitly invoked `driver.quit()` at the end of the test execution to free system memory resources and terminate background processes cleanly.

---

## 📊 Test Execution Results

When the script runs successfully, the automated console output registers a clear test validation status alongside an exit confirmation:

```text
Page Title: Automation Exercise - All Products
Test Status: PASSED

Process finished with exit code 0
