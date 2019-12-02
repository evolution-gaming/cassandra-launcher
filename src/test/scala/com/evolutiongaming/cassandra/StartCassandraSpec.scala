package com.evolutiongaming.cassandra

import org.scalatest.funsuite.AnyFunSuite

class StartCassandraSpec extends AnyFunSuite {

  test("start and stop cassandra") {
    val shutdown = StartCassandra()
    shutdown()
  }
}
