package A1;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f23a = 0;

    static {
        b.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
