/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-29")
public class UpdateOffsetRequest implements libthrift091.TBase<UpdateOffsetRequest, UpdateOffsetRequest._Fields>, java.io.Serializable, Cloneable, Comparable<UpdateOffsetRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("UpdateOffsetRequest");

  private static final libthrift091.protocol.TField CHECKPOINT_FIELD_DESC = new libthrift091.protocol.TField("checkpoint", libthrift091.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UpdateOffsetRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UpdateOffsetRequestTupleSchemeFactory());
  }

  /**
   * CheckPoint instance
   * 
   */
  public CheckPoint checkpoint; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * CheckPoint instance
     * 
     */
    CHECKPOINT((short)1, "checkpoint");

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
        case 1: // CHECKPOINT
          return CHECKPOINT;
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
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHECKPOINT, new libthrift091.meta_data.FieldMetaData("checkpoint", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, CheckPoint.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(UpdateOffsetRequest.class, metaDataMap);
  }

  public UpdateOffsetRequest() {
  }

  public UpdateOffsetRequest(
    CheckPoint checkpoint)
  {
    this();
    this.checkpoint = checkpoint;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateOffsetRequest(UpdateOffsetRequest other) {
    if (other.isSetCheckpoint()) {
      this.checkpoint = new CheckPoint(other.checkpoint);
    }
  }

  public UpdateOffsetRequest deepCopy() {
    return new UpdateOffsetRequest(this);
  }

  @Override
  public void clear() {
    this.checkpoint = null;
  }

  /**
   * CheckPoint instance
   * 
   */
  public CheckPoint getCheckpoint() {
    return this.checkpoint;
  }

  /**
   * CheckPoint instance
   * 
   */
  public UpdateOffsetRequest setCheckpoint(CheckPoint checkpoint) {
    this.checkpoint = checkpoint;
    return this;
  }

  public void unsetCheckpoint() {
    this.checkpoint = null;
  }

  /** Returns true if field checkpoint is set (has been assigned a value) and false otherwise */
  public boolean isSetCheckpoint() {
    return this.checkpoint != null;
  }

  public void setCheckpointIsSet(boolean value) {
    if (!value) {
      this.checkpoint = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHECKPOINT:
      if (value == null) {
        unsetCheckpoint();
      } else {
        setCheckpoint((CheckPoint)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHECKPOINT:
      return getCheckpoint();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHECKPOINT:
      return isSetCheckpoint();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UpdateOffsetRequest)
      return this.equals((UpdateOffsetRequest)that);
    return false;
  }

  public boolean equals(UpdateOffsetRequest that) {
    if (that == null)
      return false;

    boolean this_present_checkpoint = true && this.isSetCheckpoint();
    boolean that_present_checkpoint = true && that.isSetCheckpoint();
    if (this_present_checkpoint || that_present_checkpoint) {
      if (!(this_present_checkpoint && that_present_checkpoint))
        return false;
      if (!this.checkpoint.equals(that.checkpoint))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_checkpoint = true && (isSetCheckpoint());
    list.add(present_checkpoint);
    if (present_checkpoint)
      list.add(checkpoint);

    return list.hashCode();
  }

  @Override
  public int compareTo(UpdateOffsetRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCheckpoint()).compareTo(other.isSetCheckpoint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCheckpoint()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.checkpoint, other.checkpoint);
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
    StringBuilder sb = new StringBuilder("UpdateOffsetRequest(");
    boolean first = true;

    sb.append("checkpoint:");
    if (this.checkpoint == null) {
      sb.append("null");
    } else {
      sb.append(this.checkpoint);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (checkpoint == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'checkpoint' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (checkpoint != null) {
      checkpoint.validate();
    }
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UpdateOffsetRequestStandardSchemeFactory implements SchemeFactory {
    public UpdateOffsetRequestStandardScheme getScheme() {
      return new UpdateOffsetRequestStandardScheme();
    }
  }

  private static class UpdateOffsetRequestStandardScheme extends StandardScheme<UpdateOffsetRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, UpdateOffsetRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHECKPOINT
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.checkpoint = new CheckPoint();
              struct.checkpoint.read(iprot);
              struct.setCheckpointIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, UpdateOffsetRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.checkpoint != null) {
        oprot.writeFieldBegin(CHECKPOINT_FIELD_DESC);
        struct.checkpoint.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UpdateOffsetRequestTupleSchemeFactory implements SchemeFactory {
    public UpdateOffsetRequestTupleScheme getScheme() {
      return new UpdateOffsetRequestTupleScheme();
    }
  }

  private static class UpdateOffsetRequestTupleScheme extends TupleScheme<UpdateOffsetRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, UpdateOffsetRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.checkpoint.write(oprot);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, UpdateOffsetRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.checkpoint = new CheckPoint();
      struct.checkpoint.read(iprot);
      struct.setCheckpointIsSet(true);
    }
  }

}

