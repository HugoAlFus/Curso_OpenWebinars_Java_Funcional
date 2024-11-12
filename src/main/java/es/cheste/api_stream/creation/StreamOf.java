package es.cheste.api_stream.creation;

import java.util.stream.Stream;

public class StreamOf {

    public static void main(String[] args) {

        Stream<String> names = Stream.of("name1", "name2", "name3");

        String javaHome = System.getenv("JAVA_HOME2");
        Stream<String> enviroment = Stream.ofNullable(javaHome);
        long num = enviroment.count();
        System.out.println(num);
    }
}
