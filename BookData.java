package Includes;

public class BookData {
    public boolean BorrowedStatus; //true indicates that the book is currently borrowed and not in the library.
    public int BorrowedByUserID; // UserID of the person who has borrowed the book. If the book isn’t borrowed, it is set as-1.
    public int ISBN; // The ISBN of the book 
    public String Publisher; //Name of the publisher 
    public String Author; //Name of the author 
    public MyDate DateOfReturn; // Date on which book has to be returned. If the book isn't borrowed, the date will be last returned date.      // can be replaced with Time to Return
}
