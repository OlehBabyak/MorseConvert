package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanener = new Scanner(System.in);
        System.out.println("Введіть текст для переводу в Азбуку Морзе: ");
        String simpleText = scanener.nextLine();

        System.out.println(textToMorse(simpleText));
    }

    public static String textToMorse(String simpleText) {
        String text;
        String morse;
        String converted = "";

        for (int i = 0; i < simpleText.length(); i++) {

            text = simpleText.charAt(i) + "";

            morse = morseCode.get(text.toLowerCase());

            converted = converted + morse;

            if (!morse.equals(" ")) {
                converted = converted + " ";
            }

        }

        return converted;

    }

    private static HashMap<String, String> morseCode = new HashMap<String, String>();

    static {
        morseCode.put("a", ".-");
        morseCode.put("b", "-...");
        morseCode.put("c", "-.-.");
        morseCode.put("d", "-..");
        morseCode.put("e", ".");
        morseCode.put("f", "..-.");
        morseCode.put("g", "--.");
        morseCode.put("h", "....");
        morseCode.put("i", "..");
        morseCode.put("j", ".---");
        morseCode.put("k", "-.-");
        morseCode.put("l", ".-..");
        morseCode.put("m", "--");
        morseCode.put("n", "-.");
        morseCode.put("o", "---");
        morseCode.put("p", ".--.");
        morseCode.put("q", "--.-");
        morseCode.put("r", ".-.");
        morseCode.put("s", "...");
        morseCode.put("t", "-");
        morseCode.put("u", "..-");
        morseCode.put("v", "...-");
        morseCode.put("w", ".--");
        morseCode.put("x", "-..-");
        morseCode.put("y", "-.--");
        morseCode.put("z", "--..");
        morseCode.put("0", "-----");
        morseCode.put("1", ".----");
        morseCode.put("2", "..---");
        morseCode.put("3", "...--");
        morseCode.put("4", "....-");
        morseCode.put("5", ".....");
        morseCode.put("6", "-....");
        morseCode.put("7", "--...");
        morseCode.put("8", "---..");
        morseCode.put("9", "----.");
        morseCode.put(".", ".-.-");
        morseCode.put(",", "--..--");
        morseCode.put("?", "..--..");

    }
}
