# How to Test(will be updating it):
     This is a plain maven java project,run Driver.java for 
       i)adding an expense 
       ii)retrieving expenses based on user


# BillSharingApp(I haven't implemented all the things, paused working on it)

# Problem Definition:

To create a bill sharing application(like splitwise)
The application features are as follows:
- The application must have a concept of a group - which is basically a collection of registered
users.
- A registered user can belong to multiple groups.
- A person should be able to add a bill to the application. The bill will contain
- Total Amount of the bill.
- People involved and their share of contribution
- Group to which that bill get added

The application should keep track of all such bills. Also, the application should be able to display two
things:
- Group wise balances to a user.
- Total Balance to a user.
To summarise, we expect the following features
- Ability to register a bill against a group with a list of participating users.
- Users must be able to record contributions to these bills by way of specifying exact amount they
owe or by %age of share of the total
- A user must be able to view group wise balances
For example : Mudit registers a bill for lunch totalling 300 rupees. The bill is to be split equally among
Mudit, Sourav and Souvik. Mudit has paid 250 while Souvik shelled out 50 rupees to complete the bill.
Thus, Mudit should get back 150 rupees while Sourav and Souvik need to give back 100 and 50 rupees
respectively in order to balance out the bill.

# Bonus implementations:
Support individual (person to person) balances. Also take care of concurrency issues that can arise out of
multiple people registering bills at the same time.

## Requirement:
Should support this using In-Memory DS constructs, use of DB not allowed.
Expectations:
  1. Create the sample data yourself. You can put it into a file, test case or main driver program itself.
  2. Code should be demoable. Either by using a main driver program or test cases.
  3. Code should be modular. Code should have basic OO design. Please do not jam in
responsibilities of one class into another.
  4. Code should be extensible. Wherever applicable, use interfaces and contracts between different
  methods. It should be easy to add/remove functionality without re-writing entire codebase.
  5. Code should handle edge cases properly and fail gracefully.
  6. Code should be legible and readable

Guidelines:

  1. Please discuss the solution with an interviewer
  2. Please do not access internet for anything EXCEPT syntax
  3. You are free to use the language of your choice
  4. All work is should be your own
  5. Please focus on the Bonus Feature only after ensuring the required features are complete and
  demoable.
