package U1;

import D.a;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import iceexchange.in.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k0.C0816C;

public final class b extends C0816C {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f3045a;

    /* renamed from: b  reason: collision with root package name */
    public final List f3046b = Collections.unmodifiableList(new ArrayList());

    public b() {
        Paint paint = new Paint();
        this.f3045a = paint;
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.f3045a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (c cVar : this.f3046b) {
            cVar.getClass();
            ThreadLocal threadLocal = a.f304a;
            float f5 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((((float) Color.alpha(-16776961)) * 0.0f) + (((float) Color.alpha(-65281)) * f5)), (int) ((((float) Color.red(-16776961)) * 0.0f) + (((float) Color.red(-65281)) * f5)), (int) ((((float) Color.green(-16776961)) * 0.0f) + (((float) Color.green(-65281)) * f5)), (int) ((((float) Color.blue(-16776961)) * 0.0f) + (((float) Color.blue(-65281)) * f5))));
            float E5 = (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).E();
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
            cVar.getClass();
            canvas.drawLine(0.0f, E5, 0.0f, (float) (carouselLayoutManager.f8557o - carouselLayoutManager.B()), paint);
        }
    }
}
