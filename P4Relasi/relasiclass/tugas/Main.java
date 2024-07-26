public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Artist 1", "Genre 1");
        Artist artist2 = new Artist("Artist 2", "Genre 2");

        Location location1 = new Location("Venue 1", "City 1");
        Location location2 = new Location("Venue 2", "City 2");
     
        Concert concert1 = new Concert(artist1, location1, 10);
        Concert concert2 = new Concert(artist2, location2, 15);

        TicketBooking ticketBooking = new TicketBooking(10);

        ticketBooking.addConcert(concert1);
        ticketBooking.addConcert(concert2);

        ticketBooking.displayConcerts();
        System.out.println();

        ticketBooking.bookTicket(artist1, location1, 5);
        ticketBooking.bookTicket(artist2, location2, 10);
        ticketBooking.bookTicket(artist1, location1, 5); //sudah dibooking

        concert1.cancelSeat(5);

        System.out.println();
        ticketBooking.displayConcerts();
        ticketBooking.bookTicket(artist1, location1, 5); //bisa dibooking kembali
    }
}
