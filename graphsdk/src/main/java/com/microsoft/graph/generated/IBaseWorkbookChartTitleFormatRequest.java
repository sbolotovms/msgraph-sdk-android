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
 * The interface for the Base Workbook Chart Title Format Request.
 */
public interface IBaseWorkbookChartTitleFormatRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartTitleFormat from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookChartTitleFormat> callback);

    /**
     * Gets the WorkbookChartTitleFormat from the service
     * @return The WorkbookChartTitleFormat from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartTitleFormat get() throws ClientException;

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
     * Patches this WorkbookChartTitleFormat with a source
     * @param sourceWorkbookChartTitleFormat The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookChartTitleFormat sourceWorkbookChartTitleFormat, final ICallback<WorkbookChartTitleFormat> callback);

    /**
     * Patches this WorkbookChartTitleFormat with a source
     * @param sourceWorkbookChartTitleFormat The source object with updates
     * @return The updated WorkbookChartTitleFormat
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartTitleFormat patch(final WorkbookChartTitleFormat sourceWorkbookChartTitleFormat) throws ClientException;

    /**
     * Posts a WorkbookChartTitleFormat with a new object
     * @param newWorkbookChartTitleFormat The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookChartTitleFormat newWorkbookChartTitleFormat, final ICallback<WorkbookChartTitleFormat> callback);

    /**
     * Posts a WorkbookChartTitleFormat with a new object
     * @param newWorkbookChartTitleFormat The new object to create
     * @return The created WorkbookChartTitleFormat
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartTitleFormat post(final WorkbookChartTitleFormat newWorkbookChartTitleFormat) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookChartTitleFormatRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookChartTitleFormatRequest expand(final String value);

}
