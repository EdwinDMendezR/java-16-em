package invoke.defaults.methods;

public interface ObjectA {
    default String getMessage() {
        return "ObjectA::getMessage";
    }
}
