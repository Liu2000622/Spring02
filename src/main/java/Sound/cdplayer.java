package Sound;

public class cdplayer {
    private disk disk;

    public cdplayer() {
        super();
        System.out.println("构造函数");
    }

    public cdplayer(Sound.disk disk) {
        this.disk = disk;
        System.out.println("有参构造函数");
    }

    public void play() {
        disk.play();
    }
}
