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
 * Authorization头包含的内容
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-1-26")
public class HttpAuthorizationHeader implements libthrift091.TBase<HttpAuthorizationHeader, HttpAuthorizationHeader._Fields>, java.io.Serializable, Cloneable, Comparable<HttpAuthorizationHeader> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("HttpAuthorizationHeader");

  private static final libthrift091.protocol.TField VERSION_FIELD_DESC = new libthrift091.protocol.TField("version", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField USER_TYPE_FIELD_DESC = new libthrift091.protocol.TField("userType", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField SECRET_KEY_ID_FIELD_DESC = new libthrift091.protocol.TField("secretKeyId", libthrift091.protocol.TType.STRING, (short)3);
  private static final libthrift091.protocol.TField SECRET_KEY_FIELD_DESC = new libthrift091.protocol.TField("secretKey", libthrift091.protocol.TType.STRING, (short)4);
  private static final libthrift091.protocol.TField SIGNATURE_FIELD_DESC = new libthrift091.protocol.TField("signature", libthrift091.protocol.TType.STRING, (short)5);
  private static final libthrift091.protocol.TField ALGORITHM_FIELD_DESC = new libthrift091.protocol.TField("algorithm", libthrift091.protocol.TType.I32, (short)6);
  private static final libthrift091.protocol.TField SIGNED_HEADERS_FIELD_DESC = new libthrift091.protocol.TField("signedHeaders", libthrift091.protocol.TType.LIST, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HttpAuthorizationHeaderStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HttpAuthorizationHeaderTupleSchemeFactory());
  }

  public String version; // optional
  /**
   * 
   * @see UserType
   */
  public UserType userType; // optional
  public String secretKeyId; // optional
  /**
   * 直接使用sercetKey，此项被设置时，signature将被忽略，
   * 非安全传输应使用签名
   */
  public String secretKey; // optional
  /**
   * 如secretKey未设置，则认为使用签名，此时必须设置，
   * 被签名的正文格式：header1[\nheader2[\nheader3[...]]]，
   * 如使用默认SUGGESTED_SIGNATURE_HEADERS时为：$host\n$timestamp\n$md5
   */
  public String signature; // optional
  /**
   * 签名HMAC算法，客户端可定制，
   * 使用签名时必须设置
   * 
   * @see MacAlgorithm
   */
  public MacAlgorithm algorithm; // optional
  /**
   * 包含所有签名涉及到的部分，建议使用SUGGESTED_SIGNATURE_HEADERS，
   * 服务端未强制必须使用所列headers，定制的client自己负责签名的安全强度，
   * 使用签名时必须设置
   */
  public List<String> signedHeaders; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    VERSION((short)1, "version"),
    /**
     * 
     * @see UserType
     */
    USER_TYPE((short)2, "userType"),
    SECRET_KEY_ID((short)3, "secretKeyId"),
    /**
     * 直接使用sercetKey，此项被设置时，signature将被忽略，
     * 非安全传输应使用签名
     */
    SECRET_KEY((short)4, "secretKey"),
    /**
     * 如secretKey未设置，则认为使用签名，此时必须设置，
     * 被签名的正文格式：header1[\nheader2[\nheader3[...]]]，
     * 如使用默认SUGGESTED_SIGNATURE_HEADERS时为：$host\n$timestamp\n$md5
     */
    SIGNATURE((short)5, "signature"),
    /**
     * 签名HMAC算法，客户端可定制，
     * 使用签名时必须设置
     * 
     * @see MacAlgorithm
     */
    ALGORITHM((short)6, "algorithm"),
    /**
     * 包含所有签名涉及到的部分，建议使用SUGGESTED_SIGNATURE_HEADERS，
     * 服务端未强制必须使用所列headers，定制的client自己负责签名的安全强度，
     * 使用签名时必须设置
     */
    SIGNED_HEADERS((short)7, "signedHeaders");

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
        case 1: // VERSION
          return VERSION;
        case 2: // USER_TYPE
          return USER_TYPE;
        case 3: // SECRET_KEY_ID
          return SECRET_KEY_ID;
        case 4: // SECRET_KEY
          return SECRET_KEY;
        case 5: // SIGNATURE
          return SIGNATURE;
        case 6: // ALGORITHM
          return ALGORITHM;
        case 7: // SIGNED_HEADERS
          return SIGNED_HEADERS;
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
  private static final _Fields optionals[] = {_Fields.VERSION,_Fields.USER_TYPE,_Fields.SECRET_KEY_ID,_Fields.SECRET_KEY,_Fields.SIGNATURE,_Fields.ALGORITHM,_Fields.SIGNED_HEADERS};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new libthrift091.meta_data.FieldMetaData("version", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_TYPE, new libthrift091.meta_data.FieldMetaData("userType", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, UserType.class)));
    tmpMap.put(_Fields.SECRET_KEY_ID, new libthrift091.meta_data.FieldMetaData("secretKeyId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.SECRET_KEY, new libthrift091.meta_data.FieldMetaData("secretKey", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.SIGNATURE, new libthrift091.meta_data.FieldMetaData("signature", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.ALGORITHM, new libthrift091.meta_data.FieldMetaData("algorithm", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, MacAlgorithm.class)));
    tmpMap.put(_Fields.SIGNED_HEADERS, new libthrift091.meta_data.FieldMetaData("signedHeaders", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(HttpAuthorizationHeader.class, metaDataMap);
  }

  public HttpAuthorizationHeader() {
    this.version = "SDS-V1";

    this.userType = com.xiaomi.infra.galaxy.sds.thrift.UserType.APP_ANONYMOUS;

    this.signedHeaders = new ArrayList<String>();

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HttpAuthorizationHeader(HttpAuthorizationHeader other) {
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    if (other.isSetUserType()) {
      this.userType = other.userType;
    }
    if (other.isSetSecretKeyId()) {
      this.secretKeyId = other.secretKeyId;
    }
    if (other.isSetSecretKey()) {
      this.secretKey = other.secretKey;
    }
    if (other.isSetSignature()) {
      this.signature = other.signature;
    }
    if (other.isSetAlgorithm()) {
      this.algorithm = other.algorithm;
    }
    if (other.isSetSignedHeaders()) {
      List<String> __this__signedHeaders = new ArrayList<String>(other.signedHeaders);
      this.signedHeaders = __this__signedHeaders;
    }
  }

  public HttpAuthorizationHeader deepCopy() {
    return new HttpAuthorizationHeader(this);
  }

  @Override
  public void clear() {
    this.version = "SDS-V1";

    this.userType = com.xiaomi.infra.galaxy.sds.thrift.UserType.APP_ANONYMOUS;

    this.secretKeyId = null;
    this.secretKey = null;
    this.signature = null;
    this.algorithm = null;
    this.signedHeaders = new ArrayList<String>();

  }

  public String getVersion() {
    return this.version;
  }

  public HttpAuthorizationHeader setVersion(String version) {
    this.version = version;
    return this;
  }

  public void unsetVersion() {
    this.version = null;
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return this.version != null;
  }

  public void setVersionIsSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  /**
   * 
   * @see UserType
   */
  public UserType getUserType() {
    return this.userType;
  }

  /**
   * 
   * @see UserType
   */
  public HttpAuthorizationHeader setUserType(UserType userType) {
    this.userType = userType;
    return this;
  }

  public void unsetUserType() {
    this.userType = null;
  }

  /** Returns true if field userType is set (has been assigned a value) and false otherwise */
  public boolean isSetUserType() {
    return this.userType != null;
  }

  public void setUserTypeIsSet(boolean value) {
    if (!value) {
      this.userType = null;
    }
  }

  public String getSecretKeyId() {
    return this.secretKeyId;
  }

  public HttpAuthorizationHeader setSecretKeyId(String secretKeyId) {
    this.secretKeyId = secretKeyId;
    return this;
  }

  public void unsetSecretKeyId() {
    this.secretKeyId = null;
  }

  /** Returns true if field secretKeyId is set (has been assigned a value) and false otherwise */
  public boolean isSetSecretKeyId() {
    return this.secretKeyId != null;
  }

  public void setSecretKeyIdIsSet(boolean value) {
    if (!value) {
      this.secretKeyId = null;
    }
  }

  /**
   * 直接使用sercetKey，此项被设置时，signature将被忽略，
   * 非安全传输应使用签名
   */
  public String getSecretKey() {
    return this.secretKey;
  }

  /**
   * 直接使用sercetKey，此项被设置时，signature将被忽略，
   * 非安全传输应使用签名
   */
  public HttpAuthorizationHeader setSecretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

  public void unsetSecretKey() {
    this.secretKey = null;
  }

  /** Returns true if field secretKey is set (has been assigned a value) and false otherwise */
  public boolean isSetSecretKey() {
    return this.secretKey != null;
  }

  public void setSecretKeyIsSet(boolean value) {
    if (!value) {
      this.secretKey = null;
    }
  }

  /**
   * 如secretKey未设置，则认为使用签名，此时必须设置，
   * 被签名的正文格式：header1[\nheader2[\nheader3[...]]]，
   * 如使用默认SUGGESTED_SIGNATURE_HEADERS时为：$host\n$timestamp\n$md5
   */
  public String getSignature() {
    return this.signature;
  }

  /**
   * 如secretKey未设置，则认为使用签名，此时必须设置，
   * 被签名的正文格式：header1[\nheader2[\nheader3[...]]]，
   * 如使用默认SUGGESTED_SIGNATURE_HEADERS时为：$host\n$timestamp\n$md5
   */
  public HttpAuthorizationHeader setSignature(String signature) {
    this.signature = signature;
    return this;
  }

  public void unsetSignature() {
    this.signature = null;
  }

  /** Returns true if field signature is set (has been assigned a value) and false otherwise */
  public boolean isSetSignature() {
    return this.signature != null;
  }

  public void setSignatureIsSet(boolean value) {
    if (!value) {
      this.signature = null;
    }
  }

  /**
   * 签名HMAC算法，客户端可定制，
   * 使用签名时必须设置
   * 
   * @see MacAlgorithm
   */
  public MacAlgorithm getAlgorithm() {
    return this.algorithm;
  }

  /**
   * 签名HMAC算法，客户端可定制，
   * 使用签名时必须设置
   * 
   * @see MacAlgorithm
   */
  public HttpAuthorizationHeader setAlgorithm(MacAlgorithm algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  public void unsetAlgorithm() {
    this.algorithm = null;
  }

  /** Returns true if field algorithm is set (has been assigned a value) and false otherwise */
  public boolean isSetAlgorithm() {
    return this.algorithm != null;
  }

  public void setAlgorithmIsSet(boolean value) {
    if (!value) {
      this.algorithm = null;
    }
  }

  public int getSignedHeadersSize() {
    return (this.signedHeaders == null) ? 0 : this.signedHeaders.size();
  }

  public java.util.Iterator<String> getSignedHeadersIterator() {
    return (this.signedHeaders == null) ? null : this.signedHeaders.iterator();
  }

  public void addToSignedHeaders(String elem) {
    if (this.signedHeaders == null) {
      this.signedHeaders = new ArrayList<String>();
    }
    this.signedHeaders.add(elem);
  }

  /**
   * 包含所有签名涉及到的部分，建议使用SUGGESTED_SIGNATURE_HEADERS，
   * 服务端未强制必须使用所列headers，定制的client自己负责签名的安全强度，
   * 使用签名时必须设置
   */
  public List<String> getSignedHeaders() {
    return this.signedHeaders;
  }

  /**
   * 包含所有签名涉及到的部分，建议使用SUGGESTED_SIGNATURE_HEADERS，
   * 服务端未强制必须使用所列headers，定制的client自己负责签名的安全强度，
   * 使用签名时必须设置
   */
  public HttpAuthorizationHeader setSignedHeaders(List<String> signedHeaders) {
    this.signedHeaders = signedHeaders;
    return this;
  }

  public void unsetSignedHeaders() {
    this.signedHeaders = null;
  }

  /** Returns true if field signedHeaders is set (has been assigned a value) and false otherwise */
  public boolean isSetSignedHeaders() {
    return this.signedHeaders != null;
  }

  public void setSignedHeadersIsSet(boolean value) {
    if (!value) {
      this.signedHeaders = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((String)value);
      }
      break;

    case USER_TYPE:
      if (value == null) {
        unsetUserType();
      } else {
        setUserType((UserType)value);
      }
      break;

    case SECRET_KEY_ID:
      if (value == null) {
        unsetSecretKeyId();
      } else {
        setSecretKeyId((String)value);
      }
      break;

    case SECRET_KEY:
      if (value == null) {
        unsetSecretKey();
      } else {
        setSecretKey((String)value);
      }
      break;

    case SIGNATURE:
      if (value == null) {
        unsetSignature();
      } else {
        setSignature((String)value);
      }
      break;

    case ALGORITHM:
      if (value == null) {
        unsetAlgorithm();
      } else {
        setAlgorithm((MacAlgorithm)value);
      }
      break;

    case SIGNED_HEADERS:
      if (value == null) {
        unsetSignedHeaders();
      } else {
        setSignedHeaders((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return getVersion();

    case USER_TYPE:
      return getUserType();

    case SECRET_KEY_ID:
      return getSecretKeyId();

    case SECRET_KEY:
      return getSecretKey();

    case SIGNATURE:
      return getSignature();

    case ALGORITHM:
      return getAlgorithm();

    case SIGNED_HEADERS:
      return getSignedHeaders();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VERSION:
      return isSetVersion();
    case USER_TYPE:
      return isSetUserType();
    case SECRET_KEY_ID:
      return isSetSecretKeyId();
    case SECRET_KEY:
      return isSetSecretKey();
    case SIGNATURE:
      return isSetSignature();
    case ALGORITHM:
      return isSetAlgorithm();
    case SIGNED_HEADERS:
      return isSetSignedHeaders();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HttpAuthorizationHeader)
      return this.equals((HttpAuthorizationHeader)that);
    return false;
  }

  public boolean equals(HttpAuthorizationHeader that) {
    if (that == null)
      return false;

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    boolean this_present_userType = true && this.isSetUserType();
    boolean that_present_userType = true && that.isSetUserType();
    if (this_present_userType || that_present_userType) {
      if (!(this_present_userType && that_present_userType))
        return false;
      if (!this.userType.equals(that.userType))
        return false;
    }

    boolean this_present_secretKeyId = true && this.isSetSecretKeyId();
    boolean that_present_secretKeyId = true && that.isSetSecretKeyId();
    if (this_present_secretKeyId || that_present_secretKeyId) {
      if (!(this_present_secretKeyId && that_present_secretKeyId))
        return false;
      if (!this.secretKeyId.equals(that.secretKeyId))
        return false;
    }

    boolean this_present_secretKey = true && this.isSetSecretKey();
    boolean that_present_secretKey = true && that.isSetSecretKey();
    if (this_present_secretKey || that_present_secretKey) {
      if (!(this_present_secretKey && that_present_secretKey))
        return false;
      if (!this.secretKey.equals(that.secretKey))
        return false;
    }

    boolean this_present_signature = true && this.isSetSignature();
    boolean that_present_signature = true && that.isSetSignature();
    if (this_present_signature || that_present_signature) {
      if (!(this_present_signature && that_present_signature))
        return false;
      if (!this.signature.equals(that.signature))
        return false;
    }

    boolean this_present_algorithm = true && this.isSetAlgorithm();
    boolean that_present_algorithm = true && that.isSetAlgorithm();
    if (this_present_algorithm || that_present_algorithm) {
      if (!(this_present_algorithm && that_present_algorithm))
        return false;
      if (!this.algorithm.equals(that.algorithm))
        return false;
    }

    boolean this_present_signedHeaders = true && this.isSetSignedHeaders();
    boolean that_present_signedHeaders = true && that.isSetSignedHeaders();
    if (this_present_signedHeaders || that_present_signedHeaders) {
      if (!(this_present_signedHeaders && that_present_signedHeaders))
        return false;
      if (!this.signedHeaders.equals(that.signedHeaders))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_version = true && (isSetVersion());
    list.add(present_version);
    if (present_version)
      list.add(version);

    boolean present_userType = true && (isSetUserType());
    list.add(present_userType);
    if (present_userType)
      list.add(userType.getValue());

    boolean present_secretKeyId = true && (isSetSecretKeyId());
    list.add(present_secretKeyId);
    if (present_secretKeyId)
      list.add(secretKeyId);

    boolean present_secretKey = true && (isSetSecretKey());
    list.add(present_secretKey);
    if (present_secretKey)
      list.add(secretKey);

    boolean present_signature = true && (isSetSignature());
    list.add(present_signature);
    if (present_signature)
      list.add(signature);

    boolean present_algorithm = true && (isSetAlgorithm());
    list.add(present_algorithm);
    if (present_algorithm)
      list.add(algorithm.getValue());

    boolean present_signedHeaders = true && (isSetSignedHeaders());
    list.add(present_signedHeaders);
    if (present_signedHeaders)
      list.add(signedHeaders);

    return list.hashCode();
  }

  @Override
  public int compareTo(HttpAuthorizationHeader other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetUserType()).compareTo(other.isSetUserType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserType()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.userType, other.userType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSecretKeyId()).compareTo(other.isSetSecretKeyId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecretKeyId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.secretKeyId, other.secretKeyId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSecretKey()).compareTo(other.isSetSecretKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecretKey()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.secretKey, other.secretKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSignature()).compareTo(other.isSetSignature());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSignature()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.signature, other.signature);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAlgorithm()).compareTo(other.isSetAlgorithm());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlgorithm()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.algorithm, other.algorithm);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSignedHeaders()).compareTo(other.isSetSignedHeaders());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSignedHeaders()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.signedHeaders, other.signedHeaders);
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
    StringBuilder sb = new StringBuilder("HttpAuthorizationHeader(");
    boolean first = true;

    if (isSetVersion()) {
      sb.append("version:");
      if (this.version == null) {
        sb.append("null");
      } else {
        sb.append(this.version);
      }
      first = false;
    }
    if (isSetUserType()) {
      if (!first) sb.append(", ");
      sb.append("userType:");
      if (this.userType == null) {
        sb.append("null");
      } else {
        sb.append(this.userType);
      }
      first = false;
    }
    if (isSetSecretKeyId()) {
      if (!first) sb.append(", ");
      sb.append("secretKeyId:");
      if (this.secretKeyId == null) {
        sb.append("null");
      } else {
        sb.append(this.secretKeyId);
      }
      first = false;
    }
    if (isSetSecretKey()) {
      if (!first) sb.append(", ");
      sb.append("secretKey:");
      if (this.secretKey == null) {
        sb.append("null");
      } else {
        sb.append(this.secretKey);
      }
      first = false;
    }
    if (isSetSignature()) {
      if (!first) sb.append(", ");
      sb.append("signature:");
      if (this.signature == null) {
        sb.append("null");
      } else {
        sb.append(this.signature);
      }
      first = false;
    }
    if (isSetAlgorithm()) {
      if (!first) sb.append(", ");
      sb.append("algorithm:");
      if (this.algorithm == null) {
        sb.append("null");
      } else {
        sb.append(this.algorithm);
      }
      first = false;
    }
    if (isSetSignedHeaders()) {
      if (!first) sb.append(", ");
      sb.append("signedHeaders:");
      if (this.signedHeaders == null) {
        sb.append("null");
      } else {
        sb.append(this.signedHeaders);
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HttpAuthorizationHeaderStandardSchemeFactory implements SchemeFactory {
    public HttpAuthorizationHeaderStandardScheme getScheme() {
      return new HttpAuthorizationHeaderStandardScheme();
    }
  }

  private static class HttpAuthorizationHeaderStandardScheme extends StandardScheme<HttpAuthorizationHeader> {

    public void read(libthrift091.protocol.TProtocol iprot, HttpAuthorizationHeader struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VERSION
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.version = iprot.readString();
              struct.setVersionIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_TYPE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.userType = com.xiaomi.infra.galaxy.sds.thrift.UserType.findByValue(iprot.readI32());
              struct.setUserTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SECRET_KEY_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.secretKeyId = iprot.readString();
              struct.setSecretKeyIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SECRET_KEY
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.secretKey = iprot.readString();
              struct.setSecretKeyIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SIGNATURE
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.signature = iprot.readString();
              struct.setSignatureIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ALGORITHM
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.algorithm = com.xiaomi.infra.galaxy.sds.thrift.MacAlgorithm.findByValue(iprot.readI32());
              struct.setAlgorithmIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // SIGNED_HEADERS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list0 = iprot.readListBegin();
                struct.signedHeaders = new ArrayList<String>(_list0.size);
                String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.signedHeaders.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setSignedHeadersIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, HttpAuthorizationHeader struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.version != null) {
        if (struct.isSetVersion()) {
          oprot.writeFieldBegin(VERSION_FIELD_DESC);
          oprot.writeString(struct.version);
          oprot.writeFieldEnd();
        }
      }
      if (struct.userType != null) {
        if (struct.isSetUserType()) {
          oprot.writeFieldBegin(USER_TYPE_FIELD_DESC);
          oprot.writeI32(struct.userType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.secretKeyId != null) {
        if (struct.isSetSecretKeyId()) {
          oprot.writeFieldBegin(SECRET_KEY_ID_FIELD_DESC);
          oprot.writeString(struct.secretKeyId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.secretKey != null) {
        if (struct.isSetSecretKey()) {
          oprot.writeFieldBegin(SECRET_KEY_FIELD_DESC);
          oprot.writeString(struct.secretKey);
          oprot.writeFieldEnd();
        }
      }
      if (struct.signature != null) {
        if (struct.isSetSignature()) {
          oprot.writeFieldBegin(SIGNATURE_FIELD_DESC);
          oprot.writeString(struct.signature);
          oprot.writeFieldEnd();
        }
      }
      if (struct.algorithm != null) {
        if (struct.isSetAlgorithm()) {
          oprot.writeFieldBegin(ALGORITHM_FIELD_DESC);
          oprot.writeI32(struct.algorithm.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.signedHeaders != null) {
        if (struct.isSetSignedHeaders()) {
          oprot.writeFieldBegin(SIGNED_HEADERS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, struct.signedHeaders.size()));
            for (String _iter3 : struct.signedHeaders)
            {
              oprot.writeString(_iter3);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HttpAuthorizationHeaderTupleSchemeFactory implements SchemeFactory {
    public HttpAuthorizationHeaderTupleScheme getScheme() {
      return new HttpAuthorizationHeaderTupleScheme();
    }
  }

  private static class HttpAuthorizationHeaderTupleScheme extends TupleScheme<HttpAuthorizationHeader> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, HttpAuthorizationHeader struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetVersion()) {
        optionals.set(0);
      }
      if (struct.isSetUserType()) {
        optionals.set(1);
      }
      if (struct.isSetSecretKeyId()) {
        optionals.set(2);
      }
      if (struct.isSetSecretKey()) {
        optionals.set(3);
      }
      if (struct.isSetSignature()) {
        optionals.set(4);
      }
      if (struct.isSetAlgorithm()) {
        optionals.set(5);
      }
      if (struct.isSetSignedHeaders()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetVersion()) {
        oprot.writeString(struct.version);
      }
      if (struct.isSetUserType()) {
        oprot.writeI32(struct.userType.getValue());
      }
      if (struct.isSetSecretKeyId()) {
        oprot.writeString(struct.secretKeyId);
      }
      if (struct.isSetSecretKey()) {
        oprot.writeString(struct.secretKey);
      }
      if (struct.isSetSignature()) {
        oprot.writeString(struct.signature);
      }
      if (struct.isSetAlgorithm()) {
        oprot.writeI32(struct.algorithm.getValue());
      }
      if (struct.isSetSignedHeaders()) {
        {
          oprot.writeI32(struct.signedHeaders.size());
          for (String _iter4 : struct.signedHeaders)
          {
            oprot.writeString(_iter4);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, HttpAuthorizationHeader struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.version = iprot.readString();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.userType = com.xiaomi.infra.galaxy.sds.thrift.UserType.findByValue(iprot.readI32());
        struct.setUserTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.secretKeyId = iprot.readString();
        struct.setSecretKeyIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.secretKey = iprot.readString();
        struct.setSecretKeyIsSet(true);
      }
      if (incoming.get(4)) {
        struct.signature = iprot.readString();
        struct.setSignatureIsSet(true);
      }
      if (incoming.get(5)) {
        struct.algorithm = com.xiaomi.infra.galaxy.sds.thrift.MacAlgorithm.findByValue(iprot.readI32());
        struct.setAlgorithmIsSet(true);
      }
      if (incoming.get(6)) {
        {
          libthrift091.protocol.TList _list5 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.signedHeaders = new ArrayList<String>(_list5.size);
          String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.signedHeaders.add(_elem6);
          }
        }
        struct.setSignedHeadersIsSet(true);
      }
    }
  }

}

