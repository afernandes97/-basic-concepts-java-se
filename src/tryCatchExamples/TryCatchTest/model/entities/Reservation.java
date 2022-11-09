package tryCatchExamples.TryCatchTest.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    //using to format date
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(){

    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){
        //difference two dates in milliseconds
        long diff = checkOut.getTime() - checkIn.getTime();
        //convert dif(difference time in checkout and check-in) to days
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String updateDate(Date checkIn, Date checkOut){
        Date now = new Date();

        //wrong way validate using if
        if(checkIn.before(now) || checkOut.before(now)){
            return "Reservation dates for update must be future";
        }
        if(!checkOut.after(checkIn)){
            return "Check-out date must be after check-in date";
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;

        return "Update";
    }

    @Override
    public String toString() {
        return "Reservation: " +
                "Room " + roomNumber +
                ", check-In: " + sdf.format(checkIn) +
                ", check-Out: " + sdf.format(checkOut) +
                ", " +
                duration() +
                " nights" ;
    }
}
