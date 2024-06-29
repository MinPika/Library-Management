package Includes;

public class Response {
    public int WaitingTime;//The amount of time that it would take for the request to
    /*be processed. First response would be sent out the moment a request is received
    and it would account for 5 seconds of processing time for each element in the
    request queue. The second response would be sent after the request has been
    processed at the head of the queue and would account for the return date of the
    book in case it is currently borrowed.*/
    public boolean Available; /* true indicates that the book is currently available with
    the library and not borrowed. Set this accordingly in both responses. */
    public int PositionInQueue;  /* For first response, this should be the number of
    requests in the queue. For the second response, this should be the number of
    people waiting to borrow this book */   //removable
}
