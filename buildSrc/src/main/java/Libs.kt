object Libs {

    object Kotlin {
        const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    }

    object AndroidX {
        private const val ANDROIDX_VERSION = "1.3.0"
        const val APPCOMPAT = "androidx.appcompat:appcompat:$ANDROIDX_VERSION"
        const val COMPOSE_ACTIVITY = "androidx.activity:activity-compose:1.3.0-beta02"
    }

    object Compose {
        const val COMPOSE_VERSION = "1.0.0-beta09"
        const val COMPOSE_UI = "androidx.compose.ui:ui:$COMPOSE_VERSION"
        const val COMPOSE_MATERIAL = "androidx.compose.material:material:$COMPOSE_VERSION"
        const val COMPOSE_ANIMATION = "androidx.compose.animation:animation:$COMPOSE_VERSION"
        const val COMPOSE_RUNTIME = "androidx.compose.runtime:runtime:$COMPOSE_VERSION"
        const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling:$COMPOSE_VERSION"
        const val COMPOSE_THEME_ADAPTER =
            "com.google.android.material:compose-theme-adapter:$COMPOSE_VERSION"
        const val COMPOSE_TEST = "androidx.compose.ui:ui-test-junit4:$COMPOSE_VERSION"
    }
}