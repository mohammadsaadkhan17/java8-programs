package multi;

public class MyThread extends Thread{
	
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			String a="";
			for(int j=0; j<=10000; j++) {
				a +="a";
			}
			System.out.println(Thread.currentThread().getName()+"- Priority:"+Thread.currentThread().getPriority()+"-count:"+i);
		
	         try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

	public static void main(String[] args) {
		
            MyThread l =new MyThread("Low Priority");
            MyThread m =new MyThread("Medium Priority");
            MyThread h =new MyThread("High Priority");
            
            l.setPriority(MIN_PRIORITY);
            m.setPriority(NORM_PRIORITY);
            h.setPriority(MAX_PRIORITY);
            
            l.start();
            m.start();
            h.start();
		
	}

}
