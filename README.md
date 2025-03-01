# About
This project is a collection problem sets designed to provide practice of elementary to advanced algorithm design patterns and paradigms. 

Each problem will come with a set of unit tests that test the robustness of your solutions. 

The goal is to provide a structured syllabus to bootcamp graduates that can be used to systematically learn algorithm patterns commonly taught as part of a traditional CS degree. 

Familiarity with these patterns will improve performance in whiteboarding interviews. The idea is that once you know and understand how to implement these patterns with ease, you will more quickly recognize problem types and common solutions for them in a whiteboarding interview.

# Current Structure
This project is a work-in-progress, and I am currently developing the following problem sets and corresponding unit tests, for the following categories of algorithms:

```dtd
> searching algorithms
    > linear 
    > non-linear

> sorting algorithms
    > comparison-based
    > non-comparison-based
```

In each folder of algorithm patterns, you'll find entire classes dedicated to studying just one pattern, and contains the following:
```dtd
1. 1-5 simple problem(s) asking you to implement an algorithm using that pattern
2. 5-10 challenge problems that can be solved using that pattern
```

## Future Plans
I intend to grow this collection of problem sets to include every critical algorithm type necessary for competing at the highest level in technical interviews. In the future, I intend to include the following categories of problem sets:
```
Existing sets:
> sorting algorithms
> searching algorithms

Future additional sets:
> optimization algorithms
    > Greedy
    > Dynamic
    > Backtracking
> graph algorithms
    > traversal
    > shortest path
> string algorithms
    > searching
    > pattern matching
> math algorithms
    > arithmetic
    > algebra
    > number theory
> geometry algorithms
> bit manipulation
> randomized algorithms
```

## How to use
This repository includes no implementations, but does include unit tests for each problem ready to test your solutions!

- Clone the repository
- Begin implementing your solutions
- Run tests in one of 5 ways
  - Right click test > java folder to run all tests
  - Right click any test class to run all tests in a file
  - Click the play button next any individual test to run a single test (in IntelliJ)
  - Run Main.class, found in test > java > org.example
  - Run the command `mvn test`
