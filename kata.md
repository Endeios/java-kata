 # A pop corn FizzBuzz

This is the story of Bruno and Lucie, the day they did the FizzBuzz kata, pairing on remote, and doing pop corn for switching roles.

Lucie is an experienced Tester and Bruno is an experienced developer.

They meet over the Zoom.

## Intro: what is TDD and PP

Bruno: "Yo Lucie, what about a kata?"

Lucie: "A What?"

BR: "A Kata is a programming exercise, we use it to learn programming techniques"

LU: "Sure, we can try, But I am not a great programmer, can we do it?"

BR: "Absolutely! One could actually learn programming, by doing, with just katas: we just need to start from the beginning: We will use the superior technique of Pair Programming"

LU: "Another programmer's thing..."

BR "Yup, programming in pairs help in sharing knowledge at the beginning, and boost the productivity: the pair is really more powerful than the sum of the singles"

LU: "Ok, so what do we do first"

BR: "One of the easiest is FizzBuzz, we can do that as a starter. This will also give me the opportunity to annoy you with another superior programming tecnique: Test Driven Development"

LU: Stop right there: what did you say this FuzzBuzz? FezzBizz?


BR: Fizz buzz is a child's game, in which you count up to 100, and you say fizz instead of multiples of 3 and buzz instead of the multiples of five: also you say FizzBuzz on the multiples of both, like in this list 

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

LU: Nope, it is not clear, say it better"

BR: "You know that programming is basically problem solving right? You are given requirements, that are basically problems you have to solve"

LU: "Yup"

BR: So you take a problem, you slice it very fine, take one of the bite sized little problems, and solve that one first. It is called Test driven, because you first do a test in which you state how a program should output given the input, for example if the input is 3 the output should be fizz, and then write the easiest program that gives that output given the input. This gives life to *_THE RYTHM_* of development, this potentially infinite loop of steps of advancement toward the objectinve of the application:

### The Rythm
- A little bit of Test code ❌
- A little bit of production code ✔️ 
- A little bit of test code ❌
- A little bit of production code ✔️
.... 

The rythm and _induction_ will bring us to the app.


LU: Still a bit abstract...

BR: "Yup, sorry for that, it is easier if I show you... let's take those remote pairing machines, and have a try.

## Step 1: Lucie :car: drives, Bruno :pencil: navigates

BR: "So open the test class file, and run it, so that we know that our env is correctly set:

LU: "Just run, like this, with just the sample code inside"

BR: Yes, we want to be sure that we start from something that works, otherwise we cannot tell why test fail, if they do not execute, right?"

LU: Tak jo

💻 ```computer``` 

```shell
There are 1 ✔️ over 1 Tests Passing
```

BR: VIVA! so the _pop corn_ or _ping pong_ pair *test driven development* is like the following: one is the driver, who will drive our rally car, which is the computer: you will be the first to drive. I will be your rally navigator, telling you wich direction to take

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

💻 ```computer``` 

```shell
There are 1 ✔️ over 2 Tests Passing 
There are 1 ❌ test failures
🚨 Unresolved compilation problems:
        FizzBuzz cannot be resolved to a type
```

LU: so it is... and now?

## Step 2: Lucie :pencil: navigates, Bruno :car: drives

BR: Now we switch, I navigated the first test, and you typed, so now we invert roles: you will tell me how to fix the test, and think of the next one: *we basically switch at any failing test* 

LU: Right, but I am not a programmer, I do not know what to do.

BR: I am the driver, but I can still counsel you: the driver / navigator thing is for _the code not to go for one person head's to the program, without being said out loud_. Our ide suggests us to create a class: we could do just that!

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

💻 ```computer``` 

```shell
There are 2 ✔️ over 2 Tests Passing
```

LU: and now? switch?

BR: we switch when the test fail; no fail no switch! Now is time to think about the next test.

LU: I do not like the thing of the two tests: it confuses me, we did only one tests, there should be only one test.

BR: right, shall I delete the first sample test? we don't really need it anymore...

LU: yes delete it, I can't stand it.

BR: right away! (removes first test)

💻 ```computer``` 

```shell
There are 1 ✔️ over 1 Tests Passing
```
LU: good, so what do we do next? how do we do the next test?

BR: the next brick in our wall comes from the spec: what is the very first case?

LU: well, the first number does not change.

BR: and how do we express that in terms of input output? That Ken Beck guy, started all this thing from books about input and output tapes.

LU: then input one, and output one

BR: we need something a bit more _intentional_; when we are going to read this again, it needs to read like prose

LU: *uff*, so let's say ```fizzBuzz_of_one_should_be_one```, what about that

BR: that is perfect! expresses the intention of the test, and if would read it in the test execution report and read

```shell
fizzBuzz_of_one_should_be_one test is failing
```

