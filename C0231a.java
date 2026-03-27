package a1;

import F4.a;

/* renamed from: a1.a  reason: case insensitive filesystem */
public final class C0231a implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f3763c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile a f3764a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f3765b;

    /* JADX WARNING: type inference failed for: r0v1, types: [F4.a, java.lang.Object, a1.a] */
    public static a a(a aVar) {
        if (aVar instanceof C0231a) {
            return aVar;
        }
        ? obj = new Object();
        obj.f3765b = f3763c;
        obj.f3764a = aVar;
        return obj;
    }

    public final Object get() {
        Object obj = this.f3765b;
        Object obj2 = f3763c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f3765b;
                    if (obj == obj2) {
                        obj = this.f3764a.get();
                        Object obj3 = this.f3765b;
                        if (obj3 != obj2) {
                            if (obj3 != obj) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                            }
                        }
                        this.f3765b = obj;
                        this.f3764a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
