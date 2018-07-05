
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lotto {
    private List<Integer> lotto;

    public Lotto() {
        this(createLotto());
    }

    public Lotto(List<Integer> lotto) {
        this.lotto = lotto;
    }

    public List<Integer> getLotto() {
        return lotto;
    }

    public static List<Integer> createLotto() {
        List<Integer> lists = IntStream.range(1, 46).boxed().collect(Collectors.toList());
        Collections.shuffle(lists);
        lists = lists.subList(0, 6);
        Collections.sort(lists);
        return lists;
    }

    public int getMatchCount(Lotto winningLotto) {
        Set<Integer> intersection = new HashSet<>(lotto);
        intersection.retainAll(winningLotto.getLotto());
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
