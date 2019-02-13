package ua.training.controller;

public interface Regex {

    // email@gmail.com
    String REGEX_EMAIL = "([\\w\\.-]+)@([\\w\\.-]+)([\\w\\.-]+)";

    // https://www.youtube.com/watch?v=L6K8Uq88BEQ&index=17&list=PLLUYFDT7vPkqBZQsTGBpGCjIoePETnOxi&ab_channel=LanaDelRey
    String REGEX_URL = "((https?|ftp)://)?([a-z0-9]{3})\\.([a-z0-9-]{1,})\\.([a-z]{2,6})(/?)(/[\\w\\d-=&\\?]*)\\s?";

    // +38(044)555-55-55 || 0445555555
    String REGEX_PHONE = "((\\+?)\\d{2})?\\(?\\d{3}\\)?\\d{3}-?\\d{2}-?\\d{2}";

    // d'Ar-ta’nian
    String REGEX_NAME = "([a-zA-z]{1,}'?-?’? ?){1,10}";

    String REGEX_NICKNAME = "[a-zA-Z0-9_.]{1,30}";

    String REGEX_COMMENT = ".{,1000}";

    //10302, Rgt-Opavlo, ul. Akademika Typoleva 21/A, room 21
    String REGEX_ADDRESS = "([\\w\\s\\W]+[\\w\\W]?)\\s([\\d\\-/\\w]*),\\s([\\d\\s\\w\\./]+)";

    // 10.10.2000 | 10-10-2000 | 10/10/2000 | 10 10 2000
    String REGEX_DATE = "\\d{2}[/|\\s|\\.|-]\\d{2}[/|\\s|\\.|-]\\d{4}";
}
