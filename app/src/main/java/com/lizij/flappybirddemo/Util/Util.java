package com.lizij.flappybirddemo.Util;

import android.content.Context;
import android.util.TypedValue;

public class Util {
	public static int dp2px(Context context, float dp) {
		return Math.round(TypedValue.applyDimension(
				TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources()
						.getDisplayMetrics()));
	}

}
