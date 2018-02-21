/**
 * cdp4j - Chrome DevTools Protocol for Java
 * Copyright © 2017, 2018 WebFolder OÜ (support@webfolder.io)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;

/**
 * Called when a pseudo element is removed from an element
 */
@Experimental
@Domain("DOM")
@EventName("pseudoElementRemoved")
public class PseudoElementRemoved {
    private Integer parentId;

    private Integer pseudoElementId;

    /**
     * Pseudo element's parent element id.
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * Pseudo element's parent element id.
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * The removed pseudo element id.
     */
    public Integer getPseudoElementId() {
        return pseudoElementId;
    }

    /**
     * The removed pseudo element id.
     */
    public void setPseudoElementId(Integer pseudoElementId) {
        this.pseudoElementId = pseudoElementId;
    }
}
