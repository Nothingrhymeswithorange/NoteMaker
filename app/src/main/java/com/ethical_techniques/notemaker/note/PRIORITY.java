package com.ethical_techniques.notemaker.note;

/**
 * enum representing the priority level of the note.
 * This is used instead of a boolean var to allow for expanding to a wider variety of
 * priority levels in the future.
 */
public enum PRIORITY {
    HIGH("high"),
    LOW("low");

    String stringIdentifier;

    PRIORITY(String stringIdentifier) {
        this.stringIdentifier = stringIdentifier;
    }

   public String getString() {
        return stringIdentifier;
    }
}
