
# PortStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the port. |  [optional]
**groupId** | **String** | The id of the parent process group of the port. |  [optional]
**name** | **String** | The name of the port. |  [optional]
**transmitting** | **Boolean** | Whether the port has incoming or outgoing connections to a remote NiFi. |  [optional]
**runStatus** | [**RunStatusEnum**](#RunStatusEnum) | The run status of the port. |  [optional]
**statsLastRefreshed** | **String** | The time the status for the process group was last refreshed. |  [optional]
**aggregateSnapshot** | [**PortStatusSnapshotDTO**](PortStatusSnapshotDTO.md) | A status snapshot that represents the aggregate stats of all nodes in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this represents the stats of the single instance. |  [optional]
**nodeSnapshots** | [**List&lt;NodePortStatusSnapshotDTO&gt;**](NodePortStatusSnapshotDTO.md) | A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null. |  [optional]


<a name="RunStatusEnum"></a>
## Enum: RunStatusEnum
Name | Value
---- | -----
RUNNING | &quot;Running&quot;
STOPPED | &quot;Stopped&quot;
VALIDATING | &quot;Validating&quot;
DISABLED | &quot;Disabled&quot;
INVALID | &quot;Invalid&quot;



