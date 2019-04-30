package ingsw.pdd.conjuntos.BD;

import java.sql.Connection;

public interface IDBAdapter {
    public Connection getConnection();
}