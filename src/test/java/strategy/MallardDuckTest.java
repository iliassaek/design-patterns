package strategy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MallardDuckTest {
    @Test
    void malardduck_can_quack(){
        Duck mallardDuck = new MallardDuck();
        String quack = mallardDuck.quack();
        assertEquals(quack,MallardDuck.QUACK_QUACK );
    }

}