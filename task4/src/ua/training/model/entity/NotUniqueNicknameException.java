package ua.training.model.entity;

public class NotUniqueNicknameException extends Exception {

    private String enteredNickname;

    public NotUniqueNicknameException(String message, String enteredNickname) {
        super(message);
        this.enteredNickname = enteredNickname;
    }

    public String getEnteredNickname() {
        return enteredNickname;
    }


}
