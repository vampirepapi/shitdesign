# Single Responsibility Principle (SRP)

## Introduction
The **Single Responsibility Principle (SRP)** is the first of the **SOLID principles** for writing clean, scalable, and maintainable object-oriented code.

### Definition
> *"A class should have only one reason to change."*
In other words:
- A class should have **only one job**
- A class should have **only one responsibility**
- A class should have **only one purpose**

**Violation Consequence:** If a class takes multiple responsibilities, it becomes coupled. Changes to one responsibility may affect others, causing a ripple effect in the codebase.

---

## Real-life Analogy
### Problem Scenario
Imagine a chef who:
- Cooks food
- Cleans the kitchen
- Serves customers
- Orders groceries

**Issue:** When the chef is cleaning, cooking quality suffers.

### SRP Solution
- **Chef:** Only cooks
- **Cleaner:** Handles cleaning
- **Waiter:** Serves food
- **Manager:** Orders groceries

**Result:** Each person focuses on one task, improving overall efficiency.

---

## Technical Example: TUF+ Compiler
### Without SRP
A monolithic `TUFplusCompiler` class handling:
1. Adding driver code
2. Syntax checking
3. Running test cases
4. Storing outputs in DB
5. Returning results to users

**Problems:** Tight coupling, hard to maintain.

### With SRP
| Class | Responsibility |
|--------|----------------|
| `DriverCodeGenerator` | Adds driver code |
| `SyntaxChecker` | Performs syntax checks |
| `TestRunner` | Executes test cases |
| `DatabaseManager` | Manages DB storage |
| `UserOutputHandler` | Returns user output |
| `Coordinator` | Orchestrates workflow |

**Benefits:** Modular, maintainable, and independently testable components.

---

## Advantages of SRP
✅ **Improved Maintainability** – Changes isolated to single components
✅ **Enhanced Readability** – Smaller, focused classes
✅ **Better Reusability** – No unnecessary dependencies
✅ **Easier Testing** – Fewer dependencies per class
✅ **Lower Risk** – Reduced side effects from changes

---

## Common SRP Violations
1. **Mixing DB & Business Logic**
   - *Bad:* `Customer` class that validates data AND saves to database.
   - *Good:* Separate `CustomerValidator` and `CustomerRepository`.

2. **Coupling UI with Business Logic**
   - *Bad:* Button click handler that also processes payments.
   - *Good:* UI calls dedicated `PaymentService`.

---

## Key Notes
### Is SRP Just for Classes?
**No!** SRP applies at multiple levels:
- **Methods:** Should do one thing
- **Modules:** Focus on one domain
- **Microservices:** Single business capability
- **Systems:** Clear bounded contexts

**SRP is a mindset** applicable from code to architecture.

---

## Best Practices
- Ask: *"What is this class/module's primary responsibility?"*
- Refactor when a class has "AND" in its responsibility description.
- Use composition to delegate responsibilities.
