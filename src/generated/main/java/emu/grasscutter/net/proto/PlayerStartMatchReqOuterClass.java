// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerStartMatchReq.proto

package emu.grasscutter.net.proto;

public final class PlayerStartMatchReqOuterClass {
  private PlayerStartMatchReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerStartMatchReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerStartMatchReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 mechanicus_difficult_level = 8;</code>
     * @return The mechanicusDifficultLevel.
     */
    int getMechanicusDifficultLevel();

    /**
     * <code>uint32 match_id = 13;</code>
     * @return The matchId.
     */
    int getMatchId();

    /**
     * <code>repeated uint32 match_param_list = 6;</code>
     * @return A list containing the matchParamList.
     */
    java.util.List<java.lang.Integer> getMatchParamListList();
    /**
     * <code>repeated uint32 match_param_list = 6;</code>
     * @return The count of matchParamList.
     */
    int getMatchParamListCount();
    /**
     * <code>repeated uint32 match_param_list = 6;</code>
     * @param index The index of the element to return.
     * @return The matchParamList at the given index.
     */
    int getMatchParamList(int index);

    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    int getMatchTypeValue();
    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The matchType.
     */
    emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType getMatchType();

    /**
     * <code>uint32 dungeon_id = 2;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 mp_play_id = 10;</code>
     * @return The mpPlayId.
     */
    int getMpPlayId();
  }
  /**
   * <pre>
   * CmdId: 4178
   * Obf: GHKAOMILHPA
   * </pre>
   *
   * Protobuf type {@code PlayerStartMatchReq}
   */
  public static final class PlayerStartMatchReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerStartMatchReq)
      PlayerStartMatchReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerStartMatchReq.newBuilder() to construct.
    private PlayerStartMatchReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerStartMatchReq() {
      matchParamList_ = emptyIntList();
      matchType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerStartMatchReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerStartMatchReq(
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
            case 16: {

              dungeonId_ = input.readUInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              matchType_ = rawValue;
              break;
            }
            case 48: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                matchParamList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              matchParamList_.addInt(input.readUInt32());
              break;
            }
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                matchParamList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                matchParamList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 64: {

              mechanicusDifficultLevel_ = input.readUInt32();
              break;
            }
            case 80: {

              mpPlayId_ = input.readUInt32();
              break;
            }
            case 104: {

              matchId_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          matchParamList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.internal_static_PlayerStartMatchReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.internal_static_PlayerStartMatchReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq.class, emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq.Builder.class);
    }

    public static final int MECHANICUS_DIFFICULT_LEVEL_FIELD_NUMBER = 8;
    private int mechanicusDifficultLevel_;
    /**
     * <code>uint32 mechanicus_difficult_level = 8;</code>
     * @return The mechanicusDifficultLevel.
     */
    @java.lang.Override
    public int getMechanicusDifficultLevel() {
      return mechanicusDifficultLevel_;
    }

    public static final int MATCH_ID_FIELD_NUMBER = 13;
    private int matchId_;
    /**
     * <code>uint32 match_id = 13;</code>
     * @return The matchId.
     */
    @java.lang.Override
    public int getMatchId() {
      return matchId_;
    }

    public static final int MATCH_PARAM_LIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList matchParamList_;
    /**
     * <code>repeated uint32 match_param_list = 6;</code>
     * @return A list containing the matchParamList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMatchParamListList() {
      return matchParamList_;
    }
    /**
     * <code>repeated uint32 match_param_list = 6;</code>
     * @return The count of matchParamList.
     */
    public int getMatchParamListCount() {
      return matchParamList_.size();
    }
    /**
     * <code>repeated uint32 match_param_list = 6;</code>
     * @param index The index of the element to return.
     * @return The matchParamList at the given index.
     */
    public int getMatchParamList(int index) {
      return matchParamList_.getInt(index);
    }
    private int matchParamListMemoizedSerializedSize = -1;

    public static final int MATCH_TYPE_FIELD_NUMBER = 3;
    private int matchType_;
    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    @java.lang.Override public int getMatchTypeValue() {
      return matchType_;
    }
    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The matchType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType getMatchType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType result = emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.valueOf(matchType_);
      return result == null ? emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 2;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 2;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int MP_PLAY_ID_FIELD_NUMBER = 10;
    private int mpPlayId_;
    /**
     * <code>uint32 mp_play_id = 10;</code>
     * @return The mpPlayId.
     */
    @java.lang.Override
    public int getMpPlayId() {
      return mpPlayId_;
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
      getSerializedSize();
      if (dungeonId_ != 0) {
        output.writeUInt32(2, dungeonId_);
      }
      if (matchType_ != emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        output.writeEnum(3, matchType_);
      }
      if (getMatchParamListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(matchParamListMemoizedSerializedSize);
      }
      for (int i = 0; i < matchParamList_.size(); i++) {
        output.writeUInt32NoTag(matchParamList_.getInt(i));
      }
      if (mechanicusDifficultLevel_ != 0) {
        output.writeUInt32(8, mechanicusDifficultLevel_);
      }
      if (mpPlayId_ != 0) {
        output.writeUInt32(10, mpPlayId_);
      }
      if (matchId_ != 0) {
        output.writeUInt32(13, matchId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, dungeonId_);
      }
      if (matchType_ != emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, matchType_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < matchParamList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(matchParamList_.getInt(i));
        }
        size += dataSize;
        if (!getMatchParamListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        matchParamListMemoizedSerializedSize = dataSize;
      }
      if (mechanicusDifficultLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, mechanicusDifficultLevel_);
      }
      if (mpPlayId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, mpPlayId_);
      }
      if (matchId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, matchId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq other = (emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq) obj;

      if (getMechanicusDifficultLevel()
          != other.getMechanicusDifficultLevel()) return false;
      if (getMatchId()
          != other.getMatchId()) return false;
      if (!getMatchParamListList()
          .equals(other.getMatchParamListList())) return false;
      if (matchType_ != other.matchType_) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getMpPlayId()
          != other.getMpPlayId()) return false;
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
      hash = (37 * hash) + MECHANICUS_DIFFICULT_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getMechanicusDifficultLevel();
      hash = (37 * hash) + MATCH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMatchId();
      if (getMatchParamListCount() > 0) {
        hash = (37 * hash) + MATCH_PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMatchParamListList().hashCode();
      }
      hash = (37 * hash) + MATCH_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + matchType_;
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + MP_PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMpPlayId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq prototype) {
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
     * <pre>
     * CmdId: 4178
     * Obf: GHKAOMILHPA
     * </pre>
     *
     * Protobuf type {@code PlayerStartMatchReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerStartMatchReq)
        emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.internal_static_PlayerStartMatchReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.internal_static_PlayerStartMatchReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq.class, emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq.newBuilder()
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
        mechanicusDifficultLevel_ = 0;

        matchId_ = 0;

        matchParamList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        matchType_ = 0;

        dungeonId_ = 0;

        mpPlayId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.internal_static_PlayerStartMatchReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq build() {
        emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq buildPartial() {
        emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq result = new emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq(this);
        int from_bitField0_ = bitField0_;
        result.mechanicusDifficultLevel_ = mechanicusDifficultLevel_;
        result.matchId_ = matchId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          matchParamList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.matchParamList_ = matchParamList_;
        result.matchType_ = matchType_;
        result.dungeonId_ = dungeonId_;
        result.mpPlayId_ = mpPlayId_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq other) {
        if (other == emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq.getDefaultInstance()) return this;
        if (other.getMechanicusDifficultLevel() != 0) {
          setMechanicusDifficultLevel(other.getMechanicusDifficultLevel());
        }
        if (other.getMatchId() != 0) {
          setMatchId(other.getMatchId());
        }
        if (!other.matchParamList_.isEmpty()) {
          if (matchParamList_.isEmpty()) {
            matchParamList_ = other.matchParamList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMatchParamListIsMutable();
            matchParamList_.addAll(other.matchParamList_);
          }
          onChanged();
        }
        if (other.matchType_ != 0) {
          setMatchTypeValue(other.getMatchTypeValue());
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getMpPlayId() != 0) {
          setMpPlayId(other.getMpPlayId());
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
        emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int mechanicusDifficultLevel_ ;
      /**
       * <code>uint32 mechanicus_difficult_level = 8;</code>
       * @return The mechanicusDifficultLevel.
       */
      @java.lang.Override
      public int getMechanicusDifficultLevel() {
        return mechanicusDifficultLevel_;
      }
      /**
       * <code>uint32 mechanicus_difficult_level = 8;</code>
       * @param value The mechanicusDifficultLevel to set.
       * @return This builder for chaining.
       */
      public Builder setMechanicusDifficultLevel(int value) {
        
        mechanicusDifficultLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mechanicus_difficult_level = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMechanicusDifficultLevel() {
        
        mechanicusDifficultLevel_ = 0;
        onChanged();
        return this;
      }

      private int matchId_ ;
      /**
       * <code>uint32 match_id = 13;</code>
       * @return The matchId.
       */
      @java.lang.Override
      public int getMatchId() {
        return matchId_;
      }
      /**
       * <code>uint32 match_id = 13;</code>
       * @param value The matchId to set.
       * @return This builder for chaining.
       */
      public Builder setMatchId(int value) {
        
        matchId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 match_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchId() {
        
        matchId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList matchParamList_ = emptyIntList();
      private void ensureMatchParamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          matchParamList_ = mutableCopy(matchParamList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 match_param_list = 6;</code>
       * @return A list containing the matchParamList.
       */
      public java.util.List<java.lang.Integer>
          getMatchParamListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(matchParamList_) : matchParamList_;
      }
      /**
       * <code>repeated uint32 match_param_list = 6;</code>
       * @return The count of matchParamList.
       */
      public int getMatchParamListCount() {
        return matchParamList_.size();
      }
      /**
       * <code>repeated uint32 match_param_list = 6;</code>
       * @param index The index of the element to return.
       * @return The matchParamList at the given index.
       */
      public int getMatchParamList(int index) {
        return matchParamList_.getInt(index);
      }
      /**
       * <code>repeated uint32 match_param_list = 6;</code>
       * @param index The index to set the value at.
       * @param value The matchParamList to set.
       * @return This builder for chaining.
       */
      public Builder setMatchParamList(
          int index, int value) {
        ensureMatchParamListIsMutable();
        matchParamList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 match_param_list = 6;</code>
       * @param value The matchParamList to add.
       * @return This builder for chaining.
       */
      public Builder addMatchParamList(int value) {
        ensureMatchParamListIsMutable();
        matchParamList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 match_param_list = 6;</code>
       * @param values The matchParamList to add.
       * @return This builder for chaining.
       */
      public Builder addAllMatchParamList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMatchParamListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, matchParamList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 match_param_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchParamList() {
        matchParamList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int matchType_ = 0;
      /**
       * <code>.MatchType match_type = 3;</code>
       * @return The enum numeric value on the wire for matchType.
       */
      @java.lang.Override public int getMatchTypeValue() {
        return matchType_;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @param value The enum numeric value on the wire for matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchTypeValue(int value) {
        
        matchType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @return The matchType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType getMatchType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType result = emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.valueOf(matchType_);
        return result == null ? emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @param value The matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchType(emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        matchType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchType() {
        
        matchType_ = 0;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 2;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 2;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int mpPlayId_ ;
      /**
       * <code>uint32 mp_play_id = 10;</code>
       * @return The mpPlayId.
       */
      @java.lang.Override
      public int getMpPlayId() {
        return mpPlayId_;
      }
      /**
       * <code>uint32 mp_play_id = 10;</code>
       * @param value The mpPlayId to set.
       * @return This builder for chaining.
       */
      public Builder setMpPlayId(int value) {
        
        mpPlayId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mp_play_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMpPlayId() {
        
        mpPlayId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerStartMatchReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerStartMatchReq)
    private static final emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq();
    }

    public static emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerStartMatchReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerStartMatchReq>() {
      @java.lang.Override
      public PlayerStartMatchReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerStartMatchReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerStartMatchReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerStartMatchReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerStartMatchReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerStartMatchReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031PlayerStartMatchReq.proto\032\017MatchType.p" +
      "roto\"\255\001\n\023PlayerStartMatchReq\022\"\n\032mechanic" +
      "us_difficult_level\030\010 \001(\r\022\020\n\010match_id\030\r \001" +
      "(\r\022\030\n\020match_param_list\030\006 \003(\r\022\036\n\nmatch_ty" +
      "pe\030\003 \001(\0162\n.MatchType\022\022\n\ndungeon_id\030\002 \001(\r" +
      "\022\022\n\nmp_play_id\030\n \001(\rB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MatchTypeOuterClass.getDescriptor(),
        });
    internal_static_PlayerStartMatchReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerStartMatchReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerStartMatchReq_descriptor,
        new java.lang.String[] { "MechanicusDifficultLevel", "MatchId", "MatchParamList", "MatchType", "DungeonId", "MpPlayId", });
    emu.grasscutter.net.proto.MatchTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
