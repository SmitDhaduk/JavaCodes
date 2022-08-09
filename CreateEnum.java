public class CreateEnum {

    // Simple enum code.
    public enum ThreadState{
        START,
        RUNNING,
        WAITING,
        DEAD;
    }
    public static void main(String[] args) {

        ThreadState threadState = ThreadState.START;
        System.out.println(threadState);
        
    }

    
}
