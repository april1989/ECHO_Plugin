public class Example {
	static int x=0,y=0,z=0;
	static Object lock = new Object();
	static Object lock2 = new Object();
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.start();
		y = 1;
		x = 1;
		try{
			t.join();
			System.out.println(1/z);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	static class MyThread extends Thread{
		public void run(){
			int r1,r2;
			r2 = x;
			r1 = y;
			System.out.println(y);
			add();
			if(r1+r2!=1){
				z=1;
			}
		}
	}

	private static void add(){
		x = 2;
	}
}