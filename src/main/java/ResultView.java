public class ResultView {
    private LottoResult lottoResult;

    public ResultView(LottoResult lottoResult) {
        this.lottoResult = lottoResult;
    }

    public static void printLottoList(LottoGameManager lottoGameManager) {
        System.out.println(lottoGameManager.getLottosString());
    }
    public static void printStatResult(LottoResult lottoResult) {
        System.out.println("당첨 통계");
        System.out.println("----------");
        System.out.println("3개 일치 (5000원) - " + lottoResult.getMatchCount(LottoMatch.MATCH_THREE) + "개");
        System.out.println("4개 일치 (50000원) - "  + lottoResult.getMatchCount(LottoMatch.MATCH_FOUR) + "개");
        System.out.println("5개 일치 (1500000원) - "  + lottoResult.getMatchCount(LottoMatch.MATCH_FIVE) + "개");
        System.out.println("6개 일치 (2000000000원) - "  + lottoResult.getMatchCount(LottoMatch.MATCH_SIX) + "개");
        System.out.println("총 수익률은 " + lottoResult.getRate() + "%입니다.");
    }


}
