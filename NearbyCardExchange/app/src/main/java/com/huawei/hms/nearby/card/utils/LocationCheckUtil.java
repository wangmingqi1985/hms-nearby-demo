/*
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.hms.nearby.card.utils;

import android.content.Context;
import android.location.LocationManager;

/**
 * Location Check Util
 *
 * @since 2020-06-04
 */
public final class LocationCheckUtil {
    private LocationCheckUtil() {
    }

    /**
     * Is Gps Enabled
     *
     * @param context Context
     * @return true:Gps is enabled
     */
    public static boolean isLocationEnabled(Context context) {
        Object object = context.getSystemService(Context.LOCATION_SERVICE);
        if (!(object instanceof LocationManager)) {
            return false;
        }
        LocationManager locationManager = (LocationManager) object;
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
    }
}