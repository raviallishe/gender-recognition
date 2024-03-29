package fileOperations

import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}

import utils.Constants

import scala.io.Source

class FileOperations {

  def readFromFile(filePath: String): String = {
    Source.fromFile(filePath, "UTF-8").mkString
  }

  def writeToFile(data: Seq[String]): Unit = {
    Files.write(Paths.get("/Users/alli01/my-projects/gender-recognition/resources/output/output1.csv"), data.mkString("\n").getBytes(StandardCharsets.UTF_8))
  }
}
