package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        return switch (lang) {
            case "sp" -> "¡Hola, Mundo!";
            case "fr" -> "Bonjour, le monde!";
            case "woh" -> "We out here!";
            default -> "Hello, World!";
        };
    }
}
