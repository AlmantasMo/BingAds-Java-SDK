package com.microsoft.bingads.v13.internal.bulk;

import java.util.concurrent.Future;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.v13.bulk.BulkOperationStatus;
import com.microsoft.bingads.v13.bulk.IBulkService;

public interface BulkOperationStatusProvider<TStatus> {

    Future<BulkOperationStatus<TStatus>> getCurrentStatus(ServiceClient<IBulkService> serviceClient, AsyncCallback<BulkOperationStatus<TStatus>> callback);

    boolean isFinalStatus(BulkOperationStatus<TStatus> currentStatus);

    boolean isSuccessStatus(TStatus status);
}
