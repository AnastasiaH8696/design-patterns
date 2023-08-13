You should define the BankAccount class.

It should include at the minimum the withdraw and deposit methods. 

You should implement the Observer design pattern in order to have three observers for every BankAccount object.

The observers are:
* SimpleLoggerObserver object (prints to the console a simple message that specifies the sum that was deposit or withdrawn)
* IRSObserver object (prints to the screen a message saying that a suspected operation was carried whenever a deposit of more than 100000 shekels was completed)
* BankObserver object (prints to the screen the fee for performing the deposit / withdraw. 

The fee is 10% of the sum that was deposited / withdrawn).  