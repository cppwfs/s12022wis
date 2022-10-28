package io.spring.whatisspring;

/**
 * A Java record that contains the result of a fish cast event.
 * @param result the {@link CatchResult} for a given cast.
 */
public record CatchResult(String result) {
}
