plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.jetbrains.kotlin.kapt)
}

android {
    namespace = "com.yoma.currencyexchangerate"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.yoma.currencyexchangerate"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isDebuggable = true
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        debug {
            isDebuggable = true
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    flavorDimensions += "version"
    productFlavors {
        create("demo") {
            dimension = "version"
            buildConfigField("String", "SERVER_ENDPOINT", "\"https://api.currencylayer.com/\"")
            buildConfigField(
                "String",
                "CURRENCY_API_KEY",
                "\"${project.findProperty("CURRENCY_API_KEY")}\""
            )
        }

        create("production") {
            dimension = "version"
            buildConfigField("String", "SERVER_ENDPOINT", "\"https://api.currencylayer.com/\"")
            buildConfigField(
                "String",
                "CURRENCY_API_KEY",
                "\"${project.findProperty("CURRENCY_API_KEY")}\""
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
        buildConfig = true
    }

    kapt {
        correctErrorTypes = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //third party
    implementation(libs.github.glide)
    annotationProcessor(libs.github.glide.annotation)
    implementation(libs.android.retrofit)
    implementation(libs.android.retrofit.gson)
    implementation(libs.android.okhttp3)
    implementation(libs.android.okhttp3.login)
    implementation(libs.room.runtime)
    implementation(libs.room.ktx)
    kapt(libs.room.compiler)
}