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
import at.mic.nifi.swagger.client.model.JaxbLink;
import at.mic.nifi.swagger.client.model.Permissions;
import at.mic.nifi.swagger.client.model.RevisionInfo;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Bucket
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-05T15:38:14.826+01:00")
public class Bucket {
  @SerializedName("link")
  private JaxbLink link = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("createdTimestamp")
  private Long createdTimestamp = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("allowBundleRedeploy")
  private Boolean allowBundleRedeploy = null;

  @SerializedName("allowPublicRead")
  private Boolean allowPublicRead = null;

  @SerializedName("permissions")
  private Permissions permissions = null;

  @SerializedName("revision")
  private RevisionInfo revision = null;

  public Bucket link(JaxbLink link) {
    this.link = link;
    return this;
  }

   /**
   * An WebLink to this entity.
   * @return link
  **/
  @ApiModelProperty(example = "null", value = "An WebLink to this entity.")
  public JaxbLink getLink() {
    return link;
  }

  public void setLink(JaxbLink link) {
    this.link = link;
  }

   /**
   * An ID to uniquely identify this object.
   * @return identifier
  **/
  @ApiModelProperty(example = "null", value = "An ID to uniquely identify this object.")
  public String getIdentifier() {
    return identifier;
  }

  public Bucket name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the bucket.
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the bucket.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * The timestamp of when the bucket was first created. This is set by the server at creation time.
   * minimum: 1
   * @return createdTimestamp
  **/
  @ApiModelProperty(example = "null", value = "The timestamp of when the bucket was first created. This is set by the server at creation time.")
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public Bucket description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the bucket.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "A description of the bucket.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Bucket allowBundleRedeploy(Boolean allowBundleRedeploy) {
    this.allowBundleRedeploy = allowBundleRedeploy;
    return this;
  }

   /**
   * Indicates if this bucket allows the same version of an extension bundle to be redeployed and thus overwrite the existing artifact. By default this is false.
   * @return allowBundleRedeploy
  **/
  @ApiModelProperty(example = "null", value = "Indicates if this bucket allows the same version of an extension bundle to be redeployed and thus overwrite the existing artifact. By default this is false.")
  public Boolean getAllowBundleRedeploy() {
    return allowBundleRedeploy;
  }

  public void setAllowBundleRedeploy(Boolean allowBundleRedeploy) {
    this.allowBundleRedeploy = allowBundleRedeploy;
  }

  public Bucket allowPublicRead(Boolean allowPublicRead) {
    this.allowPublicRead = allowPublicRead;
    return this;
  }

   /**
   * Indicates if this bucket allows read access to unauthenticated anonymous users
   * @return allowPublicRead
  **/
  @ApiModelProperty(example = "null", value = "Indicates if this bucket allows read access to unauthenticated anonymous users")
  public Boolean getAllowPublicRead() {
    return allowPublicRead;
  }

  public void setAllowPublicRead(Boolean allowPublicRead) {
    this.allowPublicRead = allowPublicRead;
  }

  public Bucket permissions(Permissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * The access that the current user has to this bucket.
   * @return permissions
  **/
  @ApiModelProperty(example = "null", value = "The access that the current user has to this bucket.")
  public Permissions getPermissions() {
    return permissions;
  }

  public void setPermissions(Permissions permissions) {
    this.permissions = permissions;
  }

  public Bucket revision(RevisionInfo revision) {
    this.revision = revision;
    return this;
  }

   /**
   * The revision of this entity used for optimistic-locking during updates.
   * @return revision
  **/
  @ApiModelProperty(example = "null", value = "The revision of this entity used for optimistic-locking during updates.")
  public RevisionInfo getRevision() {
    return revision;
  }

  public void setRevision(RevisionInfo revision) {
    this.revision = revision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bucket bucket = (Bucket) o;
    return Objects.equals(this.link, bucket.link) &&
        Objects.equals(this.identifier, bucket.identifier) &&
        Objects.equals(this.name, bucket.name) &&
        Objects.equals(this.createdTimestamp, bucket.createdTimestamp) &&
        Objects.equals(this.description, bucket.description) &&
        Objects.equals(this.allowBundleRedeploy, bucket.allowBundleRedeploy) &&
        Objects.equals(this.allowPublicRead, bucket.allowPublicRead) &&
        Objects.equals(this.permissions, bucket.permissions) &&
        Objects.equals(this.revision, bucket.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, identifier, name, createdTimestamp, description, allowBundleRedeploy, allowPublicRead, permissions, revision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bucket {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    allowBundleRedeploy: ").append(toIndentedString(allowBundleRedeploy)).append("\n");
    sb.append("    allowPublicRead: ").append(toIndentedString(allowPublicRead)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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

