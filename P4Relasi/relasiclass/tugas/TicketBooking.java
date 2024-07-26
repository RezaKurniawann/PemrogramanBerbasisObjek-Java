public class TicketBooking {
    private Concert[] concerts;
    private int numConcerts;

    public TicketBooking(int maxConcerts) {
        concerts = new Concert[maxConcerts];
        numConcerts = 0;
    }

    public void addConcert(Concert concert) {
        if (numConcerts < concerts.length) {
            concerts[numConcerts] = concert;
            numConcerts++;
        } else {
            System.out.println("Maximum number of concerts reached.");
        }
    }

    public void bookTicket(Artist artist, Location location, int seat) {
        for (int i = 0; i < numConcerts; i++) {
            if (concerts[i].getArtist().equals(artist) && concerts[i].getLocation().equals(location)) {
                if (concerts[i].bookSeat(seat)) {
                    System.out.println("Ticket booked successfully for " + artist.getName() + "'s concert at " +
                            location.getVenue() + ", " + location.getCity() + ", Seat " + seat);
                } else {
                    System.out.println("Seat " + seat + " is already booked!");
                }
                return;
            }
        }
        System.out.println("Concert not found!");
    }

    public void displayConcerts() {
        System.out.println("Available Concerts:");
        for (int i = 0; i < numConcerts; i++) {
            System.out.println("- " + concerts[i].getArtist().getName() + " at " + concerts[i].getLocation().getVenue() +
                    ", " + concerts[i].getLocation().getCity());
        }
    }
}