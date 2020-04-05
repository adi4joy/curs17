package ro.fasttrackit.mvnbase.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HomeworkTest {
    Homework homework;

    @BeforeEach
    void setup() {
        homework = new Homework();
    }

    @Test
    @DisplayName("sum(5)=15")
    void sum5() {
        assertThat(homework.sum(5)).isEqualTo(15);
    }

    @Test
    @DisplayName("sum(7)=28")
    void sum7() {
        assertThat(homework.sum(7)).isEqualTo(28);
    }

    @Test
    @DisplayName("sumEven(2)=6")
    void sumEven2() {
        assertThat(homework.sumEven(2)).isEqualTo(6);
    }

    @Test
    @DisplayName("sumEven(6)=42")
    void sumEven6() {
        assertThat(homework.sumEven(6)).isEqualTo(42);
    }

    @Test
    @DisplayName("palindromeReverse(rotor)= true")
    void isPalindromeReverse() {
        assertThat(homework.palindromeReverse("rotor")).isTrue();
    }

    @Test
    @DisplayName("palindromeCheckFirstLast(Madam, I'm Adam)= true")
    void testPalindromeCheckFirstLast() {
        assertThat(homework.palindromeCheckFirstLast("Madam, I'm Adam")).isTrue();
    }

    @Test
    @DisplayName("sumDigits(5) = 5")
    void sumDigits9() {
        assertThat(homework.sumDigits(5)).isEqualTo(5);
    }

    @Test
    @DisplayName("sumDigits(10) = 1")
    void sumDigits10() {
        assertThat(homework.sumDigits(10)).isEqualTo(1);
    }

    @Test
    @DisplayName("sumDigits(12345) = 15")
    void sumDigits12345() {
        assertThat(homework.sumDigits(12345)).isEqualTo(15);
    }

}