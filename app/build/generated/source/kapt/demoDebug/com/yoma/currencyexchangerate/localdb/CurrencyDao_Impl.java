package com.yoma.currencyexchangerate.localdb;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CurrencyDao_Impl implements CurrencyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CurrencyTable> __insertionAdapterOfCurrencyTable;

  private final EntityInsertionAdapter<ExchangeRateTable> __insertionAdapterOfExchangeRateTable;

  private final EntityDeletionOrUpdateAdapter<CurrencyTable> __updateAdapterOfCurrencyTable;

  private final EntityDeletionOrUpdateAdapter<ExchangeRateTable> __updateAdapterOfExchangeRateTable;

  public CurrencyDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCurrencyTable = new EntityInsertionAdapter<CurrencyTable>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `CurrencyTable` (`id`,`currency_name`,`created_time`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CurrencyTable entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getCurrency_name() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getCurrency_name());
        }
        statement.bindLong(3, entity.getCreated_time());
      }
    };
    this.__insertionAdapterOfExchangeRateTable = new EntityInsertionAdapter<ExchangeRateTable>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `ExchangeRateTable` (`id`,`currency_name`,`exchange_rate`,`created_time`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ExchangeRateTable entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getCurrency_name() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getCurrency_name());
        }
        if (entity.getExchange_rate() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getExchange_rate());
        }
        statement.bindLong(4, entity.getCreated_time());
      }
    };
    this.__updateAdapterOfCurrencyTable = new EntityDeletionOrUpdateAdapter<CurrencyTable>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `CurrencyTable` SET `id` = ?,`currency_name` = ?,`created_time` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CurrencyTable entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getCurrency_name() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getCurrency_name());
        }
        statement.bindLong(3, entity.getCreated_time());
        statement.bindLong(4, entity.getId());
      }
    };
    this.__updateAdapterOfExchangeRateTable = new EntityDeletionOrUpdateAdapter<ExchangeRateTable>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `ExchangeRateTable` SET `id` = ?,`currency_name` = ?,`exchange_rate` = ?,`created_time` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ExchangeRateTable entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getCurrency_name() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getCurrency_name());
        }
        if (entity.getExchange_rate() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getExchange_rate());
        }
        statement.bindLong(4, entity.getCreated_time());
        statement.bindLong(5, entity.getId());
      }
    };
  }

  @Override
  public void insertCurrency(final CurrencyTable video) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCurrencyTable.insert(video);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertCurrencyExchangeRate(final ExchangeRateTable video) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfExchangeRateTable.insert(video);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateCurrency(final CurrencyTable video) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCurrencyTable.handle(video);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateCurrencyExchangeRate(final ExchangeRateTable video) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfExchangeRateTable.handle(video);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public CurrencyTable getCurrencyTable() {
    final String _sql = "SELECT * FROM CurrencyTable LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCurrencyName = CursorUtil.getColumnIndexOrThrow(_cursor, "currency_name");
      final int _cursorIndexOfCreatedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "created_time");
      final CurrencyTable _result;
      if (_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpCurrency_name;
        if (_cursor.isNull(_cursorIndexOfCurrencyName)) {
          _tmpCurrency_name = null;
        } else {
          _tmpCurrency_name = _cursor.getString(_cursorIndexOfCurrencyName);
        }
        final long _tmpCreated_time;
        _tmpCreated_time = _cursor.getLong(_cursorIndexOfCreatedTime);
        _result = new CurrencyTable(_tmpId,_tmpCurrency_name,_tmpCreated_time);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public ExchangeRateTable getExchangeRate(final String code) {
    final String _sql = "SELECT * FROM ExchangeRateTable WHERE currency_name = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (code == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, code);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCurrencyName = CursorUtil.getColumnIndexOrThrow(_cursor, "currency_name");
      final int _cursorIndexOfExchangeRate = CursorUtil.getColumnIndexOrThrow(_cursor, "exchange_rate");
      final int _cursorIndexOfCreatedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "created_time");
      final ExchangeRateTable _result;
      if (_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpCurrency_name;
        if (_cursor.isNull(_cursorIndexOfCurrencyName)) {
          _tmpCurrency_name = null;
        } else {
          _tmpCurrency_name = _cursor.getString(_cursorIndexOfCurrencyName);
        }
        final String _tmpExchange_rate;
        if (_cursor.isNull(_cursorIndexOfExchangeRate)) {
          _tmpExchange_rate = null;
        } else {
          _tmpExchange_rate = _cursor.getString(_cursorIndexOfExchangeRate);
        }
        final long _tmpCreated_time;
        _tmpCreated_time = _cursor.getLong(_cursorIndexOfCreatedTime);
        _result = new ExchangeRateTable(_tmpId,_tmpCurrency_name,_tmpExchange_rate,_tmpCreated_time);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
