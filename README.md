# Bank Account - Custom Exceptions Exercise

 **Note:** This repository is a personal training project developed to practice Advanced Exception Handling and Custom Domain Exceptions in Java.

---

##  Exercise Description

The program simulates a bank account withdrawal operation. It reads the account data (number, holder, initial balance, and withdrawal limit) and then requests a withdrawal amount. 

The core challenge is validating the withdrawal against business rules and handling errors gracefully using custom exceptions instead of simple `if-else` prints or generic runtime errors.

###  Business Validation Rules:
A withdrawal cannot be processed if:
1. The withdrawal amount exceeds the account's predefined **withdraw limit**.
2. The withdrawal amount exceeds the account's current **balance**.

---

##  Technologies Used

* **Java**
* **IntelliJ IDEA**

##  Key Concepts Practiced

* **Custom Exceptions:** Implementing a tailored exception class (e.g., `DomainException` or `BusinessException`) that extends `RuntimeException` to handle domain-specific errors.
* **The `throw` Keyword:** Explicitly throwing the custom exception with a descriptive message when a business rule is violated.
* **Clean Separation of Concerns:** Keeping validation logic inside the `Account` class entity and handling the visual error presentation inside the `Program` main class using `try-catch` blocks.
* **Defensive Programming:** Structuring code to fail fast and prevent the application from entering an invalid state (like a negative balance beyond limits).
