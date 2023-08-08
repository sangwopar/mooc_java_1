
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment comApartment) {
        if (this.squares > comApartment.squares) {
            return true;
        }  else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int ap1 = this.squares * this.princePerSquare;
        int ap2 = compared.squares * compared.princePerSquare;
        int result = ap1 - ap2;
        if (result >= 0) {
            return result;
        } else {
            return -1 * result;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int ap1 = this.squares * this.princePerSquare;
        int ap2 = compared.squares * compared.princePerSquare;
        if (ap1 > ap2) {
            return true;
        } else {
            return false;
        }
    }

}
