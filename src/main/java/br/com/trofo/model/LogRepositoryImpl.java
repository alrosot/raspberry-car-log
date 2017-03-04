package br.com.trofo.model;

import org.mapdb.BTreeMap;
import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.Serializer;
import org.springframework.stereotype.Repository;

/**
 * Created by arosot on 04/03/2017.
 */
@Repository
public class LogRepositoryImpl implements LogRepository {


    private final DB db;

    public LogRepositoryImpl() {
        db = DBMaker.fileDB("raspberry-car-log.db")
                .transactionEnable()
                .make();
    }

    @Override
    public void save(Log log) {
        final BTreeMap logItems = db.treeMap("logItems", Serializer.LONG, Serializer.JAVA)
                .createOrOpen();
        logItems.put(System.currentTimeMillis(), new Log());
        System.out.println(logItems.size());
        db.close();
    }
}
