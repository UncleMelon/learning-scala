package collection.maps

import com.alibaba.fastjson.{JSON, JSONObject}
import java.util.{Map => JMap}
import scala.collection.JavaConverters._

object JsonObject2Map {
  def main(args: Array[String]): Unit = {
    val str = "{\"a\": {\"b\":1, \"c\":2, \"d\":3, \"e\":4}}"
    val jsonObject = JSON.parseObject(str)
    val map = jsonObject.asInstanceOf[JMap[String, JMap[_, _]]]
    println("xxx")
    println(JSON.toJSONString(jsonObject, false))

  }
}
