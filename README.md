**MVVM Example with Hilt, View Binding, and Data Binding**

This is a sample Android project demonstrating the use of MVVM architecture with Dagger Hilt for dependency injection, View Binding, and Data Binding in Kotlin.

**Project Structure**

com.app.hasnain.sample.mvvmdihilt
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

**Features**
1: MVVM Architecture: Implements the Model-View-ViewModel pattern for a clean separation of concerns.
2: Dagger Hilt: Used for dependency injection to manage the creation and scope of dependencies.
3: View Binding: Simplifies the process of binding views in the code.
4: Data Binding: Binds UI components in layouts to data sources in a declarative format.
