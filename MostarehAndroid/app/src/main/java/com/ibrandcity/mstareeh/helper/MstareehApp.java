package com.ibrandcity.mstareeh.helper;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;

import java.lang.reflect.Field;

/**
 * Created by mamdouhelnakeeb on 10/21/17.
 */

public class MstareehApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        setDefaultFont(this, "MONOSPACE", "ge_ss_two.otf");
    }

    public static void setDefaultFont(Context context,
                                      String staticTypefaceFieldName, String fontAssetName) {
        final Typeface regular = Typeface.createFromAsset(context.getAssets(),
                fontAssetName);
        replaceFont(staticTypefaceFieldName, regular);
    }

    protected static void replaceFont(String staticTypefaceFieldName,
                                      final Typeface newTypeface) {
        try {
            final Field staticField = Typeface.class
                    .getDeclaredField(staticTypefaceFieldName);
            staticField.setAccessible(true);

            staticField.set(null, newTypeface);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
