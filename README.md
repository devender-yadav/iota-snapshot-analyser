# iota-snapshot-analyser

This is a simple project that analyzes iota holding among all the addresses using public snapshot file. It will generate bar chart for IOTA tokens range vs Number of addresses for different public snapshots.


![ota-distribution](https://github.com/devender-yadav/iota-snapshot-analyser/blob/master/src/test/resources/iota-distribution.png)


_Check [this](https://gist.github.com/devender-yadav/c55dfe55c25e0980d9f0cd95478f792e) for IOTA Snapshot files link._


## How to use

To generate chart, go to [BarChartGenerator.java](https://github.com/devender-yadav/iota-snapshot-analyser/blob/master/src/main/java/com/dev/iota/chart/BarChartGenerator.java) and run as Java Application.

## Data


 Snapshot| Total Addresses| More than 1Ti  | 100 Gi - 1Ti | 10 Gi - 100 Gi | 100 Mi - 1 Gi | 100 Mi - 1 Gi | 1 i - 100 Mi|
| -------|:-------------:| ---------------:|------------:|---------------:|---------------:|-------------:|---------------:|
|  Aug 17| 22244         |299              |606          |1587            | 4316           | 5407         | 10029          |
|  Sep 17| 51885         |234              |602          |2278            | 9818           | 17625        | 21328          |
|  Oct 17| 65617         |231              |582          |2630            | 12493          | 22164        | 27517          |
|  Jan 18| 260628        |240              |941          |7345            | 35033          | 75577        | 141492         |
|  Apr 18| 315552        |275              |886          |8404            | 40828          | 94936        | 170223         |
|  Jul 18| 348251        |271              |799          |9660            | 45366          | 102466       | 189689         |


