package pl.sdacademy;

import javax.persistence.*;

@Entity
public class BookRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_record_id")
    private int bookRecordId;

    @Column(name = "book_id")
    private int bookId;

    @Column(name = "registration_number")
    private String registrationNumber;

    public BookRegistration(){
    }

    public int getBookRecordId() {
        return bookRecordId;
    }

    public void setBookRecordId(int bookRecordId) {
        this.bookRecordId = bookRecordId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public BookRegistration(int bookRecordId, int bookId, String registrationNumber) {
        this.bookRecordId = bookRecordId;
        this.bookId = bookId;
        this.registrationNumber = registrationNumber;
    }
}
