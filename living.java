public interface living {
    default void live() {
        System.out.println(this.getClass().getSimpleName() + " lives");
    }
}