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

/**
 * Describes the Car specification
 **/
@ApiModel(description = "Describes the Car specification")
public class Build {
  
  @SerializedName("year")
  private BigDecimal year = null;
  @SerializedName("make")
  private String make = null;
  @SerializedName("model")
  private String model = null;
  @SerializedName("trim")
  private String trim = null;
  @SerializedName("body_type")
  private String bodyType = null;
  @SerializedName("vehicle_type")
  private String vehicleType = null;
  @SerializedName("drivetrain")
  private String drivetrain = null;
  @SerializedName("fuel_type")
  private String fuelType = null;
  @SerializedName("made_in")
  private String madeIn = null;
  @SerializedName("engine")
  private String engine = null;
  @SerializedName("engine_block")
  private String engineBlock = null;
  @SerializedName("engine_size")
  private String engineSize = null;
  @SerializedName("engine_measure")
  private String engineMeasure = null;
  @SerializedName("engine_aspiration")
  private String engineAspiration = null;
  @SerializedName("transmission")
  private String transmission = null;
  @SerializedName("doors")
  private BigDecimal doors = null;
  @SerializedName("cylinders")
  private BigDecimal cylinders = null;
  @SerializedName("steering_type")
  private String steeringType = null;
  @SerializedName("antibrake_sys")
  private String antibrakeSys = null;
  @SerializedName("tank_size")
  private String tankSize = null;
  @SerializedName("overall_height")
  private String overallHeight = null;
  @SerializedName("overall_length")
  private String overallLength = null;
  @SerializedName("overall_width")
  private String overallWidth = null;
  @SerializedName("std_seating")
  private String stdSeating = null;
  @SerializedName("highway_miles")
  private String highwayMiles = null;
  @SerializedName("city_miles")
  private String cityMiles = null;

  /**
   * Year of the Car
   **/
  @ApiModelProperty(value = "Year of the Car")
  public BigDecimal getYear() {
    return year;
  }
  public void setYear(BigDecimal year) {
    this.year = year;
  }

  /**
   * Car Make
   **/
  @ApiModelProperty(value = "Car Make")
  public String getMake() {
    return make;
  }
  public void setMake(String make) {
    this.make = make;
  }

  /**
   * Car model
   **/
  @ApiModelProperty(value = "Car model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * Trim of the car
   **/
  @ApiModelProperty(value = "Trim of the car")
  public String getTrim() {
    return trim;
  }
  public void setTrim(String trim) {
    this.trim = trim;
  }

  /**
   * Body type of the car
   **/
  @ApiModelProperty(value = "Body type of the car")
  public String getBodyType() {
    return bodyType;
  }
  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }

  /**
   * Vehicle type of the car
   **/
  @ApiModelProperty(value = "Vehicle type of the car")
  public String getVehicleType() {
    return vehicleType;
  }
  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  /**
   * Drivetrain of the car
   **/
  @ApiModelProperty(value = "Drivetrain of the car")
  public String getDrivetrain() {
    return drivetrain;
  }
  public void setDrivetrain(String drivetrain) {
    this.drivetrain = drivetrain;
  }

  /**
   * Fuel type of the car
   **/
  @ApiModelProperty(value = "Fuel type of the car")
  public String getFuelType() {
    return fuelType;
  }
  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  /**
   * Made in of the car
   **/
  @ApiModelProperty(value = "Made in of the car")
  public String getMadeIn() {
    return madeIn;
  }
  public void setMadeIn(String madeIn) {
    this.madeIn = madeIn;
  }

  /**
   * Engine of the car
   **/
  @ApiModelProperty(value = "Engine of the car")
  public String getEngine() {
    return engine;
  }
  public void setEngine(String engine) {
    this.engine = engine;
  }

  /**
   * Engine block of the car
   **/
  @ApiModelProperty(value = "Engine block of the car")
  public String getEngineBlock() {
    return engineBlock;
  }
  public void setEngineBlock(String engineBlock) {
    this.engineBlock = engineBlock;
  }

  /**
   * Engine size of the car
   **/
  @ApiModelProperty(value = "Engine size of the car")
  public String getEngineSize() {
    return engineSize;
  }
  public void setEngineSize(String engineSize) {
    this.engineSize = engineSize;
  }

  /**
   * Engine block of the car
   **/
  @ApiModelProperty(value = "Engine block of the car")
  public String getEngineMeasure() {
    return engineMeasure;
  }
  public void setEngineMeasure(String engineMeasure) {
    this.engineMeasure = engineMeasure;
  }

  /**
   * Engine aspiration of the car
   **/
  @ApiModelProperty(value = "Engine aspiration of the car")
  public String getEngineAspiration() {
    return engineAspiration;
  }
  public void setEngineAspiration(String engineAspiration) {
    this.engineAspiration = engineAspiration;
  }

