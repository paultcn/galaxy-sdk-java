/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emr.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-1-12")
public class DeleteTagRequest implements libthrift091.TBase<DeleteTagRequest, DeleteTagRequest._Fields>, java.io.Serializable, Cloneable, Comparable<DeleteTagRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("DeleteTagRequest");

  private static final libthrift091.protocol.TField CLUSTER_ID_FIELD_DESC = new libthrift091.protocol.TField("clusterId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField TAG_KEY_FIELD_DESC = new libthrift091.protocol.TField("tagKey", libthrift091.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeleteTagRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeleteTagRequestTupleSchemeFactory());
  }

  public String clusterId; // required
  public String tagKey; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    CLUSTER_ID((short)1, "clusterId"),
    TAG_KEY((short)2, "tagKey");

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
        case 1: // CLUSTER_ID
          return CLUSTER_ID;
        case 2: // TAG_KEY
          return TAG_KEY;
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
    tmpMap.put(_Fields.CLUSTER_ID, new libthrift091.meta_data.FieldMetaData("clusterId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.TAG_KEY, new libthrift091.meta_data.FieldMetaData("tagKey", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(DeleteTagRequest.class, metaDataMap);
  }

  public DeleteTagRequest() {
  }

  public DeleteTagRequest(
    String clusterId,
    String tagKey)
  {
    this();
    this.clusterId = clusterId;
    this.tagKey = tagKey;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeleteTagRequest(DeleteTagRequest other) {
    if (other.isSetClusterId()) {
      this.clusterId = other.clusterId;
    }
    if (other.isSetTagKey()) {
      this.tagKey = other.tagKey;
    }
  }

  public DeleteTagRequest deepCopy() {
    return new DeleteTagRequest(this);
  }

  @Override
  public void clear() {
    this.clusterId = null;
    this.tagKey = null;
  }

  public String getClusterId() {
    return this.clusterId;
  }

  public DeleteTagRequest setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public void unsetClusterId() {
    this.clusterId = null;
  }

  /** Returns true if field clusterId is set (has been assigned a value) and false otherwise */
  public boolean isSetClusterId() {
    return this.clusterId != null;
  }

  public void setClusterIdIsSet(boolean value) {
    if (!value) {
      this.clusterId = null;
    }
  }

  public String getTagKey() {
    return this.tagKey;
  }

  public DeleteTagRequest setTagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  public void unsetTagKey() {
    this.tagKey = null;
  }

  /** Returns true if field tagKey is set (has been assigned a value) and false otherwise */
  public boolean isSetTagKey() {
    return this.tagKey != null;
  }

  public void setTagKeyIsSet(boolean value) {
    if (!value) {
      this.tagKey = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLUSTER_ID:
      if (value == null) {
        unsetClusterId();
      } else {
        setClusterId((String)value);
      }
      break;

    case TAG_KEY:
      if (value == null) {
        unsetTagKey();
      } else {
        setTagKey((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLUSTER_ID:
      return getClusterId();

    case TAG_KEY:
      return getTagKey();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLUSTER_ID:
      return isSetClusterId();
    case TAG_KEY:
      return isSetTagKey();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeleteTagRequest)
      return this.equals((DeleteTagRequest)that);
    return false;
  }

  public boolean equals(DeleteTagRequest that) {
    if (that == null)
      return false;

    boolean this_present_clusterId = true && this.isSetClusterId();
    boolean that_present_clusterId = true && that.isSetClusterId();
    if (this_present_clusterId || that_present_clusterId) {
      if (!(this_present_clusterId && that_present_clusterId))
        return false;
      if (!this.clusterId.equals(that.clusterId))
        return false;
    }

    boolean this_present_tagKey = true && this.isSetTagKey();
    boolean that_present_tagKey = true && that.isSetTagKey();
    if (this_present_tagKey || that_present_tagKey) {
      if (!(this_present_tagKey && that_present_tagKey))
        return false;
      if (!this.tagKey.equals(that.tagKey))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_clusterId = true && (isSetClusterId());
    list.add(present_clusterId);
    if (present_clusterId)
      list.add(clusterId);

    boolean present_tagKey = true && (isSetTagKey());
    list.add(present_tagKey);
    if (present_tagKey)
      list.add(tagKey);

    return list.hashCode();
  }

  @Override
  public int compareTo(DeleteTagRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetClusterId()).compareTo(other.isSetClusterId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.clusterId, other.clusterId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTagKey()).compareTo(other.isSetTagKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTagKey()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.tagKey, other.tagKey);
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
    StringBuilder sb = new StringBuilder("DeleteTagRequest(");
    boolean first = true;

    sb.append("clusterId:");
    if (this.clusterId == null) {
      sb.append("null");
    } else {
      sb.append(this.clusterId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tagKey:");
    if (this.tagKey == null) {
      sb.append("null");
    } else {
      sb.append(this.tagKey);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (clusterId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'clusterId' was not present! Struct: " + toString());
    }
    if (tagKey == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'tagKey' was not present! Struct: " + toString());
    }
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DeleteTagRequestStandardSchemeFactory implements SchemeFactory {
    public DeleteTagRequestStandardScheme getScheme() {
      return new DeleteTagRequestStandardScheme();
    }
  }

  private static class DeleteTagRequestStandardScheme extends StandardScheme<DeleteTagRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, DeleteTagRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLUSTER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.clusterId = iprot.readString();
              struct.setClusterIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TAG_KEY
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.tagKey = iprot.readString();
              struct.setTagKeyIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, DeleteTagRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.clusterId != null) {
        oprot.writeFieldBegin(CLUSTER_ID_FIELD_DESC);
        oprot.writeString(struct.clusterId);
        oprot.writeFieldEnd();
      }
      if (struct.tagKey != null) {
        oprot.writeFieldBegin(TAG_KEY_FIELD_DESC);
        oprot.writeString(struct.tagKey);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeleteTagRequestTupleSchemeFactory implements SchemeFactory {
    public DeleteTagRequestTupleScheme getScheme() {
      return new DeleteTagRequestTupleScheme();
    }
  }

  private static class DeleteTagRequestTupleScheme extends TupleScheme<DeleteTagRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, DeleteTagRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.clusterId);
      oprot.writeString(struct.tagKey);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, DeleteTagRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.clusterId = iprot.readString();
      struct.setClusterIdIsSet(true);
      struct.tagKey = iprot.readString();
      struct.setTagKeyIsSet(true);
    }
  }

}

