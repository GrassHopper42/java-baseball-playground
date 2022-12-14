package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    private String[] splitWithComma(String str) {
        return str.split(",");
    }

    @Test
    void split() {
        String[] actual1 = splitWithComma("1,2");
        String[] actual2 = splitWithComma("1");
        assertThat(actual1).contains("1", "2");
        assertThat(actual2).containsExactly("1");
    }

    @Test
    void substring() {
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt 메소드 테스트")
    void charAt() {
        char actual = "abc".charAt(1);
        assertThat(actual).isEqualTo('b');

        assertThatThrownBy(() -> "abc".charAt(4)).isInstanceOf(IndexOutOfBoundsException.class);
    }
}
