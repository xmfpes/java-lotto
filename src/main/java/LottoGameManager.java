import java.util.ArrayList;
import java.util.Arrays;
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
        return new Lotto();
    }

    public Lotto createLotto(List<Integer> lotto) {
        Lotto newLotto = new Lotto(lotto);
        this.lottos.add(newLotto);
        return newLotto;
    }

    public List<Lotto> createLottos(int price) {
        for (int i = 0; i <price/LOTTO_PRICE ; i++) {
            lottos.add(createLotto());
        }
        return lottos;
    }

    public String getLottosString() {
        return lottos.stream().map(s -> s.toString() + "\n").collect(Collectors.joining());
    }

    public Lotto createWinningLotto(String winningLottoText) {
        winningLotto = new Lotto(Arrays.stream(winningLottoText.split(", ")).map(a -> Integer.parseInt(a)).collect(Collectors.toList()));
        return winningLotto;
    }

    public LottoResult createLottoResult() {
        List<LottoMatch> lottoMatches = new ArrayList<>();
        for (Lotto lotto : lottos) {
            lottoMatches.add(LottoMatch.getLottoMatch(lotto.getMatchCount(winningLotto)));
        }
        return new LottoResult(lottoMatches);
    }
}
