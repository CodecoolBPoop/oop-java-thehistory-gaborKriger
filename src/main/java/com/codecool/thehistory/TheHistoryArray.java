package com.codecool.thehistory;

import java.util.Arrays;

public class TheHistoryArray implements TheHistory {

    /**
     * This implementation should use a String array so don't change that!
     */

    private String[] wordsArray = new String[0];

    @Override
    public void add(String text) {
        //TODO: check the TheHistory interface for more information
        String[] temporaryStorage = text.split(" ");
        System.arraycopy(
                wordsArray,0,
                temporaryStorage,0, wordsArray.length);
        wordsArray = temporaryStorage;
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        //TODO: check the TheHistory interface for more information
        int occurrenceCounter = 0;
        for (String word : wordsArray) {
            if (word.equals(wordToBeRemoved)) {
                occurrenceCounter++;
            }
        }
        String[] temporaryStorage = new String[wordsArray.length - occurrenceCounter];
        int fillCounter = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            if (!wordsArray[i].equals(wordToBeRemoved)) {
                temporaryStorage[i - fillCounter] = wordsArray[i];
            } else {
                fillCounter++;
            }
        }
        wordsArray = temporaryStorage;
    }


    @Override
    public int size() {
        //TODO: check the TheHistory interface for more information
        return wordsArray.length;
    }

    @Override
    public void clear() {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public void replaceOneWord(String from, String to) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArray) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }
}
