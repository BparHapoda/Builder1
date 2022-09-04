public class Car {
    private final NameOfCar name;
    private final Colors color;
    private final TypeEngine engine;
    private final TypeBodies body;
    private final int volume;
    private final double maxSpeed;
    private final double accelerationTo100;

    private Car(CarBuilder carBuilder) {
        this.name = carBuilder.name;
        this.color = carBuilder.color;
        this.engine = carBuilder.engine;
        this.body = carBuilder.body;
        this.volume = carBuilder.volume;
        this.maxSpeed = carBuilder.maxSpeed;
        this.accelerationTo100 = carBuilder.accelerationTo100;

    }

    public static class CarBuilder {
        private NameOfCar name;
        private Colors color;
        private TypeEngine engine;
        private TypeBodies body;
        private int volume;
        private double maxSpeed;
        private double accelerationTo100;

        public CarBuilder setName(NameOfCar name) {
            this.name = name;
            return this;
        }

        public CarBuilder setColor(Colors color) {
            this.color = color;
            return this;
        }

        public CarBuilder setEngine(TypeEngine engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setBody(TypeBodies body) {
            this.body = body;
            return this;
        }

        public CarBuilder setVolume(int volume) {
            this.volume = volume;
            return this;
        }

        public CarBuilder setMaxSpeed(double maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public CarBuilder setAccelerationTo100(double accelerationTo100) {
            this.accelerationTo100 = accelerationTo100;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return divider() + "Автомобиль : " + newLine() +
                divider() +
                "Марка : " + name + newLine() +
                "Цвет : " + color.getRussianColor() + newLine() +
                "Тип двигателя : " + engine.getEngine() + newLine() +
                "Кузов : " + body.getName() + newLine() +
                "Объем двигателя : " + volume + newLine() +
                "Максимальная скорость : " + maxSpeed + newLine() +
                "Разгон до 100 км/ч : " + accelerationTo100 + newLine() +
                divider();
    }

    public String newLine() {
        return "\n";
    }

    public String divider() {
        return "====================================" + newLine();
    }
}
