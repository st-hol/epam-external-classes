package com.task;

public class Model {

    private String strValue = "";

    // The Program logic

    /**
     * in this method concatenate strValue to get sentence
     * @param strValue
     */
    public void assembleOurMessage(String strValue){
        this.strValue = String.join(" ", this.strValue, strValue);
    }

    public String getValue() {
        return strValue;
    }

    public void setValue(String strValue) {
        this.strValue = strValue;
    }

}