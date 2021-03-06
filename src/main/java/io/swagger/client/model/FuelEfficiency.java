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
public class FuelEfficiency {
  
  @SerializedName("city_mileage")
  private String cityMileage = null;
  @SerializedName("highway_mileage")
  private String highwayMileage = null;
  @SerializedName("combined_mileage")
  private String combinedMileage = null;
  @SerializedName("annual_miles")
  private BigDecimal annualMiles = null;
  @SerializedName("monthly_fuel_expense")
  private BigDecimal monthlyFuelExpense = null;

  /**
   * City Mileage in MPG
   **/
  @ApiModelProperty(value = "City Mileage in MPG")
  public String getCityMileage() {
    return cityMileage;
  }
  public void setCityMileage(String cityMileage) {
    this.cityMileage = cityMileage;
  }

  /**
   * Highway Mileage in MPG
   **/
  @ApiModelProperty(value = "Highway Mileage in MPG")
  public String getHighwayMileage() {
    return highwayMileage;
  }
  public void setHighwayMileage(String highwayMileage) {
    this.highwayMileage = highwayMileage;
  }

  /**
   * Combined Mileage
   **/
  @ApiModelProperty(value = "Combined Mileage")
  public String getCombinedMileage() {
    return combinedMileage;
  }
  public void setCombinedMileage(String combinedMileage) {
    this.combinedMileage = combinedMileage;
  }

  /**
   * Annual Miles of Car
   **/
  @ApiModelProperty(value = "Annual Miles of Car")
  public BigDecimal getAnnualMiles() {
    return annualMiles;
  }
  public void setAnnualMiles(BigDecimal annualMiles) {
    this.annualMiles = annualMiles;
  }

  /**
   * Monthly fuel expense
   **/
  @ApiModelProperty(value = "Monthly fuel expense")
  public BigDecimal getMonthlyFuelExpense() {
    return monthlyFuelExpense;
  }
  public void setMonthlyFuelExpense(BigDecimal monthlyFuelExpense) {
    this.monthlyFuelExpense = monthlyFuelExpense;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FuelEfficiency fuelEfficiency = (FuelEfficiency) o;
    return (this.cityMileage == null ? fuelEfficiency.cityMileage == null : this.cityMileage.equals(fuelEfficiency.cityMileage)) &&
        (this.highwayMileage == null ? fuelEfficiency.highwayMileage == null : this.highwayMileage.equals(fuelEfficiency.highwayMileage)) &&
        (this.combinedMileage == null ? fuelEfficiency.combinedMileage == null : this.combinedMileage.equals(fuelEfficiency.combinedMileage)) &&
        (this.annualMiles == null ? fuelEfficiency.annualMiles == null : this.annualMiles.equals(fuelEfficiency.annualMiles)) &&
        (this.monthlyFuelExpense == null ? fuelEfficiency.monthlyFuelExpense == null : this.monthlyFuelExpense.equals(fuelEfficiency.monthlyFuelExpense));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.cityMileage == null ? 0: this.cityMileage.hashCode());
    result = 31 * result + (this.highwayMileage == null ? 0: this.highwayMileage.hashCode());
    result = 31 * result + (this.combinedMileage == null ? 0: this.combinedMileage.hashCode());
    result = 31 * result + (this.annualMiles == null ? 0: this.annualMiles.hashCode());
    result = 31 * result + (this.monthlyFuelExpense == null ? 0: this.monthlyFuelExpense.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FuelEfficiency {\n");
    
    sb.append("  cityMileage: ").append(cityMileage).append("\n");
    sb.append("  highwayMileage: ").append(highwayMileage).append("\n");
    sb.append("  combinedMileage: ").append(combinedMileage).append("\n");
    sb.append("  annualMiles: ").append(annualMiles).append("\n");
    sb.append("  monthlyFuelExpense: ").append(monthlyFuelExpense).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
