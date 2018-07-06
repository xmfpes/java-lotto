import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoResultTest {

    @Test
    public void getMatchCount() {
        LottoResult lottoResult = new LottoResult(Arrays.asList(LottoMatch.MATCH_SIX));
        assertThat(lottoResult.getMatchCount(LottoMatch.MATCH_SIX)).isEqualTo(1);
    }

    @Test
    public void getRateTest() {
        LottoResult lottoResult = new LottoResult(Arrays.asList(LottoMatch.MATCH_THREE, LottoMatch.MATCH_FOUR));
        assertThat(lottoResult.getRate()).isEqualTo(2750.0);
    }
}
