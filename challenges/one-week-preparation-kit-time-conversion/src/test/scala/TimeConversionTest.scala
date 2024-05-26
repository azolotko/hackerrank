import weaver.scalacheck._

object TimeConversionTest extends weaver.FunSuite with Checkers {
  import Solution._

  test("Empty input") {
    expect(timeConversion("") == "")
  }

  test("Example") {
    expect(timeConversion("12:01:00PM") == "12:01:00").and(
      expect(timeConversion("12:01:00AM") == "00:01:00")
    )
  }

  test("Sample Input") {
    expect(timeConversion("07:05:45PM") == "19:05:45")
  }
}
