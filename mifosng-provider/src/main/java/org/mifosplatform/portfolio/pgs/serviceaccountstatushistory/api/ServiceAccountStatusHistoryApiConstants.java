/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.pgs.serviceaccountstatushistory.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ServiceAccountStatusHistoryApiConstants {

    public static final String RESOURCE_NAME = "serviceaccountstatushistory";

 // general
    public static final String localeParamName = "locale";
    public static final String dateFormatParamName = "dateFormat";
    
    // request parameters
    public static final String idParamName = "id";
    public static final String serviceAccountIdParamName = "serviceAccountId";
    public static final String dateParamName = "date";
    public static final String changeParamName = "change";

    public static final Set<String> CREATE_REQUEST_DATA_PARAMETERS = new HashSet<String>(Arrays.asList(localeParamName, dateFormatParamName, serviceAccountIdParamName, dateParamName,
    		changeParamName));

    // update parameters
    public static final Set<String> UPDATE_REQUEST_DATA_PARAMETERS = new HashSet<String>(Arrays.asList(changeParamName));

}