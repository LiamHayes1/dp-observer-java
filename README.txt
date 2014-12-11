A demonstration of the GOF Observer desing pattern. A temperature subject transmits data to a number of observing objects every second. 

Intent: Define a one-to-many dependency between objects so that when one object changes state, all of its dependents are notifies and updated automatically. 

Benfits:
- Lets you vary Subject and Observer independently
- You can reuse the Subject without reusing Observers, and vice versa
- Abstract coupling between Subject and Observer (Subject does not know anything about the concrete Observers)

Applicability:
- When an abstraction has two aspects, one dependent on the other. Encapsulating the aspects in seperate objects let you vary and reuse them independently.
- When a change to one object requires changing others, and you don't know how many objects need to be changed.
- When an object should be able to notify other objects without making assumptions about who these objects are. In other words, you don't want these objects tightly coupled.
