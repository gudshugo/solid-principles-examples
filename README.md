# solid-principles-examples
Implementation of SOLID principles in JAVA

SOLID principles were introduced by Robert J. Martin (Uncle Bob) in 2000. 

These five principles help us to understand the need of certain design patterns 
and software architecture in general. Adding these principles in your code can contribute
to avoiding code smells, refactoring code and so on. Design principles encourage us
to create more maintainable, understandable and flexible software. 

There are five principles:

- Single Responsibility: It says that a class should have one, 
  and only, responsibility and one reason to change. 
- Open-closed: It says that a class should be open for extension but closed for modification.
- Liskov Substitution: It says that subtypes should be easily replaceable by their parent types.
- Interface segregation: It says that many specific interfaces are better than a general one.
- Dependency Inversion: It says that we must depend on abstractions and not on concrete classes.

How the repository is organized:

- There are 5 folders with the initials from each principle, i.e. "srp" -> which stands for Single
Responsibility principle.
- In each folder, there are 2 folders: one with a "bad" implementation that means a code that 
isn't following the principle correctly. The other one is a "good" folder with a proper implementation
of the principle.
- There are many comments along the code with directions to follow in order to understand
each principle case and solution.