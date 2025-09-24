# Pizza Factory Project

This is a Maven-based Java project that implements a Pizza Factory system using the Factory design pattern.

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Building the Project

To build the project, run:

```bash
mvn clean compile
```

## Running Tests

To run the unit tests, execute:

```bash
mvn test
```

## Running the Application

To run the main application:

```bash
mvn exec:java
```

## Project Structure

```
pizza-factory/
├── pom.xml                 # Maven project configuration file
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pizza/     # Source files
│   │           ├── CheesePizza.java
│   │           ├── GlutenFreePizza.java
│   │           ├── GreekPizza.java
│   │           ├── Main.java
│   │           ├── PepperoniPizza.java
│   │           ├── Pizza.java
│   │           ├── PizzaFactory.java
│   │           ├── PizzaPie.java
│   │           ├── PizzaStore.java
│   │           ├── PizzaType.java
│   │           ├── TranslatePizzaType.java
│   │           └── VeganPizza.java
│   └── test/
│       └── java/
│           └── pizza/     # Test files
│               ├── PizzaFactoryTest.java
│               └── PizzaTest.java
└── target/                # Compiled files (ignored by git)
```

## Maven Configuration

The project uses Maven for dependency management and build automation. Key configurations in `pom.xml`:

```xml
<groupId>pizza</groupId>
<artifactId>pizza-factory</artifactId>
<version>1.0-SNAPSHOT</version>

<!-- Java version settings -->
<properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
</properties>

<!-- Dependencies -->
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## Available Pizza Types

- Cheese Pizza
- Greek Pizza
- Pepperoni Pizza
- Gluten Free Pizza
- Vegan Pizza

## Development

This project uses:
- JUnit 4 for testing
- Maven for build automation
- Factory Pattern for pizza creation

## Build and Test Status

The project has been successfully built and all tests are passing.