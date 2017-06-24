package com.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Bird bd = new Bird(50);
			pig pg = new pig(50);
			Thread tbd = new Thread(bd);
			Thread tpg = new Thread(pg);
			tbd.start();
			tpg.start();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			
		}

	}

}
class pig implements Runnable{
	int n = 0;
	int times = 0;
	
	public pig(int n){
		this.n = n;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				Thread.sleep(100);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			times++;
			System.out.println("我是第"+times+"个线程");
			if(times == n){
				break;
			}
		}
		
	}
	
}

class Bird implements Runnable{
	int n = 0;
	int res = 0;
	int times = 0;
	
	public Bird(int n){
		this.n = n;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			res+=(++times);
			System.out.println("结果是"+res);
			if(times==n){
				break;
			}
		}
	}
}