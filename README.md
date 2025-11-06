# Java LeetCode Practice

A simple Java application for practicing LeetCode problems with organized structure and test cases.

## Project Structure

```
java-leetcode/
├── pom.xml                          # Maven configuration
├── src/
│   ├── main/
│   │   └── java/
│   │       └── leetcode/            # LeetCode solution files
│   │           └── TwoSum.java      # Example: Problem #1
│   └── test/
│       └── java/
│           └── leetcode/            # Test files
│               └── TwoSumTest.java  # Example: Tests for Problem #1
└── README.md
```

## Setup

### Prerequisites
- Java 17 or higher
- Maven 3.6 or higher

### Build the Project
```bash
mvn clean compile
```

### Run Tests
```bash
mvn test
```

### Run a Specific Test
```bash
mvn test -Dtest=TwoSumTest
```

## Adding New Problems

1. Create a new Java file in `src/main/java/leetcode/` with the problem name (e.g., `AddTwoNumbers.java`)
2. Create a corresponding test file in `src/test/java/leetcode/` (e.g., `AddTwoNumbersTest.java`)
3. Follow the naming convention: `ProblemName.java` and `ProblemNameTest.java`

### Example Template

**Solution File (`src/main/java/leetcode/ProblemName.java`):**
```java
package leetcode;

/**
 * LeetCode #XX - Problem Name
 * https://leetcode.com/problems/problem-name/
 * 
 * Problem description here
 */
public class ProblemName {
    public ReturnType methodName(Parameters params) {
        // Your solution here
    }
}
```

**Test File (`src/test/java/leetcode/ProblemNameTest.java`):**
```java
package leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProblemNameTest {
    
    private final ProblemName solution = new ProblemName();
    
    @Test
    void testExample1() {
        // Your test case here
        assertEquals(expected, solution.methodName(params));
    }
}
```

## Example Problems

- [x] #1 Two Sum

## Tips

- Use descriptive test method names (e.g., `testExample1`, `testEdgeCase`, `testEmptyArray`)
- Include problem URL in comments for easy reference
- Add multiple test cases covering edge cases
- Run tests frequently to ensure solutions work correctly
