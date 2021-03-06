package sysproj.seonjoon.twice.staticdata;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;

public class StaticAppData {
    public static final int GoogleRequestCode = 7183;
    public static final int SNS_PLATFORM_COUNT = 3;

    public static final int MAINACTIVITY_FRAGMENT_COUNT =2;

    public static ColorMatrixColorFilter Gray_filter;

    static {
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);
        Gray_filter = new ColorMatrixColorFilter(matrix);
    }
}