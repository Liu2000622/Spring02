package Sound;

public class music {
    private String title;
    private int time;

    public music() {
        super();
    }

    public void setTitle(String title) {
        this.title = title;
        System.out.println("settitle");
    }

    public void setTime(int time) {
        this.time = time;
        System.out.println("settime");
    }
}
