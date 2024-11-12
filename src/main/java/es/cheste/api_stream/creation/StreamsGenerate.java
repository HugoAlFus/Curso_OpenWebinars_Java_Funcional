package es.cheste.api_stream.creation;

import java.util.UUID;
import java.util.stream.Stream;

public class StreamsGenerate {

    public static void main(String[] args) {

        // Stream infinitos
        Stream<String> uuidStream = Stream.generate(() -> UUID.randomUUID().toString());
        uuidStream.limit(20).forEach(uuid -> System.out.println(uuid));

        Stream<Integer> numberGenerator = Stream.iterate(0, num -> num + 1);
        numberGenerator.limit(20).forEach(number -> System.out.println(number));
    }
}
