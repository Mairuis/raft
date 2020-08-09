package com.mairuis.raft.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.0)",
    comments = "Source: raft.proto")
public final class PeerGrpc {

  private PeerGrpc() {}

  public static final String SERVICE_NAME = "com.mairuis.raft.proto.Peer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mairuis.raft.proto.Raft.Vote,
      com.mairuis.raft.proto.Raft.Vote> getVoteToMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteTo",
      requestType = com.mairuis.raft.proto.Raft.Vote.class,
      responseType = com.mairuis.raft.proto.Raft.Vote.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mairuis.raft.proto.Raft.Vote,
      com.mairuis.raft.proto.Raft.Vote> getVoteToMethod() {
    io.grpc.MethodDescriptor<com.mairuis.raft.proto.Raft.Vote, com.mairuis.raft.proto.Raft.Vote> getVoteToMethod;
    if ((getVoteToMethod = PeerGrpc.getVoteToMethod) == null) {
      synchronized (PeerGrpc.class) {
        if ((getVoteToMethod = PeerGrpc.getVoteToMethod) == null) {
          PeerGrpc.getVoteToMethod = getVoteToMethod =
              io.grpc.MethodDescriptor.<com.mairuis.raft.proto.Raft.Vote, com.mairuis.raft.proto.Raft.Vote>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteTo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mairuis.raft.proto.Raft.Vote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mairuis.raft.proto.Raft.Vote.getDefaultInstance()))
              .setSchemaDescriptor(new PeerMethodDescriptorSupplier("VoteTo"))
              .build();
        }
      }
    }
    return getVoteToMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PeerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PeerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PeerStub>() {
        @java.lang.Override
        public PeerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PeerStub(channel, callOptions);
        }
      };
    return PeerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PeerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PeerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PeerBlockingStub>() {
        @java.lang.Override
        public PeerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PeerBlockingStub(channel, callOptions);
        }
      };
    return PeerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PeerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PeerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PeerFutureStub>() {
        @java.lang.Override
        public PeerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PeerFutureStub(channel, callOptions);
        }
      };
    return PeerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PeerImplBase implements io.grpc.BindableService {

    /**
     */
    public void voteTo(com.mairuis.raft.proto.Raft.Vote request,
        io.grpc.stub.StreamObserver<com.mairuis.raft.proto.Raft.Vote> responseObserver) {
      asyncUnimplementedUnaryCall(getVoteToMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getVoteToMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mairuis.raft.proto.Raft.Vote,
                com.mairuis.raft.proto.Raft.Vote>(
                  this, METHODID_VOTE_TO)))
          .build();
    }
  }

  /**
   */
  public static final class PeerStub extends io.grpc.stub.AbstractAsyncStub<PeerStub> {
    private PeerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PeerStub(channel, callOptions);
    }

    /**
     */
    public void voteTo(com.mairuis.raft.proto.Raft.Vote request,
        io.grpc.stub.StreamObserver<com.mairuis.raft.proto.Raft.Vote> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoteToMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PeerBlockingStub extends io.grpc.stub.AbstractBlockingStub<PeerBlockingStub> {
    private PeerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PeerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.mairuis.raft.proto.Raft.Vote voteTo(com.mairuis.raft.proto.Raft.Vote request) {
      return blockingUnaryCall(
          getChannel(), getVoteToMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PeerFutureStub extends io.grpc.stub.AbstractFutureStub<PeerFutureStub> {
    private PeerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PeerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mairuis.raft.proto.Raft.Vote> voteTo(
        com.mairuis.raft.proto.Raft.Vote request) {
      return futureUnaryCall(
          getChannel().newCall(getVoteToMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VOTE_TO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PeerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PeerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VOTE_TO:
          serviceImpl.voteTo((com.mairuis.raft.proto.Raft.Vote) request,
              (io.grpc.stub.StreamObserver<com.mairuis.raft.proto.Raft.Vote>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PeerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PeerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mairuis.raft.proto.Raft.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Peer");
    }
  }

  private static final class PeerFileDescriptorSupplier
      extends PeerBaseDescriptorSupplier {
    PeerFileDescriptorSupplier() {}
  }

  private static final class PeerMethodDescriptorSupplier
      extends PeerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PeerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PeerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PeerFileDescriptorSupplier())
              .addMethod(getVoteToMethod())
              .build();
        }
      }
    }
    return result;
  }
}
