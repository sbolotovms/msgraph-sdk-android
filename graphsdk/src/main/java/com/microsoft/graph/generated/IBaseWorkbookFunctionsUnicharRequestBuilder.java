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
 * The interface for the Base Workbook Functions Unichar Request Builder.
 */
public interface IBaseWorkbookFunctionsUnicharRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsUnicharRequest
     *
     * @return The IWorkbookFunctionsUnicharRequest instance
     */
    IWorkbookFunctionsUnicharRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsUnicharRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsUnicharRequest instance
     */
    IWorkbookFunctionsUnicharRequest buildRequest(final List<Option> requestOptions);
}
