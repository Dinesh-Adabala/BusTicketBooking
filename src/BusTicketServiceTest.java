public class BusTicketServiceTest {
    public static void main(String[] args) {

        Ticket ticket = new Ticket("hyd","plk","19/02/2023",2,678);
        Ticket ticketR = new Ticket("hyd","plk","19/02/2023","female",2,987,900030833,123456);
        Ticket ticketA  = new Ticket("AMP","HYD","29/02/2023","male",4,987,814383756,123456);
        RedBus redBus = new RedBus();
        redBus.selectionProcess(ticketR);

        TsRtc tsRtc = new TsRtc();
        tsRtc.selectionProcess(ticket);

        AbhiBus abhiBus = new AbhiBus();
        abhiBus.selectionProcess(ticketA);
    }
}
