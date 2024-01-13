package org.nikitakosh;

import org.apache.commons.cli.*;

public class ExecApp {
    public static void main(String[] args) {
        Options options = new Options();

        Option height = new Option("height", true, "maze height");
        Option width = new Option("width", true, "maze width");
        Option startX = new Option("start_x", true, "start coordinate x");
        Option startY = new Option("start_y", true, "start coordinate y");
        Option endX = new Option("end_x", true, "finish coordinate x");
        Option endY = new Option("end_y", true, "finish coordinate y");
        Option generation = new Option("generation", true, "generation method (binary/eller)");
        Option solver = new Option("solver", true, "solution method (dfs/bfs)");

        options.addOption(height);
        options.addOption(width);
        options.addOption(startX);
        options.addOption(startY);
        options.addOption(endX);
        options.addOption(endY);
        options.addOption(generation);
        options.addOption(solver);
        CommandLineParser parser = new BasicParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            int parsedHeight = Integer.parseInt(cmd.getOptionValue("height", "10"));
            int parsedWidth = Integer.parseInt(cmd.getOptionValue("width", "10"));
            int parsedStartX = Integer.parseInt(cmd.getOptionValue("start_x", "0"));
            int parsedStartY = Integer.parseInt(cmd.getOptionValue("start_y", "0"));
            int parsedEndX = Integer.parseInt(cmd.getOptionValue("end_x", "9"));
            int parsedEndY = Integer.parseInt(cmd.getOptionValue("end_y", "9"));
            String parsedGeneration = cmd.getOptionValue("generation", "eller");
            String parsedSolver = cmd.getOptionValue("solver", "dfs");
            StartApp.start(parsedHeight, parsedWidth, parsedStartX, parsedStartY,
                    parsedEndX, parsedEndY, parsedGeneration, parsedSolver);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
