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
public class ListPermissionRequest implements libthrift091.TBase<ListPermissionRequest, ListPermissionRequest._Fields>, java.io.Serializable, Cloneable, Comparable<ListPermissionRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ListPermissionRequest");

  private static final libthrift091.protocol.TField RESOURCE_ID_FIELD_DESC = new libthrift091.protocol.TField("resourceId", libthrift091.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ListPermissionRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ListPermissionRequestTupleSchemeFactory());
  }

  public String resourceId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    RESOURCE_ID((short)1, "resourceId");

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
        case 1: // RESOURCE_ID
          return RESOURCE_ID;
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
    tmpMap.put(_Fields.RESOURCE_ID, new libthrift091.meta_data.FieldMetaData("resourceId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ListPermissionRequest.class, metaDataMap);
  }

  public ListPermissionRequest() {
  }

  public ListPermissionRequest(
    String resourceId)
  {
    this();
    this.resourceId = resourceId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ListPermissionRequest(ListPermissionRequest other) {
    if (other.isSetResourceId()) {
      this.resourceId = other.resourceId;
    }
  }

  public ListPermissionRequest deepCopy() {
    return new ListPermissionRequest(this);
  }

  @Override
  public void clear() {
    this.resourceId = null;
  }

  public String getResourceId() {
    return this.resourceId;
  }

  public ListPermissionRequest setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public void unsetResourceId() {
    this.resourceId = null;
  }

  /** Returns true if field resourceId is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceId() {
    return this.resourceId != null;
  }

  public void setResourceIdIsSet(boolean value) {
    if (!value) {
      this.resourceId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESOURCE_ID:
      if (value == null) {
        unsetResourceId();
      } else {
        setResourceId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESOURCE_ID:
      return getResourceId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESOURCE_ID:
      return isSetResourceId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ListPermissionRequest)
      return this.equals((ListPermissionRequest)that);
    return false;
  }

  public boolean equals(ListPermissionRequest that) {
    if (that == null)
      return false;

    boolean this_present_resourceId = true && this.isSetResourceId();
    boolean that_present_resourceId = true && that.isSetResourceId();
    if (this_present_resourceId || that_present_resourceId) {
      if (!(this_present_resourceId && that_present_resourceId))
        return false;
      if (!this.resourceId.equals(that.resourceId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_resourceId = true && (isSetResourceId());
    list.add(present_resourceId);
    if (present_resourceId)
      list.add(resourceId);

    return list.hashCode();
  }

  @Override
  public int compareTo(ListPermissionRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResourceId()).compareTo(other.isSetResourceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.resourceId, other.resourceId);
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
    StringBuilder sb = new StringBuilder("ListPermissionRequest(");
    boolean first = true;

    sb.append("resourceId:");
    if (this.resourceId == null) {
      sb.append("null");
    } else {
      sb.append(this.resourceId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (resourceId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'resourceId' was not present! Struct: " + toString());
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

  private static class ListPermissionRequestStandardSchemeFactory implements SchemeFactory {
    public ListPermissionRequestStandardScheme getScheme() {
      return new ListPermissionRequestStandardScheme();
    }
  }

  private static class ListPermissionRequestStandardScheme extends StandardScheme<ListPermissionRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, ListPermissionRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESOURCE_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.resourceId = iprot.readString();
              struct.setResourceIdIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ListPermissionRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resourceId != null) {
        oprot.writeFieldBegin(RESOURCE_ID_FIELD_DESC);
        oprot.writeString(struct.resourceId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ListPermissionRequestTupleSchemeFactory implements SchemeFactory {
    public ListPermissionRequestTupleScheme getScheme() {
      return new ListPermissionRequestTupleScheme();
    }
  }

  private static class ListPermissionRequestTupleScheme extends TupleScheme<ListPermissionRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ListPermissionRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.resourceId);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ListPermissionRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.resourceId = iprot.readString();
      struct.setResourceIdIsSet(true);
    }
  }

}

