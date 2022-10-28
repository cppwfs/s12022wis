package io.spring.whatisspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Restful controller for generating and retrieving the result for a cast of fish.
 */
@RestController
public class FishCastController {

    private static final Random RANDOM = new Random();

    private int catchProbability = 25;

    /**
     * Controller that determines if a fish was caught on the `cast` endpoint.
     * @return the result of the cast.
     */
    @GetMapping("/cast")
    public CatchResult castForFish() {

        int catchScore = RANDOM.nextInt(100);

        var catchResult = new CatchResult("No Fish");
        if(catchScore < catchProbability) {
            catchResult = new CatchResult("We Caught a Fish");
        }
        return catchResult;
    }
}
