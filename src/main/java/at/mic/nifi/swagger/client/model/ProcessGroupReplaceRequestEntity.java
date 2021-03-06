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
import at.mic.nifi.swagger.client.model.ProcessGroupReplaceRequestDTO;
import at.mic.nifi.swagger.client.model.RevisionDTO;
import at.mic.nifi.swagger.client.model.VersionedFlowSnapshot;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ProcessGroupReplaceRequestEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-05T15:38:14.826+01:00")
public class ProcessGroupReplaceRequestEntity {
  @SerializedName("processGroupRevision")
  private RevisionDTO processGroupRevision = null;

  @SerializedName("request")
  private ProcessGroupReplaceRequestDTO request = null;

  @SerializedName("versionedFlowSnapshot")
  private VersionedFlowSnapshot versionedFlowSnapshot = null;

  public ProcessGroupReplaceRequestEntity processGroupRevision(RevisionDTO processGroupRevision) {
    this.processGroupRevision = processGroupRevision;
    return this;
  }

   /**
   * The revision for the Process Group being updated.
   * @return processGroupRevision
  **/
  @ApiModelProperty(example = "null", value = "The revision for the Process Group being updated.")
  public RevisionDTO getProcessGroupRevision() {
    return processGroupRevision;
  }

  public void setProcessGroupRevision(RevisionDTO processGroupRevision) {
    this.processGroupRevision = processGroupRevision;
  }

  public ProcessGroupReplaceRequestEntity request(ProcessGroupReplaceRequestDTO request) {
    this.request = request;
    return this;
  }

   /**
   * The Process Group Change Request
   * @return request
  **/
  @ApiModelProperty(example = "null", value = "The Process Group Change Request")
  public ProcessGroupReplaceRequestDTO getRequest() {
    return request;
  }

  public void setRequest(ProcessGroupReplaceRequestDTO request) {
    this.request = request;
  }

  public ProcessGroupReplaceRequestEntity versionedFlowSnapshot(VersionedFlowSnapshot versionedFlowSnapshot) {
    this.versionedFlowSnapshot = versionedFlowSnapshot;
    return this;
  }

   /**
   * Returns the Versioned Flow to replace with
   * @return versionedFlowSnapshot
  **/
  @ApiModelProperty(example = "null", value = "Returns the Versioned Flow to replace with")
  public VersionedFlowSnapshot getVersionedFlowSnapshot() {
    return versionedFlowSnapshot;
  }

  public void setVersionedFlowSnapshot(VersionedFlowSnapshot versionedFlowSnapshot) {
    this.versionedFlowSnapshot = versionedFlowSnapshot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessGroupReplaceRequestEntity processGroupReplaceRequestEntity = (ProcessGroupReplaceRequestEntity) o;
    return Objects.equals(this.processGroupRevision, processGroupReplaceRequestEntity.processGroupRevision) &&
        Objects.equals(this.request, processGroupReplaceRequestEntity.request) &&
        Objects.equals(this.versionedFlowSnapshot, processGroupReplaceRequestEntity.versionedFlowSnapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processGroupRevision, request, versionedFlowSnapshot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessGroupReplaceRequestEntity {\n");
    
    sb.append("    processGroupRevision: ").append(toIndentedString(processGroupRevision)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    versionedFlowSnapshot: ").append(toIndentedString(versionedFlowSnapshot)).append("\n");
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

