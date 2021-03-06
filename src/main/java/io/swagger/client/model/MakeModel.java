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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class MakeModel {
  
  @SerializedName("make")
  private String make = null;
  @SerializedName("model")
  private String model = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMake() {
    return make;
  }
  public void setMake(String make) {
    this.make = make;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MakeModel makeModel = (MakeModel) o;
    return (this.make == null ? makeModel.make == null : this.make.equals(makeModel.make)) &&
        (this.model == null ? makeModel.model == null : this.model.equals(makeModel.model));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.make == null ? 0: this.make.hashCode());
    result = 31 * result + (this.model == null ? 0: this.model.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MakeModel {\n");
    
    sb.append("  make: ").append(make).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
