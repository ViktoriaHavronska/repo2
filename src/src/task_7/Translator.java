package task_7;

public class Translator {
    private final String cat = "кіт";
    private final String book = "книга";
    private final String family = "сімя";
    private final String laptop = "ноутбук";


    public String getCat() {
        return cat;
    }

    public String getBook() {
        return book;
    }

    public String getFamily() {
        return family;
    }

    public String getLaptop() {
        return laptop;
    }

    @Override
    public String toString() {
        return "Translator{" +
                "cat='" + cat + '\'' +
                ", book='" + book + '\'' +
                ", family='" + family + '\'' +
                ", laptop='" + laptop + '\'' +
                '}';
    }
}
