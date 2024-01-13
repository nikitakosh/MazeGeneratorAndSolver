package org.nikitakosh;

import java.util.List;

public record Maze(int height, int width, Cell[][] graph, List<List<Boolean>> rightWalls,
                   List<List<Boolean>> bottomWalls) {
}
