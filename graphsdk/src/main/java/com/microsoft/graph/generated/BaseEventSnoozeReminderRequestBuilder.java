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
 * The class for the Base Event Snooze Reminder Request Builder.
 */
public class BaseEventSnoozeReminderRequestBuilder extends BasePostMethodRequestBuilder {

    /**
     * The request builder for this EventSnoozeReminder
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseEventSnoozeReminderRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options, final DateTimeTimeZone newReminderTime) {
        super(requestUrl, client, options);
        mBodyParams.put("newReminderTime", newReminderTime);
    }

    /**
     * Creates the IEventSnoozeReminderRequest
     *
     * @return The IEventSnoozeReminderRequest instance
     */
    public IEventSnoozeReminderRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IEventSnoozeReminderRequest with specific options instead of the existing options
     *
     * @param options the options for the request
     * @return The IEventSnoozeReminderRequest instance
     */
    public IEventSnoozeReminderRequest buildRequest(final List<Option> options) {
        EventSnoozeReminderRequest request = new EventSnoozeReminderRequest(
                getRequestUrl(),
                getClient(),
                options
        );

        if (hasParameter("newReminderTime")) {
            request.mBody.newReminderTime = getParameter("newReminderTime");
        }

        return request;
    }
}
