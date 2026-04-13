package org.example;

public class uc5 {

    public static void main(String[] args) {

        String name = "";
        StringBuilder nameBuilder = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            nameBuilder.append(args[i]);
            nameBuilder.append(i < args.length - 1 ? ", " : "");
        }

        name = (args.length == 0)
                ? "Hello, World!"
                : "Hello, " + nameBuilder.toString();

        System.out.println(name);
    }
}