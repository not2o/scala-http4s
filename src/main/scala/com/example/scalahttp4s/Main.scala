package com.example.scalahttp4s

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp.Simple:
  val run = Scalahttp4sServer.run[IO]
