package dev.idion.baekjoon.string;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  @DisplayName("solution test1")
  void solutionTest1() throws IOException {
    String input = "adaabc aababbc";
    String expected = "2";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    System.setIn(in);
    Main.main(null);
    assertThat(out.toString()).isEqualTo(expected);
  }
}
