package part1.tdd;

import org.junit.Before;
import org.junit.Test;
import part1.Stringg;
import part1.inheritance.One.Auto;

import static org.junit.Assert.*;

public class TestDriven {

    @Before
    public void print(){
        System.out.println("testing start:-");
    }

    @Test
    public void compare(){
        assertEquals("pardium",new String("pardium"));
    }

    @Test
    public void compare1(){
        assertEquals("muidrap", Reverse("pardium"));
    }

    private StringBuffer Reverse(String pardium) {
        StringBuffer result = new StringBuffer("");
        for(int i=pardium.length()-1; i>=0;i--){
            result.append(pardium.charAt(i));
        }

        return result;
    }
}
