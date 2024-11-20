package com.google.firebase.firebaseintro;

public class Message {
    private String name;
    private String text;

    /**
     * Empty constructor needed for Firebase object deserialization.
     */
    public Message() {
    }

    public Message(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "(" + name + ":" + text + ")";
    }
}
