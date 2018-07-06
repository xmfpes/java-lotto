
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lotto {
    private Set<LottoNo> lotto;

    private Lotto(Set<LottoNo> lotto) {
        if(!checkValidation(lotto)) throw new IllegalArgumentException();
        this.lotto = lotto;
    }

    public static boolean checkValidation(Set numbers) {
        return numbers.size() == 6;
    }
    public static Lotto of(Integer... numbers) {
        return new Lotto(Arrays.stream(numbers).map(i -> LottoNo.of(i)).collect(Collectors.toSet()));
    }

    public static Lotto ofRandom() {
        return new Lotto(createLotto());
    }

    public static Lotto ofString(String text) {
        return new Lotto(Arrays.stream(text.split(", ")).map(a -> LottoNo.of(a)).collect(Collectors.toSet()));
    }

    public static Set<LottoNo> createLotto() {
        List<LottoNo> lists = IntStream.range(1, 46).mapToObj(i -> LottoNo.of(i)).collect(Collectors.toList());
        Collections.shuffle(lists);
        lists = lists.subList(0, 6);
        Collections.sort(lists);
        return new HashSet<>(lists);
    }

    public LottoMatch getMatch(Lotto winningLotto) {
        return LottoMatch.getLottoMatch(winningLotto.getIntersectionSize(lotto));
    }

    public int getIntersectionSize(Set<LottoNo> target) {
        Set<LottoNo> intersection = new HashSet<>(lotto);
        intersection.retainAll(target);
        return intersection.size();
    }

    @Override
    public String toString() {
        return lotto.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lotto)) return false;

        Lotto lotto1 = (Lotto) o;

        return lotto.equals(lotto1.lotto);
    }

    @Override
    public int hashCode() {
        return lotto.hashCode();
    }
}
