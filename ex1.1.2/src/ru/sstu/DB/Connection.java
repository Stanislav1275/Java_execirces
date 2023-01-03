package ru.sstu.DB;

import java.net.ConnectException;

public class Connection {
    private boolean isOpen;
    public DB db;

    private Connection(DB db, boolean isOpen) {
        this.db = db;
        this.isOpen = isOpen;
    }
    public static Connection createConnection(DB db, boolean isOpen) {
        return new Connection(db, isOpen);
    }
    public static Connection createConnection(DB db) {
        return createConnection(db,false);
    }

}
