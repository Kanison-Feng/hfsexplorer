package org.catacombae.hfs.types.hfsplus;

import java.io.PrintStream;
import java.math.BigInteger;
import org.catacombae.csjc.PrintableStruct;
import org.catacombae.csjc.StaticStruct;
import org.catacombae.util.Util;

/** This class was generated by CStructToJavaClass. */
public class BlockInfo implements StaticStruct, PrintableStruct {
    /*
     * struct BlockInfo
     * size: 16 bytes
     * description:
     *
     * BP  Size  Type    Identifier  Description
     * -----------------------------------------
     * 0   8     UInt64  bnum
     * 8   4     UInt32  bsize
     * 12  4     UInt32  next
     */

    public static final int STRUCTSIZE = 16;

    private long bnum;
    private int bsize;
    private int next;

    public BlockInfo(byte[] data, int offset) {
        bnum = Util.readLongBE(data, offset+0);
        bsize = Util.readIntBE(data, offset+8);
        next = Util.readIntBE(data, offset+12);
    }

    public static int length() { return STRUCTSIZE; }

    public int size() { return length(); }

    /**  */
    public final BigInteger getBnum() { return Util.unsign(getRawBnum()); }
    /**  */
    public final long getBsize() { return Util.unsign(getRawBsize()); }
    /**  */
    public final long getNext() { return Util.unsign(getRawNext()); }

    /** <b>Note that the return value from this function should be interpreted as an unsigned integer, for instance using Util.unsign(...).</b> */
    public final long getRawBnum() { return bnum; }
    /** <b>Note that the return value from this function should be interpreted as an unsigned integer, for instance using Util.unsign(...).</b> */
    public final int getRawBsize() { return bsize; }
    /** <b>Note that the return value from this function should be interpreted as an unsigned integer, for instance using Util.unsign(...).</b> */
    public final int getRawNext() { return next; }

    public void printFields(PrintStream ps, String prefix) {
        ps.println(prefix + " bnum: " + getBnum());
        ps.println(prefix + " bsize: " + getBsize());
        ps.println(prefix + " next: " + getNext());
    }

    public void print(PrintStream ps, String prefix) {
        ps.println(prefix + "BlockInfo:");
        printFields(ps, prefix);
    }

    public byte[] getBytes() {
        byte[] result = new byte[length()];
        int offset = 0;
        Util.arrayPutBE(result, offset, bnum); offset += 8;
        Util.arrayPutBE(result, offset, bsize); offset += 4;
        Util.arrayPutBE(result, offset, next); offset += 4;
        return result;
    }
}
