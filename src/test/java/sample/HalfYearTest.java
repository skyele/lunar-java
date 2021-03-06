package sample;

import com.nlf.calendar.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 半年示例
 */
public class HalfYearTest {
    private Object[][] data = new Object[][]{
            //强一般等价类 P73
            {6, 2000, "2000.2"},
            {6, 1996, "1996.2"},
            {6, 2002, "2002.2"},
            {6, 2000, "2000.2"},
            {6, 1996, "1996.2"},
            {6, 2002, "2002.2"},
            {6, 2000, "2000.2"},
            {6, 1996, "1996.2"},
            {6, 2002, "2002.2"},
            {6, 2000, "2000.2"},
            {6, 1996, "1996.2"},
            {6, 2002, "2002.2"},
            {7, 2000, "2001.1"},
            {7, 1996, "1997.1"},
            {7, 2002, "2003.1"},
            {7, 2000, "2001.1"},
            {7, 1996, "1997.1"},
            {7, 2002, "2003.1"},
            {7, 2000, "2001.1"},
            {7, 1996, "1997.1"},
            {7, 2002, "2003.1"},
            {7, 2000, "2001.1"},
            {7, 1996, "1997.1"},
            {7, 2002, "2003.1"},
            {2, 2000, "2000.2"},
            {2, 1996, "1996.2"},
            {2, 2002, "2002.2"},
            {2, 2000, "2000.2"},
            {2, 1996, "1996.2"},
            {2, 2002, "2002.2"},
            {2, 2000, "2000.2"},
            {2, 1996, "1996.2"},
            {2, 2002, "2002.2"},
            {2, 2000, "2000.2"},
            {2, 1996, "1996.2"},
            {2, 2002, "2002.2"},
    };

    @org.junit.Test
    public void test() {

        for (Object[] test : data) {
            SolarHalfYear halfYear = new SolarHalfYear(Integer.parseInt(test[1].toString()), Integer.parseInt(test[0].toString()));
            assertEquals(test[2].toString(), halfYear.next(1).toString());
        }
    }

}
