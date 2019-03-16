package blue.roygbiv.nafap

//This is currently first pass at small side project without runtime configuration. Letting compiler find configuration issues
// instead of persisting configuration in file or database.
class ConfiguredNoteCards {
    private var index = -1
    val noteCards : List<NoteCard> = listOf(
        NoteCard("Amazon Athena", "Analyze S3 data with SQL. Integrates with AWS Glue", Category.Analytics),
        NoteCard("Amazon EMR", "Hadoop based. Has Jupyter like notebooks for ad hoc querying", Category.Analytics),
        NoteCard("Amazon CloudSearch", "Common search functionality. Supports 34 languages, highlighting, autocomplete and geospatial search", Category.Analytics),
        NoteCard("Amazon Elasticsearch Service", "log, text analytics and visualization capabilities of ElasticSearch in AWS. Can integrate with Logstash and Kibana", Category.Analytics),
        NoteCard("Amazon Kinesis", "contains 4 services for collecting, processing and analyzing streams real-time", Category.Analytics),
        NoteCard("Amazon Kinesis Data Firehose", "used to transform and load stream data into datastores or to analytics tools", Category.Analytics),
        NoteCard("Amazon Kinesis Data Analytics", "analyze streaming data", Category.Analytics),
        NoteCard("Amazon Kinesis Data Streams", "stream data real-time for analytics", Category.Analytics),
        NoteCard("Amazon  Kinesis Video Streams", "stream video to AWS for analytics", Category.Analytics),
        NoteCard("Amazon Redshift", "columnar storage highly scalable data warehouse with massively parallel querying", Category.Analytics),
        NoteCard("Amazon QuickSight", "business intelligence service for creating interactive dashboards", Category.Analytics)
    )

    fun getNextNoteCard() : NoteCard {
        index += 1
        if(index > (noteCards.size -1 )){
            index = 0;
        }
        return noteCards[index]
    }
}