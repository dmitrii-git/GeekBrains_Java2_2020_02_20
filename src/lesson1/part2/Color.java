package lesson1.part2;

public enum Color {
//    BLACK,
//    WHITE,
//    RED,
//    GRAY


    BLACK("Черный"),
    WHITE("Белый"),
    RED("Рыжий"),
    GRAY("Серый");

    private String russianColor;

    Color(String russianColor) {
        this.russianColor = russianColor;
    }

    public String getRussianColor() {
        return russianColor;
    }
}
