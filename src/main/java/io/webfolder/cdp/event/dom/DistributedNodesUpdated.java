/**
 * The MIT License
 * Copyright © 2017 WebFolder OÜ
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.dom.BackendNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Called when distrubution is changed
 */
@Experimental
@Domain("DOM")
@EventName("distributedNodesUpdated")
public class DistributedNodesUpdated {
    private Integer insertionPointId;

    private List<BackendNode> distributedNodes = new ArrayList<>();

    /**
     * Insertion point where distrubuted nodes were updated.
     */
    public Integer getInsertionPointId() {
        return insertionPointId;
    }

    /**
     * Insertion point where distrubuted nodes were updated.
     */
    public void setInsertionPointId(Integer insertionPointId) {
        this.insertionPointId = insertionPointId;
    }

    /**
     * Distributed nodes for given insertion point.
     */
    public List<BackendNode> getDistributedNodes() {
        return distributedNodes;
    }

    /**
     * Distributed nodes for given insertion point.
     */
    public void setDistributedNodes(List<BackendNode> distributedNodes) {
        this.distributedNodes = distributedNodes;
    }
}
