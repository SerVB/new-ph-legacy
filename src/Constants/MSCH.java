/*
 * MIT License
 *
 * Copyright (c) 2017
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
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package Constants;

import utils.RGB;

/**
 * Magic School secondary skills (Air, Earth, Fire, Water).
 */
public class MSCH {

    public final int[] SECSKILLS = {
        SECSK.AIRMAGIC, SECSK.EARTHMAGIC, SECSK.FIREMAGIC, SECSK.WATERMAGIC
    };
    
    /**
     * Magic school colors (Air, Earth, Fire, Water), (Background, Foreground).
     */
    public final RGB[][] MSCH_COLORS = {
        {
            new RGB(148, 190, 198),
            new RGB( 18,  23, 127)
        },{
            new RGB(142, 232, 111),
            new RGB( 41, 110,  18)
        },{
            new RGB(228, 156, 156),
            new RGB(132,  12,  12)
        },{
            new RGB(128, 148, 255),
            new RGB(  4,  16, 128)
        }
    };
    
}