package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

/**
 * This object represents an animated emoji that displays a random value.
 * @author Ruben Bermudez
 * @version 4.7
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Dice implements BotApiObject {
    private static final String VALUE_FIELD = "value";
    private static final String EMOJI_FIELD = "emoji";

    /**
     * Value of the dice,
     * 1-6 for “🎲”, “🎯” and “🎳” base emoji,
     * 1-5 for “🏀” and “⚽” base emoji,
     * 1-64 for “🎰” base emoji
     */
    @JsonProperty(VALUE_FIELD)
    private Integer value;
    /**
     * Emoji on which the dice throw animation is based
     */
    @JsonProperty(EMOJI_FIELD)
    private String emoji;
}
