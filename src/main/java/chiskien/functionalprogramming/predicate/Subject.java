package chiskien.functionalprogramming.predicate;

public class Subject implements Comparable<Subject> {
    private int sid;
    private String title;

    private Subject(Builder builder) {
        this.sid = builder.sid;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public int compareTo(Subject o) {
        return this.sid - o.sid;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static class Builder {
        private int sid;
        private String title;

        public Builder sid(int value) {
            this.sid = value;
            return this;
        }

        public Builder title(String value) {
            this.title = value;
            return this;
        }

        public Subject build() {
            return new Subject(this);
        }
    }
}
