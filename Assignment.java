1. Write a Swift program that assigns a value of 5 to a variable 'x', and prints "Even" if 'x' is even, and "Odd" if 'x' is odd, using an if-then statement. 
ans: let x = 5
if x % 2 == 0 {
    print("Even")
} else {
    print("Odd")
}



2. Write a Swift program that prints all the even numbers between 0 and 20 using a for loop. 
ans: for number in 0...20 {
    if number % 2 == 0 {
        print(number)
    }
}




3. Write a Swift program that uses a while loop to print the numbers from 1 to 10. [1]


swift
var i = 1

while i <= 10 {
    print(i)
    i += 1
}


4. Write a Swift program that assigns a value of 10 to a variable 'a' and a value of 20 to a variable 'b'. The program should then compare the values of 'a' and 'b' and print "a is greater than b" if 'a' is greater, "b is greater than a" if 'b' is greater, and "a is equal to b" if they are equal, using an if-then statement. 

let a = 10
let b = 20

if a > b {
    print("a is greater than b")
} else if a < b {
    print("b is greater than a")
} else {
    print("a is equal to b")
}




5. Write a Swift program that defines a function called 'multiplyNumbers' that takes two integer parameters and returns their product. The program should then call this function with two integer arguments and print the result. 

func multiplyNumbers(num1: Int, num2: Int) -> Int {
    return num1 * num2
}

let result = multiplyNumbers(num1: 5, num2: 10)
print(result) // prints 50
