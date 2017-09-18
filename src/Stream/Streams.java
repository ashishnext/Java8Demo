package Stream;

/**
 * Created by gaurav on 15/9/17.
 */
public class Streams {
    public enum Status {
        OPEN, CLOSED
    };

    public static final class Task {
        public final Status status;
        public final Integer points;

        Task(final Status status, final Integer points) {
            this.status = status;
            this.points = points;
        }

        public Integer getPoints() {
            return points;
        }

        public Status getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return String.format("[%s, %d]", status, points);
        }
    }
}

