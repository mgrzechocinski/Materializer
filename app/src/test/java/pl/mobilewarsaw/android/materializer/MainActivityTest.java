package pl.mobilewarsaw.android.materializer;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MainActivityTest {

    @Test
    public void shouldMainActivityBeNotNull() throws Exception {
        //dummy test
        MainActivity mainActivity = new MainActivity();
        Assertions.assertThat(mainActivity).isNotNull();
    }
}