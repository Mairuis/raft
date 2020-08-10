package com.mairuis.raft;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.mairuis.raft.proto.Raft;
import com.mairuis.raft.proto.RaftServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import lombok.AccessLevel;
import lombok.Getter;

import java.util.concurrent.TimeUnit;

/**
 * @author Mairuis
 * @since 2020/8/4
 */
public final class PeerServer implements RaftServer {

    @Getter(AccessLevel.PRIVATE)
    private final PeerService peerService;

    @Getter(AccessLevel.PRIVATE)
    private final Server server;

    public PeerServer(int port) {
        this.peerService = new PeerService();
        this.server = ServerBuilder.forPort(port).addService(this.getPeerService()).build();
    }

    @Override
    public void start() throws Exception {
        this.getServer().start();
    }

    @Override
    public void shutdown() throws Exception {
        boolean isShutdown = this.getServer().shutdown().awaitTermination(1, TimeUnit.MINUTES);
        if (!isShutdown) {
            throw new RuntimeException("can not shut down the server, the server still running");
        }
    }

    private final class PeerService extends RaftServiceGrpc.RaftServiceImplBase {

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
}
