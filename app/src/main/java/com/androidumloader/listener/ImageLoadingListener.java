/*******************************************************************************
 * Copyright 2011-2013 Sergey Tarasevich
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.androidumloader.listener;

import android.graphics.Bitmap;
import android.view.View;

import com.androidumloader.assist.FailReason;


public interface ImageLoadingListener {


    void onLoadingStarted(String imageUri, View view);


    void onLoadingFailed(String imageUri, View view, FailReason failReason);


    void onLoadingComplete(String imageUri, View view, Bitmap loadedImage);


    void onLoadingCancelled(String imageUri, View view);
}
