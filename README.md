# Triangle Challenge
Is a java console program that determines the type of a triangle.

# Prerequisites
- Java 8

# Start
```console
./gradlew run --console=plain
```

# Run Tests
```console
./gradlew test
```

# Decisions
- **Console Application**: Light weight, Triangle classes, util classes and dependencies could be copied easily.
- **Java 8** : I used Java 8 because Romulo told me that you are currently using Java 8 in your project.
- **Gradle**: Quick possibility to run all tests / program with one line. In addition it is now possible
to see all external dependencies in one file -> "build.gradle"
- **TriangleType**: Implemented as enum because there's only a limited amount of possible triangle types.
- **TriangleException**: Own exception indicating that something was not done properly concerning triangle.
- **ConsoleUtil**: Extend console functionality with custom logic.

## Possible improvements
- Use logger instead of Console