  /**
   * Transmission of the car
   **/
  @ApiModelProperty(value = "Transmission of the car")
  public String getTransmission() {
    return transmission;
  }
  public void setTransmission(String transmission) {
    this.transmission = transmission;
  }

  /**
   * No of doors of the car
   **/
  @ApiModelProperty(value = "No of doors of the car")
  public BigDecimal getDoors() {
    return doors;
  }
  public void setDoors(BigDecimal doors) {
    this.doors = doors;
  }

  /**
   * No of cylinders of the car
   **/
  @ApiModelProperty(value = "No of cylinders of the car")
  public BigDecimal getCylinders() {
    return cylinders;
  }
  public void setCylinders(BigDecimal cylinders) {
    this.cylinders = cylinders;
  }

  /**
   * Steering type of the car
   **/
  @ApiModelProperty(value = "Steering type of the car")
  public String getSteeringType() {
    return steeringType;
  }
  public void setSteeringType(String steeringType) {
    this.steeringType = steeringType;
  }

  /**
   * Antibrake system of the car
   **/
  @ApiModelProperty(value = "Antibrake system of the car")
  public String getAntibrakeSys() {
    return antibrakeSys;
  }
  public void setAntibrakeSys(String antibrakeSys) {
    this.antibrakeSys = antibrakeSys;
  }

  /**
   * Tank size of the car
   **/
  @ApiModelProperty(value = "Tank size of the car")
  public String getTankSize() {
    return tankSize;
  }
  public void setTankSize(String tankSize) {
    this.tankSize = tankSize;
  }

  /**
   * Overall height of the car
   **/
  @ApiModelProperty(value = "Overall height of the car")
  public String getOverallHeight() {
    return overallHeight;
  }
  public void setOverallHeight(String overallHeight) {
    this.overallHeight = overallHeight;
  }

  /**
   * Overall length of the car
   **/
  @ApiModelProperty(value = "Overall length of the car")
  public String getOverallLength() {
    return overallLength;
  }
  public void setOverallLength(String overallLength) {
    this.overallLength = overallLength;
  }

  /**
   * Overall width of the car
   **/
  @ApiModelProperty(value = "Overall width of the car")
  public String getOverallWidth() {
    return overallWidth;
  }
  public void setOverallWidth(String overallWidth) {
    this.overallWidth = overallWidth;
  }

  /**
   * Std seating of the car
   **/
  @ApiModelProperty(value = "Std seating of the car")
  public String getStdSeating() {
    return stdSeating;
  }
  public void setStdSeating(String stdSeating) {
    this.stdSeating = stdSeating;
  }

  /**
   * Highway miles of the car
   **/
  @ApiModelProperty(value = "Highway miles of the car")
  public String getHighwayMiles() {
    return highwayMiles;
  }
  public void setHighwayMiles(String highwayMiles) {
    this.highwayMiles = highwayMiles;
  }

