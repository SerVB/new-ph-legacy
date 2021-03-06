/*
 * MIT License
 *
 * Copyright (c) 2017
 *
 * Permission is hereby granted,  free of charge,  to any person obtaining a copy
 * of this software and associated documentation files (the "Software"),  to deal
 * in the Software without restriction,  including without limitation the rights
 * to use,  copy,  modify,  merge,  publish,  distribute,  sublicense,  and/or sell
 * copies of the Software,  and to permit persons to whom the Software is
 * furnished to do so,  subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS",  WITHOUT WARRANTY OF ANY KIND,  EXPRESS OR
 * IMPLIED,  INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,  DAMAGES OR OTHER
 * LIABILITY,  WHETHER IN AN ACTION OF CONTRACT,  TORT OR OTHERWISE,  ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package newph.core.staticFunction;

import newph.core.metric.iPoint;
import newph.core.metric.iSize;

/**
 * Common table declarations.
 *
 * @author  SerVB
 * @since   "GitHub new sources"
 */
public final class iTables {

    /**
     * Prevents from creating an instance of the class.
     */
    private iTables() {}

    /**
     * CRC8 Table (256 values).
     */
    public static final byte[] crc8 = {
        (byte) 0xf8, (byte) 0xd9, (byte) 0xaa, (byte) 0x45, (byte) 0xff, (byte) 0x24, (byte) 0xe9, (byte) 0x70,
        (byte) 0x07, (byte) 0xac, (byte) 0xa9, (byte) 0x5f, (byte) 0xea, (byte) 0x39, (byte) 0xab, (byte) 0xa3,
        (byte) 0x80, (byte) 0x88, (byte) 0xc2, (byte) 0x92, (byte) 0x5d, (byte) 0x36, (byte) 0x29, (byte) 0x47,
        (byte) 0xbc, (byte) 0xe1, (byte) 0x19, (byte) 0xea, (byte) 0xb6, (byte) 0x89, (byte) 0x9b, (byte) 0x32,
        (byte) 0xb8, (byte) 0x3c, (byte) 0x9c, (byte) 0x27, (byte) 0x33, (byte) 0xf2, (byte) 0x3f, (byte) 0x2d,
        (byte) 0x95, (byte) 0xb6, (byte) 0x77, (byte) 0x3e, (byte) 0x79, (byte) 0x06, (byte) 0xd4, (byte) 0x77,
        (byte) 0x1a, (byte) 0x7d, (byte) 0x9d, (byte) 0xd6, (byte) 0x0e, (byte) 0xaf, (byte) 0x20, (byte) 0x42,
        (byte) 0x31, (byte) 0x55, (byte) 0x46, (byte) 0xcb, (byte) 0xdf, (byte) 0xaa, (byte) 0x6a, (byte) 0x34,

        (byte) 0x66, (byte) 0x14, (byte) 0x6b, (byte) 0xae, (byte) 0xba, (byte) 0x07, (byte) 0x00, (byte) 0xe7,
        (byte) 0x6b, (byte) 0x26, (byte) 0x4c, (byte) 0x43, (byte) 0xd5, (byte) 0xac, (byte) 0xb3, (byte) 0x69,
        (byte) 0x97, (byte) 0x0b, (byte) 0xeb, (byte) 0x02, (byte) 0x46, (byte) 0xd3, (byte) 0x56, (byte) 0xbd,
        (byte) 0x62, (byte) 0xd4, (byte) 0x8f, (byte) 0x97, (byte) 0x88, (byte) 0x87, (byte) 0x43, (byte) 0x59,
        (byte) 0xea, (byte) 0xaa, (byte) 0x42, (byte) 0x62, (byte) 0xfd, (byte) 0x2b, (byte) 0xd5, (byte) 0xa6,
        (byte) 0x71, (byte) 0x47, (byte) 0x53, (byte) 0xf7, (byte) 0x66, (byte) 0xf3, (byte) 0xef, (byte) 0x84,
        (byte) 0xdd, (byte) 0x7b, (byte) 0xd4, (byte) 0x9f, (byte) 0x6c, (byte) 0x69, (byte) 0x74, (byte) 0xc3,
        (byte) 0x37, (byte) 0xa8, (byte) 0x1c, (byte) 0xd5, (byte) 0x1b, (byte) 0xe9, (byte) 0xcc, (byte) 0xaa,

        (byte) 0x2c, (byte) 0x46, (byte) 0x47, (byte) 0xca, (byte) 0x62, (byte) 0x25, (byte) 0x66, (byte) 0x73,
        (byte) 0x8f, (byte) 0x60, (byte) 0xb1, (byte) 0xe1, (byte) 0x94, (byte) 0xa3, (byte) 0x30, (byte) 0xcd,
        (byte) 0xd5, (byte) 0x15, (byte) 0x7f, (byte) 0x34, (byte) 0xea, (byte) 0x3a, (byte) 0x21, (byte) 0x59,
        (byte) 0x98, (byte) 0x18, (byte) 0x16, (byte) 0x0d, (byte) 0xff, (byte) 0x98, (byte) 0xb0, (byte) 0x2e,
        (byte) 0x14, (byte) 0x30, (byte) 0xa2, (byte) 0x6e, (byte) 0x52, (byte) 0xbf, (byte) 0x5a, (byte) 0x55,
        (byte) 0xad, (byte) 0xb8, (byte) 0x91, (byte) 0x8a, (byte) 0xc8, (byte) 0x83, (byte) 0x20, (byte) 0x4e,
        (byte) 0x67, (byte) 0x20, (byte) 0x15, (byte) 0x49, (byte) 0x27, (byte) 0x0e, (byte) 0x06, (byte) 0x89,
        (byte) 0x6d, (byte) 0x6b, (byte) 0xa5, (byte) 0xc8, (byte) 0x9c, (byte) 0x5c, (byte) 0x95, (byte) 0xed,

        (byte) 0x8b, (byte) 0xaf, (byte) 0x7c, (byte) 0xd6, (byte) 0x36, (byte) 0xbf, (byte) 0x5a, (byte) 0x55,
        (byte) 0xb3, (byte) 0x98, (byte) 0x19, (byte) 0x78, (byte) 0x68, (byte) 0x5c, (byte) 0x65, (byte) 0x0e,
        (byte) 0x7c, (byte) 0xe6, (byte) 0xbd, (byte) 0x66, (byte) 0x8b, (byte) 0xac, (byte) 0xca, (byte) 0x5a,
        (byte) 0x9e, (byte) 0xea, (byte) 0xf0, (byte) 0x8c, (byte) 0x5a, (byte) 0xfd, (byte) 0x24, (byte) 0xf0,
        (byte) 0x77, (byte) 0x0c, (byte) 0xfd, (byte) 0x8b, (byte) 0x74, (byte) 0xee, (byte) 0x0d, (byte) 0x7a,
        (byte) 0x89, (byte) 0x48, (byte) 0x71, (byte) 0x35, (byte) 0xde, (byte) 0xf6, (byte) 0xa7, (byte) 0x15,
        (byte) 0xfa, (byte) 0xad, (byte) 0xa0, (byte) 0x14, (byte) 0x7e, (byte) 0xde, (byte) 0x16, (byte) 0xd5,
        (byte) 0x13, (byte) 0xdd, (byte) 0x20, (byte) 0xe4, (byte) 0xa1, (byte) 0x42, (byte) 0x04, (byte) 0x3e
    };

