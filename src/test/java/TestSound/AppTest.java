package TestSound;

import Sound.cdplayer;
import Sound.disk;
import Sound.music;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class AppTest {
    @Autowired
    private disk disk1;
    @Autowired
    private disk disk2;
    @Autowired
    private cdplayer player1;
    @Autowired
    private cdplayer player2;
    @Autowired
    private music music1;


    @Test
    public void test() {
        disk1.play();
    }

    @Test
    public void testplayer() {
        player1.play();
    }

    @Test
    public void testc() {
        player2.play();
    }

    @Test
    public void testtitle() {
        disk2.play();
    }

    @Test
    public void testset() {
        music1.setTime(1);
        music1.setTitle("zhang");
    }


}
