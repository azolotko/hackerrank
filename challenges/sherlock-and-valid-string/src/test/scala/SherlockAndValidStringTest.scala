import weaver.scalacheck._

object SherlockAndValidStringTest extends weaver.FunSuite with Checkers {
  import Solution._

//  test("Empty input") {
//    expect(isValid("") == "YES")
//  }
//
//  test("Sample Input 0") {
//    expect(isValid("aabbcd") == "NO")
//  }
//
//  test("Sample Input 1") {
//    expect(isValid("aabbccddeefghi") == "NO")
//  }
//
//  test("Sample Input 2") {
//    expect(isValid("abcdefghhgfedecba") == "YES")
//  }
//
//  test("Test case 7") {
//    expect(isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd") == "YES")
//  }

  test("Test case 13") {
    val input = io.Source.fromResource("input13.txt").getLines().take(1).toSeq.head
    expect(isValid(input) == "YES")
  }
}
