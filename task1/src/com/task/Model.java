package com.task;

public class Model {

    private String strValue = "";

    // The Program logic

    /**
     * This method concatenate strValue to get sentence
     * @param strValue
     */
//    public void assembleOurMessage(String strValue){
//        this.strValue = String.join(" ", this.strValue, strValue);
//    }


    /**
     * This method concatenate strValue to get sentence.
     * If strValue wasn't already in sentence
     * @param scan:Scanner
     * @return :Integer
     */
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