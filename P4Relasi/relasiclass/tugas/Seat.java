public class Seat {
    private int seatNumber;
    private boolean booked;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isBooked() {
        return booked;
    }

    public boolean bookSeat() {
        if (!booked) {
            booked = true;
            return true;
        }
        return false;
    }

    public boolean cancelSeat() {
        if (booked) {
            booked = false;
            return true;
        }
        return false;
    }
}