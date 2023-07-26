import org.example.factorialCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Testing {

    @Test
    void testEmpty(){

    }

    @Test
    void test120(){
        assertEquals("5!",new factorialCalculator().testSolve(120));
    }

    @Test
    void test99(){
        assertEquals("None",new factorialCalculator().testSolve(99));
    }

    @Test
    void test6(){
        assertEquals("3!",new factorialCalculator().testSolve(6));
    }

    @Test
    void test3628800(){
        assertEquals("10!",new factorialCalculator().testSolve(3628800));
    }


}
