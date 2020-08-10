package com.mairuis.raft;

/**
 * @author Mairuis
 * @since 2020/8/10
 */
public interface RaftServer {

    void start() throws Exception;

    void shutdown() throws Exception;

}
