package com.xiaomishu.solr49.payloads

import org.apache.lucene.analysis.payloads.PayloadHelper
import org.apache.lucene.index.FieldInvertState
import org.apache.lucene.search.similarities.DefaultSimilarity
import org.apache.lucene.util.BytesRef

class PayloadSimilarity extends DefaultSimilarity {
  
  override def scorePayload(doc: Int, start: Int, end: Int,payload: BytesRef): Float = {
    if (payload == null) 1.0F
    else PayloadHelper.decodeFloat(payload.bytes, payload.offset)
  }
}