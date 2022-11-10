package tryCatchExamples.TryCatchTest.model.entities;

import tryCatchExamples.TryCatchTest.model.exceptions.DomainException;

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

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException{
        this.roomNumber = roomNumber;
        if(!checkOut.after(checkIn)){
            //instantiate exception
            throw new DomainException("Check-out date must be after check-in date");
        }
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

    //using throws DomainException to can launch personalized exception and the program treat this using try catch
    public void updateDate(Date checkIn, Date checkOut) throws DomainException{
        Date now = new Date();

        //wrong way validate using if and return string
        if(checkIn.before(now) || checkOut.before(now)){
            //instantiate exception using personalized exception
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if(!checkOut.after(checkIn)){
            //instantiate exception
            throw new DomainException("Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;

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
