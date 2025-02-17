// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGTavernNpcInfo.proto

package emu.grasscutter.net.proto;

public final class GCGTavernNpcInfoOuterClass {
  private GCGTavernNpcInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGTavernNpcInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGTavernNpcInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scene_point_id = 7;</code>
     * @return The scenePointId.
     */
    int getScenePointId();

    /**
     * <code>uint32 id = 5;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>uint32 level_id = 1;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * Obf: GPIDFBHLGOB
   * </pre>
   *
   * Protobuf type {@code GCGTavernNpcInfo}
   */
  public static final class GCGTavernNpcInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGTavernNpcInfo)
      GCGTavernNpcInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGTavernNpcInfo.newBuilder() to construct.
    private GCGTavernNpcInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGTavernNpcInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGTavernNpcInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGTavernNpcInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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

              levelId_ = input.readUInt32();
              break;
            }
            case 40: {

              id_ = input.readUInt32();
              break;
            }
            case 56: {

              scenePointId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.internal_static_GCGTavernNpcInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.internal_static_GCGTavernNpcInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo.class, emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo.Builder.class);
    }

    public static final int SCENE_POINT_ID_FIELD_NUMBER = 7;
    private int scenePointId_;
    /**
     * <code>uint32 scene_point_id = 7;</code>
     * @return The scenePointId.
     */
    @java.lang.Override
    public int getScenePointId() {
      return scenePointId_;
    }

    public static final int ID_FIELD_NUMBER = 5;
    private int id_;
    /**
     * <code>uint32 id = 5;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 1;
    private int levelId_;
    /**
     * <code>uint32 level_id = 1;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      if (levelId_ != 0) {
        output.writeUInt32(1, levelId_);
      }
      if (id_ != 0) {
        output.writeUInt32(5, id_);
      }
      if (scenePointId_ != 0) {
        output.writeUInt32(7, scenePointId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, levelId_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, id_);
      }
      if (scenePointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, scenePointId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo other = (emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo) obj;

      if (getScenePointId()
          != other.getScenePointId()) return false;
      if (getId()
          != other.getId()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + SCENE_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScenePointId();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo prototype) {
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
     * Obf: GPIDFBHLGOB
     * </pre>
     *
     * Protobuf type {@code GCGTavernNpcInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGTavernNpcInfo)
        emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.internal_static_GCGTavernNpcInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.internal_static_GCGTavernNpcInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo.class, emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo.newBuilder()
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
        scenePointId_ = 0;

        id_ = 0;

        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.internal_static_GCGTavernNpcInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo build() {
        emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo buildPartial() {
        emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo result = new emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo(this);
        result.scenePointId_ = scenePointId_;
        result.id_ = id_;
        result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo) {
          return mergeFrom((emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo other) {
        if (other == emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo.getDefaultInstance()) return this;
        if (other.getScenePointId() != 0) {
          setScenePointId(other.getScenePointId());
        }
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
        emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int scenePointId_ ;
      /**
       * <code>uint32 scene_point_id = 7;</code>
       * @return The scenePointId.
       */
      @java.lang.Override
      public int getScenePointId() {
        return scenePointId_;
      }
      /**
       * <code>uint32 scene_point_id = 7;</code>
       * @param value The scenePointId to set.
       * @return This builder for chaining.
       */
      public Builder setScenePointId(int value) {
        
        scenePointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_point_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearScenePointId() {
        
        scenePointId_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 5;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 5;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 1;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 1;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGTavernNpcInfo)
    }

    // @@protoc_insertion_point(class_scope:GCGTavernNpcInfo)
    private static final emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo();
    }

    public static emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGTavernNpcInfo>
        PARSER = new com.google.protobuf.AbstractParser<GCGTavernNpcInfo>() {
      @java.lang.Override
      public GCGTavernNpcInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGTavernNpcInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGTavernNpcInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGTavernNpcInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGTavernNpcInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGTavernNpcInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GCGTavernNpcInfo.proto\"H\n\020GCGTavernNpc" +
      "Info\022\026\n\016scene_point_id\030\007 \001(\r\022\n\n\002id\030\005 \001(\r" +
      "\022\020\n\010level_id\030\001 \001(\rB\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGTavernNpcInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGTavernNpcInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGTavernNpcInfo_descriptor,
        new java.lang.String[] { "ScenePointId", "Id", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
