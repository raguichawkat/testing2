import static org.junit.Assert.*;

import org.junit.Test;
public class evenoddTest {

    @Test
    public void case1(){
        evenodd one = new evenodd();
        assertEquals("number is even",one.evenodd(8));
    }

    @Test
    public void case2(){
        evenodd two = new evenodd();
        assertEquals("number is odd",two.evenodd(13));
    }

    @Test
    public void case3(){
        evenodd three = new evenodd();
        assertEquals("number is even",three.evenodd(-6));
    }

    @Test
    public void case4(){
        evenodd four = new evenodd();
        assertEquals("number is even",four.evenodd(0));
    }

}