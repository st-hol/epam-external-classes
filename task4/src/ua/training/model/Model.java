package ua.training.model;

import ua.training.controller.InputNote;

public class Model {

    private InputNote note;

    public Model(){
        note = new InputNote();
    }

    public void setNote(InputNote note) {
        this.note = note;
    }


}