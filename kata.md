 # A pop corn FizzBuzz

This is the story of Bruno and Lucie, the day they did the FizzBuzz kata, pairing on remote, and doing pop corn for switching roles.

Lucie is an experienced Tester and Bruno is an experienced developer.

They meet over the Zoom.

## Intro: what is TDD and PP

Bruno: "Yo Lucie, what about a kata?"

Lucie: "A What?"

BR: "A Kata is a programming exercise, we use it to learn programming techniques"

LU: "Sure, we can try, But I am not a great programmer, can we do it?"

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

:computer: There are 1 ✔️ over 1 Tests Passing

BR: VIVA! so the pop corn or ping pong pair test driven development is like the following: one is the driver, who will drive our rally car, which is the computer: you will be the first to drive. I will be your rally navigator, telling you wich direction to take

LU: like in : you tell me what to write?

BR: Exactly! 

LU: Ok, let's try...

BR: So write a new test: this test will check if the new module fizz buzz exists: write the test

```java
...
    @Test void fizzBuzz_should_exist (){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertNotNull(fizzBuzz);
    }
...
```

BR: perfect, now please run the tests, it should fail

LU: but the test will fail, the ide is complaining that there is no ```FizzBuzzer``` 

BR: that is correct, our first test is failing because is not compiling.

:computer: 
```shell
There are 1 ✔️ over 2 Tests Passing 
There are 1 ❌ test failures
🚨 Unresolved compilation problems:
        FizzBuzz cannot be resolved to a type
```

LU: so it is: and now?

## Step 2: Lucie :pencil: navigates, Bruno :car: drives

BR: Now we switch, I navigated the first test, and you typed, so now we invert roles: you will tell me how to fix the test, and think of the next one: *we basically switch at any failing test* 

LU: Right, but I am not a programmer, I do not know what to do.

BR: I am the driver, but I can still counsel you: the driver / navigator thing is for code not to go for one person head's to the program, without being said out loud. Our ide suggests us to create a class: we could do just that!

LU: sure, it's one click, let's do it!

```java
... // in a file called FizzBuzz.java
package kata;

public class FizzBuzz {

}
```

BR: and what do we do just after we wrote *just the bit of production code to pass the test* ?

LU: we run the tests?

BR: precisely!

:computer: 
```shell
There are 2 ✔️ over 2 Tests Passing
```

LU: and now? switch?

BR: we switch wen the test fail, no fail no switch! Now is timme to think about the next test.

LU: I do not like the thing of the two tests: it confuses me, we did only one tests, there should be only one test.

BR: right, shall I delete the first sample test? we don't really need it anymore...

LU: yes delete it, I can't stand it.

BR: right away! (removes first test)

:computer: 
```shell
There are 1 ✔️ over 1 Tests Passing
```
LU: good, so how do we think of the next test?
