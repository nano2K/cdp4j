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
package io.webfolder.cdp.type.page;

/**
 * Viewport for capturing screenshot
 */
public class Viewport {
    private Double x;

    private Double y;

    private Double width;

    private Double height;

    private Double scale;

    /**
     * X offset in CSS pixels.
     */
    public Double getX() {
        return x;
    }

    /**
     * X offset in CSS pixels.
     */
    public void setX(Double x) {
        this.x = x;
    }

    /**
     * Y offset in CSS pixels
     */
    public Double getY() {
        return y;
    }

    /**
     * Y offset in CSS pixels
     */
    public void setY(Double y) {
        this.y = y;
    }

    /**
     * Rectangle width in CSS pixels
     */
    public Double getWidth() {
        return width;
    }

    /**
     * Rectangle width in CSS pixels
     */
    public void setWidth(Double width) {
        this.width = width;
    }

    /**
     * Rectangle height in CSS pixels
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Rectangle height in CSS pixels
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * Page scale factor.
     */
    public Double getScale() {
        return scale;
    }

    /**
     * Page scale factor.
     */
    public void setScale(Double scale) {
        this.scale = scale;
    }
}
