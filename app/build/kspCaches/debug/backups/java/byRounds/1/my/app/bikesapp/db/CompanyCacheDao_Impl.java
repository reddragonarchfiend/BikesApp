package my.app.bikesapp.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import my.app.bikesapp.data.models.BikeCompany;
import my.app.bikesapp.data.models.Location;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CompanyCacheDao_Impl implements CompanyCacheDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BikeCompany> __insertionAdapterOfBikeCompany;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfClearCache;

  public CompanyCacheDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBikeCompany = new EntityInsertionAdapter<BikeCompany>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `company_cache` (`id`,`company`,`href`,`location`,`name`) VALUES (?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final BikeCompany entity) {
        statement.bindString(1, entity.getId());
        final String _tmp = __converters.fromCompanyList(entity.getCompany());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, _tmp);
        }
        if (entity.getHref() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getHref());
        }
        final String _tmp_1 = __converters.fromLocation(entity.getLocation());
        if (_tmp_1 == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, _tmp_1);
        }
        if (entity.getName() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getName());
        }
      }
    };
    this.__preparedStmtOfClearCache = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM company_cache";
        return _query;
      }
    };
  }

  @Override
  public Object insertCompanies(final List<BikeCompany> companies,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfBikeCompany.insert(companies);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object clearCache(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearCache.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfClearCache.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getAllCompanies(final Continuation<? super List<BikeCompany>> $completion) {
    final String _sql = "SELECT * FROM company_cache";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BikeCompany>>() {
      @Override
      @NonNull
      public List<BikeCompany> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCompany = CursorUtil.getColumnIndexOrThrow(_cursor, "company");
          final int _cursorIndexOfHref = CursorUtil.getColumnIndexOrThrow(_cursor, "href");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final List<BikeCompany> _result = new ArrayList<BikeCompany>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BikeCompany _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final List<String> _tmpCompany;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfCompany)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfCompany);
            }
            _tmpCompany = __converters.toCompanyList(_tmp);
            final String _tmpHref;
            if (_cursor.isNull(_cursorIndexOfHref)) {
              _tmpHref = null;
            } else {
              _tmpHref = _cursor.getString(_cursorIndexOfHref);
            }
            final Location _tmpLocation;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfLocation);
            }
            _tmpLocation = __converters.toLocation(_tmp_1);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _item = new BikeCompany(_tmpId,_tmpCompany,_tmpHref,_tmpLocation,_tmpName);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