    /**
     * CRC32 Table (256 values).
     */
    public static final int[] crc32 = {
        0x00000000, 0x77073096, 0xEE0E612C, 0x990951BA,
        0x076DC419, 0x706AF48F, 0xE963A535, 0x9E6495A3,
        0x0EDB8832, 0x79DCB8A4, 0xE0D5E91E, 0x97D2D988,
        0x09B64C2B, 0x7EB17CBD, 0xE7B82D07, 0x90BF1D91,
        0x1DB71064, 0x6AB020F2, 0xF3B97148, 0x84BE41DE,
        0x1ADAD47D, 0x6DDDE4EB, 0xF4D4B551, 0x83D385C7,
        0x136C9856, 0x646BA8C0, 0xFD62F97A, 0x8A65C9EC,
        0x14015C4F, 0x63066CD9, 0xFA0F3D63, 0x8D080DF5,
        0x3B6E20C8, 0x4C69105E, 0xD56041E4, 0xA2677172,
        0x3C03E4D1, 0x4B04D447, 0xD20D85FD, 0xA50AB56B,
        0x35B5A8FA, 0x42B2986C, 0xDBBBC9D6, 0xACBCF940,
        0x32D86CE3, 0x45DF5C75, 0xDCD60DCF, 0xABD13D59,
        0x26D930AC, 0x51DE003A, 0xC8D75180, 0xBFD06116,
        0x21B4F4B5, 0x56B3C423, 0xCFBA9599, 0xB8BDA50F,
        0x2802B89E, 0x5F058808, 0xC60CD9B2, 0xB10BE924,
        0x2F6F7C87, 0x58684C11, 0xC1611DAB, 0xB6662D3D,

        0x76DC4190, 0x01DB7106, 0x98D220BC, 0xEFD5102A,
        0x71B18589, 0x06B6B51F, 0x9FBFE4A5, 0xE8B8D433,
        0x7807C9A2, 0x0F00F934, 0x9609A88E, 0xE10E9818,
        0x7F6A0DBB, 0x086D3D2D, 0x91646C97, 0xE6635C01,
        0x6B6B51F4, 0x1C6C6162, 0x856530D8, 0xF262004E,
        0x6C0695ED, 0x1B01A57B, 0x8208F4C1, 0xF50FC457,
        0x65B0D9C6, 0x12B7E950, 0x8BBEB8EA, 0xFCB9887C,
        0x62DD1DDF, 0x15DA2D49, 0x8CD37CF3, 0xFBD44C65,
        0x4DB26158, 0x3AB551CE, 0xA3BC0074, 0xD4BB30E2,
        0x4ADFA541, 0x3DD895D7, 0xA4D1C46D, 0xD3D6F4FB,
        0x4369E96A, 0x346ED9FC, 0xAD678846, 0xDA60B8D0,
        0x44042D73, 0x33031DE5, 0xAA0A4C5F, 0xDD0D7CC9,
        0x5005713C, 0x270241AA, 0xBE0B1010, 0xC90C2086,
        0x5768B525, 0x206F85B3, 0xB966D409, 0xCE61E49F,
        0x5EDEF90E, 0x29D9C998, 0xB0D09822, 0xC7D7A8B4,
        0x59B33D17, 0x2EB40D81, 0xB7BD5C3B, 0xC0BA6CAD,

        0xEDB88320, 0x9ABFB3B6, 0x03B6E20C, 0x74B1D29A,
        0xEAD54739, 0x9DD277AF, 0x04DB2615, 0x73DC1683,
        0xE3630B12, 0x94643B84, 0x0D6D6A3E, 0x7A6A5AA8,
        0xE40ECF0B, 0x9309FF9D, 0x0A00AE27, 0x7D079EB1,
        0xF00F9344, 0x8708A3D2, 0x1E01F268, 0x6906C2FE,
        0xF762575D, 0x806567CB, 0x196C3671, 0x6E6B06E7,
        0xFED41B76, 0x89D32BE0, 0x10DA7A5A, 0x67DD4ACC,
        0xF9B9DF6F, 0x8EBEEFF9, 0x17B7BE43, 0x60B08ED5,
        0xD6D6A3E8, 0xA1D1937E, 0x38D8C2C4, 0x4FDFF252,
        0xD1BB67F1, 0xA6BC5767, 0x3FB506DD, 0x48B2364B,
        0xD80D2BDA, 0xAF0A1B4C, 0x36034AF6, 0x41047A60,
        0xDF60EFC3, 0xA867DF55, 0x316E8EEF, 0x4669BE79,
        0xCB61B38C, 0xBC66831A, 0x256FD2A0, 0x5268E236,
        0xCC0C7795, 0xBB0B4703, 0x220216B9, 0x5505262F,
        0xC5BA3BBE, 0xB2BD0B28, 0x2BB45A92, 0x5CB36A04,
        0xC2D7FFA7, 0xB5D0CF31, 0x2CD99E8B, 0x5BDEAE1D,

        0x9B64C2B0, 0xEC63F226, 0x756AA39C, 0x026D930A,
        0x9C0906A9, 0xEB0E363F, 0x72076785, 0x05005713,
        0x95BF4A82, 0xE2B87A14, 0x7BB12BAE, 0x0CB61B38,
        0x92D28E9B, 0xE5D5BE0D, 0x7CDCEFB7, 0x0BDBDF21,
        0x86D3D2D4, 0xF1D4E242, 0x68DDB3F8, 0x1FDA836E,
        0x81BE16CD, 0xF6B9265B, 0x6FB077E1, 0x18B74777,
        0x88085AE6, 0xFF0F6A70, 0x66063BCA, 0x11010B5C,
        0x8F659EFF, 0xF862AE69, 0x616BFFD3, 0x166CCF45,
        0xA00AE278, 0xD70DD2EE, 0x4E048354, 0x3903B3C2,
        0xA7672661, 0xD06016F7, 0x4969474D, 0x3E6E77DB,
        0xAED16A4A, 0xD9D65ADC, 0x40DF0B66, 0x37D83BF0,
        0xA9BCAE53, 0xDEBB9EC5, 0x47B2CF7F, 0x30B5FFE9,
        0xBDBDF21C, 0xCABAC28A, 0x53B39330, 0x24B4A3A6,
        0xBAD03605, 0xCDD70693, 0x54DE5729, 0x23D967BF,
        0xB3667A2E, 0xC4614AB8, 0x5D681B02, 0x2A6F2B94,
        0xB40BBE37, 0xC30C8EA1, 0x5A05DF1B, 0x2D02EF8D
    };

    /**
     * Int based hash function.
     *
     * @param nid   Value to calculate the hash.
     * @return      The hash.
     */
    public static int HashFn(final int nid) {
        return nid;
    }

    /**
     * iSize based hash function.
     *
     * @param siz   Value to calculate the hash.
     * @return      The hash.
     */
    public static int HashFn(final iSize siz) {
        return (siz.w + 1) * (siz.h + 1);
    }

    /**
     * iPoint based hash function.
     *
     * @param pos   Value to calculate the hash.
     * @return      The hash.
     */
    public static int HashFn(final iPoint pos) {
        return (pos.x + 1) * (pos.y + 1);
    }

    /**
     * String based hash function.
     *
     * @param str   Value to calculate the hash.
     * @return      The hash.
     */
    public static int HashFn(final String str) {
        if (str.length() == 0) {
            return 0;
        }
        int h1,  h2,  h,  i = 0;
        h1 = str.charAt(i);
        h2 = h1 + 1;
        i++;
        while (i < str.length()) {
            h1 = crc8[h1 ^ str.charAt(i)];
            h2 = crc8[h2 ^ str.charAt(i)];
            i++;
        }
        h = (h1 << 8) | h2;
        return h;
    }

}
