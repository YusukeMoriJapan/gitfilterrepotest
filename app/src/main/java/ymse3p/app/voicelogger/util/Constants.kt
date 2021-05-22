package ymse3p.app.voicelogger.util

import ymse3p.app.voicelogger.BuildConfig

class Constants {
    companion object {
        const val BASE_URL = "***REMOVED***"
        const val API_KEY = BuildConfig.ApiKey

        // ROOM database
        const val DATABASE_NAME = "audio_database"
        const val AUDIO_TABLE = "audio_table"

        //Date format
        const val DATABASE_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss:SSS"

        //Permission request code
        const val REQUEST_RECORD_AUDIO_PERMISSION = 200

        //Data store preferences
        const val RECORDED_AUDIO_ID = "recorded_audio_id"
        const val PREFERENCES_NAME = "appDataStorePreference"
        const val IS_FIRST_LAUNCH = "is_first_launch"

        //Notification Channel ID
        const val NOTIFICATION_CHANNEL_ID_PLAYBACK = "playback_channel"

        //Foreground notification ID
        const val FOREGROUND_NOTIFICATION_ID_PLAYBACK = 1

        //Custom MediaDescription Key
        const val MEDIA_METADATA_QUEUE = "media_metadata_queue"

        //Roads API request rule
        const val PAGINATION_OVERLAP = 5
        const val PAGE_SIZE_LIMIT = 100
        const val REQUEST_MIN_INTERVAL_MS: Long = 100
    }
}