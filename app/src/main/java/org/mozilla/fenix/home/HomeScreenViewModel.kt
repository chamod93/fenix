package org.mozilla.fenix.home

/* This Source Code Form is subject to the terms of the Mozilla Public
   License, v. 2.0. If a copy of the MPL was not distributed with this
   file, You can obtain one at http://mozilla.org/MPL/2.0/. */

import android.os.Parcelable
import androidx.lifecycle.ViewModel

class HomeScreenViewModel : ViewModel() {
    var layoutManagerState: Parcelable? = null
    var motionLayoutProgress = 0F
}
