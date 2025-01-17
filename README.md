# Unreachable Code Bug in Java

This repository demonstrates an example of unreachable code in a Java program.  The bug arises due to a `break` statement within a loop, causing subsequent code to become unreachable.

The `UnreachableCodeBug.java` file contains the buggy code.  The `UnreachableCodeSolution.java` shows how to fix this issue. The solution involves removing the unreachable code block.

## How to reproduce:

1. Clone the repository.
2. Compile and run `UnreachableCodeBug.java`.  Observe that the line printing "Unreachable code" is never reached.
3. Then, compile and run `UnreachableCodeSolution.java`. Notice that the issue is resolved and the code runs as expected.

## How to fix:

Review your control flow carefully, paying attention to the impact of `break` and `continue` statements within loops.   Remove or refactor any code that can never be reached.  In this case, the simplest solution is simply removing the conditional block containing the unreachable code.  A more sophisticated approach might involve restructuring the conditional logic to avoid the situation entirely.