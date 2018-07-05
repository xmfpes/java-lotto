public class LottoGameMain {
    public static void main(String[] args) {
        LottoGameManager lottoGameManager = new LottoGameManager();
        lottoGameManager.createLottos(InputView.getInputPrice());
        ResultView.printLottoList(lottoGameManager);
        lottoGameManager.createWinningLotto(InputView.getWinningLottoText());
        ResultView.printStatResult(lottoGameManager.createLottoResult());
    }
}
