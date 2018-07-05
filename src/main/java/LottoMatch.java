import java.util.Arrays;

public enum LottoMatch {
    MATCH_NO(0, 0),
    MATCH_THREE(3, 5000),
    MATCH_FOUR(4, 50000),
    MATCH_FIVE(5, 1500000),
    MATCH_SIX(6, 200000000);
    private int matchCount;
    private int price;

    public int getPrice() {
        return price;
    }

    LottoMatch(int matchCount, int price) {
        this.matchCount = matchCount;
        this.price = price;
    }

    public static LottoMatch getLottoMatch(int count) {
        return Arrays.stream(LottoMatch.values()).filter(lottoMatch -> lottoMatch.matchCount == count).findFirst().orElse(LottoMatch.MATCH_NO);
    }

}
