package llama3.task108;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

interface RemoteInterface extends Remote {
    void doSomething() throws RemoteException;
}

class RemoteImplementation extends UnicastRemoteObject implements RemoteInterface {
    protected RemoteImplementation() throws RemoteException {
        super();
    }

    public void doSomething() throws RemoteException {
        System.out.println("Doing something on the server...");
    }
}

public class Task108_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static void main(String[] args) {
        try {
            RemoteImplementation remoteObj = new RemoteImplementation();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("RemoteObject", remoteObj);
            System.out.println("Server ready...");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}