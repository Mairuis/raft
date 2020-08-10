package com.mairuis.raft;

import com.mairuis.raft.proto.RaftServiceGrpc;
import io.grpc.Channel;

/**
 * @author Mairuis
 * @since 2020/8/10
 */
public final class PeerClient {
    private final RaftServiceGrpc.RaftServiceStub stub;

    public PeerClient(Channel channel) {
        this.stub = RaftServiceGrpc.newStub(channel);
    }

}
