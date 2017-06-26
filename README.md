## spark learning

### 打包
    mvn package
   
### 运行
     spark-submit  --master yarn-client --class com.sponge.spark.SparkDemo  spark-learning-1.0-SNAPSHOT.jar  /tmp/hdfs-client.properties 
     spark-submit  --master yarn-cluster --class com.sponge.spark.SparkDemo  spark-learning-1.0-SNAPSHOT.jar  /tmp/hdfs-client.properties 