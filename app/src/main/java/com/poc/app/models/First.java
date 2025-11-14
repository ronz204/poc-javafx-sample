package com.poc.app.models;

import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class First {
    private final StringProperty message;
    private int clickCount;

    public First() {
        this.message = new SimpleStringProperty("Hello from JavaFX MVC!");
        this.clickCount = 0;
    }

    public StringProperty messageProperty() {
        return message;
    }

    public String getMessage() {
        return message.get();
    }

    public void setMessage(String message) {
        this.message.set(message);
    }

    public void incrementCounter() {
        clickCount++;
        setMessage("Button clicked " + clickCount + " time" + (clickCount == 1 ? "!" : "s!"));
    }

    public void reset() {
        clickCount = 0;
        setMessage("Hello from JavaFX MVC!");
    }

    public int getClickCount() {
        return clickCount;
    }
}
