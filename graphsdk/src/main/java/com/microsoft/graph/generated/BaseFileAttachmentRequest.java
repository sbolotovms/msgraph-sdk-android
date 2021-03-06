// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

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
 * The class for the Base File Attachment Request.
 */
public class BaseFileAttachmentRequest extends BaseRequest implements IBaseFileAttachmentRequest {

    /**
     * The request for the FileAttachment
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseFileAttachmentRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the FileAttachment from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<FileAttachment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the FileAttachment from the service
     * @return The FileAttachment from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public FileAttachment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this FileAttachment with a source
     * @param sourceFileAttachment The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final FileAttachment sourceFileAttachment, final ICallback<FileAttachment> callback) {
        send(HttpMethod.PATCH, callback, sourceFileAttachment);
    }

    /**
     * Patches this FileAttachment with a source
     * @param sourceFileAttachment The source object with updates
     * @return The updated FileAttachment
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public FileAttachment patch(final FileAttachment sourceFileAttachment) throws ClientException {
        return send(HttpMethod.PATCH, sourceFileAttachment);
    }

    /**
     * Creates a FileAttachment with a new object
     * @param newFileAttachment The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final FileAttachment newFileAttachment, final ICallback<FileAttachment> callback) {
        send(HttpMethod.POST, callback, newFileAttachment);
    }

    /**
     * Creates a FileAttachment with a new object
     * @param newFileAttachment The new object to create
     * @return The created FileAttachment
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public FileAttachment post(final FileAttachment newFileAttachment) throws ClientException {
        return send(HttpMethod.POST, newFileAttachment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IFileAttachmentRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (FileAttachmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IFileAttachmentRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (FileAttachmentRequest)this;
     }

}
