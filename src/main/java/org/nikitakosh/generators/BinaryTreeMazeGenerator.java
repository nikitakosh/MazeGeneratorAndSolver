package org.nikitakosh.generators;

import org.nikitakosh.Cell;
import org.nikitakosh.Maze;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BinaryTreeMazeGenerator implements Generator {

    private final List<List<Boolean>> rightWalls = new ArrayList<>();
    private final List<List<Boolean>> bottomWalls = new ArrayList<>();

    @Override
    public Maze generate(int height, int width) {
        initializeRightWallsAndBottomWalls(height, width);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                boolean choice = new Random().nextBoolean();
                if (i != height - 1 || j != width - 1) {
                    if (j == width - 1) {
                        bottomWalls.get(i).set(j, false);
                    } else if (i == height - 1) {
                        rightWalls.get(i).set(j, false);
                    } else {
                        if (choice) {
                            rightWalls.get(i).set(j, false);
                        } else {
                            bottomWalls.get(i).set(j, false);
                        }
                    }
                }
            }
        }
        Cell[][] graph = MazeGraphGenerator.generateGraph(height, width, bottomWalls, rightWalls);
        return new Maze(height, width, graph, rightWalls, bottomWalls);
    }

    private void initializeRightWallsAndBottomWalls(int height, int width) {
        for (int i = 0; i < height; i++) {
            rightWalls.add(new ArrayList<>());
            for (int j = 0; j < width; j++) {
                rightWalls.get(i).add(true);
            }
        }
        for (int i = 0; i < height; i++) {
            bottomWalls.add(new ArrayList<>());
            for (int j = 0; j < width; j++) {
                bottomWalls.get(i).add(true);
            }
        }
    }
}
