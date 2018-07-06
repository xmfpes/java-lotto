import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LottoGameManager {
    public static final int LOTTO_PRICE = 1000;
    private List<Lotto> lottos;
    private Lotto winningLotto;

    public LottoGameManager() {
        lottos = new ArrayList<>();
    }

    public Lotto createLotto() {
        return Lotto.ofRandom();
    }

    public Lotto createLotto(Lotto lotto) {
        this.lottos.add(lotto);
        return lotto;
    }

    public List<Lotto> createLottos(int price) {
        for (int i = 0; i < price / LOTTO_PRICE; i++) {
            lottos.add(createLotto());
        }
        return lottos;
    }

    public String getLottosString() {
        return lottos.stream().map(s -> s.toString() + "\n").collect(Collectors.joining());
    }

    public Lotto createWinningLotto(String winningLottoText) {
        winningLotto = Lotto.ofString(winningLottoText);
        return winningLotto;
    }

    public LottoResult createLottoResult() {
        List<LottoMatch> lottoMatches = new ArrayList<>();
        for (Lotto lotto : lottos) {
            lottoMatches.add(lotto.getMatch(winningLotto));
        }
        return new LottoResult(lottoMatches);
    }
}
