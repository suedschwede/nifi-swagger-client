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
 * VersionedFlowDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-05T15:38:14.826+01:00")
public class VersionedFlowDTO {
  @SerializedName("registryId")
  private String registryId = null;

  @SerializedName("bucketId")
  private String bucketId = null;

  @SerializedName("flowId")
  private String flowId = null;

  @SerializedName("flowName")
  private String flowName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("comments")
  private String comments = null;

  /**
   * The action being performed
   */
  public enum ActionEnum {
    @SerializedName("COMMIT")
    COMMIT("COMMIT"),
    
    @SerializedName("FORCE_COMMIT")
    FORCE_COMMIT("FORCE_COMMIT");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("action")
  private ActionEnum action = null;

  public VersionedFlowDTO registryId(String registryId) {
    this.registryId = registryId;
    return this;
  }

   /**
   * The ID of the registry that the flow is tracked to
   * @return registryId
  **/
  @ApiModelProperty(example = "null", value = "The ID of the registry that the flow is tracked to")
  public String getRegistryId() {
    return registryId;
  }

  public void setRegistryId(String registryId) {
    this.registryId = registryId;
  }

  public VersionedFlowDTO bucketId(String bucketId) {
    this.bucketId = bucketId;
    return this;
  }

   /**
   * The ID of the bucket where the flow is stored
   * @return bucketId
  **/
  @ApiModelProperty(example = "null", value = "The ID of the bucket where the flow is stored")
  public String getBucketId() {
    return bucketId;
  }

  public void setBucketId(String bucketId) {
    this.bucketId = bucketId;
  }

  public VersionedFlowDTO flowId(String flowId) {
    this.flowId = flowId;
    return this;
  }

   /**
   * The ID of the flow
   * @return flowId
  **/
  @ApiModelProperty(example = "null", value = "The ID of the flow")
  public String getFlowId() {
    return flowId;
  }

  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }

  public VersionedFlowDTO flowName(String flowName) {
    this.flowName = flowName;
    return this;
  }

   /**
   * The name of the flow
   * @return flowName
  **/
  @ApiModelProperty(example = "null", value = "The name of the flow")
  public String getFlowName() {
    return flowName;
  }

  public void setFlowName(String flowName) {
    this.flowName = flowName;
  }

  public VersionedFlowDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the flow
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "A description of the flow")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VersionedFlowDTO comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Comments for the changeset
   * @return comments
  **/
  @ApiModelProperty(example = "null", value = "Comments for the changeset")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public VersionedFlowDTO action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * The action being performed
   * @return action
  **/
  @ApiModelProperty(example = "null", value = "The action being performed")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedFlowDTO versionedFlowDTO = (VersionedFlowDTO) o;
    return Objects.equals(this.registryId, versionedFlowDTO.registryId) &&
        Objects.equals(this.bucketId, versionedFlowDTO.bucketId) &&
        Objects.equals(this.flowId, versionedFlowDTO.flowId) &&
        Objects.equals(this.flowName, versionedFlowDTO.flowName) &&
        Objects.equals(this.description, versionedFlowDTO.description) &&
        Objects.equals(this.comments, versionedFlowDTO.comments) &&
        Objects.equals(this.action, versionedFlowDTO.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registryId, bucketId, flowId, flowName, description, comments, action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedFlowDTO {\n");
    
    sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
    sb.append("    bucketId: ").append(toIndentedString(bucketId)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    flowName: ").append(toIndentedString(flowName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

