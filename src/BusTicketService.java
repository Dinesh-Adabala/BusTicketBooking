public class BusTicketService {
    public Ticket ticket;

    protected Ticket selectionProcess(Ticket ticket) {
        System.out.println("rtc ticket booked");
        return ticket;
    }
}




