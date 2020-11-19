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
import at.mic.nifi.swagger.client.model.RevisionDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PortRunStatusEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-05T15:38:14.826+01:00")
public class PortRunStatusEntity {
  @SerializedName("revision")
  private RevisionDTO revision = null;

  /**
   * The run status of the Port.
   */
  public enum StateEnum {
    @SerializedName("RUNNING")
    RUNNING("RUNNING"),
    
    @SerializedName("STOPPED")
    STOPPED("STOPPED"),
    
    @SerializedName("DISABLED")
    DISABLED("DISABLED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("disconnectedNodeAcknowledged")
  private Boolean disconnectedNodeAcknowledged = null;

  public PortRunStatusEntity revision(RevisionDTO revision) {
    this.revision = revision;
    return this;
  }

   /**
   * The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.
   * @return revision
  **/
  @ApiModelProperty(example = "null", value = "The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.")
  public RevisionDTO getRevision() {
    return revision;
  }

  public void setRevision(RevisionDTO revision) {
    this.revision = revision;
  }

  public PortRunStatusEntity state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The run status of the Port.
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "The run status of the Port.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public PortRunStatusEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
    return this;
  }

   /**
   * Acknowledges that this node is disconnected to allow for mutable requests to proceed.
   * @return disconnectedNodeAcknowledged
  **/
  @ApiModelProperty(example = "null", value = "Acknowledges that this node is disconnected to allow for mutable requests to proceed.")
  public Boolean getDisconnectedNodeAcknowledged() {
    return disconnectedNodeAcknowledged;
  }

  public void setDisconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortRunStatusEntity portRunStatusEntity = (PortRunStatusEntity) o;
    return Objects.equals(this.revision, portRunStatusEntity.revision) &&
        Objects.equals(this.state, portRunStatusEntity.state) &&
        Objects.equals(this.disconnectedNodeAcknowledged, portRunStatusEntity.disconnectedNodeAcknowledged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, state, disconnectedNodeAcknowledged);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortRunStatusEntity {\n");
    
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
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
