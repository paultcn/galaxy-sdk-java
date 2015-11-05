/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

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
 * 行级别的增量操作
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-11-5")
public class RowEdit implements libthrift091.TBase<RowEdit, RowEdit._Fields>, java.io.Serializable, Cloneable, Comparable<RowEdit> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("RowEdit");

  private static final libthrift091.protocol.TField KEYS_FIELD_DESC = new libthrift091.protocol.TField("keys", libthrift091.protocol.TType.MAP, (short)1);
  private static final libthrift091.protocol.TField EDITS_FIELD_DESC = new libthrift091.protocol.TField("edits", libthrift091.protocol.TType.MAP, (short)2);
  private static final libthrift091.protocol.TField CONSUME_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("consumeOffset", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField DELETE_ROW_FIELD_DESC = new libthrift091.protocol.TField("deleteRow", libthrift091.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RowEditStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RowEditTupleSchemeFactory());
  }

  /**
   * 增量操作行的主键
   */
  public Map<String,Datum> keys; // optional
  /**
   * 增量操作行的属性
   */
  public Map<String,EditDatum> edits; // optional
  /**
   * 增量偏移
   */
  public long consumeOffset; // optional
  /**
   * 是否删除整行
   */
  public boolean deleteRow; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 增量操作行的主键
     */
    KEYS((short)1, "keys"),
    /**
     * 增量操作行的属性
     */
    EDITS((short)2, "edits"),
    /**
     * 增量偏移
     */
    CONSUME_OFFSET((short)3, "consumeOffset"),
    /**
     * 是否删除整行
     */
    DELETE_ROW((short)4, "deleteRow");

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
        case 1: // KEYS
          return KEYS;
        case 2: // EDITS
          return EDITS;
        case 3: // CONSUME_OFFSET
          return CONSUME_OFFSET;
        case 4: // DELETE_ROW
          return DELETE_ROW;
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
  private static final int __CONSUMEOFFSET_ISSET_ID = 0;
  private static final int __DELETEROW_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.KEYS,_Fields.EDITS,_Fields.CONSUME_OFFSET,_Fields.DELETE_ROW};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEYS, new libthrift091.meta_data.FieldMetaData("keys", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    tmpMap.put(_Fields.EDITS, new libthrift091.meta_data.FieldMetaData("edits", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "EditDictionary")));
    tmpMap.put(_Fields.CONSUME_OFFSET, new libthrift091.meta_data.FieldMetaData("consumeOffset", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.DELETE_ROW, new libthrift091.meta_data.FieldMetaData("deleteRow", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(RowEdit.class, metaDataMap);
  }

  public RowEdit() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RowEdit(RowEdit other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetKeys()) {
      this.keys = other.keys;
    }
    if (other.isSetEdits()) {
      this.edits = other.edits;
    }
    this.consumeOffset = other.consumeOffset;
    this.deleteRow = other.deleteRow;
  }

  public RowEdit deepCopy() {
    return new RowEdit(this);
  }

  @Override
  public void clear() {
    this.keys = null;
    this.edits = null;
    setConsumeOffsetIsSet(false);
    this.consumeOffset = 0;
    setDeleteRowIsSet(false);
    this.deleteRow = false;
  }

  public int getKeysSize() {
    return (this.keys == null) ? 0 : this.keys.size();
  }

  public void putToKeys(String key, Datum val) {
    if (this.keys == null) {
      this.keys = new HashMap<String,Datum>();
    }
    this.keys.put(key, val);
  }

  /**
   * 增量操作行的主键
   */
  public Map<String,Datum> getKeys() {
    return this.keys;
  }

  /**
   * 增量操作行的主键
   */
  public RowEdit setKeys(Map<String,Datum> keys) {
    this.keys = keys;
    return this;
  }

  public void unsetKeys() {
    this.keys = null;
  }

  /** Returns true if field keys is set (has been assigned a value) and false otherwise */
  public boolean isSetKeys() {
    return this.keys != null;
  }

  public void setKeysIsSet(boolean value) {
    if (!value) {
      this.keys = null;
    }
  }

  public int getEditsSize() {
    return (this.edits == null) ? 0 : this.edits.size();
  }

  public void putToEdits(String key, EditDatum val) {
    if (this.edits == null) {
      this.edits = new HashMap<String,EditDatum>();
    }
    this.edits.put(key, val);
  }

  /**
   * 增量操作行的属性
   */
  public Map<String,EditDatum> getEdits() {
    return this.edits;
  }

  /**
   * 增量操作行的属性
   */
  public RowEdit setEdits(Map<String,EditDatum> edits) {
    this.edits = edits;
    return this;
  }

  public void unsetEdits() {
    this.edits = null;
  }

  /** Returns true if field edits is set (has been assigned a value) and false otherwise */
  public boolean isSetEdits() {
    return this.edits != null;
  }

  public void setEditsIsSet(boolean value) {
    if (!value) {
      this.edits = null;
    }
  }

  /**
   * 增量偏移
   */
  public long getConsumeOffset() {
    return this.consumeOffset;
  }

  /**
   * 增量偏移
   */
  public RowEdit setConsumeOffset(long consumeOffset) {
    this.consumeOffset = consumeOffset;
    setConsumeOffsetIsSet(true);
    return this;
  }

  public void unsetConsumeOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONSUMEOFFSET_ISSET_ID);
  }

  /** Returns true if field consumeOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetConsumeOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __CONSUMEOFFSET_ISSET_ID);
  }

  public void setConsumeOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONSUMEOFFSET_ISSET_ID, value);
  }

  /**
   * 是否删除整行
   */
  public boolean isDeleteRow() {
    return this.deleteRow;
  }

  /**
   * 是否删除整行
   */
  public RowEdit setDeleteRow(boolean deleteRow) {
    this.deleteRow = deleteRow;
    setDeleteRowIsSet(true);
    return this;
  }

  public void unsetDeleteRow() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DELETEROW_ISSET_ID);
  }

  /** Returns true if field deleteRow is set (has been assigned a value) and false otherwise */
  public boolean isSetDeleteRow() {
    return EncodingUtils.testBit(__isset_bitfield, __DELETEROW_ISSET_ID);
  }

  public void setDeleteRowIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DELETEROW_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case KEYS:
      if (value == null) {
        unsetKeys();
      } else {
        setKeys((Map<String,Datum>)value);
      }
      break;

    case EDITS:
      if (value == null) {
        unsetEdits();
      } else {
        setEdits((Map<String,EditDatum>)value);
      }
      break;

    case CONSUME_OFFSET:
      if (value == null) {
        unsetConsumeOffset();
      } else {
        setConsumeOffset((Long)value);
      }
      break;

    case DELETE_ROW:
      if (value == null) {
        unsetDeleteRow();
      } else {
        setDeleteRow((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case KEYS:
      return getKeys();

    case EDITS:
      return getEdits();

    case CONSUME_OFFSET:
      return Long.valueOf(getConsumeOffset());

    case DELETE_ROW:
      return Boolean.valueOf(isDeleteRow());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case KEYS:
      return isSetKeys();
    case EDITS:
      return isSetEdits();
    case CONSUME_OFFSET:
      return isSetConsumeOffset();
    case DELETE_ROW:
      return isSetDeleteRow();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RowEdit)
      return this.equals((RowEdit)that);
    return false;
  }

  public boolean equals(RowEdit that) {
    if (that == null)
      return false;

    boolean this_present_keys = true && this.isSetKeys();
    boolean that_present_keys = true && that.isSetKeys();
    if (this_present_keys || that_present_keys) {
      if (!(this_present_keys && that_present_keys))
        return false;
      if (!this.keys.equals(that.keys))
        return false;
    }

    boolean this_present_edits = true && this.isSetEdits();
    boolean that_present_edits = true && that.isSetEdits();
    if (this_present_edits || that_present_edits) {
      if (!(this_present_edits && that_present_edits))
        return false;
      if (!this.edits.equals(that.edits))
        return false;
    }

    boolean this_present_consumeOffset = true && this.isSetConsumeOffset();
    boolean that_present_consumeOffset = true && that.isSetConsumeOffset();
    if (this_present_consumeOffset || that_present_consumeOffset) {
      if (!(this_present_consumeOffset && that_present_consumeOffset))
        return false;
      if (this.consumeOffset != that.consumeOffset)
        return false;
    }

    boolean this_present_deleteRow = true && this.isSetDeleteRow();
    boolean that_present_deleteRow = true && that.isSetDeleteRow();
    if (this_present_deleteRow || that_present_deleteRow) {
      if (!(this_present_deleteRow && that_present_deleteRow))
        return false;
      if (this.deleteRow != that.deleteRow)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_keys = true && (isSetKeys());
    list.add(present_keys);
    if (present_keys)
      list.add(keys);

    boolean present_edits = true && (isSetEdits());
    list.add(present_edits);
    if (present_edits)
      list.add(edits);

    boolean present_consumeOffset = true && (isSetConsumeOffset());
    list.add(present_consumeOffset);
    if (present_consumeOffset)
      list.add(consumeOffset);

    boolean present_deleteRow = true && (isSetDeleteRow());
    list.add(present_deleteRow);
    if (present_deleteRow)
      list.add(deleteRow);

    return list.hashCode();
  }

  @Override
  public int compareTo(RowEdit other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetKeys()).compareTo(other.isSetKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeys()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.keys, other.keys);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEdits()).compareTo(other.isSetEdits());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEdits()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.edits, other.edits);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConsumeOffset()).compareTo(other.isSetConsumeOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConsumeOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.consumeOffset, other.consumeOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeleteRow()).compareTo(other.isSetDeleteRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeleteRow()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.deleteRow, other.deleteRow);
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
    StringBuilder sb = new StringBuilder("RowEdit(");
    boolean first = true;

    if (isSetKeys()) {
      sb.append("keys:");
      if (this.keys == null) {
        sb.append("null");
      } else {
        sb.append(this.keys);
      }
      first = false;
    }
    if (isSetEdits()) {
      if (!first) sb.append(", ");
      sb.append("edits:");
      if (this.edits == null) {
        sb.append("null");
      } else {
        sb.append(this.edits);
      }
      first = false;
    }
    if (isSetConsumeOffset()) {
      if (!first) sb.append(", ");
      sb.append("consumeOffset:");
      sb.append(this.consumeOffset);
      first = false;
    }
    if (isSetDeleteRow()) {
      if (!first) sb.append(", ");
      sb.append("deleteRow:");
      sb.append(this.deleteRow);
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

  private static class RowEditStandardSchemeFactory implements SchemeFactory {
    public RowEditStandardScheme getScheme() {
      return new RowEditStandardScheme();
    }
  }

  private static class RowEditStandardScheme extends StandardScheme<RowEdit> {

    public void read(libthrift091.protocol.TProtocol iprot, RowEdit struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEYS
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map342 = iprot.readMapBegin();
                struct.keys = new HashMap<String,Datum>(2*_map342.size);
                String _key343;
                Datum _val344;
                for (int _i345 = 0; _i345 < _map342.size; ++_i345)
                {
                  _key343 = iprot.readString();
                  _val344 = new Datum();
                  _val344.read(iprot);
                  struct.keys.put(_key343, _val344);
                }
                iprot.readMapEnd();
              }
              struct.setKeysIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EDITS
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map346 = iprot.readMapBegin();
                struct.edits = new HashMap<String,EditDatum>(2*_map346.size);
                String _key347;
                EditDatum _val348;
                for (int _i349 = 0; _i349 < _map346.size; ++_i349)
                {
                  _key347 = iprot.readString();
                  _val348 = new EditDatum();
                  _val348.read(iprot);
                  struct.edits.put(_key347, _val348);
                }
                iprot.readMapEnd();
              }
              struct.setEditsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONSUME_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.consumeOffset = iprot.readI64();
              struct.setConsumeOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DELETE_ROW
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.deleteRow = iprot.readBool();
              struct.setDeleteRowIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, RowEdit struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.keys != null) {
        if (struct.isSetKeys()) {
          oprot.writeFieldBegin(KEYS_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.keys.size()));
            for (Map.Entry<String, Datum> _iter350 : struct.keys.entrySet())
            {
              oprot.writeString(_iter350.getKey());
              _iter350.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.edits != null) {
        if (struct.isSetEdits()) {
          oprot.writeFieldBegin(EDITS_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.edits.size()));
            for (Map.Entry<String, EditDatum> _iter351 : struct.edits.entrySet())
            {
              oprot.writeString(_iter351.getKey());
              _iter351.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetConsumeOffset()) {
        oprot.writeFieldBegin(CONSUME_OFFSET_FIELD_DESC);
        oprot.writeI64(struct.consumeOffset);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDeleteRow()) {
        oprot.writeFieldBegin(DELETE_ROW_FIELD_DESC);
        oprot.writeBool(struct.deleteRow);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RowEditTupleSchemeFactory implements SchemeFactory {
    public RowEditTupleScheme getScheme() {
      return new RowEditTupleScheme();
    }
  }

  private static class RowEditTupleScheme extends TupleScheme<RowEdit> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, RowEdit struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetKeys()) {
        optionals.set(0);
      }
      if (struct.isSetEdits()) {
        optionals.set(1);
      }
      if (struct.isSetConsumeOffset()) {
        optionals.set(2);
      }
      if (struct.isSetDeleteRow()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetKeys()) {
        {
          oprot.writeI32(struct.keys.size());
          for (Map.Entry<String, Datum> _iter352 : struct.keys.entrySet())
          {
            oprot.writeString(_iter352.getKey());
            _iter352.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetEdits()) {
        {
          oprot.writeI32(struct.edits.size());
          for (Map.Entry<String, EditDatum> _iter353 : struct.edits.entrySet())
          {
            oprot.writeString(_iter353.getKey());
            _iter353.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetConsumeOffset()) {
        oprot.writeI64(struct.consumeOffset);
      }
      if (struct.isSetDeleteRow()) {
        oprot.writeBool(struct.deleteRow);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, RowEdit struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map354 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.keys = new HashMap<String,Datum>(2*_map354.size);
          String _key355;
          Datum _val356;
          for (int _i357 = 0; _i357 < _map354.size; ++_i357)
          {
            _key355 = iprot.readString();
            _val356 = new Datum();
            _val356.read(iprot);
            struct.keys.put(_key355, _val356);
          }
        }
        struct.setKeysIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TMap _map358 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.edits = new HashMap<String,EditDatum>(2*_map358.size);
          String _key359;
          EditDatum _val360;
          for (int _i361 = 0; _i361 < _map358.size; ++_i361)
          {
            _key359 = iprot.readString();
            _val360 = new EditDatum();
            _val360.read(iprot);
            struct.edits.put(_key359, _val360);
          }
        }
        struct.setEditsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.consumeOffset = iprot.readI64();
        struct.setConsumeOffsetIsSet(true);
      }
      if (incoming.get(3)) {
        struct.deleteRow = iprot.readBool();
        struct.setDeleteRowIsSet(true);
      }
    }
  }

}

