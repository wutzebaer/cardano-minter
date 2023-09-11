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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * StakeInfo
 */
@JsonPropertyOrder({
  StakeInfo.JSON_PROPERTY_STAKE,
  StakeInfo.JSON_PROPERTY_POOL_HASH,
  StakeInfo.JSON_PROPERTY_TICKER_NAME,
  StakeInfo.JSON_PROPERTY_TOTAL_STAKE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-11T14:43:30.463313100+02:00[Europe/Berlin]")
public class StakeInfo {
  public static final String JSON_PROPERTY_STAKE = "stake";
  private Long stake;

  public static final String JSON_PROPERTY_POOL_HASH = "poolHash";
  private String poolHash;

  public static final String JSON_PROPERTY_TICKER_NAME = "tickerName";
  private String tickerName;

  public static final String JSON_PROPERTY_TOTAL_STAKE = "totalStake";
  private Long totalStake;

  public StakeInfo() {
  }

  public StakeInfo stake(Long stake) {
    
    this.stake = stake;
    return this;
  }

   /**
   * Get stake
   * @return stake
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStake() {
    return stake;
  }


  @JsonProperty(JSON_PROPERTY_STAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStake(Long stake) {
    this.stake = stake;
  }


  public StakeInfo poolHash(String poolHash) {
    
    this.poolHash = poolHash;
    return this;
  }

   /**
   * Get poolHash
   * @return poolHash
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POOL_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPoolHash() {
    return poolHash;
  }


  @JsonProperty(JSON_PROPERTY_POOL_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoolHash(String poolHash) {
    this.poolHash = poolHash;
  }


  public StakeInfo tickerName(String tickerName) {
    
    this.tickerName = tickerName;
    return this;
  }

   /**
   * Get tickerName
   * @return tickerName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TICKER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTickerName() {
    return tickerName;
  }


  @JsonProperty(JSON_PROPERTY_TICKER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTickerName(String tickerName) {
    this.tickerName = tickerName;
  }


  public StakeInfo totalStake(Long totalStake) {
    
    this.totalStake = totalStake;
    return this;
  }

   /**
   * Get totalStake
   * @return totalStake
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_STAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalStake() {
    return totalStake;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_STAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalStake(Long totalStake) {
    this.totalStake = totalStake;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StakeInfo stakeInfo = (StakeInfo) o;
    return Objects.equals(this.stake, stakeInfo.stake) &&
        Objects.equals(this.poolHash, stakeInfo.poolHash) &&
        Objects.equals(this.tickerName, stakeInfo.tickerName) &&
        Objects.equals(this.totalStake, stakeInfo.totalStake);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stake, poolHash, tickerName, totalStake);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StakeInfo {\n");
    sb.append("    stake: ").append(toIndentedString(stake)).append("\n");
    sb.append("    poolHash: ").append(toIndentedString(poolHash)).append("\n");
    sb.append("    tickerName: ").append(toIndentedString(tickerName)).append("\n");
    sb.append("    totalStake: ").append(toIndentedString(totalStake)).append("\n");
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

