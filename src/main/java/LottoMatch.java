import java.util.Arrays;

public enum LottoMatch {
    MATCH_NO(0, 0),
    MATCH_THREE(3, 5_000),
    MATCH_FOUR(4, 50_000),
    MATCH_FIVE(5, 1_500_000),
    MATCH_SIX(6, 200_000_000);
    private int matchCount;
    private int price;

    public int getPrice() {
        return price;
    }

    LottoMatch(int matchCount, int price) {
        this.matchCount = matchCount;
        this.price = price;
    }

    public boolean isEqualsType(int count) {
        return this.matchCount == count;
    }
    public static LottoMatch getLottoMatch(int count) {
        return Arrays.stream(LottoMatch.values()).filter(lottoMatch -> lottoMatch.isEqualsType(count)).findFirst().orElse(LottoMatch.MATCH_NO);
    }
}
