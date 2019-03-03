public interface Work {
    void doOneThing();

    default void doAnotherThing() {
        System.out.println("Did the other thing");
    }

}
