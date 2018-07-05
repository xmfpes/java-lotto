import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class LottoMatchTest {

    @Test
    public void getLottoMatch() {
        assertThat(LottoMatch.getLottoMatch(3)).isEqualTo(LottoMatch.MATCH_THREE);
    }
}