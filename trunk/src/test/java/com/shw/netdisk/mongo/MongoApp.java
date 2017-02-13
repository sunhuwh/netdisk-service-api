package com.shw.netdisk.mongo;


import static org.springframework.data.mongodb.core.query.Criteria.where;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import com.mongodb.Mongo;
import com.shw.netdisk.domain.Resource;

public class MongoApp {

  private static final Log log = LogFactory.getLog(MongoApp.class);

  public static void main(String[] args) throws Exception {

    MongoOperations mongoOps = new MongoTemplate(new Mongo(), "netdisk");
    Resource resource = new Resource();
    resource.setName("111");
    mongoOps.insert(resource);

    log.info(mongoOps.findOne(new Query(where("name").is("111")), Resource.class));

    //mongoOps.dropCollection("resource");
  }
}
