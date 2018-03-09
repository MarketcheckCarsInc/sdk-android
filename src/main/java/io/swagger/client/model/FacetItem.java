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
public class FacetItem {
  
  @SerializedName("item")
  private String item = null;
  @SerializedName("count")
  private BigDecimal count = null;

  /**
   * Facet item
   **/
  @ApiModelProperty(value = "Facet item")
  public String getItem() {
    return item;
  }
  public void setItem(String item) {
    this.item = item;
  }

  /**
   * Facet item count
   **/
  @ApiModelProperty(value = "Facet item count")
  public BigDecimal getCount() {
    return count;
  }
  public void setCount(BigDecimal count) {
    this.count = count;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetItem facetItem = (FacetItem) o;
    return (this.item == null ? facetItem.item == null : this.item.equals(facetItem.item)) &&
        (this.count == null ? facetItem.count == null : this.count.equals(facetItem.count));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.item == null ? 0: this.item.hashCode());
    result = 31 * result + (this.count == null ? 0: this.count.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetItem {\n");
    
    sb.append("  item: ").append(item).append("\n");
    sb.append("  count: ").append(count).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
