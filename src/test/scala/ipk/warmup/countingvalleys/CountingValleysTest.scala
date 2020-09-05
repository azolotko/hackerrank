package ipk.warmup.countingvalleys

import munit.FunSuite

class CountingValleysTest extends FunSuite {
  test("CountingValleysTest.countingValleys") {
    assertEquals(
      CountingValleys
        .countingValleys(8, "UDDDUDUU"),
      1
    )

    assertEquals(
      CountingValleys
        .countingValleys(12, "DDUUDDUDUUUD"),
      2
    )
  }
}
