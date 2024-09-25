package com.yoma.currencyexchangerate.localdb;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CurrencyDatabase_Impl extends CurrencyDatabase {
  private volatile CurrencyDao _currencyDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `CurrencyTable` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `currency_name` TEXT NOT NULL, `created_time` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `ExchangeRateTable` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `currency_name` TEXT NOT NULL, `exchange_rate` TEXT NOT NULL, `created_time` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2d50e95f6e3edad44c14ce7e2f54e74b')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `CurrencyTable`");
        db.execSQL("DROP TABLE IF EXISTS `ExchangeRateTable`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsCurrencyTable = new HashMap<String, TableInfo.Column>(3);
        _columnsCurrencyTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrencyTable.put("currency_name", new TableInfo.Column("currency_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrencyTable.put("created_time", new TableInfo.Column("created_time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCurrencyTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCurrencyTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCurrencyTable = new TableInfo("CurrencyTable", _columnsCurrencyTable, _foreignKeysCurrencyTable, _indicesCurrencyTable);
        final TableInfo _existingCurrencyTable = TableInfo.read(db, "CurrencyTable");
        if (!_infoCurrencyTable.equals(_existingCurrencyTable)) {
          return new RoomOpenHelper.ValidationResult(false, "CurrencyTable(com.yoma.currencyexchangerate.localdb.CurrencyTable).\n"
                  + " Expected:\n" + _infoCurrencyTable + "\n"
                  + " Found:\n" + _existingCurrencyTable);
        }
        final HashMap<String, TableInfo.Column> _columnsExchangeRateTable = new HashMap<String, TableInfo.Column>(4);
        _columnsExchangeRateTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchangeRateTable.put("currency_name", new TableInfo.Column("currency_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchangeRateTable.put("exchange_rate", new TableInfo.Column("exchange_rate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExchangeRateTable.put("created_time", new TableInfo.Column("created_time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExchangeRateTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesExchangeRateTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoExchangeRateTable = new TableInfo("ExchangeRateTable", _columnsExchangeRateTable, _foreignKeysExchangeRateTable, _indicesExchangeRateTable);
        final TableInfo _existingExchangeRateTable = TableInfo.read(db, "ExchangeRateTable");
        if (!_infoExchangeRateTable.equals(_existingExchangeRateTable)) {
          return new RoomOpenHelper.ValidationResult(false, "ExchangeRateTable(com.yoma.currencyexchangerate.localdb.ExchangeRateTable).\n"
                  + " Expected:\n" + _infoExchangeRateTable + "\n"
                  + " Found:\n" + _existingExchangeRateTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2d50e95f6e3edad44c14ce7e2f54e74b", "dbaec3f1d2c11db58eaba839288dec96");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "CurrencyTable","ExchangeRateTable");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `CurrencyTable`");
      _db.execSQL("DELETE FROM `ExchangeRateTable`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CurrencyDao.class, CurrencyDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public CurrencyDao getCurrencyDAO() {
    if (_currencyDao != null) {
      return _currencyDao;
    } else {
      synchronized(this) {
        if(_currencyDao == null) {
          _currencyDao = new CurrencyDao_Impl(this);
        }
        return _currencyDao;
      }
    }
  }
}
