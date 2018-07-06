import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoTest {

    @Test
    public void createLottoTest() {
        assertThat(Lotto.createLotto().size()).isEqualTo(6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createInvalidLottoTest() {
        Lotto.of(1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Test
    public void getMatchCountTest() {
        Lotto lotto = Lotto.of(1, 2, 3, 4, 5, 6);
        Lotto winningLotto = Lotto.of(1, 2, 3, 4, 5, 6);
        assertThat(lotto.getMatch(winningLotto)).isEqualTo(LottoMatch.MATCH_SIX);
    }
}
