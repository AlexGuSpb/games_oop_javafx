package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BishopBlackTest {

    @Test
    void position() {
        Figure bishopBlack = new BishopBlack(Cell.A1);
        assertEquals(Cell.A1, bishopBlack.position());
    }

    @Test
    void copy() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(steps, bishopBlack.way(Cell.G5));
    }

    @Test
    void way() {
        Figure bishopBlack = new BishopBlack(Cell.A1);
        Figure bishopBlack1 = new BishopBlack(Cell.B1);
        assertEquals(bishopBlack1.position(), bishopBlack.copy(Cell.B1).position());
    }
}