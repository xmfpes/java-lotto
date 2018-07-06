import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoGameManagerTest {
    private LottoGameManager lottoGameManager;

    @Before
    public void setUp() throws Exception {
        lottoGameManager = new LottoGameManager();
    }

    @Test
    public void createLottosTest () {
        assertThat(lottoGameManager.createLottos(14000).size()).isEqualTo(14);
    }

    @Test
    public void getLottosStringTest() {
        lottoGameManager.createLotto(Lotto.of(1, 2, 3, 4, 5, 6));
        assertThat(lottoGameManager.getLottosString()).isEqualTo(Lotto.of(1, 2, 3, 4, 5, 6).toString() + "\n");
    }

    @Test
    public void createWinningLottoTest() {
        assertThat(lottoGameManager.createWinningLotto("1, 2, 3, 4, 5, 6")).isEqualTo(Lotto.of(1, 2, 3, 4, 5, 6));
    }

    @Test
    public void createLottoResultTest() {
        lottoGameManager.createLotto(Lotto.of(1, 2, 3, 4, 5, 6));
        lottoGameManager.createWinningLotto("1, 2, 3, 4, 5, 6");
        assertThat(lottoGameManager.createLottoResult()).isEqualTo(new LottoResult(Arrays.asList(LottoMatch.MATCH_SIX)));
    }
}
