package com.mairuis.kvserver;

/**
 * @author Mairuis
 * @since 2020/8/4
 */
public interface KVDatabase {

    byte[] get(String key);

    boolean put(String key, byte[] value);
}
