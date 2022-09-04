public enum Colors {
    RED("Красный"), BLACK("Черный"), WHITE("Белый"), GREEN("Зеленый"), BLUE("Синий"),
    YELLOW("Желтый"),
    BROWN("Коричневый"), GRAY("Серый"), ORANGE("Оранжевый"), PURPLE("Пурпурный");
    private final String russianColor;

    Colors(String russianColor) {
        this.russianColor = russianColor;
    }

    public String getRussianColor() {
        return russianColor;
    }

}
