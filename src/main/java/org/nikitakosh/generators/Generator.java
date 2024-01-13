package org.nikitakosh.generators;

import org.nikitakosh.Maze;

public interface Generator {
    Maze generate(int height, int width);
}
