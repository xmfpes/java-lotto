import java.util.List;

public class LottoResult {
    private List<LottoMatch> lottoMatches;

    public LottoResult(List<LottoMatch> lottoMatches) {
        this.lottoMatches = lottoMatches;
    }

    public int getMatchCount(LottoMatch lottoMatch) {
        return (int) lottoMatches.stream().filter(m -> lottoMatch == m).count();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LottoResult)) return false;

        LottoResult that = (LottoResult) o;

        return lottoMatches != null ? lottoMatches.equals(that.lottoMatches) : that.lottoMatches == null;
    }

    @Override
    public int hashCode() {
        return lottoMatches != null ? lottoMatches.hashCode() : 0;
    }

    public double getRate() {
        return ((double)(lottoMatches.stream().map(m -> m.getPrice()).reduce((a, b) -> a + b).get()) /
                (double)(lottoMatches.size() * 1000)) * 100;
    }
}
