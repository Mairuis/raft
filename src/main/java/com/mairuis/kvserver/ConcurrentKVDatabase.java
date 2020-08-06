package com.mairuis.kvserver;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author Mairuis
 * @since 2020/8/4
 */
public class ConcurrentKVDatabase implements KVDatabase {

    private final ConcurrentMap<String, byte[]> mainTable = new ConcurrentHashMap<>();

    @Override
    public byte[] get(String key) {
        return mainTable.get(key);
    }

    @Override
    public boolean put(String key, byte[] value) {
        return mainTable.put(key, value) == null;
    }
}
