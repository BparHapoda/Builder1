public enum TypeEngine {
    PETROL("Бензиновый"), DIESEL("Дизельный"), HYBRID("Гибридный"), ELECTRIC("Электрический");
    private final String russianEngine;

    TypeEngine(String russianEngine) {
        this.russianEngine = russianEngine;
    }

    public String getEngine() {
        return russianEngine;
    }

}
