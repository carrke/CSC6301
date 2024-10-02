# Week 5 - Sorted Stack
Update week 4 program to utilize a Stack instead of a Linked List

## How to run
Compile the program
```
javac *.java
```
Then run the program
```
java Main.java
```

## Documentation
Documentation can be generated via javadocs
```
javadoc -d docs *.java
```
Then viewed through docs/index.html

## Providing input
The program asks for integers which should be provided one at a time and entry is finished by entering the word "end"

## Example Usage and Output
Assuming the user enters the following:
```
5
-1
1
7
2
3
2
127
-999
end
```
The program will output the following:
```
Provided data: [5, -1, 1, 7, 2, 3, 2, 127, -999]
Sorting data...
Sorted data: [-999, -1, 1, 2, 2, 3, 5, 7, 127]

Goodbye
```