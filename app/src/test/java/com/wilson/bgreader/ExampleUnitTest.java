package com.wilson.bgreader;

import com.wilson.CommonUtil.CommonUtil;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.PointValue;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void test() throws Exception {
        byte[] aByte;
        aByte = new byte[]{40, 0, 51, 19, 8, 79, -8, 89, 1, 0, -96, 7, -32, 90, 0, 47, 0, 1, -80, 11, -79, 11, -89, 11, -104, 11, -123, 11, 110, 11, 98, 11, 68, 11, 29, 11, -21, 10, 110, 10, -101, 9, 76, 8, -7, 6, -35, 4, -54, 2, 41};
//        aByte = new byte[]{40, 0, 39, 19, 13, 79, -8, 89, 1, 0, -96, 7, -32, 90, 0, 47, 0, 1, -91, 11, -82, 11, -74, 11, -73, 11, -79, 11, -80, 11, -79, 11, -89, 11, -104, 11, -123, 11, 41};
//        aByte = new byte[]{40, 0, 39, 19, 18, 79, -8, 89, 1, 0, -96, 7, -32, 90, 0, 47, 0, 1, -100, 11, -119, 11, 126, 11, -116, 11, -102, 11, -91, 11, -82, 11, -74, 11, -73, 11, -79, 11, 41};
//        aByte = new byte[]{40, 0, 39, 19, 20, 79, -8, 89, 1, 0, -96, 7, -32, 90, 0, 47, 0, 1, -89, 11, -100, 11, -119, 11, 126, 11, -116, 11, -102, 11, -91, 11, -82, 11, -74, 11, -73, 11, 41};
//        aByte = new byte[]{40, 0, 51, 19, 25, 79, -8, 89, 1, 0, -96, 7, -32, 90, 0, 47, 0, 1, 85, 11, 104, 11, -126, 11, -112, 11, -93, 11, -89, 11, -100, 11, -119, 11, 126, 11, -116, 11, -80, 11, 110, 10, -101, 9, 76, 8, -7, 6, -35, 4, 41};
//        aByte = new byte[]{40, 0, 39, 19, 27, 79, -8, 89, 1, 0, -96, 7, -32, 90, 0, 47, 0, 1, -16, 10, 36, 11, 68, 11, 85, 11, 104, 11, -126, 11, -112, 11, -93, 11, -89, 11, -100, 11, 41};
//        aByte = new byte[]{40, 0, 39, 19, 32, 79, -8, 89, 1, 0, -96, 7, -32, 90, 0, 47, 0, 1, 107, 10, -109, 10, -74, 10, -52, 10, -16, 10, 36, 11, 68, 11, 85, 11, 104, 11, -126, 11, 41};
//        aByte = new byte[]{40, 0, 39, 19, 37, 79, -8, 89, 1, 0, -96, 7, -32, 90, 0, 47, 0, 1, -78, 9, -50, 9, -10, 9, 18, 10, 69, 10, 107, 10, -109, 10, -74, 10, -52, 10, -16, 10, 41};

        ArrayList<Byte> bytes = new ArrayList();

        int k = (((Byte)aByte[3]).byteValue() & 0xFF) * 256 + (((Byte)aByte[4]).byteValue() & 0xFF);


        for (int i=18; i<aByte.length-1; i++){
            byte[] bb = new byte[] { ((Byte)aByte[i + 1]).byteValue(), ((Byte)aByte[i]).byteValue() };
            String s1 = CommonUtil.bytesToHexString(bb);
            Integer s2 = CommonUtil.getGlucoseRaw2(s1);
            Double s3 = CommonUtil.formatValue(s2);
            System.out.println(String.format("%s---%s---%s---%2.1f",(i-18)/2+1,s1,s2,s3));
            i++;
        }

        long lTime = CommonUtil.getLongMtime();
        long tTime = lTime - 30*60*1000;
        for (int i = 0; i < 12; ++i) {
            System.out.println(String.format("%s,%s,%s", tTime, tTime%1000000000, (tTime%1000000000) / 1000));

            tTime = tTime + 30*60*1000;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String strTime = sdf.format(lTime);
        long tmpTime = ((Date)sdf.parse(strTime.substring(0,17)+"00")).getTime();
        System.out.println(String.format("%s, %s", (Date)sdf.parse(strTime.substring(0,17)+"00"), tmpTime));
        System.out.println(k);
        if (-0.08 > -0.05)
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}