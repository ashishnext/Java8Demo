package Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by gaurav on 15/9/17.
 */
public class MyStreams {
    public static void main(String args[]) {
        final Collection<Streams.Task> tasks = Arrays.asList(
                new Streams.Task(Streams.Status.OPEN, 5),
                new Streams.Task(Streams.Status.OPEN, 13),
                new Streams.Task(Streams.Status.CLOSED, 8));

// Calculate total points of all active tasks using sum()
        final long totalPointsOfOpenTasks = tasks
                .stream()
                .filter(task -> task.getStatus() == Streams.Status.OPEN)
                .mapToInt(Streams.Task::getPoints)
                .sum();
        System.out.println("Calculate total points of all active tasks using sum(): " + totalPointsOfOpenTasks);


        // Calculate total points of all tasks
        final double totalPoints = tasks
                .stream()
                .parallel()
                .map(Streams.Task::getPoints) // or map( Task::getPoints )
                .reduce(0, Integer::sum);
        System.out.println("Total points (all tasks): " + totalPoints);

        // Group tasks by their status
        final Map<Streams.Status, List<Streams.Task>> map = tasks
                .stream()
                .collect(Collectors.groupingBy(Streams.Task::getStatus));
        System.out.println("Group tasks by their status:::" + map);


// Calculate the weight of each tasks (as percent of total points)
        final Collection<String> result = tasks
                .stream()                                        // Stream< String >
                .mapToInt(Streams.Task::getPoints)                     // IntStream
                .asLongStream()                                  // LongStream
                .mapToDouble(points -> points / totalPoints)   // DoubleStream
                .boxed()                                         // Stream< Double >
                .mapToLong(weigth -> (long) (weigth * 100)) // LongStream
                .mapToObj(percentage -> percentage + "%")      // Stream< String>
                .collect(Collectors.toList());                 // List< String >
        System.out.println(result);


    }
}

