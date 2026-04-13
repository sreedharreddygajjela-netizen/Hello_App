package org.example;
public class uc4 {
    public static void main(String[] args) {
        String name = "";
        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            nameBuilder.append(args[i]);
            if (i < args.length - 1) {
                nameBuilder.append(", ");
            }
        }
        name = "my name is " + nameBuilder.toString();
        System.out.print(name);
    }
}