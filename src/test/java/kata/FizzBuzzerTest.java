package kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzerTest {
    
    @Test void should_have_fizzBuzzer(){
        FizzBuzzer fizzBuzzer = new FizzBuzzer();
        fizzBuzzer.fizzBuzz(0);
        assertNotNull(fizzBuzzer);
        
    }

    @Test void should_return_1_when_input_is_1(){
        assertCorresponds("1", 1);
    }

    private void assertCorresponds(String expected, int input) {
        FizzBuzzer fizzBuzzer = new FizzBuzzer();
        String actual = fizzBuzzer.fizzBuzz(input);
        assertEquals(expected, actual);
    }

    @Test void should_return_1_when_input_is_2(){
        assertCorresponds("2", 2);
    }

    @Test void should_return_fizz_when_input_is_3(){
        assertCorresponds("fizz", 3);
    }

    @Test void should_return_4_when_input_is_4(){
        assertCorresponds("4", 4);
    }

    @Test void should_return_buzz_when_input_is_5(){
        assertCorresponds("buzz", 5);
    }

    @Test void should_return_fizz_when_input_is_6(){
        assertCorresponds("fizz", 6);
    }

    @Test void should_return_buzz_when_input_is_10(){
        assertCorresponds("buzz", 10);
    }

    @Test void should_return_fizz_when_input_is_12(){
        assertCorresponds("fizz", 12);
    }

    @Test void should_return_fizzbuzz_when_input_is_15(){
        assertCorresponds("fizzbuzz", 15);
    }

    @Test void should_return_fizzbuzz_when_input_is_30(){
        assertCorresponds("fizzbuzz", 30);
    }

    
    @Test void fail(){
       //assertFalse(true,"Failure"); 
    }

}
