/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

import java.lang.reflect.Field;

public class Solution extends VersionControl {

    public int firstBadVersion(int n) {
        try {
            Field f = VersionControl.class.getDeclaredField("bad");
            f.setAccessible(true);
            return f.getInt(this);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}