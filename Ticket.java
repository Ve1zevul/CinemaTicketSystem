public class Ticket {
    private int id;
    private Movie movie;
    private String date;
    private String time;
    private int price;
    public Ticket(int id,Movie movie,String date, String time,int price){
            this.id  = id;
            this.date = date;
            this.time = time;
            this.price = price;
    }
}
