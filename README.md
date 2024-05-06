# About

It's a base java selenium test automation project.

# Prerequisites

- Java - Development Language
- Selenium - Testing Framework
- Junit 5 - Testing Framework
- Cucumber - for BDD
- Allure - for Report
- IDE (IntelliJ IDEA, Eclipse, etc.)

## Setup

1. **Clone the repository:**

    ```
    https://github.com/ysfclskn/java-selenium-cucumber-automation-base.git
    ```

2. **Navigate to the project directory:**

    ```
    cd java-selenium-cucumber-automation-base
    ```

3. **Install dependencies:**

    ```
    mvn install
    ```

# Run Project

### Feature Run

- You can run directly with feature files in java/test/resources/features directory.

### Maven Run

```
mvn clean test
```

### Cucumber Single Tag Run

Example for `@smoke` tag:

```
mvn test -D"cucumber.filter.tags=@smoke"
```

### Run Parallel

After setting the `cucumber.execution.parallel.enabled` parameter to `true` in the `junit-platform.properties` file, you
can use one of the terminal commands mentioned above or run it with ```mvn clean run```


### Run Tests with Specific Parameters

Example Run : ``` mvn test clean -Dbrowser=chrome -Dheadless=true ```


#### Parameters

| key      | value             | default |
|----------|-------------------|-------|
| browser  | chrome, firefox   | chrome | 
| headless | true,false        | false |
| env      | test,prod         | prod  |
| gridUrl  | selenium grid url |     |

# Reporting

- Allure Report after run

```
allure serve target/allure-results
```

# Project Structure

```
📦 java-selenium-cucumber-automation-base
└─ src
   ├─ test
   │  ├─ java
   │  │  ├─ config 
   │  │  ├─ pages
   │  │  ├─ runners
   │  │  ├─ steps
   │  │  └─ utils
   │  └─ resources
   │     ├─ features
   │     ├─ allure.properties -> Allure report configs
   │     └─ junit-platform.properties -> Junit configs
   └─ pom.xml
```

# Support

Contact me ysfclskn94@hotmail.com
