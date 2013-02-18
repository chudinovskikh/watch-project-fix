class WatchProjectFixGrailsPlugin {
    // the plugin version
    def version = "1.0"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.2 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/*.gsp",
            "web-app/*",
    ]

    def title = "Watch Resouce Fix Plugin" // Headline display name of the plugin
    def author = "Anton Chudinovskikh"
    def authorEmail = "anton.chudinovskih@nitka.com"
    def description = 'Fixes problems with GrailsProjectWatcher'

    def watchedResources = ['file:./*/**/*.*']

    def onChange = { event ->
    }
}
