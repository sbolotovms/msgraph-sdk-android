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
 * The class for the Base Workbook Functions Areas Request Builder.
 */
public class BaseWorkbookFunctionsAreasRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAreas
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsAreasRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement reference) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("reference", reference);
    }

    /**
     * Creates the IWorkbookFunctionsAreasRequest
     *
     * @return The IWorkbookFunctionsAreasRequest instance
     */
    public IWorkbookFunctionsAreasRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsAreasRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsAreasRequest instance
     */
    public IWorkbookFunctionsAreasRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsAreasRequest request = new WorkbookFunctionsAreasRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("reference")) {
            request.mBody.reference = getParameter("reference");
        }

        return request;
    }
}
