import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoTest {

    @Test
    public void createLottoTest() {
        assertThat(Lotto.createLotto().size()).isEqualTo(6);
    }

    @Test
    public void getMatchCountTest() {
        Lotto lotto = new Lotto(Arrays.asList(1, 2, 3, 4, 5, 6));
        Lotto winningLotto = new Lotto(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertThat(lotto.getMatchCount(winningLotto)).isEqualTo(6);
    }
}