I would perfectly understand what is wrong! Let me write that as second test

```java
...
    @Test void fizzBuzz_of_one_should_be_one(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizBuzzOf(1);
        assertEquals("1", result);
    }
...
```
....aaaand run tests

💻 ```computer``` 

```shell
There are 1 ✔️  over 2 Tests Passing
There are 1 ❌ test failures
🚨 Unresolved compilation problem:
        The method fizBuzzOf(int) is undefined for the type FizzBuzz
```
LU: fail, so we switch


## Step 3: Lucie :car: drives, Bruno :pencil: navigates

BR: yup, it is my turn again to navigate and yours to drive. please write a method in the ```FizzBuzz``` class called ```fizzBuzzOf``` with an integer parameter called ```number```, and with an output value that is a ```String```: make the method return the string ```"1"```.

LU: a static string as result? can't we just use the input?

BR: we could, but this is simpler and there is nothing simpler than a static string. The production code should be as simple as possible, as hackish as possible.

LU: whatever floats your boat....

```java
...
	public String fizBuzzOf(int number) {
		return "1";
	}
...
```
... now tests ....
💻 ```computer``` 

```shell
There are 2 ✔️ over 2 Tests Passing
```

BR: AH! tests pass! What a joyful thing!

LU: You are easily amused....

BR: Green test is love! Green test is life! Now, let's copy the first test, rename it to ```fizzBuzz_of_two_should_be_two```, and change the ones to twos, both input and expected result

LU: Like this?
```java
...
    @Test void fizzBuzz_of_two_should_be_two(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizBuzzOf(2);
        assertEquals("2", result);
    }
...
```

BR: exactly! now run the tests, they should fail, because the returned string is wrong

💻 ```computer``` 

```shell
There are 2 ✔️  over 3 Tests Passing
There are 1 ❌ test failures
🚨 expected: <2> but was: <1>
```

## Important intermezzo 

LU: I am not surprised! to be honest this static string seems a bit silly to me...

BR: I assure you it is not! That was a fast way of having this next test fail, and in doing so, concentrating on the _rythm_ of the "switch" and "test code"-"production code", which is our objective here; we are not here for the program. The program is boring, we are using its boringness to concentrate on the rythm, which is our true objective today. Do not look at the shape: concentrate on the space between the shapes.


## Step 4: Lucie :pencil: navigates, Bruno :car: drives

LU: ...right the rythm, we started with the rythm...
It is my turn to navigate right? The test was failing...

BR: Yes.... master....

LU: You scare me... So now we could just return the number in that function there, we are just doing the first two numbers right? We are inducing the bahviour.

BR: Your ideas are always so bright master...

LU: Snap out of it! And write the code!

BR: Sure, but the spec is clear that we want a ```String``` there, not a number, because "fizz" and "buzz" and "fizzbuzz" need to be representable, so I will write like this

```java
...
    public String fizBuzzOf(int number) {
		return String.format("%d", number);
	}
...
```

... aaaand test ...

💻 ```computer``` 

```shell
There are 3 ✔️  over 3 Tests Passing
```

Marvellous!

LU: Right, so next one should be ```fizz_buzz_of_three_shluld_be_fizz```! Please copy and paste the previous test and change the string and the number accordingly!


BR: Right away!

```java
...
    @Test void fizzBuzz_of_three_should_be_fizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizBuzzOf(3);
        assertEquals("fizz", result);
    }
...
```
... And run ...

💻 ```computer``` 

```shell
There are 3 ✔️  over 4 Tests Passing
There are 1 ❌ test failures
🚨 expected: <fizz> but was: <3>
```

## Step 5: Lucie :car: drives, Bruno :pencil: navigates

LU: So I'll drive, what now?

BR: the easiest way to tackle this is to check if the input is equal to three and, if yes, return ```"fizz"```

LU: Like this

```java
...
	public String fizBuzzOf(int number) {
        if (number==3)
            return "fizz";
		return String.format("%d", number);
	}
...
```
BR: Yup, and yes, it could be a bit better, but for now it will do.

LU: ... let's run! ...

💻 ```computer``` 

```shell
There are 4 ✔️  over 4 Tests Passing
```

... Nice, so what next?



And they continued, till the end of the kata



---

Important snippets to keep in mind to finish the kata

|Snippet|meaning|
|-------|-------|
|```if(number%3==0)```| it is a condition that is true when the number is perfectly divisible by three, in other words _when the interger rest of the division by three is zero_|
|```if(number%5==0)```| same condition as above, just with the number five. Do not be afraid of copy pasting in this kata (or others for that matter)|
|```if(number%15==0)```| same condition as above, just with the number fifteen. Do not be afraid of copy pasting in this kata (or others for that matter)|
