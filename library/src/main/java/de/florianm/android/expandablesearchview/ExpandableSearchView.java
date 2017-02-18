package de.florianm.android.expandablesearchview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;


public class ExpandableSearchView extends View {
    public ExpandableSearchView(Context context) {
        super(context, null, R.styleable.search_bar_theme_searchBarStyle);
    }

    public ExpandableSearchView(Context context, AttributeSet attrs) {
        super(context, attrs, R.styleable.search_bar_theme_searchBarStyle);
    }

    public ExpandableSearchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ExpandableSearchView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
