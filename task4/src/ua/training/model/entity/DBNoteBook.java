package ua.training.model.entity;

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

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public static boolean checkExistingNickname (String nickname){
        for (DBNoteBook note : DBNoteBook.values()){
            if (note.getNickname().equals(nickname)){return true;}
        }
        return  false;
    }


//    public static void checkExistingNickname(String enteredNickname) throws NotUniqueNicknameException {
//        for (DBNoteBook item : DBNoteBook.values()){
//            if (item.nickname.equals(enteredNickname)) {
//                throw new NotUniqueNicknameException("Already existing login", enteredNickname);
//            }
//        }
//    }

}
