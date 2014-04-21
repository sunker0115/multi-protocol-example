// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg.proto

package com.server.msg.protocol;

public final class Msg {
  private Msg() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registry.add(com.server.msg.protocol.Msg.msgId);
  }
  public interface MessageOrBuilder extends
      com.google.protobuf.GeneratedMessage.
          ExtendableMessageOrBuilder<Message> {

    // optional string msgId = 1;
    /**
     * <code>optional string msgId = 1;</code>
     */
    boolean hasMsgId();
    /**
     * <code>optional string msgId = 1;</code>
     */
    java.lang.String getMsgId();
    /**
     * <code>optional string msgId = 1;</code>
     */
    com.google.protobuf.ByteString
        getMsgIdBytes();
  }
  /**
   * Protobuf type {@code com.server.msg.protocol.Message}
   */
  public static final class Message extends
      com.google.protobuf.GeneratedMessage.ExtendableMessage<
        Message> implements MessageOrBuilder {
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.server.msg.protocol.Msg.Message, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Message(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Message defaultInstance;
    public static Message getDefaultInstance() {
      return defaultInstance;
    }

    public Message getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Message(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              msgId_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.server.msg.protocol.Msg.internal_static_com_server_msg_protocol_Message_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.server.msg.protocol.Msg.internal_static_com_server_msg_protocol_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.server.msg.protocol.Msg.Message.class, com.server.msg.protocol.Msg.Message.Builder.class);
    }

    public static com.google.protobuf.Parser<Message> PARSER =
        new com.google.protobuf.AbstractParser<Message>() {
      public Message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Message(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string msgId = 1;
    public static final int MSGID_FIELD_NUMBER = 1;
    private java.lang.Object msgId_;
    /**
     * <code>optional string msgId = 1;</code>
     */
    public boolean hasMsgId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string msgId = 1;</code>
     */
    public java.lang.String getMsgId() {
      java.lang.Object ref = msgId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          msgId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string msgId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMsgIdBytes() {
      java.lang.Object ref = msgId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      msgId_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage
        .ExtendableMessage<com.server.msg.protocol.Msg.Message>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getMsgIdBytes());
      }
      extensionWriter.writeUntil(10001, output);
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getMsgIdBytes());
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.server.msg.protocol.Msg.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.server.msg.protocol.Msg.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.server.msg.protocol.Msg.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.server.msg.protocol.Msg.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.server.msg.protocol.Msg.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.server.msg.protocol.Msg.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.server.msg.protocol.Msg.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.server.msg.protocol.Msg.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.server.msg.protocol.Msg.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.server.msg.protocol.Msg.Message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.server.msg.protocol.Msg.Message prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.server.msg.protocol.Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<
          com.server.msg.protocol.Msg.Message, Builder> implements com.server.msg.protocol.Msg.MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.server.msg.protocol.Msg.internal_static_com_server_msg_protocol_Message_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.server.msg.protocol.Msg.internal_static_com_server_msg_protocol_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.server.msg.protocol.Msg.Message.class, com.server.msg.protocol.Msg.Message.Builder.class);
      }

      // Construct using com.server.msg.protocol.Msg.Message.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        msgId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.server.msg.protocol.Msg.internal_static_com_server_msg_protocol_Message_descriptor;
      }

      public com.server.msg.protocol.Msg.Message getDefaultInstanceForType() {
        return com.server.msg.protocol.Msg.Message.getDefaultInstance();
      }

      public com.server.msg.protocol.Msg.Message build() {
        com.server.msg.protocol.Msg.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.server.msg.protocol.Msg.Message buildPartial() {
        com.server.msg.protocol.Msg.Message result = new com.server.msg.protocol.Msg.Message(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.msgId_ = msgId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.server.msg.protocol.Msg.Message) {
          return mergeFrom((com.server.msg.protocol.Msg.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.server.msg.protocol.Msg.Message other) {
        if (other == com.server.msg.protocol.Msg.Message.getDefaultInstance()) return this;
        if (other.hasMsgId()) {
          bitField0_ |= 0x00000001;
          msgId_ = other.msgId_;
          onChanged();
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!extensionsAreInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.server.msg.protocol.Msg.Message parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.server.msg.protocol.Msg.Message) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string msgId = 1;
      private java.lang.Object msgId_ = "";
      /**
       * <code>optional string msgId = 1;</code>
       */
      public boolean hasMsgId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string msgId = 1;</code>
       */
      public java.lang.String getMsgId() {
        java.lang.Object ref = msgId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          msgId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string msgId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMsgIdBytes() {
        java.lang.Object ref = msgId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msgId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string msgId = 1;</code>
       */
      public Builder setMsgId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        msgId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string msgId = 1;</code>
       */
      public Builder clearMsgId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        msgId_ = getDefaultInstance().getMsgId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string msgId = 1;</code>
       */
      public Builder setMsgIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        msgId_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.server.msg.protocol.Message)
    }

    static {
      defaultInstance = new Message(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.server.msg.protocol.Message)
  }

  public interface PosOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 col = 2;
    /**
     * <code>optional int32 col = 2;</code>
     */
    boolean hasCol();
    /**
     * <code>optional int32 col = 2;</code>
     */
    int getCol();

    // optional int32 row = 3;
    /**
     * <code>optional int32 row = 3;</code>
     */
    boolean hasRow();
    /**
     * <code>optional int32 row = 3;</code>
     */
    int getRow();
  }
  /**
   * Protobuf type {@code com.server.msg.protocol.Pos}
   */
  public static final class Pos extends
      com.google.protobuf.GeneratedMessage
      implements PosOrBuilder {
    // Use Pos.newBuilder() to construct.
    private Pos(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Pos(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Pos defaultInstance;
    public static Pos getDefaultInstance() {
      return defaultInstance;
    }

    public Pos getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Pos(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000001;
              col_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000002;
              row_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.server.msg.protocol.Msg.internal_static_com_server_msg_protocol_Pos_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.server.msg.protocol.Msg.internal_static_com_server_msg_protocol_Pos_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.server.msg.protocol.Msg.Pos.class, com.server.msg.protocol.Msg.Pos.Builder.class);
    }

    public static com.google.protobuf.Parser<Pos> PARSER =
        new com.google.protobuf.AbstractParser<Pos>() {
      public Pos parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Pos(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Pos> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 col = 2;
    public static final int COL_FIELD_NUMBER = 2;
    private int col_;
    /**
     * <code>optional int32 col = 2;</code>
     */
    public boolean hasCol() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 col = 2;</code>
     */
    public int getCol() {
      return col_;
    }

    // optional int32 row = 3;
    public static final int ROW_FIELD_NUMBER = 3;
    private int row_;
    /**
     * <code>optional int32 row = 3;</code>
     */
    public boolean hasRow() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 row = 3;</code>
     */
    public int getRow() {
      return row_;
    }

    private void initFields() {
      col_ = 0;
      row_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(2, col_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(3, row_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, col_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, row_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.server.msg.protocol.Msg.Pos parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.server.msg.protocol.Msg.Pos parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.server.msg.protocol.Msg.Pos parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.server.msg.protocol.Msg.Pos parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.server.msg.protocol.Msg.Pos parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.server.msg.protocol.Msg.Pos parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.server.msg.protocol.Msg.Pos parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.server.msg.protocol.Msg.Pos parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.server.msg.protocol.Msg.Pos parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.server.msg.protocol.Msg.Pos parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.server.msg.protocol.Msg.Pos prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.server.msg.protocol.Pos}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.server.msg.protocol.Msg.PosOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.server.msg.protocol.Msg.internal_static_com_server_msg_protocol_Pos_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.server.msg.protocol.Msg.internal_static_com_server_msg_protocol_Pos_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.server.msg.protocol.Msg.Pos.class, com.server.msg.protocol.Msg.Pos.Builder.class);
      }

      // Construct using com.server.msg.protocol.Msg.Pos.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        col_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        row_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.server.msg.protocol.Msg.internal_static_com_server_msg_protocol_Pos_descriptor;
      }

      public com.server.msg.protocol.Msg.Pos getDefaultInstanceForType() {
        return com.server.msg.protocol.Msg.Pos.getDefaultInstance();
      }

      public com.server.msg.protocol.Msg.Pos build() {
        com.server.msg.protocol.Msg.Pos result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.server.msg.protocol.Msg.Pos buildPartial() {
        com.server.msg.protocol.Msg.Pos result = new com.server.msg.protocol.Msg.Pos(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.col_ = col_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.row_ = row_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.server.msg.protocol.Msg.Pos) {
          return mergeFrom((com.server.msg.protocol.Msg.Pos)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.server.msg.protocol.Msg.Pos other) {
        if (other == com.server.msg.protocol.Msg.Pos.getDefaultInstance()) return this;
        if (other.hasCol()) {
          setCol(other.getCol());
        }
        if (other.hasRow()) {
          setRow(other.getRow());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.server.msg.protocol.Msg.Pos parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.server.msg.protocol.Msg.Pos) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 col = 2;
      private int col_ ;
      /**
       * <code>optional int32 col = 2;</code>
       */
      public boolean hasCol() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 col = 2;</code>
       */
      public int getCol() {
        return col_;
      }
      /**
       * <code>optional int32 col = 2;</code>
       */
      public Builder setCol(int value) {
        bitField0_ |= 0x00000001;
        col_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 col = 2;</code>
       */
      public Builder clearCol() {
        bitField0_ = (bitField0_ & ~0x00000001);
        col_ = 0;
        onChanged();
        return this;
      }

      // optional int32 row = 3;
      private int row_ ;
      /**
       * <code>optional int32 row = 3;</code>
       */
      public boolean hasRow() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 row = 3;</code>
       */
      public int getRow() {
        return row_;
      }
      /**
       * <code>optional int32 row = 3;</code>
       */
      public Builder setRow(int value) {
        bitField0_ |= 0x00000002;
        row_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 row = 3;</code>
       */
      public Builder clearRow() {
        bitField0_ = (bitField0_ & ~0x00000002);
        row_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.server.msg.protocol.Pos)
    }

    static {
      defaultInstance = new Pos(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.server.msg.protocol.Pos)
  }

  public static final int MSGID_FIELD_NUMBER = 51234;
  /**
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.lang.Integer> msgId = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Integer.class,
        null);
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_server_msg_protocol_Message_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_server_msg_protocol_Message_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_server_msg_protocol_Pos_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_server_msg_protocol_Pos_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tmsg.proto\022\027com.server.msg.protocol\032 go" +
      "ogle/protobuf/descriptor.proto\"\037\n\007Messag" +
      "e\022\r\n\005msgId\030\001 \001(\t*\005\010d\020\221N\"\037\n\003Pos\022\013\n\003col\030\002 " +
      "\001(\005\022\013\n\003row\030\003 \001(\005:0\n\005msgId\022\037.google.proto" +
      "buf.MessageOptions\030\242\220\003 \001(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_server_msg_protocol_Message_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_server_msg_protocol_Message_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_server_msg_protocol_Message_descriptor,
              new java.lang.String[] { "MsgId", });
          internal_static_com_server_msg_protocol_Pos_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_com_server_msg_protocol_Pos_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_server_msg_protocol_Pos_descriptor,
              new java.lang.String[] { "Col", "Row", });
          msgId.internalInit(descriptor.getExtensions().get(0));
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}