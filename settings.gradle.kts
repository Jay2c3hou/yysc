/*
 * Copyright (c) 2022 NetEase, Inc.  All rights reserved.
 * Use of this source code is governed by a MIT license that can be found in the LICENSE file.
 */


pluginManagement {
    repositories {
        gradlePluginPortal()
        maven { setUrl("https://maven.aliyun.com/repository/public") }
        maven { setUrl("https://maven.aliyun.com/repository/central") }
        maven { setUrl("https://maven.aliyun.com/repository/google") }
        maven { setUrl("'https://maven.aliyun.com/repository/gradle-plugin") }
        google()
        mavenCentral()
        maven {
            setUrl("https://oss.sonatype.org/content/repositories/snapshots/")
        }
        maven {
            setUrl("https://developer.huawei.com/repo/")
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://maven.aliyun.com/repository/public") }
        maven { setUrl("https://maven.aliyun.com/repository/central") }
        maven { setUrl("https://maven.aliyun.com/repository/google") }
        maven { setUrl("'https://maven.aliyun.com/repository/gradle-plugin") }
        maven {
            setUrl("https://oss.sonatype.org/content/repositories/snapshots/")
        }
        maven {
            setUrl("https://developer.huawei.com/repo/")
        }
    }
}

rootProject.name = "im-uikit"
include(":app")
include(":common-ui")
include(":aisearchkit")
include(":conversationkit-ui")
include(":teamkit-ui")
include(":contactkit-ui")
include(":chatkit-ui")
include(":locationkit")
