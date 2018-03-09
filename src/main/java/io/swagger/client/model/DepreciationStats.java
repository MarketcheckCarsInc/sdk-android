/**
 * Marketcheck Cars API
 * <b>Access the New, Used and Certified cars inventories for all Car Dealers in US.</b> <br/>The data is sourced from online listings by over 44,000 Car dealers in US. At any time, there are about 6.2M searchable listings (about 1.9M unique VINs) for Used & Certified cars and about 6.6M (about 3.9M unique VINs) New Car listings from all over US. We use this API at the back for our website <a href='https://www.marketcheck.com' target='_blank'>www.marketcheck.com</a> and our Android and iOS mobile apps too.<br/><h5> Few useful links : </h5><ul><li>A quick view of the API and the use cases is depicated <a href='https://portals.marketcheck.com/mcapi/' target='_blank'>here</a></li><li>The Postman collection with various usages of the API is shared here https://www.getpostman.com/collections/2752684ff636cdd7bac2</li></ul>
 *
 * OpenAPI spec version: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class DepreciationStats {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("current_value")
  private BigDecimal currentValue = null;
  @SerializedName("one_year_from_now")
  private BigDecimal oneYearFromNow = null;
  @SerializedName("one_year_from_now_percent")
  private BigDecimal oneYearFromNowPercent = null;
  @SerializedName("two_year_from_now")
  private BigDecimal twoYearFromNow = null;
  @SerializedName("two_year_from_now_percent")
  private BigDecimal twoYearFromNowPercent = null;
  @SerializedName("five_year_from_now")
  private BigDecimal fiveYearFromNow = null;
  @SerializedName("five_year_from_now_percent")
  private BigDecimal fiveYearFromNowPercent = null;

  /**
   * ymm_comb_name
   **/
  @ApiModelProperty(value = "ymm_comb_name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Price of year make model combination
   **/
  @ApiModelProperty(value = "Price of year make model combination")
  public BigDecimal getCurrentValue() {
    return currentValue;
  }
  public void setCurrentValue(BigDecimal currentValue) {
    this.currentValue = currentValue;
  }

  /**
   * price after one year from now
   **/
  @ApiModelProperty(value = "price after one year from now")
  public BigDecimal getOneYearFromNow() {
    return oneYearFromNow;
  }
  public void setOneYearFromNow(BigDecimal oneYearFromNow) {
    this.oneYearFromNow = oneYearFromNow;
  }

  /**
   * price depreciation percent after one year from now
   **/
  @ApiModelProperty(value = "price depreciation percent after one year from now")
  public BigDecimal getOneYearFromNowPercent() {
    return oneYearFromNowPercent;
  }
  public void setOneYearFromNowPercent(BigDecimal oneYearFromNowPercent) {
    this.oneYearFromNowPercent = oneYearFromNowPercent;
  }

  /**
   * price after two year from now
   **/
  @ApiModelProperty(value = "price after two year from now")
  public BigDecimal getTwoYearFromNow() {
    return twoYearFromNow;
  }
  public void setTwoYearFromNow(BigDecimal twoYearFromNow) {
    this.twoYearFromNow = twoYearFromNow;
  }

  /**
   * price depreciation percent after two year from now
   **/
  @ApiModelProperty(value = "price depreciation percent after two year from now")
  public BigDecimal getTwoYearFromNowPercent() {
    return twoYearFromNowPercent;
  }
  public void setTwoYearFromNowPercent(BigDecimal twoYearFromNowPercent) {
    this.twoYearFromNowPercent = twoYearFromNowPercent;
  }

  /**
   * price after five year from now
   **/
  @ApiModelProperty(value = "price after five year from now")
  public BigDecimal getFiveYearFromNow() {
    return fiveYearFromNow;
  }
  public void setFiveYearFromNow(BigDecimal fiveYearFromNow) {
    this.fiveYearFromNow = fiveYearFromNow;
  }

  /**
   * price depreciation percent after five year from now
   **/
  @ApiModelProperty(value = "price depreciation percent after five year from now")
  public BigDecimal getFiveYearFromNowPercent() {
    return fiveYearFromNowPercent;
  }
  public void setFiveYearFromNowPercent(BigDecimal fiveYearFromNowPercent) {
    this.fiveYearFromNowPercent = fiveYearFromNowPercent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepreciationStats depreciationStats = (DepreciationStats) o;
    return (this.name == null ? depreciationStats.name == null : this.name.equals(depreciationStats.name)) &&
        (this.currentValue == null ? depreciationStats.currentValue == null : this.currentValue.equals(depreciationStats.currentValue)) &&
        (this.oneYearFromNow == null ? depreciationStats.oneYearFromNow == null : this.oneYearFromNow.equals(depreciationStats.oneYearFromNow)) &&
        (this.oneYearFromNowPercent == null ? depreciationStats.oneYearFromNowPercent == null : this.oneYearFromNowPercent.equals(depreciationStats.oneYearFromNowPercent)) &&
        (this.twoYearFromNow == null ? depreciationStats.twoYearFromNow == null : this.twoYearFromNow.equals(depreciationStats.twoYearFromNow)) &&
        (this.twoYearFromNowPercent == null ? depreciationStats.twoYearFromNowPercent == null : this.twoYearFromNowPercent.equals(depreciationStats.twoYearFromNowPercent)) &&
        (this.fiveYearFromNow == null ? depreciationStats.fiveYearFromNow == null : this.fiveYearFromNow.equals(depreciationStats.fiveYearFromNow)) &&
        (this.fiveYearFromNowPercent == null ? depreciationStats.fiveYearFromNowPercent == null : this.fiveYearFromNowPercent.equals(depreciationStats.fiveYearFromNowPercent));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.currentValue == null ? 0: this.currentValue.hashCode());
    result = 31 * result + (this.oneYearFromNow == null ? 0: this.oneYearFromNow.hashCode());
    result = 31 * result + (this.oneYearFromNowPercent == null ? 0: this.oneYearFromNowPercent.hashCode());
    result = 31 * result + (this.twoYearFromNow == null ? 0: this.twoYearFromNow.hashCode());
    result = 31 * result + (this.twoYearFromNowPercent == null ? 0: this.twoYearFromNowPercent.hashCode());
    result = 31 * result + (this.fiveYearFromNow == null ? 0: this.fiveYearFromNow.hashCode());
    result = 31 * result + (this.fiveYearFromNowPercent == null ? 0: this.fiveYearFromNowPercent.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepreciationStats {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  currentValue: ").append(currentValue).append("\n");
    sb.append("  oneYearFromNow: ").append(oneYearFromNow).append("\n");
    sb.append("  oneYearFromNowPercent: ").append(oneYearFromNowPercent).append("\n");
    sb.append("  twoYearFromNow: ").append(twoYearFromNow).append("\n");
    sb.append("  twoYearFromNowPercent: ").append(twoYearFromNowPercent).append("\n");
    sb.append("  fiveYearFromNow: ").append(fiveYearFromNow).append("\n");
    sb.append("  fiveYearFromNowPercent: ").append(fiveYearFromNowPercent).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}