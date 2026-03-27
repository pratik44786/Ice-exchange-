package A1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20a;

    /* renamed from: b  reason: collision with root package name */
    public final IBinder f21b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22c;

    public /* synthetic */ a(IBinder iBinder, String str, int i6) {
        this.f20a = i6;
        this.f21b = iBinder;
        this.f22c = str;
    }

    public final IBinder asBinder() {
        switch (this.f20a) {
            case 0:
                return this.f21b;
            case 1:
                return this.f21b;
            default:
                return this.f21b;
        }
    }

    public Parcel e() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f22c);
        return obtain;
    }

    public Parcel f(Parcel parcel, int i6) {
        parcel = Parcel.obtain();
        try {
            this.f21b.transact(i6, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e6) {
            throw e6;
        } finally {
            parcel.recycle();
        }
    }

    public Parcel g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f22c);
        return obtain;
    }

    public Parcel y(Parcel parcel, int i6) {
        parcel = Parcel.obtain();
        try {
            this.f21b.transact(i6, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e6) {
            throw e6;
        } finally {
            parcel.recycle();
        }
    }

    public void z(Parcel parcel, int i6) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f21b.transact(i6, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
