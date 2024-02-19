public class Ticket {
    private String fromAddress;
    private   String toAddress ;
    private   String date;
    private String gender;
    private   int noOfSeats;

    private int ticketAmount;
    public  int loginMobileNo;
    public  int password;

    public Ticket(String fromAddress, String toAddress, String date, String gender, int noOfSeats, int ticketAmount,int loginMobileNo,int password) {
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.date = date;
        this.gender = gender;
        this.noOfSeats = noOfSeats;
        this.ticketAmount = ticketAmount;
        this.loginMobileNo = loginMobileNo;
        this.password = password;
    }

    public Ticket(String fromAddress, String toAddress, String date, int noOfSeats, int ticketAmount) {
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.date = date;
        this.noOfSeats = noOfSeats;
        this.ticketAmount = ticketAmount;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getTicketAmount() {
        return ticketAmount;
    }

    public void setTicketAmount(int ticketAmount) {
        this.ticketAmount = ticketAmount;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "fromAddress='" + fromAddress + '\'' +
                ", toAddress='" + toAddress + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", ticketAmount=" + ticketAmount +
                ", loginMobileNo=" + loginMobileNo +
                ", password=" + password +
                '}';
    }
}
