/*
 * Login API
 * API description for Login method in Markdown.
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UserLoginApiForm
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-13T20:05:00.198+02:00")
public class UserLoginApiForm {
  @SerializedName("gaId")
  private String gaId = null;

  @SerializedName("adId")
  private String adId = null;

  @SerializedName("apnId")
  private String apnId = null;

  @SerializedName("gcmId")
  private String gcmId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("phoneCc")
  private String phoneCc = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("authcode")
  private String authcode = null;

  public UserLoginApiForm gaId(String gaId) {
    this.gaId = gaId;
    return this;
  }

   /**
   * Get gaId
   * @return gaId
  **/
  @ApiModelProperty(value = "")
  public String getGaId() {
    return gaId;
  }

  public void setGaId(String gaId) {
    this.gaId = gaId;
  }

  public UserLoginApiForm adId(String adId) {
    this.adId = adId;
    return this;
  }

   /**
   * Get adId
   * @return adId
  **/
  @ApiModelProperty(value = "")
  public String getAdId() {
    return adId;
  }

  public void setAdId(String adId) {
    this.adId = adId;
  }

  public UserLoginApiForm apnId(String apnId) {
    this.apnId = apnId;
    return this;
  }

   /**
   * Get apnId
   * @return apnId
  **/
  @ApiModelProperty(value = "")
  public String getApnId() {
    return apnId;
  }

  public void setApnId(String apnId) {
    this.apnId = apnId;
  }

  public UserLoginApiForm gcmId(String gcmId) {
    this.gcmId = gcmId;
    return this;
  }

   /**
   * Get gcmId
   * @return gcmId
  **/
  @ApiModelProperty(value = "")
  public String getGcmId() {
    return gcmId;
  }

  public void setGcmId(String gcmId) {
    this.gcmId = gcmId;
  }

  public UserLoginApiForm name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserLoginApiForm password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserLoginApiForm phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UserLoginApiForm phoneCc(String phoneCc) {
    this.phoneCc = phoneCc;
    return this;
  }

   /**
   * Get phoneCc
   * @return phoneCc
  **/
  @ApiModelProperty(value = "")
  public String getPhoneCc() {
    return phoneCc;
  }

  public void setPhoneCc(String phoneCc) {
    this.phoneCc = phoneCc;
  }

  public UserLoginApiForm uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public UserLoginApiForm authcode(String authcode) {
    this.authcode = authcode;
    return this;
  }

   /**
   * Get authcode
   * @return authcode
  **/
  @ApiModelProperty(value = "")
  public String getAuthcode() {
    return authcode;
  }

  public void setAuthcode(String authcode) {
    this.authcode = authcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLoginApiForm userLoginApiForm = (UserLoginApiForm) o;
    return Objects.equals(this.gaId, userLoginApiForm.gaId) &&
        Objects.equals(this.adId, userLoginApiForm.adId) &&
        Objects.equals(this.apnId, userLoginApiForm.apnId) &&
        Objects.equals(this.gcmId, userLoginApiForm.gcmId) &&
        Objects.equals(this.name, userLoginApiForm.name) &&
        Objects.equals(this.password, userLoginApiForm.password) &&
        Objects.equals(this.phone, userLoginApiForm.phone) &&
        Objects.equals(this.phoneCc, userLoginApiForm.phoneCc) &&
        Objects.equals(this.uuid, userLoginApiForm.uuid) &&
        Objects.equals(this.authcode, userLoginApiForm.authcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gaId, adId, apnId, gcmId, name, password, phone, phoneCc, uuid, authcode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLoginApiForm {\n");
    
    sb.append("    gaId: ").append(toIndentedString(gaId)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    apnId: ").append(toIndentedString(apnId)).append("\n");
    sb.append("    gcmId: ").append(toIndentedString(gcmId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneCc: ").append(toIndentedString(phoneCc)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    authcode: ").append(toIndentedString(authcode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

