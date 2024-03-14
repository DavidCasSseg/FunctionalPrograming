package Multithreading;

//extends Thread
//implements Runnable
class Task1 extends  Thread{

    public void run(){//SIGNATURE
        System.out.println("\nTask1 Started");
        for(int i = 101; i <= 199; i++){
            System.out.print(i + " ");
        }
        System.out.print("\n Task1 Done\n");
    }
}

class Task2 implements Runnable{
    @Override
    public void run() {
        System.out.println("\nTask2 Started");
        for(int i = 201; i <= 299; i++){
            System.out.print(i + " ");
        }
        System.out.print("\n Task2 Done\n");
    }
}
public class ThreadBasicsRunner {
    public static void main(String[] args) throws InterruptedException {
        //Task1
        System.out.print("\nTask1 Kicked off");
        Task1 task1 = new Task1();
        task1.start();//task1.run();

        System.out.print("\nTask2 Kicked off");
        //Task2
        Task2 task2 = new Task2();
        Thread threadTask2 = new Thread(task2);
        threadTask2.start();

        task1.join();// La linea de codigo siguiente unicamente es ejecutada despues de que la peticion termino su proceso
        threadTask2.join();

        System.out.println("\n Task3 Kicked off");
        //Task3
        for(int i = 301; i <= 399; i++){
            System.out.print(i + " ");
        }
        System.out.print("\n Task3 Done\n");

        System.out.print("\n Main Done");
    }

}
