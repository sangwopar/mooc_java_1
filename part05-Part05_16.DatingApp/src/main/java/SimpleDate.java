
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    
    public void advance() {
        ++day;
        if (day > 30) {
            day = 1;
            ++month;
        }
        if (month > 12) {
            month = 1;
            ++year;
        }
    }
    public void advance(int howManyDays) {
        day += howManyDays;
        if (day > 30) {
            int div = day / 30;
            int remain = day % 30;
            day = remain;
            month += div;
        }

        if (month > 12) {
            int div = month / 12;
            int remain = month / 12;
            month = remain;
            year += div;
        }

    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate copySimpleDate = new SimpleDate(this.day, this.month, this.year);
        copySimpleDate.advance(days);
        
        return copySimpleDate;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
