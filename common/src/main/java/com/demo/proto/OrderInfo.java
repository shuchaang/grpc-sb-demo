// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: demo.proto

package com.demo.proto;

/**
 * Protobuf type {@code com.demo.proto.OrderInfo}
 */
public  final class OrderInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.demo.proto.OrderInfo)
    OrderInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderInfo.newBuilder() to construct.
  private OrderInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderInfo() {
    remark_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            orderId_ = input.readInt32();
            break;
          }
          case 16: {

            productId_ = input.readInt32();
            break;
          }
          case 24: {

            orderTime_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            remark_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.demo.proto.HelloWorldProto.internal_static_com_demo_proto_OrderInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.demo.proto.HelloWorldProto.internal_static_com_demo_proto_OrderInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.demo.proto.OrderInfo.class, com.demo.proto.OrderInfo.Builder.class);
  }

  public static final int ORDERID_FIELD_NUMBER = 1;
  private int orderId_;
  /**
   * <code>int32 orderId = 1;</code>
   */
  public int getOrderId() {
    return orderId_;
  }

  public static final int PRODUCTID_FIELD_NUMBER = 2;
  private int productId_;
  /**
   * <code>int32 productId = 2;</code>
   */
  public int getProductId() {
    return productId_;
  }

  public static final int ORDERTIME_FIELD_NUMBER = 3;
  private long orderTime_;
  /**
   * <code>int64 orderTime = 3;</code>
   */
  public long getOrderTime() {
    return orderTime_;
  }

  public static final int REMARK_FIELD_NUMBER = 4;
  private volatile java.lang.Object remark_;
  /**
   * <code>string remark = 4;</code>
   */
  public java.lang.String getRemark() {
    java.lang.Object ref = remark_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      remark_ = s;
      return s;
    }
  }
  /**
   * <code>string remark = 4;</code>
   */
  public com.google.protobuf.ByteString
      getRemarkBytes() {
    java.lang.Object ref = remark_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      remark_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (orderId_ != 0) {
      output.writeInt32(1, orderId_);
    }
    if (productId_ != 0) {
      output.writeInt32(2, productId_);
    }
    if (orderTime_ != 0L) {
      output.writeInt64(3, orderTime_);
    }
    if (!getRemarkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, remark_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (orderId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, orderId_);
    }
    if (productId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, productId_);
    }
    if (orderTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, orderTime_);
    }
    if (!getRemarkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, remark_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.demo.proto.OrderInfo)) {
      return super.equals(obj);
    }
    com.demo.proto.OrderInfo other = (com.demo.proto.OrderInfo) obj;

    if (getOrderId()
        != other.getOrderId()) return false;
    if (getProductId()
        != other.getProductId()) return false;
    if (getOrderTime()
        != other.getOrderTime()) return false;
    if (!getRemark()
        .equals(other.getRemark())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ORDERID_FIELD_NUMBER;
    hash = (53 * hash) + getOrderId();
    hash = (37 * hash) + PRODUCTID_FIELD_NUMBER;
    hash = (53 * hash) + getProductId();
    hash = (37 * hash) + ORDERTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOrderTime());
    hash = (37 * hash) + REMARK_FIELD_NUMBER;
    hash = (53 * hash) + getRemark().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.demo.proto.OrderInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.demo.proto.OrderInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.demo.proto.OrderInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.demo.proto.OrderInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.demo.proto.OrderInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.demo.proto.OrderInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.demo.proto.OrderInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.demo.proto.OrderInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.demo.proto.OrderInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.demo.proto.OrderInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.demo.proto.OrderInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.demo.proto.OrderInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.demo.proto.OrderInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.demo.proto.OrderInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.demo.proto.OrderInfo)
      com.demo.proto.OrderInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.demo.proto.HelloWorldProto.internal_static_com_demo_proto_OrderInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.demo.proto.HelloWorldProto.internal_static_com_demo_proto_OrderInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.demo.proto.OrderInfo.class, com.demo.proto.OrderInfo.Builder.class);
    }

    // Construct using com.demo.proto.OrderInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      orderId_ = 0;

      productId_ = 0;

      orderTime_ = 0L;

      remark_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.demo.proto.HelloWorldProto.internal_static_com_demo_proto_OrderInfo_descriptor;
    }

    @java.lang.Override
    public com.demo.proto.OrderInfo getDefaultInstanceForType() {
      return getDefaultInstance();
    }

    @java.lang.Override
    public com.demo.proto.OrderInfo build() {
      com.demo.proto.OrderInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.demo.proto.OrderInfo buildPartial() {
      com.demo.proto.OrderInfo result = new com.demo.proto.OrderInfo(this);
      result.orderId_ = orderId_;
      result.productId_ = productId_;
      result.orderTime_ = orderTime_;
      result.remark_ = remark_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.demo.proto.OrderInfo) {
        return mergeFrom((com.demo.proto.OrderInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.demo.proto.OrderInfo other) {
      if (other == getDefaultInstance()) return this;
      if (other.getOrderId() != 0) {
        setOrderId(other.getOrderId());
      }
      if (other.getProductId() != 0) {
        setProductId(other.getProductId());
      }
      if (other.getOrderTime() != 0L) {
        setOrderTime(other.getOrderTime());
      }
      if (!other.getRemark().isEmpty()) {
        remark_ = other.remark_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.demo.proto.OrderInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.demo.proto.OrderInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int orderId_ ;
    /**
     * <code>int32 orderId = 1;</code>
     */
    public int getOrderId() {
      return orderId_;
    }
    /**
     * <code>int32 orderId = 1;</code>
     */
    public Builder setOrderId(int value) {
      
      orderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 orderId = 1;</code>
     */
    public Builder clearOrderId() {
      
      orderId_ = 0;
      onChanged();
      return this;
    }

    private int productId_ ;
    /**
     * <code>int32 productId = 2;</code>
     */
    public int getProductId() {
      return productId_;
    }
    /**
     * <code>int32 productId = 2;</code>
     */
    public Builder setProductId(int value) {
      
      productId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 productId = 2;</code>
     */
    public Builder clearProductId() {
      
      productId_ = 0;
      onChanged();
      return this;
    }

    private long orderTime_ ;
    /**
     * <code>int64 orderTime = 3;</code>
     */
    public long getOrderTime() {
      return orderTime_;
    }
    /**
     * <code>int64 orderTime = 3;</code>
     */
    public Builder setOrderTime(long value) {
      
      orderTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 orderTime = 3;</code>
     */
    public Builder clearOrderTime() {
      
      orderTime_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object remark_ = "";
    /**
     * <code>string remark = 4;</code>
     */
    public java.lang.String getRemark() {
      java.lang.Object ref = remark_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        remark_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string remark = 4;</code>
     */
    public com.google.protobuf.ByteString
        getRemarkBytes() {
      java.lang.Object ref = remark_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        remark_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string remark = 4;</code>
     */
    public Builder setRemark(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      remark_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string remark = 4;</code>
     */
    public Builder clearRemark() {
      
      remark_ = getDefaultInstance().getRemark();
      onChanged();
      return this;
    }
    /**
     * <code>string remark = 4;</code>
     */
    public Builder setRemarkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      remark_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.demo.proto.OrderInfo)
  }

  // @@protoc_insertion_point(class_scope:com.demo.proto.OrderInfo)
  private static final com.demo.proto.OrderInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.demo.proto.OrderInfo();
  }

  public static com.demo.proto.OrderInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderInfo>
      PARSER = new com.google.protobuf.AbstractParser<OrderInfo>() {
    @java.lang.Override
    public OrderInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.demo.proto.OrderInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

