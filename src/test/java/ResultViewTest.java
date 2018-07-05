import org.junit.Test;

import java.util.Arrays;

public class ResultViewTest {

    @Test
    public void printLottoResultTest() {
        LottoGameManager lottoGameManager = new LottoGameManager();
        lottoGameManager.createLottos(10000);
        ResultView.printLottoList(lottoGameManager);
    }

    @Test
    public void printStatTest() {
        LottoResult lottoResult = new LottoResult(Arrays.asList(LottoMatch.MATCH_THREE, LottoMatch.MATCH_FOUR, LottoMatch.MATCH_FIVE));
        ResultView.printStatResult(lottoResult);

        LottoResult lottoResult2 = new LottoResult(Arrays.asList(LottoMatch.MATCH_THREE));
        ResultView.printStatResult(lottoResult2);
    }
}
