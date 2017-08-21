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
public class CreateTagRequest implements libthrift091.TBase<CreateTagRequest, CreateTagRequest._Fields>, java.io.Serializable, Cloneable, Comparable<CreateTagRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("CreateTagRequest");

  private static final libthrift091.protocol.TField QUEUE_NAME_FIELD_DESC = new libthrift091.protocol.TField("queueName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField TAG_NAME_FIELD_DESC = new libthrift091.protocol.TField("tagName", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField START_TIMESTAMP_FIELD_DESC = new libthrift091.protocol.TField("startTimestamp", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField READ_QPSQUOTA_FIELD_DESC = new libthrift091.protocol.TField("readQPSQuota", libthrift091.protocol.TType.I64, (short)4);
  private static final libthrift091.protocol.TField ATTRIBUTE_NAME_FIELD_DESC = new libthrift091.protocol.TField("attributeName", libthrift091.protocol.TType.STRING, (short)5);
  private static final libthrift091.protocol.TField ATTRIBUTE_VALUE_FIELD_DESC = new libthrift091.protocol.TField("attributeValue", libthrift091.protocol.TType.STRUCT, (short)6);
  private static final libthrift091.protocol.TField USER_ATTRIBUTES_FIELD_DESC = new libthrift091.protocol.TField("userAttributes", libthrift091.protocol.TType.MAP, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CreateTagRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CreateTagRequestTupleSchemeFactory());
  }

  public String queueName; // required
  public String tagName; // required
  public long startTimestamp; // optional
  public long readQPSQuota; // optional
  public String attributeName; // optional
  public com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute attributeValue; // optional
  public Map<String,String> userAttributes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    QUEUE_NAME((short)1, "queueName"),
    TAG_NAME((short)2, "tagName"),
    START_TIMESTAMP((short)3, "startTimestamp"),
    READ_QPSQUOTA((short)4, "readQPSQuota"),
    ATTRIBUTE_NAME((short)5, "attributeName"),
    ATTRIBUTE_VALUE((short)6, "attributeValue"),
    USER_ATTRIBUTES((short)7, "userAttributes");

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
        case 2: // TAG_NAME
          return TAG_NAME;
        case 3: // START_TIMESTAMP
          return START_TIMESTAMP;
        case 4: // READ_QPSQUOTA
          return READ_QPSQUOTA;
        case 5: // ATTRIBUTE_NAME
          return ATTRIBUTE_NAME;
        case 6: // ATTRIBUTE_VALUE
          return ATTRIBUTE_VALUE;
        case 7: // USER_ATTRIBUTES
          return USER_ATTRIBUTES;
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
  private static final int __STARTTIMESTAMP_ISSET_ID = 0;
  private static final int __READQPSQUOTA_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.START_TIMESTAMP,_Fields.READ_QPSQUOTA,_Fields.ATTRIBUTE_NAME,_Fields.ATTRIBUTE_VALUE,_Fields.USER_ATTRIBUTES};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUEUE_NAME, new libthrift091.meta_data.FieldMetaData("queueName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.TAG_NAME, new libthrift091.meta_data.FieldMetaData("tagName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.START_TIMESTAMP, new libthrift091.meta_data.FieldMetaData("startTimestamp", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.READ_QPSQUOTA, new libthrift091.meta_data.FieldMetaData("readQPSQuota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.ATTRIBUTE_NAME, new libthrift091.meta_data.FieldMetaData("attributeName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.ATTRIBUTE_VALUE, new libthrift091.meta_data.FieldMetaData("attributeValue", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute.class)));
    tmpMap.put(_Fields.USER_ATTRIBUTES, new libthrift091.meta_data.FieldMetaData("userAttributes", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(CreateTagRequest.class, metaDataMap);
  }

  public CreateTagRequest() {
  }

  public CreateTagRequest(
    String queueName,
    String tagName)
  {
    this();
    this.queueName = queueName;
    this.tagName = tagName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateTagRequest(CreateTagRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
    if (other.isSetTagName()) {
      this.tagName = other.tagName;
    }
    this.startTimestamp = other.startTimestamp;
    this.readQPSQuota = other.readQPSQuota;
    if (other.isSetAttributeName()) {
      this.attributeName = other.attributeName;
    }
    if (other.isSetAttributeValue()) {
      this.attributeValue = new com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute(other.attributeValue);
    }
    if (other.isSetUserAttributes()) {
      Map<String,String> __this__userAttributes = new HashMap<String,String>(other.userAttributes);
      this.userAttributes = __this__userAttributes;
    }
  }

  public CreateTagRequest deepCopy() {
    return new CreateTagRequest(this);
  }

  @Override
  public void clear() {
    this.queueName = null;
    this.tagName = null;
    setStartTimestampIsSet(false);
    this.startTimestamp = 0;
    setReadQPSQuotaIsSet(false);
    this.readQPSQuota = 0;
    this.attributeName = null;
    this.attributeValue = null;
    this.userAttributes = null;
  }

  public String getQueueName() {
    return this.queueName;
  }

  public CreateTagRequest setQueueName(String queueName) {
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

  public String getTagName() {
    return this.tagName;
  }

  public CreateTagRequest setTagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

  public void unsetTagName() {
    this.tagName = null;
  }

  /** Returns true if field tagName is set (has been assigned a value) and false otherwise */
  public boolean isSetTagName() {
    return this.tagName != null;
  }

  public void setTagNameIsSet(boolean value) {
    if (!value) {
      this.tagName = null;
    }
  }

  public long getStartTimestamp() {
    return this.startTimestamp;
  }

  public CreateTagRequest setStartTimestamp(long startTimestamp) {
    this.startTimestamp = startTimestamp;
    setStartTimestampIsSet(true);
    return this;
  }

  public void unsetStartTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTTIMESTAMP_ISSET_ID);
  }

  /** Returns true if field startTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTTIMESTAMP_ISSET_ID);
  }

  public void setStartTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTTIMESTAMP_ISSET_ID, value);
  }

  public long getReadQPSQuota() {
    return this.readQPSQuota;
  }

  public CreateTagRequest setReadQPSQuota(long readQPSQuota) {
    this.readQPSQuota = readQPSQuota;
    setReadQPSQuotaIsSet(true);
    return this;
  }

  public void unsetReadQPSQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __READQPSQUOTA_ISSET_ID);
  }

  /** Returns true if field readQPSQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetReadQPSQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __READQPSQUOTA_ISSET_ID);
  }

  public void setReadQPSQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __READQPSQUOTA_ISSET_ID, value);
  }

  public String getAttributeName() {
    return this.attributeName;
  }

  public CreateTagRequest setAttributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  public void unsetAttributeName() {
    this.attributeName = null;
  }

  /** Returns true if field attributeName is set (has been assigned a value) and false otherwise */
  public boolean isSetAttributeName() {
    return this.attributeName != null;
  }

  public void setAttributeNameIsSet(boolean value) {
    if (!value) {
      this.attributeName = null;
    }
  }

  public com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute getAttributeValue() {
    return this.attributeValue;
  }

  public CreateTagRequest setAttributeValue(com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

  public void unsetAttributeValue() {
    this.attributeValue = null;
  }

  /** Returns true if field attributeValue is set (has been assigned a value) and false otherwise */
  public boolean isSetAttributeValue() {
    return this.attributeValue != null;
  }

  public void setAttributeValueIsSet(boolean value) {
    if (!value) {
      this.attributeValue = null;
    }
  }

  public int getUserAttributesSize() {
    return (this.userAttributes == null) ? 0 : this.userAttributes.size();
  }

  public void putToUserAttributes(String key, String val) {
    if (this.userAttributes == null) {
      this.userAttributes = new HashMap<String,String>();
    }
    this.userAttributes.put(key, val);
  }

  public Map<String,String> getUserAttributes() {
    return this.userAttributes;
  }

  public CreateTagRequest setUserAttributes(Map<String,String> userAttributes) {
    this.userAttributes = userAttributes;
    return this;
  }

  public void unsetUserAttributes() {
    this.userAttributes = null;
  }

  /** Returns true if field userAttributes is set (has been assigned a value) and false otherwise */
  public boolean isSetUserAttributes() {
    return this.userAttributes != null;
  }

  public void setUserAttributesIsSet(boolean value) {
    if (!value) {
      this.userAttributes = null;
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

    case TAG_NAME:
      if (value == null) {
        unsetTagName();
      } else {
        setTagName((String)value);
      }
      break;

    case START_TIMESTAMP:
      if (value == null) {
        unsetStartTimestamp();
      } else {
        setStartTimestamp((Long)value);
      }
      break;

    case READ_QPSQUOTA:
      if (value == null) {
        unsetReadQPSQuota();
      } else {
        setReadQPSQuota((Long)value);
      }
      break;

    case ATTRIBUTE_NAME:
      if (value == null) {
        unsetAttributeName();
      } else {
        setAttributeName((String)value);
      }
      break;

    case ATTRIBUTE_VALUE:
      if (value == null) {
        unsetAttributeValue();
      } else {
        setAttributeValue((com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute)value);
      }
      break;

    case USER_ATTRIBUTES:
      if (value == null) {
        unsetUserAttributes();
      } else {
        setUserAttributes((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return getQueueName();

    case TAG_NAME:
      return getTagName();

    case START_TIMESTAMP:
      return Long.valueOf(getStartTimestamp());

    case READ_QPSQUOTA:
      return Long.valueOf(getReadQPSQuota());

    case ATTRIBUTE_NAME:
      return getAttributeName();

    case ATTRIBUTE_VALUE:
      return getAttributeValue();

    case USER_ATTRIBUTES:
      return getUserAttributes();

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
    case TAG_NAME:
      return isSetTagName();
    case START_TIMESTAMP:
      return isSetStartTimestamp();
    case READ_QPSQUOTA:
      return isSetReadQPSQuota();
    case ATTRIBUTE_NAME:
      return isSetAttributeName();
    case ATTRIBUTE_VALUE:
      return isSetAttributeValue();
    case USER_ATTRIBUTES:
      return isSetUserAttributes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CreateTagRequest)
      return this.equals((CreateTagRequest)that);
    return false;
  }

  public boolean equals(CreateTagRequest that) {
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

    boolean this_present_tagName = true && this.isSetTagName();
    boolean that_present_tagName = true && that.isSetTagName();
    if (this_present_tagName || that_present_tagName) {
      if (!(this_present_tagName && that_present_tagName))
        return false;
      if (!this.tagName.equals(that.tagName))
        return false;
    }

    boolean this_present_startTimestamp = true && this.isSetStartTimestamp();
    boolean that_present_startTimestamp = true && that.isSetStartTimestamp();
    if (this_present_startTimestamp || that_present_startTimestamp) {
      if (!(this_present_startTimestamp && that_present_startTimestamp))
        return false;
      if (this.startTimestamp != that.startTimestamp)
        return false;
    }

    boolean this_present_readQPSQuota = true && this.isSetReadQPSQuota();
    boolean that_present_readQPSQuota = true && that.isSetReadQPSQuota();
    if (this_present_readQPSQuota || that_present_readQPSQuota) {
      if (!(this_present_readQPSQuota && that_present_readQPSQuota))
        return false;
      if (this.readQPSQuota != that.readQPSQuota)
        return false;
    }

    boolean this_present_attributeName = true && this.isSetAttributeName();
    boolean that_present_attributeName = true && that.isSetAttributeName();
    if (this_present_attributeName || that_present_attributeName) {
      if (!(this_present_attributeName && that_present_attributeName))
        return false;
      if (!this.attributeName.equals(that.attributeName))
        return false;
    }

    boolean this_present_attributeValue = true && this.isSetAttributeValue();
    boolean that_present_attributeValue = true && that.isSetAttributeValue();
    if (this_present_attributeValue || that_present_attributeValue) {
      if (!(this_present_attributeValue && that_present_attributeValue))
        return false;
      if (!this.attributeValue.equals(that.attributeValue))
        return false;
    }

    boolean this_present_userAttributes = true && this.isSetUserAttributes();
    boolean that_present_userAttributes = true && that.isSetUserAttributes();
    if (this_present_userAttributes || that_present_userAttributes) {
      if (!(this_present_userAttributes && that_present_userAttributes))
        return false;
      if (!this.userAttributes.equals(that.userAttributes))
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

    boolean present_tagName = true && (isSetTagName());
    list.add(present_tagName);
    if (present_tagName)
      list.add(tagName);

    boolean present_startTimestamp = true && (isSetStartTimestamp());
    list.add(present_startTimestamp);
    if (present_startTimestamp)
      list.add(startTimestamp);

    boolean present_readQPSQuota = true && (isSetReadQPSQuota());
    list.add(present_readQPSQuota);
    if (present_readQPSQuota)
      list.add(readQPSQuota);

    boolean present_attributeName = true && (isSetAttributeName());
    list.add(present_attributeName);
    if (present_attributeName)
      list.add(attributeName);

    boolean present_attributeValue = true && (isSetAttributeValue());
    list.add(present_attributeValue);
    if (present_attributeValue)
      list.add(attributeValue);

    boolean present_userAttributes = true && (isSetUserAttributes());
    list.add(present_userAttributes);
    if (present_userAttributes)
      list.add(userAttributes);

    return list.hashCode();
  }

  @Override
  public int compareTo(CreateTagRequest other) {
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
    lastComparison = Boolean.valueOf(isSetTagName()).compareTo(other.isSetTagName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTagName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.tagName, other.tagName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartTimestamp()).compareTo(other.isSetStartTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTimestamp()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.startTimestamp, other.startTimestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReadQPSQuota()).compareTo(other.isSetReadQPSQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReadQPSQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.readQPSQuota, other.readQPSQuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAttributeName()).compareTo(other.isSetAttributeName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributeName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.attributeName, other.attributeName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAttributeValue()).compareTo(other.isSetAttributeValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributeValue()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.attributeValue, other.attributeValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserAttributes()).compareTo(other.isSetUserAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserAttributes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.userAttributes, other.userAttributes);
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
    StringBuilder sb = new StringBuilder("CreateTagRequest(");
    boolean first = true;

    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tagName:");
    if (this.tagName == null) {
      sb.append("null");
    } else {
      sb.append(this.tagName);
    }
    first = false;
    if (isSetStartTimestamp()) {
      if (!first) sb.append(", ");
      sb.append("startTimestamp:");
      sb.append(this.startTimestamp);
      first = false;
    }
    if (isSetReadQPSQuota()) {
      if (!first) sb.append(", ");
      sb.append("readQPSQuota:");
      sb.append(this.readQPSQuota);
      first = false;
    }
    if (isSetAttributeName()) {
      if (!first) sb.append(", ");
      sb.append("attributeName:");
      if (this.attributeName == null) {
        sb.append("null");
      } else {
        sb.append(this.attributeName);
      }
      first = false;
    }
    if (isSetAttributeValue()) {
      if (!first) sb.append(", ");
      sb.append("attributeValue:");
      if (this.attributeValue == null) {
        sb.append("null");
      } else {
        sb.append(this.attributeValue);
      }
      first = false;
    }
    if (isSetUserAttributes()) {
      if (!first) sb.append(", ");
      sb.append("userAttributes:");
      if (this.userAttributes == null) {
        sb.append("null");
      } else {
        sb.append(this.userAttributes);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (queueName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'queueName' was not present! Struct: " + toString());
    }
    if (tagName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'tagName' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (attributeValue != null) {
      attributeValue.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CreateTagRequestStandardSchemeFactory implements SchemeFactory {
    public CreateTagRequestStandardScheme getScheme() {
      return new CreateTagRequestStandardScheme();
    }
  }

  private static class CreateTagRequestStandardScheme extends StandardScheme<CreateTagRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, CreateTagRequest struct) throws libthrift091.TException {
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
          case 2: // TAG_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.tagName = iprot.readString();
              struct.setTagNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // START_TIMESTAMP
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.startTimestamp = iprot.readI64();
              struct.setStartTimestampIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // READ_QPSQUOTA
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.readQPSQuota = iprot.readI64();
              struct.setReadQPSQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ATTRIBUTE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.attributeName = iprot.readString();
              struct.setAttributeNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ATTRIBUTE_VALUE
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.attributeValue = new com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute();
              struct.attributeValue.read(iprot);
              struct.setAttributeValueIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // USER_ATTRIBUTES
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map44 = iprot.readMapBegin();
                struct.userAttributes = new HashMap<String,String>(2*_map44.size);
                String _key45;
                String _val46;
                for (int _i47 = 0; _i47 < _map44.size; ++_i47)
                {
                  _key45 = iprot.readString();
                  _val46 = iprot.readString();
                  struct.userAttributes.put(_key45, _val46);
                }
                iprot.readMapEnd();
              }
              struct.setUserAttributesIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, CreateTagRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueName != null) {
        oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
        oprot.writeString(struct.queueName);
        oprot.writeFieldEnd();
      }
      if (struct.tagName != null) {
        oprot.writeFieldBegin(TAG_NAME_FIELD_DESC);
        oprot.writeString(struct.tagName);
        oprot.writeFieldEnd();
      }
      if (struct.isSetStartTimestamp()) {
        oprot.writeFieldBegin(START_TIMESTAMP_FIELD_DESC);
        oprot.writeI64(struct.startTimestamp);
        oprot.writeFieldEnd();
      }
      if (struct.isSetReadQPSQuota()) {
        oprot.writeFieldBegin(READ_QPSQUOTA_FIELD_DESC);
        oprot.writeI64(struct.readQPSQuota);
        oprot.writeFieldEnd();
      }
      if (struct.attributeName != null) {
        if (struct.isSetAttributeName()) {
          oprot.writeFieldBegin(ATTRIBUTE_NAME_FIELD_DESC);
          oprot.writeString(struct.attributeName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.attributeValue != null) {
        if (struct.isSetAttributeValue()) {
          oprot.writeFieldBegin(ATTRIBUTE_VALUE_FIELD_DESC);
          struct.attributeValue.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.userAttributes != null) {
        if (struct.isSetUserAttributes()) {
          oprot.writeFieldBegin(USER_ATTRIBUTES_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, struct.userAttributes.size()));
            for (Map.Entry<String, String> _iter48 : struct.userAttributes.entrySet())
            {
              oprot.writeString(_iter48.getKey());
              oprot.writeString(_iter48.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CreateTagRequestTupleSchemeFactory implements SchemeFactory {
    public CreateTagRequestTupleScheme getScheme() {
      return new CreateTagRequestTupleScheme();
    }
  }

  private static class CreateTagRequestTupleScheme extends TupleScheme<CreateTagRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, CreateTagRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.queueName);
      oprot.writeString(struct.tagName);
      BitSet optionals = new BitSet();
      if (struct.isSetStartTimestamp()) {
        optionals.set(0);
      }
      if (struct.isSetReadQPSQuota()) {
        optionals.set(1);
      }
      if (struct.isSetAttributeName()) {
        optionals.set(2);
      }
      if (struct.isSetAttributeValue()) {
        optionals.set(3);
      }
      if (struct.isSetUserAttributes()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetStartTimestamp()) {
        oprot.writeI64(struct.startTimestamp);
      }
      if (struct.isSetReadQPSQuota()) {
        oprot.writeI64(struct.readQPSQuota);
      }
      if (struct.isSetAttributeName()) {
        oprot.writeString(struct.attributeName);
      }
      if (struct.isSetAttributeValue()) {
        struct.attributeValue.write(oprot);
      }
      if (struct.isSetUserAttributes()) {
        {
          oprot.writeI32(struct.userAttributes.size());
          for (Map.Entry<String, String> _iter49 : struct.userAttributes.entrySet())
          {
            oprot.writeString(_iter49.getKey());
            oprot.writeString(_iter49.getValue());
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, CreateTagRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.queueName = iprot.readString();
      struct.setQueueNameIsSet(true);
      struct.tagName = iprot.readString();
      struct.setTagNameIsSet(true);
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.startTimestamp = iprot.readI64();
        struct.setStartTimestampIsSet(true);
      }
      if (incoming.get(1)) {
        struct.readQPSQuota = iprot.readI64();
        struct.setReadQPSQuotaIsSet(true);
      }
      if (incoming.get(2)) {
        struct.attributeName = iprot.readString();
        struct.setAttributeNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.attributeValue = new com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute();
        struct.attributeValue.read(iprot);
        struct.setAttributeValueIsSet(true);
      }
      if (incoming.get(4)) {
        {
          libthrift091.protocol.TMap _map50 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.userAttributes = new HashMap<String,String>(2*_map50.size);
          String _key51;
          String _val52;
          for (int _i53 = 0; _i53 < _map50.size; ++_i53)
          {
            _key51 = iprot.readString();
            _val52 = iprot.readString();
            struct.userAttributes.put(_key51, _val52);
          }
        }
        struct.setUserAttributesIsSet(true);
      }
    }
  }

}

