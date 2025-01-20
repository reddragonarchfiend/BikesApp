package my.app.bikesapp.db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\bH\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u001c\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lmy/app/bikesapp/db/Converters;", "", "()V", "gson", "Lcom/google/gson/Gson;", "fromCompanyList", "", "company", "", "fromLocation", "location", "Lmy/app/bikesapp/data/models/Location;", "toCompanyList", "companyJson", "toLocation", "locationJson", "app_debug"})
public final class Converters {
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.Gson gson = null;
    
    public Converters() {
        super();
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromCompanyList(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> company) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> toCompanyList(@org.jetbrains.annotations.Nullable()
    java.lang.String companyJson) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromLocation(@org.jetbrains.annotations.Nullable()
    my.app.bikesapp.data.models.Location location) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final my.app.bikesapp.data.models.Location toLocation(@org.jetbrains.annotations.Nullable()
    java.lang.String locationJson) {
        return null;
    }
}