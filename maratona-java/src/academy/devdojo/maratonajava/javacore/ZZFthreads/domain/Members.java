package academy.devdojo.maratonajava.javacore.ZZFthreads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen(){
        return open;
    }

    public int pendingEmails(){
        synchronized (emails){
            return emails.size();
        }
    }

    public void addMemberEmail(String email){
        synchronized (this.emails){
            System.out.println(getThreadName() + " Adicionou email na lista");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(getThreadName() + " checking if there are emails");
        synchronized (this.emails){
            while (this.emails.size() == 0){
                if (!open) return null;
                System.out.println(getThreadName() + " Não tem email disponível na lista, entrando em modo de espera");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close(){
        open = false;
        synchronized (this.emails){
        System.out.println(getThreadName() + " Notificando todo mundo que não estamos mais pegando emails");
    }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }
}
