/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2009-2025 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.binding.internal;

/**
 * Enumeration of video fit mode options.
 */
public enum libvlc_video_fit_mode_t {

    libvlc_video_fit_none(0),    /** Explicit zoom set by \ref libvlc_video_set_scale */
    libvlc_video_fit_smaller(1), /** Fit inside / to smallest display dimension */
    libvlc_video_fit_larger(2),  /** Fit outside / to largest display dimension */
    libvlc_video_fit_width(3),   /** Fit to display width */
    libvlc_video_fit_height(4);

    private final int intValue;

    libvlc_video_fit_mode_t(int intValue) {
        this.intValue = intValue;
    }

    public int intValue() {
        return intValue;
    }
}
