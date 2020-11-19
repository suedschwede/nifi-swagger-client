
# RemoteProcessGroupStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **String** | The unique ID of the process group that the Processor belongs to |  [optional]
**id** | **String** | The unique ID of the Processor |  [optional]
**name** | **String** | The name of the remote process group. |  [optional]
**targetUri** | **String** | The URI of the target system. |  [optional]
**transmissionStatus** | **String** | The transmission status of the remote process group. |  [optional]
**statsLastRefreshed** | **String** | The time the status for the process group was last refreshed. |  [optional]
**validationStatus** | [**ValidationStatusEnum**](#ValidationStatusEnum) | Indicates whether the component is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the component is valid) |  [optional]
**aggregateSnapshot** | [**RemoteProcessGroupStatusSnapshotDTO**](RemoteProcessGroupStatusSnapshotDTO.md) | A status snapshot that represents the aggregate stats of all nodes in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this represents the stats of the single instance. |  [optional]
**nodeSnapshots** | [**List&lt;NodeRemoteProcessGroupStatusSnapshotDTO&gt;**](NodeRemoteProcessGroupStatusSnapshotDTO.md) | A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null. |  [optional]


<a name="ValidationStatusEnum"></a>
## Enum: ValidationStatusEnum
Name | Value
---- | -----
VALID | &quot;VALID&quot;
INVALID | &quot;INVALID&quot;
VALIDATING | &quot;VALIDATING&quot;



