package com.kadenfrisk.draganddrop.models.blocks.logic;

import com.kadenfrisk.draganddrop.models.Block;

import static com.kadenfrisk.draganddrop.util.LabelCreator.createLabel;

public class ForLoopBlock extends Block {

    private final String name;

    public ForLoopBlock() {
        this.name = "For";

        // Add the name to the actual block to be displayed on screen
        this.getChildren().add(createLabel(name));

        // Set the blocks css class
        this.getStyleClass().add("for-loop-block");
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
