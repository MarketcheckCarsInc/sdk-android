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
public class VinReport {
  
  @SerializedName("icon")
  private String icon = null;
  @SerializedName("some_text")
  private String someText = null;

  /**
   * icon url
   **/
  @ApiModelProperty(value = "icon url")
  public String getIcon() {
    return icon;
  }
  public void setIcon(String icon) {
    this.icon = icon;
  }

  /**
   * Some descriptional text
   **/
  @ApiModelProperty(value = "Some descriptional text")
  public String getSomeText() {
    return someText;
  }
  public void setSomeText(String someText) {
    this.someText = someText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VinReport vinReport = (VinReport) o;
    return (this.icon == null ? vinReport.icon == null : this.icon.equals(vinReport.icon)) &&
        (this.someText == null ? vinReport.someText == null : this.someText.equals(vinReport.someText));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.icon == null ? 0: this.icon.hashCode());
    result = 31 * result + (this.someText == null ? 0: this.someText.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinReport {\n");
    
    sb.append("  icon: ").append(icon).append("\n");
    sb.append("  someText: ").append(someText).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
