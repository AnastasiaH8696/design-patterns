You should develop a simple application that allows us to manage the personal data of soldiers in a specific army unit.

The details of each and every soldier are saved to specific file that its name is the soldier ID number. The files that hold the soldiers data are saved in a specific folder. Each file will include the specific soldier data in the CSV format (e.g. mosh,23434324,captain,1.87). The details of each soldier should be in accordance with the definition of the Soldier class.

When executing the application we shall get a list of the IDs of all soldiers in our unit, and we will be able to specify the ID of the specific soldier we want to get his/her details.

In order to avoid the creation of multiple Soldier objects, the program will implement the Proxy design pattern, by defining the SoldierProxy class. Both Soldier and ProxySoldier will implement the ISoldier interface. This interface includes the printDetails() abstract method. The printDetails() method simply prints to the screen the details of the soldier. 