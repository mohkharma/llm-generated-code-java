package gemini.task181;

import java.util.concurrent.locks.ReentrantLock;

public class Task181_GEMINI_gemini_1_5_pro_001 {
    private double balance;
    private final ReentrantLock lock = new ReentrantLock();
    private boolean isOpen;

    public Task181_GEMINI_gemini_1_5_pro_001(double initialBalance) {
        this.balance = initialBalance;
        this.isOpen = true;
    }

    public void open() {
        if (isOpen) {
            throw new IllegalStateException("Account already open");
        }
        isOpen = true;
    }

    public void close() {
        if (!isOpen) {
            throw new IllegalStateException("Account already closed");
        }
        isOpen = false;
    }

    public void deposit(double amount) {
        if (!isOpen) {
            throw new IllegalStateException("Account closed");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        lock.lock();
        try {
            balance += amount;
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        if (!isOpen) {
            throw new IllegalStateException("Account closed");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        lock.lock();
        try {
            if (balance < amount) {
                throw new IllegalArgumentException("Insufficient funds");
            }
            balance -= amount;
        } finally {
            lock.unlock();
        }
    }
}