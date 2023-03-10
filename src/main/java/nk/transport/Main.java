package nk.transport;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: Main.java 0 1 2 3 ");
            return;
        }
        TransportFactory factory = new TransportFactory();
        Transport vehicle;
        for (String arg : args) {
            int type = Integer.parseInt(arg);
            if (type >= 0 && type < TransportType.values().length) {
                vehicle = factory.createTransport(TransportType.values()[type]);
                vehicle.printParameters();
                System.out.println();
            } else {
                System.out.println("Такого не знаю.");
            }
        }
    }
}
