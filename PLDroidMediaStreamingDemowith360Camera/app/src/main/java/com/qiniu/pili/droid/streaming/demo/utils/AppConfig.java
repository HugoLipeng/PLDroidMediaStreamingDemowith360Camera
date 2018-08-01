package com.qiniu.pili.droid.streaming.demo.utils;

import android.os.Environment;

import java.io.File;

/**
 * Created by wh on 2017/3/16.
 */

public class AppConfig {

    public static final String SDK_KEY_NEW = "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";

    //滤镜列表 17/05/11
    public static String[] mFilterName = {"深度美白", "清新丽人", "暖暖阳光", "香艳红唇", "艺术黑白",
            "甜美", "温暖", "果冻", "唯美", "淡雅",
            "清新", "Movie", "电影色FM2", "电影色FM7", "Vista(胶片)",
            "Chihiro(日系)", "lzyy(淡雅)", "旧时光OT4(怀旧)", "旧时光OT2(黑调)", "Pinky(少女)", "Zoe(初夏)", "超现实(绘画)" };
    public static String[] mFilterType = {"Deep", "Skinfresh", "Sunshine", "Sexylips", "Skinbw",
            "Sweet", "Lightwarm", "Jelly", "Grace", "Elegant",
            "Fresh", "Movie", "FM2", "FM7", "Vista",
            "Chihiro", "LZYY", "OldTimeFour", "OldTimeTwo", "PinkyFive", "Zoe", "SketchBW" };

    public static final String DEFAULT_PATH = Environment.getExternalStorageDirectory()
            + File.separator + "sdk_demo" + File.separator;

    public static final String STICKER_NAME = "TestSticker";

    public static final String STICKER_LOCAL_PATH = DEFAULT_PATH + "sticker" + File.separator ;

    public static final String STICKER_NOMEDIA_PATH = DEFAULT_PATH + ".nomedia";

    public static final boolean IS_USE_INDEPENDENT_THREAD = true;

}
