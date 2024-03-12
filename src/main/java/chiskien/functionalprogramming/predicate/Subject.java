package chiskien.functionalprogramming.predicate;

public class Subject {
    private int sid;
    private String name;

    public Subject(Builder builder) {
        this.sid = builder.sid;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private int sid;
        private String name;

        public Builder sid(int i) {
            this.sid = i;
            return this;
        }

        public Builder title(String javaOop) {
            this.name = javaOop;
            return this;
        }

        public Subject build() {
            return new Subject(this);
        }
    }
}
