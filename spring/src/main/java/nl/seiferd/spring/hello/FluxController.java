package nl.seiferd.spring.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Random;
import java.util.stream.Stream;

@RestController
public class FluxController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FluxController.class);

    @GetMapping(value = "/random", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> getTemperature() {
        Random r = new Random();
        int low = 0, high = 50;
        return Flux.fromStream(Stream.generate(() -> r.nextInt(high - low) + low)
                .map(String::valueOf)
                .peek(LOGGER::info))
                .map(Integer::valueOf)
                .delayElements(Duration.ofSeconds(1));
    }
}
