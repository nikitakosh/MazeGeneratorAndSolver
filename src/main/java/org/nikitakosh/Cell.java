package org.nikitakosh;

import java.util.List;

public record Cell(int row, int col, List<Direction> directions) {
    public enum Direction {TOP, RIGHT, BOTTOM, LEFT}
}

