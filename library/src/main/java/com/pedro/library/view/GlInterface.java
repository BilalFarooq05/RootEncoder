/*
 * Copyright (C) 2024 pedroSG94.
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
 */

package com.pedro.library.view;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.pedro.encoder.input.gl.render.filters.BaseFilterRender;

public interface GlInterface {

    void setEncoderSize(int width, int height);

    void setEncoderRecordSize(int width, int height);

    Point getEncoderSize();

    SurfaceTexture getSurfaceTexture();

    Surface getSurface();

    void addMediaCodecSurface(Surface surface);

    void removeMediaCodecSurface();

    void addMediaCodecRecordSurface(Surface surface);

    void removeMediaCodecRecordSurface();

    void takePhoto(TakePhotoCallback takePhotoCallback);

    void setFilter(int filterPosition, @NonNull BaseFilterRender baseFilterRender);

    void addFilter(@NonNull BaseFilterRender baseFilterRender);

    void addFilter(int filterPosition, @NonNull BaseFilterRender baseFilterRender);

    void clearFilters();

    void removeFilter(int filterPosition);

    void removeFilter(@NonNull BaseFilterRender baseFilterRender);

    int filtersCount();

    void setFilter(@NonNull BaseFilterRender baseFilterRender);

    void setRotation(int rotation);

    void forceFpsLimit(int fps);

    void setStreamRotation(int rotation);

    void setIsStreamHorizontalFlip(boolean flip);

    void setIsStreamVerticalFlip(boolean flip);

    void setIsPreviewHorizontalFlip(boolean flip);

    void setIsPreviewVerticalFlip(boolean flip);

    void start();

    void stop();

    void muteVideo();

    void unMuteVideo();

    boolean isVideoMuted();

    void setForceRender(boolean enabled, int fps);

    void setForceRender(boolean enabled);

    boolean isRunning();

    void setRenderErrorCallback(RenderErrorCallback callback);

    // Static image methods
    void setStaticImage(Bitmap bitmap);
    void removeStaticImage();
    boolean isShowingStaticImage();
}