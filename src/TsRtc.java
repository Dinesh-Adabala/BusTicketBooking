public class TsRtc extends BusTicketService {
    private  int ticketCost = 700;
    private  int ticketAmount;


    public int paymentProcess(int noOfSeats){
        this.ticketAmount  = noOfSeats*ticketCost;
        System.out.println(ticketAmount);

        return ticketAmount;
    }
    @Override
    public Ticket selectionProcess(Ticket ticket){
        int tm = this.paymentProcess(ticket.getNoOfSeats());
        ticket.setTicketAmount(tm);
        System.out.println("Tsrtc ticket booked");
        System.out.println(ticket);

        return ticket;
    }
}
