package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String description, PoemDecorator poemDecorator) {
        return poemDecorator.decorate(description);
    }
}