package com.task;

public class Model {

    private String strValue = "";

    // The Program logic

    /**
     * in this method concatenate strValue to get sentence
     * @param strValue
     */
//    public void assembleOurMessage(String strValue){
//        this.strValue = String.join(" ", this.strValue, strValue);
//    }

    public int assembleOurMessage(String strValue){
        if (!this.strValue.contains(strValue)) {
            this.strValue = String.join(" ", this.strValue, strValue);
            return 1;
        }
        return 0;
    }

    public String getValue() {
        return strValue;
    }

    public void setValue(String strValue) {
        this.strValue = strValue;
    }

}