package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String beauty1 = poemBeautifier.beautify("Sample text", (description -> description.toUpperCase()));
        System.out.println(beauty1);

        String beauty2 = poemBeautifier.beautify("Sample text", (description -> "ABC" + description + "ABC"));
        System.out.println(beauty2);

        String beauty3 = poemBeautifier.beautify("Sample text", (description -> description.replace(" ", "+")));
        System.out.println(beauty3);

        String beauty4 = poemBeautifier.beautify("Sample text", (description -> description.concat("Yes")));
        System.out.println(beauty4);





    }
}

