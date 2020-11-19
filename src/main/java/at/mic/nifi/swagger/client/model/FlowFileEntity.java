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
import at.mic.nifi.swagger.client.model.FlowFileDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FlowFileEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-05T15:38:14.826+01:00")
public class FlowFileEntity {
  @SerializedName("flowFile")
  private FlowFileDTO flowFile = null;

  public FlowFileEntity flowFile(FlowFileDTO flowFile) {
    this.flowFile = flowFile;
    return this;
  }

   /**
   * Get flowFile
   * @return flowFile
  **/
  @ApiModelProperty(example = "null", value = "")
  public FlowFileDTO getFlowFile() {
    return flowFile;
  }

  public void setFlowFile(FlowFileDTO flowFile) {
    this.flowFile = flowFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowFileEntity flowFileEntity = (FlowFileEntity) o;
    return Objects.equals(this.flowFile, flowFileEntity.flowFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowFileEntity {\n");
    
    sb.append("    flowFile: ").append(toIndentedString(flowFile)).append("\n");
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

