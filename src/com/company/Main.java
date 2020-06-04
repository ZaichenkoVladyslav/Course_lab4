/*
 *
 * Classname Main
 *
 * 31 May 2020
 *
 * Copyright Zaichenko Vladyslav KNUTE
 *
 * Module 1 task 2 "Array practice"
 *
 * 1. Find in the net and download a text version of a novel about Harry Potter.
 * For instance, "Harry Potter and the Sorcerer's Stone".
 * 2. Split the novel into an array of words.
 * 3. Clean the words from a punctuation signs.
 * 4. Create another array containing distinct words.
 * 5. Order the words in alphabetic order.
 *
 */

package com.company;

    import java.io.IOException;
    import java.nio.file.Files;
    import java.nio.file.Paths;
    import java.util.Arrays;

        public class Main {

            public static void main(String[] args) throws IOException {
                String text = new String(Files.readAllBytes(Paths.get
                        ("/Users/Vladyslav/Desktop/Harry.txt")));

                String cleanerText = text
                        .replaceAll("\\.", "")
                        .replaceAll(",", "")
                        .replaceAll("\"", "")
                        .replaceAll("!", "")
                        .replaceAll(";", "")
                        .replaceAll(":", "")
                        .replaceAll("\\?", "")
                        .replaceAll("\\(", "")
                        .replaceAll("\\)", "")
                        .replaceAll("\"", "")
                        .replaceAll("\n", "")
                        .replaceAll("�", "")
                        .replaceAll("0'", "")
                        .replaceAll("--", "")
                        .toLowerCase();

                String[] words = cleanerText.split(" ");

                String distinctString = " ";

                for (int i = 0; i < words.length; i++) {
                    if (!distinctString.contains(words[i])) {
                        distinctString += words[i] + " ";
                    }
                }

                String[] distinctArray = distinctString.split(" ");

                Arrays.sort(distinctArray);

                for (int i = 0; i < distinctArray.length; i++) {
                    System.out.println(distinctArray[i]);
                }
            }
    }
