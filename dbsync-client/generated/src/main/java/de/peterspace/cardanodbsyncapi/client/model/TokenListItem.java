/*
 * Cardano DB-Sync API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.peterspace.cardanodbsyncapi.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TokenListItem
 */
@JsonPropertyOrder({
  TokenListItem.JSON_PROPERTY_MA_MINT_ID,
  TokenListItem.JSON_PROPERTY_SLOT_NO,
  TokenListItem.JSON_PROPERTY_MA_POLICY_ID,
  TokenListItem.JSON_PROPERTY_MA_NAME,
  TokenListItem.JSON_PROPERTY_MA_FINGERPRINT,
  TokenListItem.JSON_PROPERTY_QUANTITY,
  TokenListItem.JSON_PROPERTY_NAME,
  TokenListItem.JSON_PROPERTY_IMAGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-17T21:04:32.197294800+02:00[Europe/Berlin]")
public class TokenListItem {
  public static final String JSON_PROPERTY_MA_MINT_ID = "maMintId";
  private Long maMintId;

  public static final String JSON_PROPERTY_SLOT_NO = "slotNo";
  private Long slotNo;

  public static final String JSON_PROPERTY_MA_POLICY_ID = "maPolicyId";
  private String maPolicyId;

  public static final String JSON_PROPERTY_MA_NAME = "maName";
  private String maName;

  public static final String JSON_PROPERTY_MA_FINGERPRINT = "maFingerprint";
  private String maFingerprint;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Long quantity;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_IMAGE = "image";
  private String image;

  public TokenListItem() {
  }

  public TokenListItem maMintId(Long maMintId) {
    
    this.maMintId = maMintId;
    return this;
  }

   /**
   * Get maMintId
   * @return maMintId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MA_MINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaMintId() {
    return maMintId;
  }


  @JsonProperty(JSON_PROPERTY_MA_MINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaMintId(Long maMintId) {
    this.maMintId = maMintId;
  }


  public TokenListItem slotNo(Long slotNo) {
    
    this.slotNo = slotNo;
    return this;
  }

   /**
   * Get slotNo
   * @return slotNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLOT_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSlotNo() {
    return slotNo;
  }


  @JsonProperty(JSON_PROPERTY_SLOT_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlotNo(Long slotNo) {
    this.slotNo = slotNo;
  }


  public TokenListItem maPolicyId(String maPolicyId) {
    
    this.maPolicyId = maPolicyId;
    return this;
  }

   /**
   * Get maPolicyId
   * @return maPolicyId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MA_POLICY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaPolicyId() {
    return maPolicyId;
  }


  @JsonProperty(JSON_PROPERTY_MA_POLICY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaPolicyId(String maPolicyId) {
    this.maPolicyId = maPolicyId;
  }


  public TokenListItem maName(String maName) {
    
    this.maName = maName;
    return this;
  }

   /**
   * Get maName
   * @return maName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MA_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaName() {
    return maName;
  }


  @JsonProperty(JSON_PROPERTY_MA_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaName(String maName) {
    this.maName = maName;
  }


  public TokenListItem maFingerprint(String maFingerprint) {
    
    this.maFingerprint = maFingerprint;
    return this;
  }

   /**
   * Get maFingerprint
   * @return maFingerprint
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MA_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaFingerprint() {
    return maFingerprint;
  }


  @JsonProperty(JSON_PROPERTY_MA_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaFingerprint(String maFingerprint) {
    this.maFingerprint = maFingerprint;
  }


  public TokenListItem quantity(Long quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }


  public TokenListItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public TokenListItem image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getImage() {
    return image;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImage(String image) {
    this.image = image;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenListItem tokenListItem = (TokenListItem) o;
    return Objects.equals(this.maMintId, tokenListItem.maMintId) &&
        Objects.equals(this.slotNo, tokenListItem.slotNo) &&
        Objects.equals(this.maPolicyId, tokenListItem.maPolicyId) &&
        Objects.equals(this.maName, tokenListItem.maName) &&
        Objects.equals(this.maFingerprint, tokenListItem.maFingerprint) &&
        Objects.equals(this.quantity, tokenListItem.quantity) &&
        Objects.equals(this.name, tokenListItem.name) &&
        Objects.equals(this.image, tokenListItem.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maMintId, slotNo, maPolicyId, maName, maFingerprint, quantity, name, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenListItem {\n");
    sb.append("    maMintId: ").append(toIndentedString(maMintId)).append("\n");
    sb.append("    slotNo: ").append(toIndentedString(slotNo)).append("\n");
    sb.append("    maPolicyId: ").append(toIndentedString(maPolicyId)).append("\n");
    sb.append("    maName: ").append(toIndentedString(maName)).append("\n");
    sb.append("    maFingerprint: ").append(toIndentedString(maFingerprint)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

