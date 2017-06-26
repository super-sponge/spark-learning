package com.sponge.spark

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by sponge on 2017/6/26.
  */
object SparkDemo {
  def main(args: Array[String]) {

    // 设置Spark的序列化方式
    System.setProperty("spark.serializer", "org.apache.spark.serializer.KryoSerializer")

    // 初始化Spark
    val sparkConf = new SparkConf().setAppName("CountDemo")
    val sc = new SparkContext(sparkConf)

    // 读取文件
    val rdd = sc.textFile(args(0))
//    val rdd = sc.textFile("/tmp/hosts")

    println(args(0) + "的行数为：" + rdd.count())

    sc.stop()
  }

}
