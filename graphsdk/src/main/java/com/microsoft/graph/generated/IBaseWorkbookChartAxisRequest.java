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
 * The interface for the Base Workbook Chart Axis Request.
 */
public interface IBaseWorkbookChartAxisRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartAxis from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookChartAxis> callback);

    /**
     * Gets the WorkbookChartAxis from the service
     * @return The WorkbookChartAxis from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartAxis get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookChartAxis with a source
     * @param sourceWorkbookChartAxis The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookChartAxis sourceWorkbookChartAxis, final ICallback<WorkbookChartAxis> callback);

    /**
     * Patches this WorkbookChartAxis with a source
     * @param sourceWorkbookChartAxis The source object with updates
     * @return The updated WorkbookChartAxis
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartAxis patch(final WorkbookChartAxis sourceWorkbookChartAxis) throws ClientException;

    /**
     * Posts a WorkbookChartAxis with a new object
     * @param newWorkbookChartAxis The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookChartAxis newWorkbookChartAxis, final ICallback<WorkbookChartAxis> callback);

    /**
     * Posts a WorkbookChartAxis with a new object
     * @param newWorkbookChartAxis The new object to create
     * @return The created WorkbookChartAxis
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartAxis post(final WorkbookChartAxis newWorkbookChartAxis) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookChartAxisRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookChartAxisRequest expand(final String value);

}
