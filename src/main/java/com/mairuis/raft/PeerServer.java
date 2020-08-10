package com.mairuis.raft;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.mairuis.raft.proto.Raft;
import com.mairuis.raft.proto.RaftServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * @author Mairuis
 * @since 2020/8/4
 */
public final class PeerServer extends RaftServiceGrpc.RaftServiceImplBase {

    @Override
    public void vote(Raft.Vote request, StreamObserver<Raft.VoteReply> responseObserver) {
        try {
            System.out.println(JsonFormat.printer().print(request));
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        responseObserver.onNext(Raft.VoteReply.newBuilder().build());
        responseObserver.onCompleted();
    }
}
