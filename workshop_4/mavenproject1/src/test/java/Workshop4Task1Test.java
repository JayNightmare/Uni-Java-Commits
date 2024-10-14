
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.workshop4.workshoptasks.task1.Workshop4Task1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorda
 */

class Workshop4Task1Test {
    @Test
    void testProcessNumbers() {
        int result = Workshop4Task1.processNumbers();
        assertEquals(56, result, "The sum should be 56");
    }
}
