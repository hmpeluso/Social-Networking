# Social-Networking
Welcome to EduCorp, the nation's leading provider of educational support software! You will be joining the team tasked with developing EduCorp's latest classroom app, SitRite3K.  For this assignment, you must implement three classes: a class named Student that encapsulates information about individual students, a class named Posse that manages an individual student's friends, and a utility class named Social that contains methods for performing calculations involving social networks.

Each class has it's own code and it's own JUnit Test Class.

Social Class: 
The distance() method must calculate the Euclidean distance between two seats, located at s and t, where element 0 contains the row and element 1 contains the column. For simplicity, it assumes that the seats are arranged in a uniform grid with one meter of separation between adjacent seats.


Student Class:
The role of the name and friends attributes should be apparent from the UML diagrams. The seat attribute must have a length of 2 and must contain the row and column (in that order) of the Student object's seat.
Constructors
As usual, the constructors must appropriately initialize each of the instance variables. The single-argument constructor must initialize both the row and the column values to 0. (Note: As always, you must avoid code duplication. In this case, one constructor should probably call the other, which itself should call setRow and setColumn).
Getters and Setters
The getters and setters must perform the obvious operations. All methods that change the row and/or column must (directly or indirectly) validate the parameters they are passed. Specifically, if the parameter is less than 0, then the corresponding instance variable must be set to 0.
addFriend()
This method must add the provided Student object to the Posse named friends. However, it must never add a Student object to her/his own Posse.
equals()
This method must return true if and only if the name of this Student object is the same as the name of the given Student object. (This program assumes that names will be unique.)
unhappiness()
A student's "unhappiness" is defined as the summed Euclidean distance from the student to each of their friends. In other words, the farther away a student's friends are sitting from them, the more unhappy that student is. 
"F" denotes the set of friends, "g hat" denotes the seat of the student, "f hat" denotes the seat of the friend, and "d" denotes the Euclidean distance. If the student has no friends, then this method must return 0.0.


Posse Class: 
Each Posse object has a maximum size, denoted by maxSize. The members object stores references to the students who have been added.
Constructors
As usual, the constructors must appropriately initialize each of the instance variables. The default constructor must initialize the Posse to have a maxSize of 30. The other constructor must initialize the Posse to have the given maxSize. (As always, you must avoid code duplication.)
add()
The add() method must add the given Student to the end of the Posse if and only if it is not already in the Posse and the Posse is not full.
It must return false if the Posse was full and true if either the Student was added or if it was already in the Posse.

contains()
The contains() method must return true if the given Student is in the Posse. It must return false otherwise, including when the parameter is null. (As always, you must avoid code duplication.)
get() Methods
Both get() methods must return either (a reference to) a Student that is in the Posse or null.
The version that is passed an int must return the Student at the given index of members if the index is valid. It must return null otherwise.

The version that is passed a String must return the Student with the given name if that Student is in members. It must return null otherwise, including when the parameter is null. You may assume that the parameter name is unique.

The get() methods must not contain duplicate code and must not duplicate code in any other methods.

getMaxSize() and getSize()
The getMaxSize() method must return the maximum size of the Posse.

The getSize() method must return the number of Student objects that are currently in the Posse.




