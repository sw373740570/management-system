package com.vcredit.fileMongo.repository;

import com.vcredit.fileMongo.entity.FileSummary;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by knny0 on 2017/1/5.
 */
@ComponentScan
public interface FileSummaryRepo extends MongoRepository<FileSummary,String> {
    public FileSummary findByOrderId(String orderId);
}
