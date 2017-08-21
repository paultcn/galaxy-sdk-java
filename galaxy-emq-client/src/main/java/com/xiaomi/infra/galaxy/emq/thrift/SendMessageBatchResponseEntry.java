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
public class SendMessageBatchResponseEntry implements libthrift091.TBase<SendMessageBatchResponseEntry, SendMessageBatchResponseEntry._Fields>, java.io.Serializable, Cloneable, Comparable<SendMessageBatchResponseEntry> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("SendMessageBatchResponseEntry");

  private static final libthrift091.protocol.TField ENTRY_ID_FIELD_DESC = new libthrift091.protocol.TField("entryId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField MESSAGE_ID_FIELD_DESC = new libthrift091.protocol.TField("messageID", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField BODY_LENGTH_FIELD_DESC = new libthrift091.protocol.TField("bodyLength", libthrift091.protocol.TType.I32, (short)3);
  private static final libthrift091.protocol.TField BODY_MD5_FIELD_DESC = new libthrift091.protocol.TField("bodyMd5", libthrift091.protocol.TType.STRING, (short)4);
  private static final libthrift091.protocol.TField SEND_TIMESTAMP_FIELD_DESC = new libthrift091.protocol.TField("sendTimestamp", libthrift091.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SendMessageBatchResponseEntryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SendMessageBatchResponseEntryTupleSchemeFactory());
  }

  /**
   * corresponding to the entryId in request
   * 
   */
  public String entryId; // required
  /**
   * MessageID for the send message
   * 
   */
  public String messageID; // required
  /**
   * Length of message body
   * 
   */
  public int bodyLength; // optional
  /**
   * MD5 string of the message body
   * 
   */
  public String bodyMd5; // optional
  /**
   * timestamp when the message arrived servers
   * 
   */
  public long sendTimestamp; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * corresponding to the entryId in request
     * 
     */
    ENTRY_ID((short)1, "entryId"),
    /**
     * MessageID for the send message
     * 
     */
    MESSAGE_ID((short)2, "messageID"),
    /**
     * Length of message body
     * 
     */
    BODY_LENGTH((short)3, "bodyLength"),
    /**
     * MD5 string of the message body
     * 
     */
    BODY_MD5((short)4, "bodyMd5"),
    /**
     * timestamp when the message arrived servers
     * 
     */
    SEND_TIMESTAMP((short)5, "sendTimestamp");

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
        case 1: // ENTRY_ID
          return ENTRY_ID;
        case 2: // MESSAGE_ID
          return MESSAGE_ID;
        case 3: // BODY_LENGTH
          return BODY_LENGTH;
        case 4: // BODY_MD5
          return BODY_MD5;
        case 5: // SEND_TIMESTAMP
          return SEND_TIMESTAMP;
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
  private static final int __BODYLENGTH_ISSET_ID = 0;
  private static final int __SENDTIMESTAMP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.BODY_LENGTH,_Fields.BODY_MD5,_Fields.SEND_TIMESTAMP};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ENTRY_ID, new libthrift091.meta_data.FieldMetaData("entryId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE_ID, new libthrift091.meta_data.FieldMetaData("messageID", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.BODY_LENGTH, new libthrift091.meta_data.FieldMetaData("bodyLength", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.BODY_MD5, new libthrift091.meta_data.FieldMetaData("bodyMd5", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEND_TIMESTAMP, new libthrift091.meta_data.FieldMetaData("sendTimestamp", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(SendMessageBatchResponseEntry.class, metaDataMap);
  }

  public SendMessageBatchResponseEntry() {
  }

  public SendMessageBatchResponseEntry(
    String entryId,
    String messageID)
  {
    this();
    this.entryId = entryId;
    this.messageID = messageID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SendMessageBatchResponseEntry(SendMessageBatchResponseEntry other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetEntryId()) {
      this.entryId = other.entryId;
    }
    if (other.isSetMessageID()) {
      this.messageID = other.messageID;
    }
    this.bodyLength = other.bodyLength;
    if (other.isSetBodyMd5()) {
      this.bodyMd5 = other.bodyMd5;
    }
    this.sendTimestamp = other.sendTimestamp;
  }

  public SendMessageBatchResponseEntry deepCopy() {
    return new SendMessageBatchResponseEntry(this);
  }

  @Override
  public void clear() {
    this.entryId = null;
    this.messageID = null;
    setBodyLengthIsSet(false);
    this.bodyLength = 0;
    this.bodyMd5 = null;
    setSendTimestampIsSet(false);
    this.sendTimestamp = 0;
  }

  /**
   * corresponding to the entryId in request
   * 
   */
  public String getEntryId() {
    return this.entryId;
  }

  /**
   * corresponding to the entryId in request
   * 
   */
  public SendMessageBatchResponseEntry setEntryId(String entryId) {
    this.entryId = entryId;
    return this;
  }

  public void unsetEntryId() {
    this.entryId = null;
  }

  /** Returns true if field entryId is set (has been assigned a value) and false otherwise */
  public boolean isSetEntryId() {
    return this.entryId != null;
  }

  public void setEntryIdIsSet(boolean value) {
    if (!value) {
      this.entryId = null;
    }
  }

  /**
   * MessageID for the send message
   * 
   */
  public String getMessageID() {
    return this.messageID;
  }

  /**
   * MessageID for the send message
   * 
   */
  public SendMessageBatchResponseEntry setMessageID(String messageID) {
    this.messageID = messageID;
    return this;
  }

  public void unsetMessageID() {
    this.messageID = null;
  }

  /** Returns true if field messageID is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageID() {
    return this.messageID != null;
  }

  public void setMessageIDIsSet(boolean value) {
    if (!value) {
      this.messageID = null;
    }
  }

  /**
   * Length of message body
   * 
   */
  public int getBodyLength() {
    return this.bodyLength;
  }

  /**
   * Length of message body
   * 
   */
  public SendMessageBatchResponseEntry setBodyLength(int bodyLength) {
    this.bodyLength = bodyLength;
    setBodyLengthIsSet(true);
    return this;
  }

  public void unsetBodyLength() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BODYLENGTH_ISSET_ID);
  }

  /** Returns true if field bodyLength is set (has been assigned a value) and false otherwise */
  public boolean isSetBodyLength() {
    return EncodingUtils.testBit(__isset_bitfield, __BODYLENGTH_ISSET_ID);
  }

  public void setBodyLengthIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BODYLENGTH_ISSET_ID, value);
  }

  /**
   * MD5 string of the message body
   * 
   */
  public String getBodyMd5() {
    return this.bodyMd5;
  }

  /**
   * MD5 string of the message body
   * 
   */
  public SendMessageBatchResponseEntry setBodyMd5(String bodyMd5) {
    this.bodyMd5 = bodyMd5;
    return this;
  }

  public void unsetBodyMd5() {
    this.bodyMd5 = null;
  }

  /** Returns true if field bodyMd5 is set (has been assigned a value) and false otherwise */
  public boolean isSetBodyMd5() {
    return this.bodyMd5 != null;
  }

  public void setBodyMd5IsSet(boolean value) {
    if (!value) {
      this.bodyMd5 = null;
    }
  }

  /**
   * timestamp when the message arrived servers
   * 
   */
  public long getSendTimestamp() {
    return this.sendTimestamp;
  }

  /**
   * timestamp when the message arrived servers
   * 
   */
  public SendMessageBatchResponseEntry setSendTimestamp(long sendTimestamp) {
    this.sendTimestamp = sendTimestamp;
    setSendTimestampIsSet(true);
    return this;
  }

  public void unsetSendTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SENDTIMESTAMP_ISSET_ID);
  }

  /** Returns true if field sendTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetSendTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __SENDTIMESTAMP_ISSET_ID);
  }

  public void setSendTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SENDTIMESTAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ENTRY_ID:
      if (value == null) {
        unsetEntryId();
      } else {
        setEntryId((String)value);
      }
      break;

    case MESSAGE_ID:
      if (value == null) {
        unsetMessageID();
      } else {
        setMessageID((String)value);
      }
      break;

    case BODY_LENGTH:
      if (value == null) {
        unsetBodyLength();
      } else {
        setBodyLength((Integer)value);
      }
      break;

    case BODY_MD5:
      if (value == null) {
        unsetBodyMd5();
      } else {
        setBodyMd5((String)value);
      }
      break;

    case SEND_TIMESTAMP:
      if (value == null) {
        unsetSendTimestamp();
      } else {
        setSendTimestamp((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ENTRY_ID:
      return getEntryId();

    case MESSAGE_ID:
      return getMessageID();

    case BODY_LENGTH:
      return Integer.valueOf(getBodyLength());

    case BODY_MD5:
      return getBodyMd5();

    case SEND_TIMESTAMP:
      return Long.valueOf(getSendTimestamp());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ENTRY_ID:
      return isSetEntryId();
    case MESSAGE_ID:
      return isSetMessageID();
    case BODY_LENGTH:
      return isSetBodyLength();
    case BODY_MD5:
      return isSetBodyMd5();
    case SEND_TIMESTAMP:
      return isSetSendTimestamp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SendMessageBatchResponseEntry)
      return this.equals((SendMessageBatchResponseEntry)that);
    return false;
  }

  public boolean equals(SendMessageBatchResponseEntry that) {
    if (that == null)
      return false;

    boolean this_present_entryId = true && this.isSetEntryId();
    boolean that_present_entryId = true && that.isSetEntryId();
    if (this_present_entryId || that_present_entryId) {
      if (!(this_present_entryId && that_present_entryId))
        return false;
      if (!this.entryId.equals(that.entryId))
        return false;
    }

    boolean this_present_messageID = true && this.isSetMessageID();
    boolean that_present_messageID = true && that.isSetMessageID();
    if (this_present_messageID || that_present_messageID) {
      if (!(this_present_messageID && that_present_messageID))
        return false;
      if (!this.messageID.equals(that.messageID))
        return false;
    }

    boolean this_present_bodyLength = true && this.isSetBodyLength();
    boolean that_present_bodyLength = true && that.isSetBodyLength();
    if (this_present_bodyLength || that_present_bodyLength) {
      if (!(this_present_bodyLength && that_present_bodyLength))
        return false;
      if (this.bodyLength != that.bodyLength)
        return false;
    }

    boolean this_present_bodyMd5 = true && this.isSetBodyMd5();
    boolean that_present_bodyMd5 = true && that.isSetBodyMd5();
    if (this_present_bodyMd5 || that_present_bodyMd5) {
      if (!(this_present_bodyMd5 && that_present_bodyMd5))
        return false;
      if (!this.bodyMd5.equals(that.bodyMd5))
        return false;
    }

    boolean this_present_sendTimestamp = true && this.isSetSendTimestamp();
    boolean that_present_sendTimestamp = true && that.isSetSendTimestamp();
    if (this_present_sendTimestamp || that_present_sendTimestamp) {
      if (!(this_present_sendTimestamp && that_present_sendTimestamp))
        return false;
      if (this.sendTimestamp != that.sendTimestamp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_entryId = true && (isSetEntryId());
    list.add(present_entryId);
    if (present_entryId)
      list.add(entryId);

    boolean present_messageID = true && (isSetMessageID());
    list.add(present_messageID);
    if (present_messageID)
      list.add(messageID);

    boolean present_bodyLength = true && (isSetBodyLength());
    list.add(present_bodyLength);
    if (present_bodyLength)
      list.add(bodyLength);

    boolean present_bodyMd5 = true && (isSetBodyMd5());
    list.add(present_bodyMd5);
    if (present_bodyMd5)
      list.add(bodyMd5);

    boolean present_sendTimestamp = true && (isSetSendTimestamp());
    list.add(present_sendTimestamp);
    if (present_sendTimestamp)
      list.add(sendTimestamp);

    return list.hashCode();
  }

  @Override
  public int compareTo(SendMessageBatchResponseEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEntryId()).compareTo(other.isSetEntryId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntryId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.entryId, other.entryId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageID()).compareTo(other.isSetMessageID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageID()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageID, other.messageID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBodyLength()).compareTo(other.isSetBodyLength());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBodyLength()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.bodyLength, other.bodyLength);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBodyMd5()).compareTo(other.isSetBodyMd5());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBodyMd5()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.bodyMd5, other.bodyMd5);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSendTimestamp()).compareTo(other.isSetSendTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSendTimestamp()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.sendTimestamp, other.sendTimestamp);
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
    StringBuilder sb = new StringBuilder("SendMessageBatchResponseEntry(");
    boolean first = true;

    sb.append("entryId:");
    if (this.entryId == null) {
      sb.append("null");
    } else {
      sb.append(this.entryId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageID:");
    if (this.messageID == null) {
      sb.append("null");
    } else {
      sb.append(this.messageID);
    }
    first = false;
    if (isSetBodyLength()) {
      if (!first) sb.append(", ");
      sb.append("bodyLength:");
      sb.append(this.bodyLength);
      first = false;
    }
    if (isSetBodyMd5()) {
      if (!first) sb.append(", ");
      sb.append("bodyMd5:");
      if (this.bodyMd5 == null) {
        sb.append("null");
      } else {
        sb.append(this.bodyMd5);
      }
      first = false;
    }
    if (isSetSendTimestamp()) {
      if (!first) sb.append(", ");
      sb.append("sendTimestamp:");
      sb.append(this.sendTimestamp);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (entryId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'entryId' was not present! Struct: " + toString());
    }
    if (messageID == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'messageID' was not present! Struct: " + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SendMessageBatchResponseEntryStandardSchemeFactory implements SchemeFactory {
    public SendMessageBatchResponseEntryStandardScheme getScheme() {
      return new SendMessageBatchResponseEntryStandardScheme();
    }
  }

  private static class SendMessageBatchResponseEntryStandardScheme extends StandardScheme<SendMessageBatchResponseEntry> {

    public void read(libthrift091.protocol.TProtocol iprot, SendMessageBatchResponseEntry struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ENTRY_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.entryId = iprot.readString();
              struct.setEntryIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.messageID = iprot.readString();
              struct.setMessageIDIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BODY_LENGTH
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.bodyLength = iprot.readI32();
              struct.setBodyLengthIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BODY_MD5
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.bodyMd5 = iprot.readString();
              struct.setBodyMd5IsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SEND_TIMESTAMP
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.sendTimestamp = iprot.readI64();
              struct.setSendTimestampIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, SendMessageBatchResponseEntry struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.entryId != null) {
        oprot.writeFieldBegin(ENTRY_ID_FIELD_DESC);
        oprot.writeString(struct.entryId);
        oprot.writeFieldEnd();
      }
      if (struct.messageID != null) {
        oprot.writeFieldBegin(MESSAGE_ID_FIELD_DESC);
        oprot.writeString(struct.messageID);
        oprot.writeFieldEnd();
      }
      if (struct.isSetBodyLength()) {
        oprot.writeFieldBegin(BODY_LENGTH_FIELD_DESC);
        oprot.writeI32(struct.bodyLength);
        oprot.writeFieldEnd();
      }
      if (struct.bodyMd5 != null) {
        if (struct.isSetBodyMd5()) {
          oprot.writeFieldBegin(BODY_MD5_FIELD_DESC);
          oprot.writeString(struct.bodyMd5);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetSendTimestamp()) {
        oprot.writeFieldBegin(SEND_TIMESTAMP_FIELD_DESC);
        oprot.writeI64(struct.sendTimestamp);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SendMessageBatchResponseEntryTupleSchemeFactory implements SchemeFactory {
    public SendMessageBatchResponseEntryTupleScheme getScheme() {
      return new SendMessageBatchResponseEntryTupleScheme();
    }
  }

  private static class SendMessageBatchResponseEntryTupleScheme extends TupleScheme<SendMessageBatchResponseEntry> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, SendMessageBatchResponseEntry struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.entryId);
      oprot.writeString(struct.messageID);
      BitSet optionals = new BitSet();
      if (struct.isSetBodyLength()) {
        optionals.set(0);
      }
      if (struct.isSetBodyMd5()) {
        optionals.set(1);
      }
      if (struct.isSetSendTimestamp()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetBodyLength()) {
        oprot.writeI32(struct.bodyLength);
      }
      if (struct.isSetBodyMd5()) {
        oprot.writeString(struct.bodyMd5);
      }
      if (struct.isSetSendTimestamp()) {
        oprot.writeI64(struct.sendTimestamp);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, SendMessageBatchResponseEntry struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.entryId = iprot.readString();
      struct.setEntryIdIsSet(true);
      struct.messageID = iprot.readString();
      struct.setMessageIDIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.bodyLength = iprot.readI32();
        struct.setBodyLengthIsSet(true);
      }
      if (incoming.get(1)) {
        struct.bodyMd5 = iprot.readString();
        struct.setBodyMd5IsSet(true);
      }
      if (incoming.get(2)) {
        struct.sendTimestamp = iprot.readI64();
        struct.setSendTimestampIsSet(true);
      }
    }
  }

}

