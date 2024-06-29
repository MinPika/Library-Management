package Includes;

public class RequestData {
	public int ISBN;// ISBN of the book that is being requested by the user.
	public int UserID;//User ID of the user who has made the request.
	public MyDate RequestDate;//The date on which the request has been made. Note
	//that the DateOfReturn for a book should be set to 1 month after the date that it is issued

	public String toString() {
        return "ISBN: " + ISBN + "\nUserID: " + UserID + "\n";
    }
}
