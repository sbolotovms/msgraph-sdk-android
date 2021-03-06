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
 * The class for the Base Workbook Functions Sum Ifs Request Builder.
 */
public class BaseWorkbookFunctionsSumIfsRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSumIfs
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsSumIfsRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement sumRange, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("sumRange", sumRange);
        mBodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsSumIfsRequest
     *
     * @return The IWorkbookFunctionsSumIfsRequest instance
     */
    public IWorkbookFunctionsSumIfsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsSumIfsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsSumIfsRequest instance
     */
    public IWorkbookFunctionsSumIfsRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsSumIfsRequest request = new WorkbookFunctionsSumIfsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("sumRange")) {
            request.mBody.sumRange = getParameter("sumRange");
        }

        if (hasParameter("values")) {
            request.mBody.values = getParameter("values");
        }

        return request;
    }
}
