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
import at.mic.nifi.swagger.client.model.PropertyHistoryDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ComponentHistoryDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-05T15:38:14.826+01:00")
public class ComponentHistoryDTO {
  @SerializedName("componentId")
  private String componentId = null;

  @SerializedName("propertyHistory")
  private Map<String, PropertyHistoryDTO> propertyHistory = new HashMap<String, PropertyHistoryDTO>();

  public ComponentHistoryDTO componentId(String componentId) {
    this.componentId = componentId;
    return this;
  }

   /**
   * The component id.
   * @return componentId
  **/
  @ApiModelProperty(example = "null", value = "The component id.")
  public String getComponentId() {
    return componentId;
  }

  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }

  public ComponentHistoryDTO propertyHistory(Map<String, PropertyHistoryDTO> propertyHistory) {
    this.propertyHistory = propertyHistory;
    return this;
  }

  public ComponentHistoryDTO putPropertyHistoryItem(String key, PropertyHistoryDTO propertyHistoryItem) {
    this.propertyHistory.put(key, propertyHistoryItem);
    return this;
  }

   /**
   * The history for the properties of the component.
   * @return propertyHistory
  **/
  @ApiModelProperty(example = "null", value = "The history for the properties of the component.")
  public Map<String, PropertyHistoryDTO> getPropertyHistory() {
    return propertyHistory;
  }

  public void setPropertyHistory(Map<String, PropertyHistoryDTO> propertyHistory) {
    this.propertyHistory = propertyHistory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentHistoryDTO componentHistoryDTO = (ComponentHistoryDTO) o;
    return Objects.equals(this.componentId, componentHistoryDTO.componentId) &&
        Objects.equals(this.propertyHistory, componentHistoryDTO.propertyHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, propertyHistory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentHistoryDTO {\n");
    
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    propertyHistory: ").append(toIndentedString(propertyHistory)).append("\n");
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

