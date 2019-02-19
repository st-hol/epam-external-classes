package ua.training.controller;

public enum DBNoteBook {
    USER1("Petro", "petr0"),
    USER2("Alex", "alexxx"),
    USER3("Misha", "mishanya123");


    private String name;
    private String nickname;


    DBNoteBook(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public static void checkExistingNickname(String enteredNickname) throws NotUniqueNicknameException {
        for (DBNoteBook item : DBNoteBook.values()){
            if (item.nickname.equals(enteredNickname)) {
                throw new NotUniqueNicknameException("Already existing login", enteredNickname);
            }
        }
    }
}
