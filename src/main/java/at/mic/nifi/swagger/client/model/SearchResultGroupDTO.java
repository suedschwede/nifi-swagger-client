/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.12.1
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package at.mic.nifi.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SearchResultGroupDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-05T15:38:14.826+01:00")
public class SearchResultGroupDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  public SearchResultGroupDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the group.
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "The id of the group.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SearchResultGroupDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the group.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the group.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultGroupDTO searchResultGroupDTO = (SearchResultGroupDTO) o;
    return Objects.equals(this.id, searchResultGroupDTO.id) &&
        Objects.equals(this.name, searchResultGroupDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultGroupDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

