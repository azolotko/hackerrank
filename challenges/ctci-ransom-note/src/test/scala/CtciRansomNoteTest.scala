import weaver.scalacheck._

object CtciRansomNoteTest extends weaver.FunSuite with Checkers {
  import SolutionImpl._

  test("Empty input") {
    expect(checkMagazine0(magazine = Array.empty, note = Array.empty))
  }

  test("Sample Input 0") {
    expect(
      checkMagazine0(
        magazine = Array("give", "me", "one", "grand", "today", "night"),
        note = Array("give", "one", "grand", "today")
      )
    )
  }

  test("Sample Input 1") {
    not(
      expect(
        checkMagazine0(
          magazine = Array("two", "times", "three", "is", "not", "four"),
          note = Array("two", "times", "two", "is", "four")
        )
      )
    )
  }

  test("Sample Input 2") {
    not(
      expect(
        checkMagazine0(
          magazine = Array("ive", "got", "a", "lovely", "bunch", "of", "coconuts"),
          note = Array("ive", "got", "some", "coconuts")
        )
      )
    )
  }

  test("Remove only one word") {
    expect(
      checkMagazine0(
        magazine = Array("lovely", "lovely","lovely", "bunch", "of", "coconuts"),
        note = Array("lovely", "lovely", "coconuts")
      )
    )
  }
}
