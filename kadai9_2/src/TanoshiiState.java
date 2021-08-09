
class TanoshiiState extends DogState {
	 private static TanoshiiState s = new TanoshiiState();
	 TanoshiiState() {}
	 public static DogState getInstance() {
	 return s;
	 }
	 public void tukareta(Dog moto) {
	 moto.changeState(FutsuuState.getInstance());
	 }
	 public void tabeta(Dog moto) { // なにもしない
	 }
	 public String toString() {
	 return "楽しい状態";
	 }
	@Override
	public void nitibotu(Dog moto) {
		// TODO 自動生成されたメソッド・スタブ
		moto.changeState(NetaState.getInstance());

	}
	@Override
	public void hinode(Dog moto) {
		// TODO 自動生成されたメソッド・スタブ

	}

	}