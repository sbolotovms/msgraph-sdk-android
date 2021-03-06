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

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Calendar Group.
 */
public class BaseCalendarGroup extends Entity implements IJsonBackedObject {


    public BaseCalendarGroup() {
        oDataType = "microsoft.graph.calendarGroup";
    }

    /**
     * The Name.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Class Id.
     */
    @SerializedName("classId")
    @Expose
    public java.util.UUID classId;

    /**
     * The Change Key.
     */
    @SerializedName("changeKey")
    @Expose
    public String changeKey;

    /**
     * The Calendars.
     */
    public transient CalendarCollectionPage calendars;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;


        if (json.has("calendars")) {
            final BaseCalendarCollectionResponse response = new BaseCalendarCollectionResponse();
            if (json.has("calendars@odata.nextLink")) {
                response.nextLink = json.get("calendars@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("calendars").toString(), JsonObject[].class);
            final Calendar[] array = new Calendar[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Calendar.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            calendars = new CalendarCollectionPage(response, null);
        }
    }
}
