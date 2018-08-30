/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_wars_questions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class OddEvenTest {
    @Test
    public void exampleTest() {
        assertEquals("odd", OddEven.oddOrEven(new int[] {2, 5, 34, 6}));
    }
}