  /**
   * City miles of the car
   **/
  @ApiModelProperty(value = "City miles of the car")
  public String getCityMiles() {
    return cityMiles;
  }
  public void setCityMiles(String cityMiles) {
    this.cityMiles = cityMiles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Build build = (Build) o;
    return (this.year == null ? build.year == null : this.year.equals(build.year)) &&
        (this.make == null ? build.make == null : this.make.equals(build.make)) &&
        (this.model == null ? build.model == null : this.model.equals(build.model)) &&
        (this.trim == null ? build.trim == null : this.trim.equals(build.trim)) &&
        (this.bodyType == null ? build.bodyType == null : this.bodyType.equals(build.bodyType)) &&
        (this.vehicleType == null ? build.vehicleType == null : this.vehicleType.equals(build.vehicleType)) &&
        (this.drivetrain == null ? build.drivetrain == null : this.drivetrain.equals(build.drivetrain)) &&
        (this.fuelType == null ? build.fuelType == null : this.fuelType.equals(build.fuelType)) &&
        (this.madeIn == null ? build.madeIn == null : this.madeIn.equals(build.madeIn)) &&
        (this.engine == null ? build.engine == null : this.engine.equals(build.engine)) &&
        (this.engineBlock == null ? build.engineBlock == null : this.engineBlock.equals(build.engineBlock)) &&
        (this.engineSize == null ? build.engineSize == null : this.engineSize.equals(build.engineSize)) &&
        (this.engineMeasure == null ? build.engineMeasure == null : this.engineMeasure.equals(build.engineMeasure)) &&
        (this.engineAspiration == null ? build.engineAspiration == null : this.engineAspiration.equals(build.engineAspiration)) &&
        (this.transmission == null ? build.transmission == null : this.transmission.equals(build.transmission)) &&
        (this.doors == null ? build.doors == null : this.doors.equals(build.doors)) &&
        (this.cylinders == null ? build.cylinders == null : this.cylinders.equals(build.cylinders)) &&
        (this.steeringType == null ? build.steeringType == null : this.steeringType.equals(build.steeringType)) &&
        (this.antibrakeSys == null ? build.antibrakeSys == null : this.antibrakeSys.equals(build.antibrakeSys)) &&
        (this.tankSize == null ? build.tankSize == null : this.tankSize.equals(build.tankSize)) &&
        (this.overallHeight == null ? build.overallHeight == null : this.overallHeight.equals(build.overallHeight)) &&
        (this.overallLength == null ? build.overallLength == null : this.overallLength.equals(build.overallLength)) &&
        (this.overallWidth == null ? build.overallWidth == null : this.overallWidth.equals(build.overallWidth)) &&
        (this.stdSeating == null ? build.stdSeating == null : this.stdSeating.equals(build.stdSeating)) &&
        (this.highwayMiles == null ? build.highwayMiles == null : this.highwayMiles.equals(build.highwayMiles)) &&
        (this.cityMiles == null ? build.cityMiles == null : this.cityMiles.equals(build.cityMiles));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.year == null ? 0: this.year.hashCode());
    result = 31 * result + (this.make == null ? 0: this.make.hashCode());
    result = 31 * result + (this.model == null ? 0: this.model.hashCode());
    result = 31 * result + (this.trim == null ? 0: this.trim.hashCode());
    result = 31 * result + (this.bodyType == null ? 0: this.bodyType.hashCode());
    result = 31 * result + (this.vehicleType == null ? 0: this.vehicleType.hashCode());
    result = 31 * result + (this.drivetrain == null ? 0: this.drivetrain.hashCode());
    result = 31 * result + (this.fuelType == null ? 0: this.fuelType.hashCode());
    result = 31 * result + (this.madeIn == null ? 0: this.madeIn.hashCode());
    result = 31 * result + (this.engine == null ? 0: this.engine.hashCode());
    result = 31 * result + (this.engineBlock == null ? 0: this.engineBlock.hashCode());
    result = 31 * result + (this.engineSize == null ? 0: this.engineSize.hashCode());
    result = 31 * result + (this.engineMeasure == null ? 0: this.engineMeasure.hashCode());
    result = 31 * result + (this.engineAspiration == null ? 0: this.engineAspiration.hashCode());
    result = 31 * result + (this.transmission == null ? 0: this.transmission.hashCode());
    result = 31 * result + (this.doors == null ? 0: this.doors.hashCode());
    result = 31 * result + (this.cylinders == null ? 0: this.cylinders.hashCode());
    result = 31 * result + (this.steeringType == null ? 0: this.steeringType.hashCode());
    result = 31 * result + (this.antibrakeSys == null ? 0: this.antibrakeSys.hashCode());
    result = 31 * result + (this.tankSize == null ? 0: this.tankSize.hashCode());
    result = 31 * result + (this.overallHeight == null ? 0: this.overallHeight.hashCode());
    result = 31 * result + (this.overallLength == null ? 0: this.overallLength.hashCode());
    result = 31 * result + (this.overallWidth == null ? 0: this.overallWidth.hashCode());
    result = 31 * result + (this.stdSeating == null ? 0: this.stdSeating.hashCode());
    result = 31 * result + (this.highwayMiles == null ? 0: this.highwayMiles.hashCode());
    result = 31 * result + (this.cityMiles == null ? 0: this.cityMiles.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Build {\n");
    
    sb.append("  year: ").append(year).append("\n");
    sb.append("  make: ").append(make).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("  trim: ").append(trim).append("\n");
    sb.append("  bodyType: ").append(bodyType).append("\n");
    sb.append("  vehicleType: ").append(vehicleType).append("\n");
    sb.append("  drivetrain: ").append(drivetrain).append("\n");
    sb.append("  fuelType: ").append(fuelType).append("\n");
    sb.append("  madeIn: ").append(madeIn).append("\n");
    sb.append("  engine: ").append(engine).append("\n");
    sb.append("  engineBlock: ").append(engineBlock).append("\n");
    sb.append("  engineSize: ").append(engineSize).append("\n");
    sb.append("  engineMeasure: ").append(engineMeasure).append("\n");
    sb.append("  engineAspiration: ").append(engineAspiration).append("\n");
    sb.append("  transmission: ").append(transmission).append("\n");
    sb.append("  doors: ").append(doors).append("\n");
    sb.append("  cylinders: ").append(cylinders).append("\n");
    sb.append("  steeringType: ").append(steeringType).append("\n");
    sb.append("  antibrakeSys: ").append(antibrakeSys).append("\n");
    sb.append("  tankSize: ").append(tankSize).append("\n");
    sb.append("  overallHeight: ").append(overallHeight).append("\n");
    sb.append("  overallLength: ").append(overallLength).append("\n");
    sb.append("  overallWidth: ").append(overallWidth).append("\n");
    sb.append("  stdSeating: ").append(stdSeating).append("\n");
    sb.append("  highwayMiles: ").append(highwayMiles).append("\n");
    sb.append("  cityMiles: ").append(cityMiles).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
