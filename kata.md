# Fizz Buzz

Imagine the scene. You are eleven years old, and in the five minutes before the end of the lesson, your Maths teacher decides he should make his class more “fun” by introducing a “game”. He explains that he is going to point at each pupil in turn and ask them to say the next number in sequence, starting from one. The “fun” part is that if the number is divisible by three, you instead say “Fizz” and if it is divisible by five you say “Buzz”. So now your maths teacher is pointing at all of your classmates in turn, and they happily shout “one!”, “two!”, “Fizz!”, “four!”, “Buzz!”… until he very deliberately points at you, fixing you with a steely gaze… time stands still, your mouth dries up, your palms become sweatier and sweatier until you finally manage to croak “Fizz!”. Doom is avoided, and the pointing finger moves on.

So of course in order to avoid embarassment infront of your whole class, you have to get the full list printed out so you know what to say. Your class has about 33 pupils and he might go round three times before the bell rings for breaktime. Next maths lesson is on Thursday. Get coding!

Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz “.

### Sample output:

# A pop corn example

This is the story of Bruno and Lucie, the day they did the FizzBuzz kata, pairing on remote, and doing pop corn for switching roles.

## Intro: what is TDD and PP

Bruno: "Yo Lucie, what about a kata?"

LU: "A What?"

Br: "A Kata is a programming exercise, we use it to learn programming techniques"

Lu: "Sure, we can try, But I am not a great programmer, can we do it?"

BR: "Absolutely! One could actually learn programming, by doing, with just katas: we just need to start from the beginning: We will use the super technique of Pair Programming"

LU: "Another programmer's thing..."

BR "Yup, programming in pairs help in sharing knowledge at the beginning, and boost the productivity: the pair is really more powerful than the sum of the singles"

LU: "Ok, so what do we do first"

BR: "One of the easiest is FizzBuzz, we can do that as a starter. This will also give me the opportunity to annoy you with another superior programming tecnique: Test Driven Development"

LU: Stop right there: what did you say this FuzzBuzz? FezzBizz?


BR: Fizz buzz is a child's game, in which you count up to 100 
```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
... etc up to 100
```



LU: "I like the sound of it, but testing is something you do after an app is done, to document that it respects the requirements: programming doesn't sound like testing..."

BR: "Yeah, that name... when the inventor, Ken Beck, gave it a name, he just had invented the unit tests for java, as a programming tool, so that it's customers could have automated test; it is a long story: the short version is, the first thing that he used to try to emulate a classic programming definition, was this xUnit test framework, and it became test driven development. But it is not about testing, it is about decomposing the problem"

LU: "Nope, it is not clear, say it better"

BR: "You know that programming is basically problem solving right? You are given requirements, that are basically problems you have to solve"

LU: "Yup"

BR: "So you take a problem, you slice it very fine, take one of the bite sized little problems, and solve that one insted. It is called Test driven, because you first do a test in which you state how a program should output given the input, for example if the input is 3 the output should be fizz, and then write the easiest program that gives that output given the input."

LU: "Still a bit abstract..."

BR: "Yup, sorry for that, it is easier if I show you... let's take those remote pairing machines, and have a try.

## Step 1: Lucie :car: drives, Bruno :pencil: navigates

BR: "So open the test class file, and run it, so that we know that our env is correctly set:

LU: "Just run, like this, with just the sample code inside"

BR: Yes, we want to be sure that we start from somethinf that works, otherwise we cannot tell why test fail, if the do not execute, right?"

LU: Tak jo

:computer: 1/1 Tests Passing :heavy_check_mark:

BR: VIVA! so the pop corn or ping pong pair test driven development is like the following: one is the driver, who will drive our rally car, which is the computer: you will be the first to drive. I will be your rally navigator, telling you wich direction to take

LU: like in : you tell me what to write?

BR: Exactly! 

LU: Ok, let's try...

BR: So write a new test: this test will chek if the 

