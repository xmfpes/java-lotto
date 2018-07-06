import java.util.HashMap;
import java.util.Map;

public class LottoNo implements Comparable<LottoNo> {
    private Integer num;
    private static final Map<Integer, LottoNo> lottoNoMap;

    static {
        lottoNoMap = new HashMap<>();
        for (int i = 1; i <= 45; i++) {
            lottoNoMap.put(i, new LottoNo(i));
        }
    }

    private LottoNo(int num) {
        checkValidation(num);
        this.num = num;
    }

    private static void checkValidation(int num) {
        if (num < 1 || num > 45) {
            throw new IllegalArgumentException();
        }
    }

    public static LottoNo of(int num) {
        checkValidation(num);
        return lottoNoMap.get(num);
    }

    public static LottoNo of(String num) {
        int parsedNum = Integer.parseInt(num);
        checkValidation(parsedNum);
        return lottoNoMap.get(parsedNum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LottoNo)) return false;

        LottoNo lottoNo = (LottoNo) o;

        return num != null ? num.equals(lottoNo.num) : lottoNo.num == null;
    }

    @Override
    public int hashCode() {
        return num != null ? num.hashCode() : 0;
    }

    @Override
    public int compareTo(LottoNo o) {
        return o.num;
    }

    @Override
    public String toString() {
        return num.toString();
    }
}
