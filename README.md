# Cassandra Launcher
[![Build Status](https://github.com/evolution-gaming/cassandra-launcher/workflows/CI/badge.svg)](https://github.com/evolution-gaming/cassandra-launcher/actions?query=workflow%3ACI)
[![Coverage Status](https://coveralls.io/repos/github/evolution-gaming/cassandra-launcher/badge.svg?branch=master)](https://coveralls.io/github/evolution-gaming/cassandra-launcher?branch=master)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/dfad9023e8394f75bbd821ae2e305476)](https://www.codacy.com/app/evolution-gaming/cassandra-launcher?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=evolution-gaming/cassandra-launcher&amp;utm_campaign=Badge_Grade)
[![Version](https://img.shields.io/badge/version-click-blue)](https://evolution.jfrog.io/artifactory/api/search/latestVersion?g=com.evolutiongaming&a=cassandra-launcher_2.13&repos=public)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellowgreen.svg)](https://opensource.org/licenses/MIT)

## How to use

```scala
val shutdown = StartCassandra() // starts server
shutdown() // shutdown server
```

## Setup

```scala
addSbtPlugin("com.evolution" % "sbt-artifactory-plugin" % "0.0.2")

libraryDependencies += "com.evolutiongaming" %% "cassandra-launcher" % "0.0.5"
```