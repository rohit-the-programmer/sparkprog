package simplexamples

import org.apache.spark.sql.SparkSession

object finaltest {

  def main(args: Array[String]): Unit = {



    println("Hello World")


    val spark = SparkSession
      .builder
      .master("local")
      .appName("MyFirstIntelliJProg")
      .getOrCreate()

    val df = spark.range(10, 105, 10)

    df.show(2)

    df.write.csv("/Users/Rohit/sparkoutout/finaltest")


  }

}
