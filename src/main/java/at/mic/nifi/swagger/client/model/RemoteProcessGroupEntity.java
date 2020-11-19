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
import at.mic.nifi.swagger.client.model.BulletinEntity;
import at.mic.nifi.swagger.client.model.PermissionsDTO;
import at.mic.nifi.swagger.client.model.PositionDTO;
import at.mic.nifi.swagger.client.model.RemoteProcessGroupDTO;
import at.mic.nifi.swagger.client.model.RemoteProcessGroupStatusDTO;
import at.mic.nifi.swagger.client.model.RevisionDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * RemoteProcessGroupEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-05T15:38:14.826+01:00")
public class RemoteProcessGroupEntity {
  @SerializedName("revision")
  private RevisionDTO revision = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("position")
  private PositionDTO position = null;

  @SerializedName("permissions")
  private PermissionsDTO permissions = null;

  @SerializedName("bulletins")
  private List<BulletinEntity> bulletins = new ArrayList<BulletinEntity>();

  @SerializedName("disconnectedNodeAcknowledged")
  private Boolean disconnectedNodeAcknowledged = null;

  @SerializedName("component")
  private RemoteProcessGroupDTO component = null;

  @SerializedName("status")
  private RemoteProcessGroupStatusDTO status = null;

  @SerializedName("inputPortCount")
  private Integer inputPortCount = null;

  @SerializedName("outputPortCount")
  private Integer outputPortCount = null;

  @SerializedName("operatePermissions")
  private PermissionsDTO operatePermissions = null;

  public RemoteProcessGroupEntity revision(RevisionDTO revision) {
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

  public RemoteProcessGroupEntity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the component.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the component.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RemoteProcessGroupEntity uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI for futures requests to the component.
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "The URI for futures requests to the component.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public RemoteProcessGroupEntity position(PositionDTO position) {
    this.position = position;
    return this;
  }

   /**
   * The position of this component in the UI if applicable.
   * @return position
  **/
  @ApiModelProperty(example = "null", value = "The position of this component in the UI if applicable.")
  public PositionDTO getPosition() {
    return position;
  }

  public void setPosition(PositionDTO position) {
    this.position = position;
  }

  public RemoteProcessGroupEntity permissions(PermissionsDTO permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * The permissions for this component.
   * @return permissions
  **/
  @ApiModelProperty(example = "null", value = "The permissions for this component.")
  public PermissionsDTO getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionsDTO permissions) {
    this.permissions = permissions;
  }

  public RemoteProcessGroupEntity bulletins(List<BulletinEntity> bulletins) {
    this.bulletins = bulletins;
    return this;
  }

  public RemoteProcessGroupEntity addBulletinsItem(BulletinEntity bulletinsItem) {
    this.bulletins.add(bulletinsItem);
    return this;
  }

   /**
   * The bulletins for this component.
   * @return bulletins
  **/
  @ApiModelProperty(example = "null", value = "The bulletins for this component.")
  public List<BulletinEntity> getBulletins() {
    return bulletins;
  }

  public void setBulletins(List<BulletinEntity> bulletins) {
    this.bulletins = bulletins;
  }

  public RemoteProcessGroupEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
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

  public RemoteProcessGroupEntity component(RemoteProcessGroupDTO component) {
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @ApiModelProperty(example = "null", value = "")
  public RemoteProcessGroupDTO getComponent() {
    return component;
  }

  public void setComponent(RemoteProcessGroupDTO component) {
    this.component = component;
  }

  public RemoteProcessGroupEntity status(RemoteProcessGroupStatusDTO status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the remote process group.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The status of the remote process group.")
  public RemoteProcessGroupStatusDTO getStatus() {
    return status;
  }

  public void setStatus(RemoteProcessGroupStatusDTO status) {
    this.status = status;
  }

  public RemoteProcessGroupEntity inputPortCount(Integer inputPortCount) {
    this.inputPortCount = inputPortCount;
    return this;
  }

   /**
   * The number of remote input ports currently available on the target.
   * @return inputPortCount
  **/
  @ApiModelProperty(example = "null", value = "The number of remote input ports currently available on the target.")
  public Integer getInputPortCount() {
    return inputPortCount;
  }

  public void setInputPortCount(Integer inputPortCount) {
    this.inputPortCount = inputPortCount;
  }

  public RemoteProcessGroupEntity outputPortCount(Integer outputPortCount) {
    this.outputPortCount = outputPortCount;
    return this;
  }

   /**
   * The number of remote output ports currently available on the target.
   * @return outputPortCount
  **/
  @ApiModelProperty(example = "null", value = "The number of remote output ports currently available on the target.")
  public Integer getOutputPortCount() {
    return outputPortCount;
  }

  public void setOutputPortCount(Integer outputPortCount) {
    this.outputPortCount = outputPortCount;
  }

  public RemoteProcessGroupEntity operatePermissions(PermissionsDTO operatePermissions) {
    this.operatePermissions = operatePermissions;
    return this;
  }

   /**
   * The permissions for this component operations.
   * @return operatePermissions
  **/
  @ApiModelProperty(example = "null", value = "The permissions for this component operations.")
  public PermissionsDTO getOperatePermissions() {
    return operatePermissions;
  }

  public void setOperatePermissions(PermissionsDTO operatePermissions) {
    this.operatePermissions = operatePermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteProcessGroupEntity remoteProcessGroupEntity = (RemoteProcessGroupEntity) o;
    return Objects.equals(this.revision, remoteProcessGroupEntity.revision) &&
        Objects.equals(this.id, remoteProcessGroupEntity.id) &&
        Objects.equals(this.uri, remoteProcessGroupEntity.uri) &&
        Objects.equals(this.position, remoteProcessGroupEntity.position) &&
        Objects.equals(this.permissions, remoteProcessGroupEntity.permissions) &&
        Objects.equals(this.bulletins, remoteProcessGroupEntity.bulletins) &&
        Objects.equals(this.disconnectedNodeAcknowledged, remoteProcessGroupEntity.disconnectedNodeAcknowledged) &&
        Objects.equals(this.component, remoteProcessGroupEntity.component) &&
        Objects.equals(this.status, remoteProcessGroupEntity.status) &&
        Objects.equals(this.inputPortCount, remoteProcessGroupEntity.inputPortCount) &&
        Objects.equals(this.outputPortCount, remoteProcessGroupEntity.outputPortCount) &&
        Objects.equals(this.operatePermissions, remoteProcessGroupEntity.operatePermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, id, uri, position, permissions, bulletins, disconnectedNodeAcknowledged, component, status, inputPortCount, outputPortCount, operatePermissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteProcessGroupEntity {\n");
    
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    bulletins: ").append(toIndentedString(bulletins)).append("\n");
    sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    inputPortCount: ").append(toIndentedString(inputPortCount)).append("\n");
    sb.append("    outputPortCount: ").append(toIndentedString(outputPortCount)).append("\n");
    sb.append("    operatePermissions: ").append(toIndentedString(operatePermissions)).append("\n");
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

