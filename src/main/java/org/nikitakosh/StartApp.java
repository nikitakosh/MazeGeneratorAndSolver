package org.nikitakosh;

import org.nikitakosh.generators.BinaryTreeMazeGenerator;
import org.nikitakosh.generators.EllerMazeGenerator;
import org.nikitakosh.generators.Generator;
import org.nikitakosh.renders.MazeRender;
import org.nikitakosh.solvers.BFSSolver;
import org.nikitakosh.solvers.DFSSolver;
import org.nikitakosh.solvers.Solver;

import java.util.List;

public class StartApp {

    public static void start(int parsedHeight, int parsedWidth, int parsedStartX, int parsedStartY, int parsedEndX, int parsedEndY, String parsedGeneration, String parsedSolver) {
        Generator generator = null;
        if (parsedGeneration.equals("eller")) {
            generator = new EllerMazeGenerator();
        } else if (parsedGeneration.equals("binary")) {
            generator = new BinaryTreeMazeGenerator();
        } else {
            System.out.println("unknown generator type");
            System.exit(0);
        }
        Maze maze = generator.generate(parsedHeight, parsedWidth);
        Solver solver = null;
        if (parsedSolver.equals("dfs")) {
            solver = new DFSSolver();
        } else if (parsedSolver.equals("bfs")) {
            solver = new BFSSolver();
        } else {
            System.out.println("unknown solver type");
            System.exit(0);
        }
        List<Cell> path = solver.solve(maze, new Coordinate(parsedStartX, parsedStartY),
                new Coordinate(parsedEndX, parsedEndY));
        MazeRender mazeRender = new MazeRender();
        System.out.println("\n" + mazeRender.render(maze));
        System.out.println("\n" + mazeRender.render(maze, path));
    }
}
