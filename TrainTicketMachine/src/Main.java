public class Main {
    public static void main(String[] args) {
        double charge = TicketSystem.getCharge(Location.SUNNYCITY, false, 2);
        System.out.println("$" +charge);
    }
}