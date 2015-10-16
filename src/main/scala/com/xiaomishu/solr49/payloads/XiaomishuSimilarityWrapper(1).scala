package com.xiaomishu.solr49.payloads

import org.apache.lucene.search.similarities.DefaultSimilarity
import org.apache.lucene.search.similarities.PerFieldSimilarityWrapper
import org.apache.lucene.search.similarities.Similarity

class XiaomishuSimilarityWrapper extends PerFieldSimilarityWrapper {

  override def get(fieldName: String): Similarity = fieldName match {
    case "payloads"|"respayloads" => new PayloadSimilarity()
    case _ => new DefaultSimilarity()
  }
}