package org.nikitakosh.solvers;

import org.nikitakosh.Cell;
import org.nikitakosh.Coordinate;
import org.nikitakosh.Maze;

import java.util.List;

public interface Solver {
    List<Cell> solve(Maze maze, Coordinate start, Coordinate end);
}
