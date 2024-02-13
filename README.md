# MVVM Architecture with Kotlin

This project demonstrates the implementation of the MVVM (Model-View-ViewModel) architecture pattern using Kotlin for Android app development. It utilizes various Android components and patterns including Room Database, Repository Pattern, ViewModel, ViewModelFactory, and Coroutines.

## Overview

The project showcases how to structure an Android app using the MVVM architecture, separating concerns and improving code maintainability and testability.

### Key Components

- **Room Database**: Utilized for data persistence, providing an abstraction layer over SQLite.
- **Repository Pattern**: Abstracts the data sources (in this case, the Room Database) from the rest of the application, providing a clean API for accessing and managing data.
- **ViewModel**: Manages UI-related data and business logic, surviving configuration changes and other lifecycle-related events.
- **ViewModelFactory**: Responsible for instantiating ViewModels, facilitating dependency injection.
- **Coroutines**: Used for asynchronous programming, enabling non-blocking and responsive UI.

## Installation

1. Clone or download the repository.
2. Open the project in Android Studio.
3. Build and run the app on an emulator or physical device.

## Usage

The app presents a simple interface for managing quotes. Users can view a list of quotes and add new quotes.

### Adding Quotes

To add a new quote, simply click on the "Add Quote" button in the app's interface. This will prompt the user to input the text and author of the quote, which will then be added to the list of quotes.

### Viewing Quotes

The app displays a list of quotes retrieved from the Room Database. These quotes are loaded asynchronously and displayed in the UI using LiveData and Data Binding.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
