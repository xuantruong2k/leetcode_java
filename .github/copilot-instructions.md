# AI Coding Agent Instructions

This document provides essential context for AI agents working in this Java LeetCode practice repository.

## Project Overview

This is a structured Java project for solving LeetCode problems, using:
- Java 17+
- Maven for build/test
- JUnit 5 for testing
- Standard package structure with solutions and tests

## Key Conventions

### File Organization
- Solutions go in `src/main/java/leetcode/ProblemName.java`
- Tests go in `src/test/java/leetcode/ProblemNameTest.java`
- Class names must match file names exactly

### Solution File Pattern
```java
package leetcode;

/**
 * LeetCode #X - Problem Name
 * https://leetcode.com/problems/problem-name/
 * 
 * Brief problem description
 */
public class ProblemName {
    public ReturnType methodName(Parameters) {
        // Solution implementation
    }
}
```

### Test File Pattern
```java
package leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProblemNameTest {
    private final ProblemName solution = new ProblemName();
    
    @Test
    void testExample1() {
        // Test implementation
        assertEquals(expected, solution.methodName(params));
    }
}
```

Example: See `TwoSum.java` and `TwoSumTest.java` for reference implementation.

## Development Workflow

### Essential Commands
```bash
# Build project
mvn clean compile

# Run all tests
mvn test

# Run specific test
mvn test -Dtest=ProblemNameTest
```

### Test Requirements
- Include LeetCode example test cases
- Add edge cases (empty arrays, null inputs, etc.)
- Use descriptive test method names
- Validate exception cases when appropriate

### Code Quality Standards
- Include problem URL in file comments
- Document complex algorithm steps
- Follow established naming patterns
- Handle edge cases explicitly

## Common Patterns

### Exception Handling
- Throw `IllegalArgumentException` for invalid inputs
- Example: `throw new IllegalArgumentException("No solution exists");`

### Test Structure
- Each test file starts with a solution instance field
- Test methods follow `testScenarioName` pattern
- Use appropriate JUnit assertions for validation