
import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class LottoNoTest {
    @Test
    public void create() {
        assertThat(LottoNo.of(5)).isEqualTo(LottoNo.of(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createInvalidNumTest() {
        LottoNo.of(50);
    }
}
