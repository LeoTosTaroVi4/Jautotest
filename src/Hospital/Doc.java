package Hospital;

public abstract class Doc {
    public void treat() {
        System.out.println("Он несет исцеление");
    }

    abstract void treatment();
}
