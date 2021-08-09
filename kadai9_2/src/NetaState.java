
class NetaState extends DogState {
	 private static NetaState s = new NetaState();
	 private NetaState() {}
	 public static DogState getInstance() {
	 return s;
	 }
	 public void tukareta(Dog moto) {
	 // なにもしない
	 }
	 public void tabeta(Dog moto) {

	 }
	 public String toString() {
	 return "寝てる状態";
	 }
	@Override
	public void nitibotu(Dog moto) {
		// TODO 自動生成されたメソッド・スタブ

	}
	@Override
	public void hinode(Dog moto) {
		// TODO 自動生成されたメソッド・スタブ
		moto.changeState(FutsuuState.getInstance());

	}

}