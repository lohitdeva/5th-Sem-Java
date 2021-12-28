//Program to demonstrate running of threads

class First extends Thread {
	public void run() {
		for(int i = 1; i <= 5; i++)
			System.out.println("From First: i = " + i);
		System.out.println("Exit from First");
	}
}

class Second extends Thread {
	public void run() {
		for(int i = 1; i <= 5; i++)
			System.out.println("From Second: i = " + i);
		System.out.println("Exit from Second");
	}
}

class Third extends Thread {
	public void run() {
		for(int i = 1; i <= 5; i++)
			System.out.println("From Third: i = " + i);
		System.out.println("Exit from Third");
	}
}

class PrgB8 {
	public static void main(String[] args) {
		System.out.println("*** PROGRAM TO DEMONSTRATE RUNNING OF THREADS ***");
		new First().start();
		new Second().start();
		new Third().start();
	}
}