package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int iterations = 0;
        for (int i = 1; i < elements.length; i++) {
            int current = elements[i];
            int idx = i - 1;
            
            while (idx >= 0 && current < elements[idx]) {
                iterations++;
                elements[idx + 1] = elements[idx];
            
                idx--; 
            }
            elements[idx + 1] = current;
        }

        System.out.println("Insertion sort: " + iterations + " iterations");
        return elements;
    }

    public static int[] selectionSort(int[] elements) {
        int iterations = 0;
        for (int i = 0; i < elements.length; i++) {
            int min = elements[i];
            int minIdx = i;

            for (int j = i + 1; j < elements.length; j++) {
                iterations++;
                if (elements[j] < min) {
                    min = elements[j];
                    minIdx = j;
                }
            }

            int temp = elements[minIdx];
            elements[minIdx] = elements[i];
            elements[i] = temp;
        }
        System.out.println("Selection sort: " + iterations + " iterations");
        return elements;
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int iterations = 0;
        for (int i = 1; i < words.size(); i++) {
            String current = words.get(i);
            
            int idx = i - 1;
            while (idx >= 0 && current.compareTo(words.get(idx)) < 0) {
                iterations++;
                words.set(idx + 1, words.get(idx));

                idx -= 1;
            }
            words.set(idx + 1, current);
        }
        System.out.println(iterations);
        return words;
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int iterations = 0;
        for (int i = 0; i < words.size(); i++) {
            String min = words.get(i);
            int minIdx = i;

            for (int j = i +1; j < words.size(); j++) {
                iterations++;
                if (words.get(j).compareTo(min) < 0) {
                    min = words.get(j);
                    minIdx = j;
                }
            }

            String temp = words.get(minIdx);
            words.set(minIdx, words.get(i));
            words.set(i, temp);
        }
        System.out.println(iterations);
        return words;
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

   
}