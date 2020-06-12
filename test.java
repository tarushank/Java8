import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class test
{
    public static void main(String args[]) 
    {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        
        //ForEach statement to Iterate through the list.
        //Collections framework for the iteration (External Iteration).
        for(String lis : list)
        {
            System.out.println(lis.toString());
        }

        //Java 8 for the internal iteration.
        list.forEach( l -> System.out.println("This is from the Java 8 Lamba Expression: \n" +l.toString()) );

        //Utilizing streams
        Stream<String> stream_var = Stream.of("one","two");
        //stream_var.forEach( a -> System.out.println("Showing the functions of Streams \n" +a.toUpperCase()) );

        stream_var.forEach( b -> {
            System.out.println("This is a streams utility using lambda functions");
            System.out.println(b.toUpperCase());
        });

    }
}