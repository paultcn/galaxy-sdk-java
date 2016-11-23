/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-11-21")
public class ChangeMessageVisibilityBatchRequest implements libthrift091.TBase<ChangeMessageVisibilityBatchRequest, ChangeMessageVisibilityBatchRequest._Fields>, java.io.Serializable, Cloneable, Comparable<ChangeMessageVisibilityBatchRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ChangeMessageVisibilityBatchRequest");

  private static final libthrift091.protocol.TField QUEUE_NAME_FIELD_DESC = new libthrift091.protocol.TField("queueName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField CHANGE_MESSAGE_VISIBILITY_REQUEST_ENTRY_LIST_FIELD_DESC = new libthrift091.protocol.TField("changeMessageVisibilityRequestEntryList", libthrift091.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ChangeMessageVisibilityBatchRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ChangeMessageVisibilityBatchRequestTupleSchemeFactory());
  }

  /**
   * Queue name;
   * 
   */
  public String queueName; // required
  /**
   * List of ChangeMessageVisibilityRequest;
   * 
   */
  public List<ChangeMessageVisibilityBatchRequestEntry> changeMessageVisibilityRequestEntryList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Queue name;
     * 
     */
    QUEUE_NAME((short)1, "queueName"),
    /**
     * List of ChangeMessageVisibilityRequest;
     * 
     */
    CHANGE_MESSAGE_VISIBILITY_REQUEST_ENTRY_LIST((short)2, "changeMessageVisibilityRequestEntryList");

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
        case 1: // QUEUE_NAME
          return QUEUE_NAME;
        case 2: // CHANGE_MESSAGE_VISIBILITY_REQUEST_ENTRY_LIST
          return CHANGE_MESSAGE_VISIBILITY_REQUEST_ENTRY_LIST;
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
    tmpMap.put(_Fields.QUEUE_NAME, new libthrift091.meta_data.FieldMetaData("queueName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHANGE_MESSAGE_VISIBILITY_REQUEST_ENTRY_LIST, new libthrift091.meta_data.FieldMetaData("changeMessageVisibilityRequestEntryList", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, ChangeMessageVisibilityBatchRequestEntry.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ChangeMessageVisibilityBatchRequest.class, metaDataMap);
  }

  public ChangeMessageVisibilityBatchRequest() {
  }

  public ChangeMessageVisibilityBatchRequest(
    String queueName,
    List<ChangeMessageVisibilityBatchRequestEntry> changeMessageVisibilityRequestEntryList)
  {
    this();
    this.queueName = queueName;
    this.changeMessageVisibilityRequestEntryList = changeMessageVisibilityRequestEntryList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChangeMessageVisibilityBatchRequest(ChangeMessageVisibilityBatchRequest other) {
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
    if (other.isSetChangeMessageVisibilityRequestEntryList()) {
      List<ChangeMessageVisibilityBatchRequestEntry> __this__changeMessageVisibilityRequestEntryList = new ArrayList<ChangeMessageVisibilityBatchRequestEntry>(other.changeMessageVisibilityRequestEntryList.size());
      for (ChangeMessageVisibilityBatchRequestEntry other_element : other.changeMessageVisibilityRequestEntryList) {
        __this__changeMessageVisibilityRequestEntryList.add(new ChangeMessageVisibilityBatchRequestEntry(other_element));
      }
      this.changeMessageVisibilityRequestEntryList = __this__changeMessageVisibilityRequestEntryList;
    }
  }

  public ChangeMessageVisibilityBatchRequest deepCopy() {
    return new ChangeMessageVisibilityBatchRequest(this);
  }

  @Override
  public void clear() {
    this.queueName = null;
    this.changeMessageVisibilityRequestEntryList = null;
  }

  /**
   * Queue name;
   * 
   */
  public String getQueueName() {
    return this.queueName;
  }

  /**
   * Queue name;
   * 
   */
  public ChangeMessageVisibilityBatchRequest setQueueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  public void unsetQueueName() {
    this.queueName = null;
  }

  /** Returns true if field queueName is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueName() {
    return this.queueName != null;
  }

  public void setQueueNameIsSet(boolean value) {
    if (!value) {
      this.queueName = null;
    }
  }

  public int getChangeMessageVisibilityRequestEntryListSize() {
    return (this.changeMessageVisibilityRequestEntryList == null) ? 0 : this.changeMessageVisibilityRequestEntryList.size();
  }

  public java.util.Iterator<ChangeMessageVisibilityBatchRequestEntry> getChangeMessageVisibilityRequestEntryListIterator() {
    return (this.changeMessageVisibilityRequestEntryList == null) ? null : this.changeMessageVisibilityRequestEntryList.iterator();
  }

  public void addToChangeMessageVisibilityRequestEntryList(ChangeMessageVisibilityBatchRequestEntry elem) {
    if (this.changeMessageVisibilityRequestEntryList == null) {
      this.changeMessageVisibilityRequestEntryList = new ArrayList<ChangeMessageVisibilityBatchRequestEntry>();
    }
    this.changeMessageVisibilityRequestEntryList.add(elem);
  }

  /**
   * List of ChangeMessageVisibilityRequest;
   * 
   */
  public List<ChangeMessageVisibilityBatchRequestEntry> getChangeMessageVisibilityRequestEntryList() {
    return this.changeMessageVisibilityRequestEntryList;
  }

  /**
   * List of ChangeMessageVisibilityRequest;
   * 
   */
  public ChangeMessageVisibilityBatchRequest setChangeMessageVisibilityRequestEntryList(List<ChangeMessageVisibilityBatchRequestEntry> changeMessageVisibilityRequestEntryList) {
    this.changeMessageVisibilityRequestEntryList = changeMessageVisibilityRequestEntryList;
    return this;
  }

  public void unsetChangeMessageVisibilityRequestEntryList() {
    this.changeMessageVisibilityRequestEntryList = null;
  }

  /** Returns true if field changeMessageVisibilityRequestEntryList is set (has been assigned a value) and false otherwise */
  public boolean isSetChangeMessageVisibilityRequestEntryList() {
    return this.changeMessageVisibilityRequestEntryList != null;
  }

  public void setChangeMessageVisibilityRequestEntryListIsSet(boolean value) {
    if (!value) {
      this.changeMessageVisibilityRequestEntryList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUEUE_NAME:
      if (value == null) {
        unsetQueueName();
      } else {
        setQueueName((String)value);
      }
      break;

    case CHANGE_MESSAGE_VISIBILITY_REQUEST_ENTRY_LIST:
      if (value == null) {
        unsetChangeMessageVisibilityRequestEntryList();
      } else {
        setChangeMessageVisibilityRequestEntryList((List<ChangeMessageVisibilityBatchRequestEntry>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return getQueueName();

    case CHANGE_MESSAGE_VISIBILITY_REQUEST_ENTRY_LIST:
      return getChangeMessageVisibilityRequestEntryList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUEUE_NAME:
      return isSetQueueName();
    case CHANGE_MESSAGE_VISIBILITY_REQUEST_ENTRY_LIST:
      return isSetChangeMessageVisibilityRequestEntryList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ChangeMessageVisibilityBatchRequest)
      return this.equals((ChangeMessageVisibilityBatchRequest)that);
    return false;
  }

  public boolean equals(ChangeMessageVisibilityBatchRequest that) {
    if (that == null)
      return false;

    boolean this_present_queueName = true && this.isSetQueueName();
    boolean that_present_queueName = true && that.isSetQueueName();
    if (this_present_queueName || that_present_queueName) {
      if (!(this_present_queueName && that_present_queueName))
        return false;
      if (!this.queueName.equals(that.queueName))
        return false;
    }

    boolean this_present_changeMessageVisibilityRequestEntryList = true && this.isSetChangeMessageVisibilityRequestEntryList();
    boolean that_present_changeMessageVisibilityRequestEntryList = true && that.isSetChangeMessageVisibilityRequestEntryList();
    if (this_present_changeMessageVisibilityRequestEntryList || that_present_changeMessageVisibilityRequestEntryList) {
      if (!(this_present_changeMessageVisibilityRequestEntryList && that_present_changeMessageVisibilityRequestEntryList))
        return false;
      if (!this.changeMessageVisibilityRequestEntryList.equals(that.changeMessageVisibilityRequestEntryList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_queueName = true && (isSetQueueName());
    list.add(present_queueName);
    if (present_queueName)
      list.add(queueName);

    boolean present_changeMessageVisibilityRequestEntryList = true && (isSetChangeMessageVisibilityRequestEntryList());
    list.add(present_changeMessageVisibilityRequestEntryList);
    if (present_changeMessageVisibilityRequestEntryList)
      list.add(changeMessageVisibilityRequestEntryList);

    return list.hashCode();
  }

  @Override
  public int compareTo(ChangeMessageVisibilityBatchRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQueueName()).compareTo(other.isSetQueueName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.queueName, other.queueName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChangeMessageVisibilityRequestEntryList()).compareTo(other.isSetChangeMessageVisibilityRequestEntryList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChangeMessageVisibilityRequestEntryList()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.changeMessageVisibilityRequestEntryList, other.changeMessageVisibilityRequestEntryList);
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
    StringBuilder sb = new StringBuilder("ChangeMessageVisibilityBatchRequest(");
    boolean first = true;

    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("changeMessageVisibilityRequestEntryList:");
    if (this.changeMessageVisibilityRequestEntryList == null) {
      sb.append("null");
    } else {
      sb.append(this.changeMessageVisibilityRequestEntryList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (queueName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'queueName' was not present! Struct: " + toString());
    }
    if (changeMessageVisibilityRequestEntryList == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'changeMessageVisibilityRequestEntryList' was not present! Struct: " + toString());
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

  private static class ChangeMessageVisibilityBatchRequestStandardSchemeFactory implements SchemeFactory {
    public ChangeMessageVisibilityBatchRequestStandardScheme getScheme() {
      return new ChangeMessageVisibilityBatchRequestStandardScheme();
    }
  }

  private static class ChangeMessageVisibilityBatchRequestStandardScheme extends StandardScheme<ChangeMessageVisibilityBatchRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, ChangeMessageVisibilityBatchRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUEUE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.queueName = iprot.readString();
              struct.setQueueNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CHANGE_MESSAGE_VISIBILITY_REQUEST_ENTRY_LIST
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list64 = iprot.readListBegin();
                struct.changeMessageVisibilityRequestEntryList = new ArrayList<ChangeMessageVisibilityBatchRequestEntry>(_list64.size);
                ChangeMessageVisibilityBatchRequestEntry _elem65;
                for (int _i66 = 0; _i66 < _list64.size; ++_i66)
                {
                  _elem65 = new ChangeMessageVisibilityBatchRequestEntry();
                  _elem65.read(iprot);
                  struct.changeMessageVisibilityRequestEntryList.add(_elem65);
                }
                iprot.readListEnd();
              }
              struct.setChangeMessageVisibilityRequestEntryListIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ChangeMessageVisibilityBatchRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueName != null) {
        oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
        oprot.writeString(struct.queueName);
        oprot.writeFieldEnd();
      }
      if (struct.changeMessageVisibilityRequestEntryList != null) {
        oprot.writeFieldBegin(CHANGE_MESSAGE_VISIBILITY_REQUEST_ENTRY_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.changeMessageVisibilityRequestEntryList.size()));
          for (ChangeMessageVisibilityBatchRequestEntry _iter67 : struct.changeMessageVisibilityRequestEntryList)
          {
            _iter67.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ChangeMessageVisibilityBatchRequestTupleSchemeFactory implements SchemeFactory {
    public ChangeMessageVisibilityBatchRequestTupleScheme getScheme() {
      return new ChangeMessageVisibilityBatchRequestTupleScheme();
    }
  }

  private static class ChangeMessageVisibilityBatchRequestTupleScheme extends TupleScheme<ChangeMessageVisibilityBatchRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ChangeMessageVisibilityBatchRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.queueName);
      {
        oprot.writeI32(struct.changeMessageVisibilityRequestEntryList.size());
        for (ChangeMessageVisibilityBatchRequestEntry _iter68 : struct.changeMessageVisibilityRequestEntryList)
        {
          _iter68.write(oprot);
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ChangeMessageVisibilityBatchRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.queueName = iprot.readString();
      struct.setQueueNameIsSet(true);
      {
        libthrift091.protocol.TList _list69 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.changeMessageVisibilityRequestEntryList = new ArrayList<ChangeMessageVisibilityBatchRequestEntry>(_list69.size);
        ChangeMessageVisibilityBatchRequestEntry _elem70;
        for (int _i71 = 0; _i71 < _list69.size; ++_i71)
        {
          _elem70 = new ChangeMessageVisibilityBatchRequestEntry();
          _elem70.read(iprot);
          struct.changeMessageVisibilityRequestEntryList.add(_elem70);
        }
      }
      struct.setChangeMessageVisibilityRequestEntryListIsSet(true);
    }
  }

}

