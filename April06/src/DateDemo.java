public class DateDemo {

    int day;
    int month;
    int year;

    public DateDemo(int day) {
        this.day = day;
    }

    public DateDemo(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public DateDemo(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printDate(){
        System.out.println("Date  " + day + " /  " +month + " / " +year);
    }

}
