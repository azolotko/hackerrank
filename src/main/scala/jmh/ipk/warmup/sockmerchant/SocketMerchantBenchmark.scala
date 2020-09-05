package jmh.ipk.warmup.sockmerchant

import ipk.warmup.sockmerchant.{HashMapSocketMerchant, SortSocketMerchant}
import org.openjdk.jmh.annotations.{Benchmark, Scope, State}

import scala.util.Random

class SocketMerchantBenchmark {
  import SocketMerchantBenchmark._

  @Benchmark
  def sortSolutionBenchmark(state: BenchmarkState): Unit =
    SortSocketMerchant.sockMerchant(state.input.length, state.input)

  @Benchmark
  def hashMapSolutionBenchmark(state: BenchmarkState): Unit =
    HashMapSocketMerchant.sockMerchant(state.input.length, state.input)
}

object SocketMerchantBenchmark {
  @State(Scope.Benchmark)
  class BenchmarkState {
    val input: Array[Int] = Array.fill(10000000)(Random.nextInt(1000))
  }
}
