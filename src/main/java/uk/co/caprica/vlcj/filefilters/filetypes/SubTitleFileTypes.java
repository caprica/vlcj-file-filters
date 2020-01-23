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

package uk.co.caprica.vlcj.filefilters.filetypes;

/**
 * Subtitle file types supported by VLC.
 */
final public class SubTitleFileTypes {

    /**
     * From the vlc_interface.h include file.
     */
    private static final String[] EXTENSIONS_SUBTITLE = {
        "cdg",
        "idx",
        "srt",
        "sub",
        "utf",
        "ass",
        "ssa",
        "aqt",
        "jss",
        "psb",
        "rt",
        "sami",
        "smi",
        "txt",
        "smil",
        "stl",
        "usf",
        "dks",
        "pjs",
        "mpl2",
        "mks",
        "vtt",
        "tt",
        "ttml",
        "dfxp",
        "scc"
    };

    /**
     * Get the subtitle file types supported by VLC.
     *
     * @return supported file types
     */
    public static String[] subTitleFileTypes() {
        return EXTENSIONS_SUBTITLE;
    }
}
