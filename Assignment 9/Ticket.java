package cdac;
class Ticket {
    int ticketId;
    String customerName;
    String issueDescription;

    Ticket(int ticketId, String customerName,String issueDescription) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.issueDescription = issueDescription;
    }

    void display() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Issue: " + issueDescription);
    }
}