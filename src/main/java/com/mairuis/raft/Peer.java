package com.mairuis.raft;

import com.mairuis.raft.proto.PeerGrpc;
import com.mairuis.raft.proto.Raft;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

/**
 * @author Mairuis
 * @since 2020/8/4
 */
public class Peer extends PeerGrpc.PeerImplBase {
    @Override
    public void voteTo(Raft.Vote request, StreamObserver<Raft.Vote> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("").build();
        PeerGrpc.PeerBlockingStub blockingStub = PeerGrpc.newBlockingStub(channel);
        PeerGrpc.PeerStub asyncStub = PeerGrpc.newStub(channel);
    }
}
