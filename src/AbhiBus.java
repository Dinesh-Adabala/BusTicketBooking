public class AbhiBus extends BusTicketService {
    public   int ticketCost = 1400;
    public   int ticketAmount;
    private int loginMobileNoDB = 814383756;
    private int passwordDB = 123456;

    public  boolean loginProcess(Ticket ticket){
        if (loginMobileNoDB==ticket.loginMobileNo && passwordDB==ticket.password){
            System.out.println("Login successfull");
            return true;
        }else {
            System.out.println("Login Failed (Incorrect Password or Mobile Number) ");
            return false;
        }

    }

    public int paymentProcess(Ticket ticket){
        if (this.loginProcess(ticket)){
            this.ticketAmount  = ticket.getNoOfSeats()*ticketCost;
            //System.out.println(ticketAmount);

        }return ticketAmount;

    }
    BusTicketService bts = new BusTicketService();
    @Override
    protected Ticket selectionProcess(Ticket ticket){
        if (this.loginProcess(ticket)) {
            int tm = paymentProcess(ticket);
            ticket.setTicketAmount(tm);
            System.out.println(ticket);
            System.out.println("Abhi Bus ticket booked ");
            return ticket;

        }
        return ticket;
    }
    public int getLoginMobileNoDB() {
        return loginMobileNoDB;
    }

    public void setLoginMobileNoDB(int loginMobileNoDB) {
        this.loginMobileNoDB = loginMobileNoDB;
    }

    public int getPasswordDB() {
        return passwordDB;
    }

    public void setPasswordDB(int passwordDB) {
        this.passwordDB = passwordDB;
    }



    public int getTicketCost() {
        return ticketCost;
    }

    public int getTicketAmount() {
        return ticketAmount;
    }

    @Override
    public String toString() {
        return "RedBus{" +
                "ticketCost=" + ticketCost +
                ", ticketAmount=" + ticketAmount +
                '}';
    }

}
