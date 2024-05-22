# MVVM Example Project

Welcome to the MVVM Example Project! This project demonstrates the implementation of the Model-View-ViewModel (MVVM) architecture in an Android application using Hilt for dependency injection, View Binding, and Data Binding.

## Table of Contents
- [Introduction](#introduction)
- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Features](#features)
- [Dependencies](#dependencies)
- [License](#license)

## Introduction
This project showcases a clean and scalable approach to building Android applications using the MVVM architecture. It leverages Hilt for dependency injection and employs both View Binding and Data Binding for a smooth UI experience.

## Project Structure
```
com.example.mvvmexample
│
├── data
│   ├── model
│   │   └── User.kt
│   ├── repository
│   │   └── UserRepository.kt
│   └── di
│       └── AppModule.kt
│
├── ui
│   ├── main
│   │   ├── MainActivity.kt
│   │   └── MainViewModel.kt
│   └── binding
│       └── BindingAdapters.kt
│
├── utils
│   └── Extensions.kt
│
└── MyApplication.kt
```

### Explanation
- **data**: Contains all data-related classes.
  - **model**: Defines the data models, such as `User.kt`.
  - **repository**: Manages data operations, such as `UserRepository.kt`.
  - **di**: Includes dependency injection classes, like `AppModule.kt` for Hilt modules.
  
- **ui**: Contains all UI-related classes.
  - **main**: UI components related to the main screen, including `MainActivity.kt` and `MainViewModel.kt`.
  - **binding**: Custom binding adapters, such as `BindingAdapters.kt`.
  
- **utils**: Utility classes and extensions, such as `Extensions.kt`.

- **MyApplication.kt**: The application class for setting up Hilt.

## Setup and Installation
### Prerequisites
- Android Studio
- Java 8 or higher
- Gradle

### Steps
1. **Clone the repository:**
   ```sh
   git clone https://github.com/Hasnain17/MVVM_DI_HILT.git
   ```
2. **Open the project in Android Studio.**
3. **Sync the project with Gradle files.**

### Add Hilt Plugin
Ensure that the Hilt plugin is included in both the project-level and app-level build.gradle files.

**Project-Level build.gradle**
```gradle
buildscript {
    ext.kotlin_version = "1.8.20"
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath "com.android.tools.build:gradle:8.0.1"
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
        classpath "com.google.dagger:hilt-android-gradle-plugin:2.44" // Add this line
    }
}

plugins {
    id 'com.android.application' version '8.0.1' apply false
    id 'com.android.library' version '8.0.1' apply false
    id 'org.jetbrains.kotlin.android' version '1.8.20' apply false
}
```

**App-Level build.gradle**
```gradle
plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
    id 'kotlin-kapt'
    id 'dagger.hilt.android.plugin'
}

android {
    namespace 'com.example.mvvmexample'
    compileSdkVersion 33

    defaultConfig {
        applicationId "com.example.mvvmexample"
        minSdkVersion 21
        targetSdkVersion 33
        versionCode 1
        versionName "1.0"
    }

    buildFeatures {
        viewBinding true
        dataBinding true
    }
}

dependencies {
    implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    implementation 'androidx.core:core-ktx:1.9.0'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.8.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.5.1'
    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1'
    implementation 'com.google.dagger:hilt-android:2.44'
    kapt 'com.google.dagger:hilt-compiler:2.44'
}
```

### Sync Your Project
After updating both `build.gradle` files, sync your project with Gradle.

## Usage
1. **Run the project** in Android Studio.
2. **Explore the app** to see the MVVM architecture in action, with Hilt managing the dependencies.

## Features
- **MVVM Architecture**: Separation of concerns, making the code more manageable and testable.
- **Hilt Integration**: Simplifies dependency injection.
- **View Binding**: Reduces boilerplate code for UI components.
- **Data Binding**: Binds UI components in the layouts to data sources in a declarative manner.

## Dependencies
- **Hilt**: Dependency injection framework.
- **View Binding**: For binding views.
- **Data Binding**: For binding data to views.
- **Lifecycle Components**: LiveData and ViewModel.


I hope this project helps you understand and implement the MVVM architecture using Hilt, View Binding, and Data Binding in your Android applications. Happy coding!
