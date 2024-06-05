package com.nerds.kidzo24

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project

internal fun Project.configureAndroidCompose(
    commonExtensions: CommonExtension<*, *, *, *>
){
    commonExtensions.apply {
        buildFeatures {
            compose = true
        }
    }
}