
import org.apache.spark.sql.{SaveMode,SparkSession}
import org.apache.spark.sql.functions.udf
import org.apache.log4j.{Level, Logger}

object COUNT {
  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)

    val spark = SparkSession.builder().enableHiveSupport().getOrCreate()

    val df = spark.read.parquet("s3://xxxx/xxxx/xxxx/20190310/01/")

    val COU = df.count()
    val list1: List[Long] = List(COU)
    import spark.implicits._
    list1.toDF.write.csv("s3://some/path")

  }
}
