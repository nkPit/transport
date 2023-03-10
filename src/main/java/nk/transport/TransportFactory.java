package nk.transport;

public class TransportFactory {
    public  Transport createTransport(TransportType typeTransport){
        Transport transport;
        switch(typeTransport){
            case Motorcycle:
                transport = new Motorcycle("Мотоцикл", 2, 200, "Это мотоцикл");
                break;
            case Scooter:
                transport = new Scooter("Самокат", 2, 50, "Это самокат");
                break;
            case Car:
                transport = new Car("Автомобиль", 4, 150, "Это автомобиль");
                break;
            case Bus:
                transport = new Bus("Автобус", 6, 100, "Это автобус");
                break;
            default:
                throw new IllegalArgumentException(typeTransport + "не найден.");
                        
        }
        return transport;
    }
}