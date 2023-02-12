/*
 * The MIT License
 *
 * Copyright (c) 2009-2023 PrimeTek Informatics
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
package org.primefaces.event;

import javax.faces.component.UIComponent;
import javax.faces.component.behavior.Behavior;

import org.primefaces.model.TreeNode;

public class NodeSelectEvent extends AbstractAjaxBehaviorEvent {

    private static final long serialVersionUID = 1L;

    private TreeNode treeNode;

    private boolean contextMenu;

    public NodeSelectEvent(UIComponent component, Behavior behavior, TreeNode treeNode) {
        super(component, behavior);
        this.treeNode = treeNode;
    }

    public NodeSelectEvent(UIComponent component, Behavior behavior, TreeNode treeNode, boolean contextMenu) {
        super(component, behavior);
        this.treeNode = treeNode;
        this.contextMenu = contextMenu;
    }

    public TreeNode getTreeNode() {
        return treeNode;
    }

    public boolean isContextMenu() {
        return contextMenu;
    }
}
