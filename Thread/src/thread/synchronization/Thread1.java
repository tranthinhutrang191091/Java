package thread.synchronization;

public class Thread1 extends Thread {
	private ShareData shareDate;

	public Thread1(ShareData shareDate) {
		this.shareDate = shareDate;
	}

	@Override
	public void run() {
		for(int i=0;i<shareDate.userList.length;i++) {
			System.out.println("User Name: " +shareDate.userList[i]);
		}
	}
	
}
