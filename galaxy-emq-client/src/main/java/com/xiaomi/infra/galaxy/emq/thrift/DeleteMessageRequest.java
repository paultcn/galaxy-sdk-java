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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-7-27")
public class DeleteMessageRequest implements libthrift091.TBase<DeleteMessageRequest, DeleteMessageRequest._Fields>, java.io.Serializable, Cloneable, Comparable<DeleteMessageRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("DeleteMessageRequest");

  private static final libthrift091.protocol.TField QUEUE_NAME_FIELD_DESC = new libthrift091.protocol.TField("queueName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField RECEIPT_HANDLE_FIELD_DESC = new libthrift091.protocol.TField("receiptHandle", libthrift091.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeleteMessageRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeleteMessageRequestTupleSchemeFactory());
  }

  /**
   * Queue name;
   * 
   */
  public String queueName; // required
  /**
   * receipt handle of message to delete;
   * 
   */
  public String receiptHandle; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Queue name;
     * 
     */
    QUEUE_NAME((short)1, "queueName"),
    /**
     * receipt handle of message to delete;
     * 
     */
    RECEIPT_HANDLE((short)2, "receiptHandle");

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
        case 2: // RECEIPT_HANDLE
          return RECEIPT_HANDLE;
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
    tmpMap.put(_Fields.RECEIPT_HANDLE, new libthrift091.meta_data.FieldMetaData("receiptHandle", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(DeleteMessageRequest.class, metaDataMap);
  }

  public DeleteMessageRequest() {
  }

  public DeleteMessageRequest(
    String queueName,
    String receiptHandle)
  {
    this();
    this.queueName = queueName;
    this.receiptHandle = receiptHandle;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeleteMessageRequest(DeleteMessageRequest other) {
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
    if (other.isSetReceiptHandle()) {
      this.receiptHandle = other.receiptHandle;
    }
  }

  public DeleteMessageRequest deepCopy() {
    return new DeleteMessageRequest(this);
  }

  @Override
  public void clear() {
    this.queueName = null;
    this.receiptHandle = null;
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
  public DeleteMessageRequest setQueueName(String queueName) {
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

  /**
   * receipt handle of message to delete;
   * 
   */
  public String getReceiptHandle() {
    return this.receiptHandle;
  }

  /**
   * receipt handle of message to delete;
   * 
   */
  public DeleteMessageRequest setReceiptHandle(String receiptHandle) {
    this.receiptHandle = receiptHandle;
    return this;
  }

  public void unsetReceiptHandle() {
    this.receiptHandle = null;
  }

  /** Returns true if field receiptHandle is set (has been assigned a value) and false otherwise */
  public boolean isSetReceiptHandle() {
    return this.receiptHandle != null;
  }

  public void setReceiptHandleIsSet(boolean value) {
    if (!value) {
      this.receiptHandle = null;
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

    case RECEIPT_HANDLE:
      if (value == null) {
        unsetReceiptHandle();
      } else {
        setReceiptHandle((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return getQueueName();

    case RECEIPT_HANDLE:
      return getReceiptHandle();

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
    case RECEIPT_HANDLE:
      return isSetReceiptHandle();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeleteMessageRequest)
      return this.equals((DeleteMessageRequest)that);
    return false;
  }

  public boolean equals(DeleteMessageRequest that) {
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

    boolean this_present_receiptHandle = true && this.isSetReceiptHandle();
    boolean that_present_receiptHandle = true && that.isSetReceiptHandle();
    if (this_present_receiptHandle || that_present_receiptHandle) {
      if (!(this_present_receiptHandle && that_present_receiptHandle))
        return false;
      if (!this.receiptHandle.equals(that.receiptHandle))
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

    boolean present_receiptHandle = true && (isSetReceiptHandle());
    list.add(present_receiptHandle);
    if (present_receiptHandle)
      list.add(receiptHandle);

    return list.hashCode();
  }

  @Override
  public int compareTo(DeleteMessageRequest other) {
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
    lastComparison = Boolean.valueOf(isSetReceiptHandle()).compareTo(other.isSetReceiptHandle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceiptHandle()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.receiptHandle, other.receiptHandle);
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
    StringBuilder sb = new StringBuilder("DeleteMessageRequest(");
    boolean first = true;

    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("receiptHandle:");
    if (this.receiptHandle == null) {
      sb.append("null");
    } else {
      sb.append(this.receiptHandle);
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
    if (receiptHandle == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'receiptHandle' was not present! Struct: " + toString());
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

  private static class DeleteMessageRequestStandardSchemeFactory implements SchemeFactory {
    public DeleteMessageRequestStandardScheme getScheme() {
      return new DeleteMessageRequestStandardScheme();
    }
  }

  private static class DeleteMessageRequestStandardScheme extends StandardScheme<DeleteMessageRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, DeleteMessageRequest struct) throws libthrift091.TException {
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
          case 2: // RECEIPT_HANDLE
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.receiptHandle = iprot.readString();
              struct.setReceiptHandleIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, DeleteMessageRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueName != null) {
        oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
        oprot.writeString(struct.queueName);
        oprot.writeFieldEnd();
      }
      if (struct.receiptHandle != null) {
        oprot.writeFieldBegin(RECEIPT_HANDLE_FIELD_DESC);
        oprot.writeString(struct.receiptHandle);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeleteMessageRequestTupleSchemeFactory implements SchemeFactory {
    public DeleteMessageRequestTupleScheme getScheme() {
      return new DeleteMessageRequestTupleScheme();
    }
  }

  private static class DeleteMessageRequestTupleScheme extends TupleScheme<DeleteMessageRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, DeleteMessageRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.queueName);
      oprot.writeString(struct.receiptHandle);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, DeleteMessageRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.queueName = iprot.readString();
      struct.setQueueNameIsSet(true);
      struct.receiptHandle = iprot.readString();
      struct.setReceiptHandleIsSet(true);
    }
  }

}

