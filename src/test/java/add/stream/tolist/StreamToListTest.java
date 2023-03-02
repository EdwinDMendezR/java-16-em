package add.stream.tolist;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamToListTest {

    @Test
    public void methodTest() {
        List<String> listaDeCadenas = Stream.of(
                "Hola", "Mundo", "Java", "16")
                .toList();
    }

}
