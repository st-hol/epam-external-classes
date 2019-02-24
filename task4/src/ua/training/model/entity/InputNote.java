package ua.training.model.entity;

public class InputNote {

    private String name;
    private String nickname;
    private String phone;
    private String address;
    private String email;
    private String url;
    private String date;


    public InputNote(String name, String nickname) throws NotUniqueNicknameException {

        if (DBNoteBook.checkExistingNickname(nickname)) {
            throw new NotUniqueNicknameException("Already existing login", nickname);
        }

        this.name = name;
        this.nickname = nickname;
    }




    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "NoteBook{" +
                "Name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
