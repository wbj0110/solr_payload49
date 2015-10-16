/**
 * @Copyright:Copyright (c) 2008 - 2100
 * @Company:xiaomishu
 */

/**
 * @Title:
 * @Description:
 * @Author:wengbenjue
 * @Since:2014Äê8ÔÂ20ÈÕ
 * @Version:1.1.0
 */
import org.apache.solr.common.params.MapSolrParams
import org.apache.solr.common.params.CommonParams
import org.junit.Assert
import org.junit.Test
import scala.io._
import scala.collection.JavaConversions.mapAsJavaMap

class TestIo {
@Test def testAllDocsQuery(): Unit = {
  for(line <- Source.fromFile(new java.io.File("D:\\dump"),"utf8").getLines){
    println(line);
  }
  }
}