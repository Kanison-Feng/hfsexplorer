/*-
 * Copyright (C) 2008-2012 Erik Larsson
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.catacombae.hfsexplorer.fs;

import org.catacombae.hfs.ProgressMonitor;

/**
 * @author <a href="http://www.catacombae.org/" target="_top">Erik Larsson</a>
 */
public class NullProgressMonitor implements ProgressMonitor {

    private static final NullProgressMonitor INSTANCE = new NullProgressMonitor();

    public static NullProgressMonitor getInstance() { return INSTANCE; }

    protected NullProgressMonitor() {}

    /* @Override */
    public void signalCancel() {}

    /* @Override */
    public boolean cancelSignaled() { return false; }

    /* @Override */
    public void confirmCancel() {}

    /* @Override */
    public void addDataProgress(long dataSize) {}

}
