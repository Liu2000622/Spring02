package Sound;

import java.util.List;
import java.util.Set;

public class disk {
    private int titile;
    private Set<String> track;

    public disk() {
        super();
        System.out.println("Disk无参构造");
    }

    public disk(int titile, Set<String> track) {
        this.titile = titile;
        this.track = track;
    }

    public int getTitile() {
        return titile;
    }

    public Set<String> getTrack() {
        return track;
    }

    public void setTitile(int titile) {
        this.titile = titile;
        System.out.println("title");
    }

    public void setTrack(Set<String> track) {
        this.track = track;
        System.out.println("settreck");
    }

    public void play() {
        System.out.println("播放" + this.titile);
        for (String track : this.track) {
            System.out.println(track);
        }
    }
}
