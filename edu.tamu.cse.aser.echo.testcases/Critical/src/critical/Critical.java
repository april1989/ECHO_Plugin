package critical;

public class Critical {
	public int turn;
	public static void main(String[] args){
		Thread t1, t2;

		Critical c = new Critical();
		Section s1 = new Section(c, 0);
		Section s2 = new Section(c, 1);

		t1 = new Thread(s1);
		t1.start();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		t2 = new Thread(s2);
		t2.start();

		try {
			t1.join();
		}catch ( InterruptedException e ) {}

		try {
			t2.join();
		}catch ( InterruptedException e ) {}

	}
}

















