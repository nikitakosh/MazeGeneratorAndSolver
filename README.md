# Maze Solver 

## Overview
This Java project provides a command-line tool for generating and solving mazes. The program utilizes various parameters to customize the maze generation and solving process.

## Features
- **Maze Generation:** Users can specify the maze height, width, starting and ending coordinates, and choose between two generation methods: binary tree algorithm or Eller's algorithm.
- **Maze Solving:** The generated maze can be solved using either depth-first search (DFS) or breadth-first search (BFS) algorithms.
- **Command-Line Interface:** The program accepts input through a command-line interface, making it easy to customize maze generation and solving options.

## Getting Started

### Prerequisites
Make sure you have Java Runtime Environment (JRE) installed on your system.

### How to Run
1. Download the latest release of the project from the [Releases](link to releases page) page.
2. Open a terminal and navigate to the directory where you downloaded the JAR file.
3. Run the program with desired parameters. For example:
    ```bash
    java -jar MazeSolverApp.jar --height 10 --width 10 --start_x 0 --start_y 0 --end_x 9 --end_y 9 --generation eller --solver dfs
    ```

### Command-Line Parameters
- `--height`: Maze height.
- `--width`: Maze width.
- `--start_x`: Starting coordinate x.
- `--start_y`: Starting coordinate y.
- `--end_x`: Finish coordinate x.
- `--end_y`: Finish coordinate y.
- `--generation`: Generation method (binary/eller).
- `--solver`: Solution method (dfs/bfs).

### Example
```bash
java -jar MazeSolverApp.jar --height 5 --width 5 --start_x 0 --start_y 0 --end_x 4 --end_y 4 --generation eller --solver dfs
```
### Example of work
![image](https://github.com/nikitakosh/MazeGeneratorAndSolver/assets/113053952/7fdec73b-72d5-4846-b323-fc46e8b402f2)


