/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.io.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * 文件头
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-1-26")
public class RSFileHeader implements libthrift091.TBase<RSFileHeader, RSFileHeader._Fields>, java.io.Serializable, Cloneable, Comparable<RSFileHeader> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("RSFileHeader");

  private static final libthrift091.protocol.TField MAGIC_FIELD_DESC = new libthrift091.protocol.TField("magic", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField VERSION_FIELD_DESC = new libthrift091.protocol.TField("version", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField COMPRESSION_FIELD_DESC = new libthrift091.protocol.TField("compression", libthrift091.protocol.TType.I32, (short)3);
  private static final libthrift091.protocol.TField CHECKSUM_FIELD_DESC = new libthrift091.protocol.TField("checksum", libthrift091.protocol.TType.I32, (short)4);
  private static final libthrift091.protocol.TField COUNT_FIELD_DESC = new libthrift091.protocol.TField("count", libthrift091.protocol.TType.I64, (short)5);
  private static final libthrift091.protocol.TField METADATA_FIELD_DESC = new libthrift091.protocol.TField("metadata", libthrift091.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RSFileHeaderStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RSFileHeaderTupleSchemeFactory());
  }

  /**
   * Magic常量，固定为"RSF"
   */
  public String magic; // optional
  /**
   * 版本号
   */
  public int version; // optional
  /**
   * 压缩算法类型
   * 可选，进行压缩的区域为文件中除文件头之外其余部分
   * 
   * @see Compression
   */
  public Compression compression; // optional
  /**
   * 数据完整性校验算法类型
   * 可选，对每条记录对data部分进行校验
   * 
   * @see Checksum
   */
  public Checksum checksum; // optional
  /**
   * 记录数目，不含最后EOF记录，可选
   */
  public long count; // optional
  /**
   * 元信息，内容由使用者自己定义
   */
  public ByteBuffer metadata; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Magic常量，固定为"RSF"
     */
    MAGIC((short)1, "magic"),
    /**
     * 版本号
     */
    VERSION((short)2, "version"),
    /**
     * 压缩算法类型
     * 可选，进行压缩的区域为文件中除文件头之外其余部分
     * 
     * @see Compression
     */
    COMPRESSION((short)3, "compression"),
    /**
     * 数据完整性校验算法类型
     * 可选，对每条记录对data部分进行校验
     * 
     * @see Checksum
     */
    CHECKSUM((short)4, "checksum"),
    /**
     * 记录数目，不含最后EOF记录，可选
     */
    COUNT((short)5, "count"),
    /**
     * 元信息，内容由使用者自己定义
     */
    METADATA((short)6, "metadata");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MAGIC
          return MAGIC;
        case 2: // VERSION
          return VERSION;
        case 3: // COMPRESSION
          return COMPRESSION;
        case 4: // CHECKSUM
          return CHECKSUM;
        case 5: // COUNT
          return COUNT;
        case 6: // METADATA
          return METADATA;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __VERSION_ISSET_ID = 0;
  private static final int __COUNT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MAGIC,_Fields.VERSION,_Fields.COMPRESSION,_Fields.CHECKSUM,_Fields.COUNT,_Fields.METADATA};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MAGIC, new libthrift091.meta_data.FieldMetaData("magic", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION, new libthrift091.meta_data.FieldMetaData("version", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.COMPRESSION, new libthrift091.meta_data.FieldMetaData("compression", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, Compression.class)));
    tmpMap.put(_Fields.CHECKSUM, new libthrift091.meta_data.FieldMetaData("checksum", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, Checksum.class)));
    tmpMap.put(_Fields.COUNT, new libthrift091.meta_data.FieldMetaData("count", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.METADATA, new libthrift091.meta_data.FieldMetaData("metadata", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(RSFileHeader.class, metaDataMap);
  }

  public RSFileHeader() {
    this.count = -1L;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RSFileHeader(RSFileHeader other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMagic()) {
      this.magic = other.magic;
    }
    this.version = other.version;
    if (other.isSetCompression()) {
      this.compression = other.compression;
    }
    if (other.isSetChecksum()) {
      this.checksum = other.checksum;
    }
    this.count = other.count;
    if (other.isSetMetadata()) {
      this.metadata = libthrift091.TBaseHelper.copyBinary(other.metadata);
    }
  }

  public RSFileHeader deepCopy() {
    return new RSFileHeader(this);
  }

  @Override
  public void clear() {
    this.magic = null;
    setVersionIsSet(false);
    this.version = 0;
    this.compression = null;
    this.checksum = null;
    this.count = -1L;

    this.metadata = null;
  }

  /**
   * Magic常量，固定为"RSF"
   */
  public String getMagic() {
    return this.magic;
  }

  /**
   * Magic常量，固定为"RSF"
   */
  public RSFileHeader setMagic(String magic) {
    this.magic = magic;
    return this;
  }

  public void unsetMagic() {
    this.magic = null;
  }

  /** Returns true if field magic is set (has been assigned a value) and false otherwise */
  public boolean isSetMagic() {
    return this.magic != null;
  }

  public void setMagicIsSet(boolean value) {
    if (!value) {
      this.magic = null;
    }
  }

  /**
   * 版本号
   */
  public int getVersion() {
    return this.version;
  }

  /**
   * 版本号
   */
  public RSFileHeader setVersion(int version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  /**
   * 压缩算法类型
   * 可选，进行压缩的区域为文件中除文件头之外其余部分
   * 
   * @see Compression
   */
  public Compression getCompression() {
    return this.compression;
  }

  /**
   * 压缩算法类型
   * 可选，进行压缩的区域为文件中除文件头之外其余部分
   * 
   * @see Compression
   */
  public RSFileHeader setCompression(Compression compression) {
    this.compression = compression;
    return this;
  }

  public void unsetCompression() {
    this.compression = null;
  }

  /** Returns true if field compression is set (has been assigned a value) and false otherwise */
  public boolean isSetCompression() {
    return this.compression != null;
  }

  public void setCompressionIsSet(boolean value) {
    if (!value) {
      this.compression = null;
    }
  }

  /**
   * 数据完整性校验算法类型
   * 可选，对每条记录对data部分进行校验
   * 
   * @see Checksum
   */
  public Checksum getChecksum() {
    return this.checksum;
  }

  /**
   * 数据完整性校验算法类型
   * 可选，对每条记录对data部分进行校验
   * 
   * @see Checksum
   */
  public RSFileHeader setChecksum(Checksum checksum) {
    this.checksum = checksum;
    return this;
  }

  public void unsetChecksum() {
    this.checksum = null;
  }

  /** Returns true if field checksum is set (has been assigned a value) and false otherwise */
  public boolean isSetChecksum() {
    return this.checksum != null;
  }

  public void setChecksumIsSet(boolean value) {
    if (!value) {
      this.checksum = null;
    }
  }

  /**
   * 记录数目，不含最后EOF记录，可选
   */
  public long getCount() {
    return this.count;
  }

  /**
   * 记录数目，不含最后EOF记录，可选
   */
  public RSFileHeader setCount(long count) {
    this.count = count;
    setCountIsSet(true);
    return this;
  }

  public void unsetCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  /** Returns true if field count is set (has been assigned a value) and false otherwise */
  public boolean isSetCount() {
    return EncodingUtils.testBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  public void setCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COUNT_ISSET_ID, value);
  }

  /**
   * 元信息，内容由使用者自己定义
   */
  public byte[] getMetadata() {
    setMetadata(libthrift091.TBaseHelper.rightSize(metadata));
    return metadata == null ? null : metadata.array();
  }

  public ByteBuffer bufferForMetadata() {
    return libthrift091.TBaseHelper.copyBinary(metadata);
  }

  /**
   * 元信息，内容由使用者自己定义
   */
  public RSFileHeader setMetadata(byte[] metadata) {
    this.metadata = metadata == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(metadata, metadata.length));
    return this;
  }

  public RSFileHeader setMetadata(ByteBuffer metadata) {
    this.metadata = libthrift091.TBaseHelper.copyBinary(metadata);
    return this;
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MAGIC:
      if (value == null) {
        unsetMagic();
      } else {
        setMagic((String)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Integer)value);
      }
      break;

    case COMPRESSION:
      if (value == null) {
        unsetCompression();
      } else {
        setCompression((Compression)value);
      }
      break;

    case CHECKSUM:
      if (value == null) {
        unsetChecksum();
      } else {
        setChecksum((Checksum)value);
      }
      break;

    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((Long)value);
      }
      break;

    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        setMetadata((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MAGIC:
      return getMagic();

    case VERSION:
      return Integer.valueOf(getVersion());

    case COMPRESSION:
      return getCompression();

    case CHECKSUM:
      return getChecksum();

    case COUNT:
      return Long.valueOf(getCount());

    case METADATA:
      return getMetadata();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MAGIC:
      return isSetMagic();
    case VERSION:
      return isSetVersion();
    case COMPRESSION:
      return isSetCompression();
    case CHECKSUM:
      return isSetChecksum();
    case COUNT:
      return isSetCount();
    case METADATA:
      return isSetMetadata();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RSFileHeader)
      return this.equals((RSFileHeader)that);
    return false;
  }

  public boolean equals(RSFileHeader that) {
    if (that == null)
      return false;

    boolean this_present_magic = true && this.isSetMagic();
    boolean that_present_magic = true && that.isSetMagic();
    if (this_present_magic || that_present_magic) {
      if (!(this_present_magic && that_present_magic))
        return false;
      if (!this.magic.equals(that.magic))
        return false;
    }

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_compression = true && this.isSetCompression();
    boolean that_present_compression = true && that.isSetCompression();
    if (this_present_compression || that_present_compression) {
      if (!(this_present_compression && that_present_compression))
        return false;
      if (!this.compression.equals(that.compression))
        return false;
    }

    boolean this_present_checksum = true && this.isSetChecksum();
    boolean that_present_checksum = true && that.isSetChecksum();
    if (this_present_checksum || that_present_checksum) {
      if (!(this_present_checksum && that_present_checksum))
        return false;
      if (!this.checksum.equals(that.checksum))
        return false;
    }

    boolean this_present_count = true && this.isSetCount();
    boolean that_present_count = true && that.isSetCount();
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
        return false;
    }

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_magic = true && (isSetMagic());
    list.add(present_magic);
    if (present_magic)
      list.add(magic);

    boolean present_version = true && (isSetVersion());
    list.add(present_version);
    if (present_version)
      list.add(version);

    boolean present_compression = true && (isSetCompression());
    list.add(present_compression);
    if (present_compression)
      list.add(compression.getValue());

    boolean present_checksum = true && (isSetChecksum());
    list.add(present_checksum);
    if (present_checksum)
      list.add(checksum.getValue());

    boolean present_count = true && (isSetCount());
    list.add(present_count);
    if (present_count)
      list.add(count);

    boolean present_metadata = true && (isSetMetadata());
    list.add(present_metadata);
    if (present_metadata)
      list.add(metadata);

    return list.hashCode();
  }

  @Override
  public int compareTo(RSFileHeader other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMagic()).compareTo(other.isSetMagic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMagic()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.magic, other.magic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCompression()).compareTo(other.isSetCompression());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompression()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.compression, other.compression);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChecksum()).compareTo(other.isSetChecksum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChecksum()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.checksum, other.checksum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCount()).compareTo(other.isSetCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCount()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.count, other.count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.metadata, other.metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RSFileHeader(");
    boolean first = true;

    if (isSetMagic()) {
      sb.append("magic:");
      if (this.magic == null) {
        sb.append("null");
      } else {
        sb.append(this.magic);
      }
      first = false;
    }
    if (isSetVersion()) {
      if (!first) sb.append(", ");
      sb.append("version:");
      sb.append(this.version);
      first = false;
    }
    if (isSetCompression()) {
      if (!first) sb.append(", ");
      sb.append("compression:");
      if (this.compression == null) {
        sb.append("null");
      } else {
        sb.append(this.compression);
      }
      first = false;
    }
    if (isSetChecksum()) {
      if (!first) sb.append(", ");
      sb.append("checksum:");
      if (this.checksum == null) {
        sb.append("null");
      } else {
        sb.append(this.checksum);
      }
      first = false;
    }
    if (isSetCount()) {
      if (!first) sb.append(", ");
      sb.append("count:");
      sb.append(this.count);
      first = false;
    }
    if (isSetMetadata()) {
      if (!first) sb.append(", ");
      sb.append("metadata:");
      if (this.metadata == null) {
        sb.append("null");
      } else {
        libthrift091.TBaseHelper.toString(this.metadata, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RSFileHeaderStandardSchemeFactory implements SchemeFactory {
    public RSFileHeaderStandardScheme getScheme() {
      return new RSFileHeaderStandardScheme();
    }
  }

  private static class RSFileHeaderStandardScheme extends StandardScheme<RSFileHeader> {

    public void read(libthrift091.protocol.TProtocol iprot, RSFileHeader struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MAGIC
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.magic = iprot.readString();
              struct.setMagicIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERSION
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.version = iprot.readI32();
              struct.setVersionIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COMPRESSION
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.compression = com.xiaomi.infra.galaxy.io.thrift.Compression.findByValue(iprot.readI32());
              struct.setCompressionIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CHECKSUM
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.checksum = com.xiaomi.infra.galaxy.io.thrift.Checksum.findByValue(iprot.readI32());
              struct.setChecksumIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COUNT
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.count = iprot.readI64();
              struct.setCountIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // METADATA
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.metadata = iprot.readBinary();
              struct.setMetadataIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, RSFileHeader struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.magic != null) {
        if (struct.isSetMagic()) {
          oprot.writeFieldBegin(MAGIC_FIELD_DESC);
          oprot.writeString(struct.magic);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetVersion()) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeI32(struct.version);
        oprot.writeFieldEnd();
      }
      if (struct.compression != null) {
        if (struct.isSetCompression()) {
          oprot.writeFieldBegin(COMPRESSION_FIELD_DESC);
          oprot.writeI32(struct.compression.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.checksum != null) {
        if (struct.isSetChecksum()) {
          oprot.writeFieldBegin(CHECKSUM_FIELD_DESC);
          oprot.writeI32(struct.checksum.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetCount()) {
        oprot.writeFieldBegin(COUNT_FIELD_DESC);
        oprot.writeI64(struct.count);
        oprot.writeFieldEnd();
      }
      if (struct.metadata != null) {
        if (struct.isSetMetadata()) {
          oprot.writeFieldBegin(METADATA_FIELD_DESC);
          oprot.writeBinary(struct.metadata);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RSFileHeaderTupleSchemeFactory implements SchemeFactory {
    public RSFileHeaderTupleScheme getScheme() {
      return new RSFileHeaderTupleScheme();
    }
  }

  private static class RSFileHeaderTupleScheme extends TupleScheme<RSFileHeader> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, RSFileHeader struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMagic()) {
        optionals.set(0);
      }
      if (struct.isSetVersion()) {
        optionals.set(1);
      }
      if (struct.isSetCompression()) {
        optionals.set(2);
      }
      if (struct.isSetChecksum()) {
        optionals.set(3);
      }
      if (struct.isSetCount()) {
        optionals.set(4);
      }
      if (struct.isSetMetadata()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetMagic()) {
        oprot.writeString(struct.magic);
      }
      if (struct.isSetVersion()) {
        oprot.writeI32(struct.version);
      }
      if (struct.isSetCompression()) {
        oprot.writeI32(struct.compression.getValue());
      }
      if (struct.isSetChecksum()) {
        oprot.writeI32(struct.checksum.getValue());
      }
      if (struct.isSetCount()) {
        oprot.writeI64(struct.count);
      }
      if (struct.isSetMetadata()) {
        oprot.writeBinary(struct.metadata);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, RSFileHeader struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.magic = iprot.readString();
        struct.setMagicIsSet(true);
      }
      if (incoming.get(1)) {
        struct.version = iprot.readI32();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.compression = com.xiaomi.infra.galaxy.io.thrift.Compression.findByValue(iprot.readI32());
        struct.setCompressionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.checksum = com.xiaomi.infra.galaxy.io.thrift.Checksum.findByValue(iprot.readI32());
        struct.setChecksumIsSet(true);
      }
      if (incoming.get(4)) {
        struct.count = iprot.readI64();
        struct.setCountIsSet(true);
      }
      if (incoming.get(5)) {
        struct.metadata = iprot.readBinary();
        struct.setMetadataIsSet(true);
      }
    }
  }

}

