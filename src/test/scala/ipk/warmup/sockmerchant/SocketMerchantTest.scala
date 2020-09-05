package ipk.warmup.sockmerchant

import munit.FunSuite

class SocketMerchantTest extends FunSuite {
  test("SortSocketMerchant$.sockMerchant") {
    assertEquals(
      SortSocketMerchant
        .sockMerchant(9, Array(10, 20, 20, 10, 10, 30, 50, 10, 20)),
      3
    )
  }

  test("HashMapSocketMerchant$.sockMerchant") {
    assertEquals(
      HashMapSocketMerchant
        .sockMerchant(9, Array(10, 20, 20, 10, 10, 30, 50, 10, 20)),
      3
    )
  }
}
