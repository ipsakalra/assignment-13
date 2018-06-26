class Threads{
	synchronized static void printThreads(int a,int b){
		for(int i=b;i<=a;i++){
			System.out.println(i);
			try{
				Thread.sleep(4);
			}catch(Exception e){}
		}
		}
	}
		public class Multi{
			public static void main(String[] args){
				Thread t=new Thread(){
					public void run(){
						Threads.printThreads(500,0);
					}
				};
				Thread t1=new Thread(){
					public void run(){
						Threads.printThreads(1000,500);
					}
				};
				t.start();
				t1.start();
			}
		}
	
	
