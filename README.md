# Triangle Challenge
Is a java console program that determines the type of a triangle.

# Prerequisites
- Java 8

# Start
gradlew run

# Run Tests
gradlew test

# Decisions
- **Java 8** : I used Java 8 because Romulo told me that you are currently using Java 8 in your project.
- **Gradle**: I used gradle because now you can see an overview the file "build.gradle" which additional dependencies I used
and to give you a quick possibility to test / run the code with one line.
- **TriangleType**: Implemented as enum because there's only a limited amount of possible status.
- **TriangleException**: Own exception indicating that something was not done properly concerning triangle.
- **ConsoleUtil**: Extend console functionality with custom logic.

## Possible improvements
- Use logger instead of Console