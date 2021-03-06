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

import io.swagger.client.model.Dealer;
import java.math.BigDecimal;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Dealers Response
 **/
@ApiModel(description = "Dealers Response")
public class DealersResponse {
  
  @SerializedName("num_found")
  private BigDecimal numFound = null;
  @SerializedName("dealers")
  private List<Dealer> dealers = null;

  /**
   * number of dealers found
   **/
  @ApiModelProperty(value = "number of dealers found")
  public BigDecimal getNumFound() {
    return numFound;
  }
  public void setNumFound(BigDecimal numFound) {
    this.numFound = numFound;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Dealer> getDealers() {
    return dealers;
  }
  public void setDealers(List<Dealer> dealers) {
    this.dealers = dealers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealersResponse dealersResponse = (DealersResponse) o;
    return (this.numFound == null ? dealersResponse.numFound == null : this.numFound.equals(dealersResponse.numFound)) &&
        (this.dealers == null ? dealersResponse.dealers == null : this.dealers.equals(dealersResponse.dealers));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.numFound == null ? 0: this.numFound.hashCode());
    result = 31 * result + (this.dealers == null ? 0: this.dealers.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealersResponse {\n");
    
    sb.append("  numFound: ").append(numFound).append("\n");
    sb.append("  dealers: ").append(dealers).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
