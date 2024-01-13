package org.nikitakosh.renders;

import org.nikitakosh.Cell;
import org.nikitakosh.Maze;

import java.util.List;

public interface Render {
    String render(Maze maze);

    String render(Maze maze, List<Cell> path);
}
