# Learning Code Refactoring (notes)

## [Code Refactoring by Derek Banas #1](https://www.youtube.com/watch?v=vhYK3pDUijk&t=435s&index=1&list=PLGLfVvz_LVvSuz6NuHAzpM52qKM6bPlCV)
_./src/FootballPlayer.java_

### Bad Smells
1. Duplicated Code
2. Long Methods - harder to share, understand, and reuse (they should be, approx., 5 lines long)
3. Complex Conditional Statements
4. Primitive Obsession - avoiding using specialized class (like Integer in Java)
5. Indecent Exposure - setting to public classes and/or variables thet should be private
6. Solution Sprawl
7. Alternative Classes with Different Interfaces - Interfaces that should be merged
8. Lazy Classes - classes that should be merged
9. Large Classes
10. Switch Statements
11. Combinatorial Explosions
12. Oddball Solutions

###### HINT:
> Another good refactoring is shifting the methods inside a class around into a semi readable order. What I mean is that constructors and init-type methods are at the top, and utility-type methods like toString() are at the bottom. Also methods that are related to each other should also be close to each other in the class.  There is nothing more headache inducing than jumping all over the place in the class trying to follow a sequence of method calls. The more top-down readable the class is the easier it is to understand.

### Creation Problems
1. Creation Method
2. Replace Constructors with Creation Methods
    - Which constructor should be called?
    - Which constructors had descriptive names?
    - Constructors can't have the same attribute signatures

### Avoid Duplication & Chain Constructors
1. More constructors - more problems
2. General purpose constructors save the day