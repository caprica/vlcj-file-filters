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
 * Copyright 2009-2020 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.filefilters;

import static uk.co.caprica.vlcj.filefilters.filetypes.AudioFileTypes.audioFileTypes;

/**
 * File filter implementation for audio files recognised by libvlc.
 */
public class AudioFileFilter extends ExtensionFileFilter {

    /**
     * Single instance.
     */
    public static final AudioFileFilter INSTANCE = new AudioFileFilter();

    /**
     * Create a new file filter.
     */
    public AudioFileFilter() {
        super(audioFileTypes());
    }
}
