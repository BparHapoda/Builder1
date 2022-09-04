public enum TypeBodies {
    Sedan("Седан"), SUV("Внедорожник"), PickUp("Пикап"), Coupe("Купе"),
    Minivan("Минивэн"), Wagon("Универсал"), Hatchback("Хэтчбэк");
    private final String russianBody;

    TypeBodies(String russianBody) {
        this.russianBody = russianBody;
    }

    public String getName() {
        return russianBody;
    }

}