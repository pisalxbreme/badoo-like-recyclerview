package me.pisal.badoorecyclerview.custom.ui

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View
import me.pisal.badoorecyclerview.R

class BDItemDecorator(space:Int): RecyclerView.ItemDecoration() {

    var space: Int = 0

    init {
        this.space = space
    }

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        if (parent.getChildLayoutPosition(view) == 1) {
            outRect.top = view.context.resources.getDimensionPixelSize(R.dimen.middle_item_space) - space;
        } else {
            outRect.top = space;
        }
        outRect.bottom = space;
    }
}