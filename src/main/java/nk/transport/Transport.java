package nk.transport;

import lombok.Data;

@Data
public abstract class Transport {
    private String typeTransport;
    private int numberOfWheel;
    private int maxSpeed;
    private String about;

    Transport(String typeTransport, int numberOfWheel, int maxSpeed, String about) {
        if (numberOfWheel < 0) {
            throw new IllegalArgumentException("Должно быть больше 0.");
        } else if (maxSpeed < 0) {
            throw new IllegalArgumentException("Должно быть больше 0.");
        } else {
            this.typeTransport = typeTransport;
            this.numberOfWheel = numberOfWheel;
            this.maxSpeed = maxSpeed;
            this.about = about;
        }
    }

    public void printParameters() {
        System.out.println("Наименование транспорта: " + this.typeTransport);
        System.out.println("Кол-во колес: " + this.numberOfWheel);
        System.out.println("Максимальная скорость: " + this.maxSpeed);
        System.out.println("Уникальные характеристики: " + this.about);
    }
}