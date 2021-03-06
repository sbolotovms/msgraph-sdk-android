// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Contact Folder Collection Request.
 */
public class BaseContactFolderCollectionRequest extends BaseCollectionRequest<BaseContactFolderCollectionResponse, IContactFolderCollectionPage> implements IBaseContactFolderCollectionRequest {

    /**
     * The request builder for this collection of ContactFolder
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseContactFolderCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseContactFolderCollectionResponse.class, IContactFolderCollectionPage.class);
    }

    public void get(final ICallback<IContactFolderCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IContactFolderCollectionPage get() throws ClientException {
        final BaseContactFolderCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ContactFolder newContactFolder, final ICallback<ContactFolder> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ContactFolderRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newContactFolder, callback);
    }

    public ContactFolder post(final ContactFolder newContactFolder) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ContactFolderRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newContactFolder);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IContactFolderCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ContactFolderCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IContactFolderCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ContactFolderCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IContactFolderCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ContactFolderCollectionRequest)this;
    }

    public IContactFolderCollectionPage buildFromResponse(final BaseContactFolderCollectionResponse response) {
        final IContactFolderCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ContactFolderCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ContactFolderCollectionPage page = new ContactFolderCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
