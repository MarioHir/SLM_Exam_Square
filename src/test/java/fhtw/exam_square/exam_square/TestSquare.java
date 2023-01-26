package fhtw.exam_square.exam_square;

import fhtw.exam_square.exam_square.service.SquareService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSquare {

    private final SquareService sqService = new SquareService();

    @Test
    void testSquare() {

        int sq = 10;
        int calcSq = (int)Math.pow(sq, 2);

        sqService.setNum(sq);
        sqService.calcSquare();

        assertEquals(calcSq, sqService.getNum());

    }
}
