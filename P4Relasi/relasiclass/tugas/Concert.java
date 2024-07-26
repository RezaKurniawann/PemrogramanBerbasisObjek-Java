public class Concert {
    private Artist artist;
    private Location location;
    private Seat[] seats;

    public Concert(Artist artist, Location location, int numSeats) {
        this.artist = artist;
        this.location = location;
        this.seats = new Seat[numSeats];
        for (int i = 0; i < numSeats; i++) {
            seats[i] = new Seat(i + 1);
        }
    }

    public Artist getArtist() {
        return artist;
    }

    public Location getLocation() {
        return location;
    }

    public Seat[] getSeats() {
        return seats;
    }

    public boolean bookSeat(int seatNum) {
        if (seatNum > 0 && seatNum <= seats.length) {
            return seats[seatNum - 1].bookSeat();
        }
        return false;
    }

    public boolean cancelSeat(int seatNum) {
        if (seatNum > 0 && seatNum <= seats.length) {
            return seats[seatNum - 1].cancelSeat();
        }
        return false;
    }
}