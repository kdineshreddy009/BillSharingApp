# BillSharingApp

Problem Definition:

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
