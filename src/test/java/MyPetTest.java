import com.mypet.fish.Fish;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MyPetTest {

    @Test
    public void myFirstTest() {
        Fish fish = new Fish();
        String fishSay = fish.say("hello");
        Assert.assertThat(fishSay, CoreMatchers.containsString("hello"));
    }

}